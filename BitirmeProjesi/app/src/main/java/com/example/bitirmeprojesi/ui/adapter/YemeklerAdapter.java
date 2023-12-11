package com.example.bitirmeprojesi.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bitirmeprojesi.data.entity.Yemekler;
import com.example.bitirmeprojesi.databinding.CardTasarimBinding;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class YemeklerAdapter extends RecyclerView.Adapter<YemeklerAdapter.CardTasarimTutucu>{
    private List<Yemekler> yemeklerListesi;
    private Context mContext;

    public YemeklerAdapter(List<Yemekler> yemeklerListesi, Context mContext) {
        this.yemeklerListesi = yemeklerListesi;
        this.mContext = mContext;
    }


    public class  CardTasarimTutucu extends RecyclerView.ViewHolder{
        private CardTasarimBinding tasarim;

        public CardTasarimTutucu( CardTasarimBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }


    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       //viewbinding yaptığımız yer
        CardTasarimBinding binding=CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false);
        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {

        Yemekler yemek=yemeklerListesi.get(position);
        CardTasarimBinding t=holder.tasarim;

        t.imageViewYemek.setImageResource(mContext.getResources()
                .getIdentifier(yemek.getYemek_resim_adi(),"drawable",mContext.getPackageName()));

        t.textViewFiyat.setText(yemek.getYemek_fiyat()+ "₺");


    }

    @Override
    public int getItemCount() {
        //kaç kere çalışacağımızı belirler
        return yemeklerListesi.size();
    }
}
