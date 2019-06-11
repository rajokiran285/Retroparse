package com.example.kiranraj.retroparse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import API.Api_interface;
import Model.Hero;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=findViewById(R.id.list);

        Retrofit  retrofit=new Retrofit.Builder()
                .baseUrl(Api_interface.base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Api_interface apiInterface=retrofit.create(Api_interface.class);

        Call<List<Hero>> call=apiInterface.getdata();

        call.enqueue(new Callback<List<Hero>>() {
            @Override
            public void onResponse(Call<List<Hero>> call, Response<List<Hero>> response) {
                List<Hero> heros=response.body();

                String [] DATA=new String[heros.size()];
                for (int i=0;i<heros.size();i++)
                {
                    DATA[i]=heros.get(i).getName();

                    list.setAdapter(new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,DATA));
                }
            }

            @Override
            public void onFailure(Call<List<Hero>> call, Throwable t) {

            }
        });

    }
}
