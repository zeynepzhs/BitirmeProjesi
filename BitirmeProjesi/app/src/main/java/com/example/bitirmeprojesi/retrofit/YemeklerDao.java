package com.example.bitirmeprojesi.retrofit;

import com.example.bitirmeprojesi.data.entity.CRUDCevap;
import com.example.bitirmeprojesi.data.entity.YemeklerCevap;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;


public interface YemeklerDao {

    //http://kasimadalan.pe.hu/yemekler/tumYemekleriGetir.php

    @GET("yemekler/tumYemekleriGetir.php")
    Call<YemeklerCevap> tum_yemekleri_getir();



}
