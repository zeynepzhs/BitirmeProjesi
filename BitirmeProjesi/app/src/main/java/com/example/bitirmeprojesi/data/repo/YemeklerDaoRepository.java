package com.example.bitirmeprojesi.data.repo;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.bitirmeprojesi.data.entity.CRUDCevap;
import com.example.bitirmeprojesi.data.entity.Yemekler;
import com.example.bitirmeprojesi.data.entity.YemeklerCevap;
import com.example.bitirmeprojesi.retrofit.YemeklerDao;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class YemeklerDaoRepository {
    public MutableLiveData<List<Yemekler>> yemeklerListesi = new MutableLiveData<>();
    private YemeklerDao ydao;
    public YemeklerDaoRepository(YemeklerDao ydao){
        this.ydao = ydao;
    }

    public void tum_yemekleri_getir(){
        ydao.tum_yemekleri_getir().enqueue(new Callback<YemeklerCevap>() {
            @Override
            public void onResponse(Call<YemeklerCevap> call, Response<YemeklerCevap> response) {
                //List<YemeklerCevap> liste = response.body().getYemekler();
             List<Yemekler> liste =response.body().getYemekler();
                yemeklerListesi.setValue(liste);
            }
            @Override
            public void onFailure(Call<YemeklerCevap> call, Throwable t) {}
        });
    }


}
