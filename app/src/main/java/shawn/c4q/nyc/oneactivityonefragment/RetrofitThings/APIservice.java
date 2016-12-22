package shawn.c4q.nyc.oneactivityonefragment.RetrofitThings;

import retrofit2.Call;
import retrofit2.http.GET;
import shawn.c4q.nyc.oneactivityonefragment.JSONObjectsReturned.Wrapper;

/**
 * Created by shawnspeaks on 12/21/16.
 */

public interface APIservice {

    @GET("cgi-bin/12_21_2016_exam.pl")
    Call<Wrapper> getOutterMostJsonObject();




}
