package com.example.bitirmeprojesi.data.repo;

import androidx.lifecycle.MutableLiveData;

import com.example.bitirmeprojesi.data.entity.CRUDCevap;
import com.example.bitirmeprojesi.data.entity.SepettekiYemekler;
import com.example.bitirmeprojesi.data.entity.SepettekiYemeklerCevap;
import com.example.bitirmeprojesi.retrofit.SepettekiYemeklerDao;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SepettekiYemeklerDaoRepository {

    public MutableLiveData<List<SepettekiYemekler>> sepettekiYemeklerListesi = new MutableLiveData<>();
    private SepettekiYemeklerDao sydao;
    public SepettekiYemeklerDaoRepository(SepettekiYemeklerDao sydao){
        this.sydao = sydao;
    }


    public void sepetteki_yemekleri_ekle(String yemek_adi,String yemek_resim_adi,int yemek_fiyat,int yemek_siparis_adet,
                                         String kullanici_adi){
        sydao.sepetteki_yemekleri_ekle(yemek_adi,yemek_resim_adi, yemek_fiyat, yemek_siparis_adet,kullanici_adi)
                .enqueue(new Callback<CRUDCevap>() {
            @Override
            public void onResponse(Call<CRUDCevap> call, Response<CRUDCevap> response) {}
            @Override
            public void onFailure(Call<CRUDCevap> call, Throwable t) {}
        });
    }

    public void  sepetteki_yemekleri_getir(String kullanici_adi){
        sydao.sepetteki_yemekleri_getir(kullanici_adi).enqueue(new Callback<SepettekiYemeklerCevap>() {
            @Override
            public void onResponse(Call<SepettekiYemeklerCevap> call, Response<SepettekiYemeklerCevap> response) {
                List<SepettekiYemekler> liste = response.body().getSepettekiyemekler();
                sepettekiYemeklerListesi.setValue(liste);
            }
            @Override
            public void onFailure(Call<SepettekiYemeklerCevap> call, Throwable t) {}
        });
    }


    public void sepetteki_yemekleri_sil(int sepet_yemek_id, String kullanici_adi){
        sydao.sepetteki_yemekleri_sil(sepet_yemek_id,kullanici_adi).enqueue(new Callback<CRUDCevap>() {
            @Override
            public void onResponse(Call<CRUDCevap> call, Response<CRUDCevap> response) {
                sepetteki_yemekleri_getir(kullanici_adi);
            }
            @Override
            public void onFailure(Call<CRUDCevap> call, Throwable t) {}
        });
    }
}
