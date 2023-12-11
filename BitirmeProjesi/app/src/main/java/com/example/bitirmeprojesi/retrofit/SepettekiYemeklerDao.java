package com.example.bitirmeprojesi.retrofit;

import com.example.bitirmeprojesi.data.entity.CRUDCevap;
import com.example.bitirmeprojesi.data.entity.SepettekiYemeklerCevap;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
public interface SepettekiYemeklerDao {

    @POST("yemekler/sepeteYemekEkle.php")
    @FormUrlEncoded
    Call<CRUDCevap> sepetteki_yemekleri_ekle(@Field("yemek_adi") String yemek_adi,
                                             @Field("yemek_resim_adi") String yemek_resim_adi,
                                             @Field("yemek_fiyat") int yemek_fiyat,
                                             @Field("yemek_siparis_adet") int yemek_siparis_adet,
                                             @Field("kullanici_adi") String kullanici_adi);

    @POST("yemekler/sepettenYemekSil.php")
    @FormUrlEncoded
    Call<CRUDCevap> sepetteki_yemekleri_sil(@Field("sepet_yemek_id") int sepet_yemek_id,
                        @Field("kullanici_adi") String kullanici_adi);


    @POST("yemekler/sepettekiYemekleriGetir.php")
    @FormUrlEncoded
    Call<SepettekiYemeklerCevap> sepetteki_yemekleri_getir(@Field("kullanici_adi") String kullanici_adi);


}
