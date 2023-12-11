package com.example.bitirmeprojesi.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bitirmeprojesi.data.entity.SepettekiYemekler;
import com.example.bitirmeprojesi.data.entity.Yemekler;
import com.example.bitirmeprojesi.databinding.CardTasarimBinding;

import java.util.List;

public class SepetAdapter extends  RecyclerView.Adapter<SepetAdapter.CardTasarimTutucuSepet>{

    private List<SepettekiYemekler> sepettekiYemeklerListesi;
    private Context mContext;

    public SepetAdapter(List<SepettekiYemekler> sepettekiYemeklerListesi, Context mContext) {
        this.sepettekiYemeklerListesi = sepettekiYemeklerListesi;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public CardTasarimTutucuSepet onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        CardTasarimBinding binding=CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false);
        return new CardTasarimTutucuSepet(binding);

    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucuSepet holder, int position) {

    }

    @Override
    public int getItemCount() {
        return sepettekiYemeklerListesi.size();
    }

    public class  CardTasarimTutucuSepet extends RecyclerView.ViewHolder{

        private CardTasarimBinding tasarim;

        public CardTasarimTutucuSepet( CardTasarimBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }
}


