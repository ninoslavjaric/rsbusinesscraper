import helper.Log;
import logic.Worker;
import pojo.City;
import pojo.Seeker;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import services.RegisterService;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
//        Log.dd(new File("cache/cities.ser").exists());
//        ArrayList<City> cities = Worker.getCities();
        Log.prntl(Worker.getCompanies());
    }
}
