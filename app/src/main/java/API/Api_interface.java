package API;

import java.util.List;

import Model.Hero;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api_interface {


    String base_url="https://simplifiedcoding.net/demos/";

    @GET("marvel")
    Call<List<Hero>> getdata();
}
