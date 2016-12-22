package shawn.c4q.nyc.oneactivityonefragment.RetrofitThings;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by shawnspeaks on 12/21/16.
 */

public class UrlBuilder {

    private static final String baseURL = "http://jsjrobotics.nyc/";
    private static Retrofit retrofit;
    private static Retrofit.Builder builder;

    public static APIservice makeService(){
        builder = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create());

        retrofit = builder.build();
        return retrofit.create(APIservice.class);
    }

}
