package com.example.bitirmeprojesi.di;


import com.example.bitirmeprojesi.data.repo.SepettekiYemeklerDaoRepository;
import com.example.bitirmeprojesi.data.repo.YemeklerDaoRepository;
import com.example.bitirmeprojesi.retrofit.ApiUtils;
import com.example.bitirmeprojesi.retrofit.SepettekiYemeklerDao;
import com.example.bitirmeprojesi.retrofit.YemeklerDao;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {

    @Provides
    @Singleton
    public YemeklerDaoRepository provideKisilerDaoRepository(YemeklerDao ydao){
        return new YemeklerDaoRepository(ydao);
    }

    @Provides
    @Singleton
    public YemeklerDao provideYemeklerDao(){
        return ApiUtils.getYemeklerDao();
    }


    @Provides
    @Singleton
    public SepettekiYemeklerDaoRepository provideSepettekiYemeklerDaoRepository(SepettekiYemeklerDao sydao){
        return new SepettekiYemeklerDaoRepository(sydao);
    }

    @Provides
    @Singleton
    public SepettekiYemeklerDao provideSepettekiYemeklerDao(){
        return ApiUtils.getSepettekiYemeklerDao();
    }
}
