package com.example.sistemas.afinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.sistemas.afinal.adapters.RecyclerViewAdapter;
import com.example.sistemas.afinal.api.ApiService;
import com.example.sistemas.afinal.model.Pojo;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public final static String TAG = "Datos abiertos Colombia";

    private RecyclerView recyclerView;

    private RecyclerViewAdapter adapterRecycler;

    private Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //conexion del objeto retrofit
        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.datos.gov.co/resource/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        adapterRecycler = new RecyclerViewAdapter(this);
        recyclerView.setAdapter(adapterRecycler);
        recyclerView.setHasFixedSize(true);

        final GridLayoutManager layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });

        obtenerDatos();
    }

    private void obtenerDatos() {

        ApiService service = retrofit.create(ApiService.class);
        Call<List<Pojo>> respuestaCall = service.obtenerListaIcfes();


        respuestaCall.enqueue(new Callback<List<Pojo>>() {
            @Override
            public void onResponse(Call<List<Pojo>> call, Response<List<Pojo>> response) {
                if(response.isSuccessful()){

                    ArrayList<Pojo> lista = (ArrayList<Pojo>) response.body();
                    adapterRecycler.adicionarLista(lista);


/*                    for(int i=0;i<lista.size();i++)
                    {
                        CarrosPOJO p = (CarrosPOJO)lista.get(i);
                        Log.i(TAG," Clase: "+p.getClase()+"  -  Total: "+p.getTotal());
                    }*/

                }else
                {
                    Log.e(TAG, "onResponse: "+response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<List<Pojo>> call, Throwable t) {
                Log.e(TAG," onFailure: "+t.getMessage());
            }
        });
    }

}
