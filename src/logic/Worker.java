package logic;

import helper.Log;
import helper.Serializer;
import pojo.City;
import pojo.Company;
import pojo.CompanyListResponse;
import pojo.Seeker;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import services.RegisterService;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by ninoslav.jaric on 10-Dec-16.
 */
public class Worker {

    public static ArrayList<City> getCities() throws IOException, ClassNotFoundException {
        ArrayList<City> cities;
        String cachePath = "cache/cities.ser";
        if(new File(cachePath).exists()){
            cities = (ArrayList<City>) Serializer.unserialize(cachePath);
            return cities;
        }
        HashMap<String, String> citySeeker = new HashMap<>();
        citySeeker.put("value","");
        cities = getService().listCities(new Seeker(citySeeker)).execute().body();
        Serializer.serialize(cities, cachePath);
        return cities;
    }

    public static ArrayList<Company> getCompanies() throws IOException, ClassNotFoundException {
        ArrayList<City> cities = getCities();
        String path = "cache/companieLists";
        File cache;
        for (City city : cities) {
            cache = new File(path+"/"+city.getValue());
            if(!cache.exists())
                cache.mkdir();
            Log.prntl("City progress:\t"+((float)cities.indexOf(city)/cities.size())+"\tName:\t"+city.getDisplayText());
//            Log.die();
            proccessCompaniesByCity(city);
        }

        return null;
    }

    public static void proccessCompaniesByCity(City city) throws IOException {
        HashMap<String, String> filter = new HashMap<>();
        CompanyListResponse clr;
        int offset = 0, limit = 10;
        Integer total = null;
        String path = "cache/companieLists", serTarget = null;

        filter.put("djelatnostId", "");
        filter.put("osnivac", "");
        filter.put("term", "");
        filter.put("opstinaId", "");
        filter.put("value", "");
        filter.put("opstinaId", "" + city.getValue());


        do{
//            Call<CompanyListResponse> call = getService().listCompanies(new Seeker(filter));
//            Response djes = call.execute();
            if(total != null){
                serTarget = path+"/"+city.getValue()+"/"+offset+"-"+limit+"-"+total+".ser";
                if(new File(serTarget).exists()){
                    Log.prnt("\rCompany progress:\t"+((float)offset/total));
                    offset += limit;
                    continue;
                }
            }
            clr = getService().listCompanies(new Seeker(filter), offset, limit).execute().body();
            total = clr.getTotalRecordCount();
            if(total == 0)
                break;
            serTarget = path+"/"+city.getValue()+"/"+offset+"-"+limit+"-"+total+".ser";
            Serializer.serialize(clr, serTarget);

            Log.prnt("\rCompany progress:\t"+((float)offset/total));
            offset += limit;
        }while(offset <= total);
        Log.prntl("\n");
    }

    private static RegisterService getService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://bizreg.esrpska.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(RegisterService.class);
    }
}
