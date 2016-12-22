package shawn.c4q.nyc.oneactivityonefragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import shawn.c4q.nyc.oneactivityonefragment.RetrofitThings.APIservice;
import shawn.c4q.nyc.oneactivityonefragment.RetrofitThings.DoApiCall;
import shawn.c4q.nyc.oneactivityonefragment.RetrofitThings.UrlBuilder;

/**
 * Created by shawnspeaks on 12/21/16.
 */

public class SingleFragment extends Fragment {

    APIservice apIservice;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        apIservice = UrlBuilder.makeService();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.animal_holder_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        DoApiCall d = new DoApiCall();
        d.DoApiCall(apIservice);
    }



}
