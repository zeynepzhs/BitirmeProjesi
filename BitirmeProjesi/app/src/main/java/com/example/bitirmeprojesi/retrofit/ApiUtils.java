package com.example.bitirmeprojesi.retrofit;

public class ApiUtils {
    public static final String BASE_URL = "http://kasimadalan.pe.hu/";

    public static YemeklerDao getYemeklerDao(){
        return RetrofitClient.getClient(BASE_URL).create(YemeklerDao.class);
    }

    public static SepettekiYemeklerDao getSepettekiYemeklerDao(){
        return RetrofitClient.getClient(BASE_URL).create(SepettekiYemeklerDao.class);
    }
}
