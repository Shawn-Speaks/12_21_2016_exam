package shawn.c4q.nyc.oneactivityonefragment.RetrofitThings;

import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import shawn.c4q.nyc.oneactivityonefragment.JSONObjectsReturned.Animal;
import shawn.c4q.nyc.oneactivityonefragment.JSONObjectsReturned.Wrapper;

import static android.content.ContentValues.TAG;

/**
 * Created by shawnspeaks on 12/21/16.
 */

public class DoApiCall {

    APIservice apIservice =  UrlBuilder.makeService();

    List<Animal> animals;

    public void DoApiCall(APIservice apIservice) {
        this.apIservice = apIservice;

        Call<Wrapper> wrapperCall = apIservice.getOutterMostJsonObject();
        wrapperCall.enqueue(new Callback<Wrapper>() {
            @Override
            public void onResponse(Call<Wrapper> call, Response<Wrapper> response) {
                Log.d(TAG, "SUCCESS");
                Wrapper wrapper = response.body();
                animals = wrapper.getAnimals();
                setAnimals(animals);
            }

            @Override
            public void onFailure(Call<Wrapper> call, Throwable t) {
                Log.d(TAG, "ERROR FOOL");
            }
        });
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
