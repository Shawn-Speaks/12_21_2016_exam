package shawn.c4q.nyc.oneactivityonefragment;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import shawn.c4q.nyc.oneactivityonefragment.JSONObjectsReturned.Animal;
import shawn.c4q.nyc.oneactivityonefragment.RetrofitThings.APIservice;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;
    APIservice apIservice;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createFragmentHoster(new SingleFragment());
//        apIservice = UrlBuilder.makeService();
//        DoApiCall d = new DoApiCall();
//        d.DoApiCall(apIservice);
//        List<Animal> animals = d.getAnimals();
//        setTv1(animals.get(0));


    }




    public void createFragmentHoster(Fragment f){
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.container, f)
                .commit();
    }



    private void setTv1(Animal animal){
        final Animal a = animal;
        tv1 = (TextView) findViewById(R.id.tv_1);
        tv1.setTextColor(Color.parseColor(a.getTextColor()));
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                relativeLayout.setBackground(Color.parseColor(a.getBackground()));
            }
        });

    }



    public void setTv2(Animal animal){

    }



    public void setTv3(Animal animal){

    }



    public void setTv4(Animal animal){

    }



    public void setTv5(Animal animal){

    }



}
