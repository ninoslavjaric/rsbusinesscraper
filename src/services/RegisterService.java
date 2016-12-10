package services;

import pojo.City;
import pojo.Company;
import pojo.CompanyListResponse;
import pojo.Seeker;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.ArrayList;
import java.util.List;

public interface RegisterService {
    @Headers("User-agent: Googlebot")
    @POST("Home/OpstinaOptions")
    Call<ArrayList<City>> listCities(@Body Seeker seeker);

    @Headers("User-agent: Googlebot")
    @POST("Home/SearchPoslovniSubjekt")
    Call<CompanyListResponse> listCompanies(@Body Seeker seeker, @Query("jtStartIndex") int offset, @Query("jtPageSize") int limit);

    @Headers("User-agent: Googlebot")
    @POST("Home/SearchPoslovniSubjekt")
    Call<CompanyListResponse> listCompanies(@Body Seeker seeker, @Query("jtStartIndex") int offset);

    @Headers("User-agent: Googlebot")
    @POST("Home/SearchPoslovniSubjekt?jtStartIndex=0&jtPageSize=10")
    Call<CompanyListResponse> listCompanies(@Body Seeker seeker);
}