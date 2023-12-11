package com.example.bitirmeprojesi.data.entity;

import java.util.List;

public class SepettekiYemeklerCevap {
    private List<SepettekiYemekler> sepettekiyemekler;
    private int success;

    public SepettekiYemeklerCevap() {
    }

    public SepettekiYemeklerCevap(List<SepettekiYemekler> sepettekiyemekler, int success) {
        this.sepettekiyemekler = sepettekiyemekler;
        this.success = success;
    }

    public List<SepettekiYemekler> getSepettekiyemekler() {
        return sepettekiyemekler;
    }

    public void setSepettekiyemekler(List<SepettekiYemekler> sepettekiyemekler) {
        this.sepettekiyemekler = sepettekiyemekler;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }
}
