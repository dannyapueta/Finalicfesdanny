package com.example.sistemas.afinal.api;

import com.example.sistemas.afinal.model.Pojo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 *
 */

public interface ApiService {
    @GET("hs24-twbf.json")
    Call<List<Pojo>> obtenerListaIcfes();
}
