package com.example.bitirmeprojesi.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bitirmeprojesi.R;
import com.example.bitirmeprojesi.data.entity.Yemekler;
import com.example.bitirmeprojesi.databinding.FragmentAnasayfaBinding;
import com.example.bitirmeprojesi.ui.adapter.YemeklerAdapter;

import java.util.ArrayList;


public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentAnasayfaBinding.inflate(inflater, container, false);

        binding.yemeklerRv.setLayoutManager(
                new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        );

        ArrayList<Yemekler> yemeklerListesi = new ArrayList<>();

        YemeklerAdapter yemeklerAdapter=new YemeklerAdapter(yemeklerListesi,requireContext());
        binding.yemeklerRv.setAdapter(yemeklerAdapter);


        return binding.getRoot();
    }
}