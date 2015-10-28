package com.example.avellb155max.appcalorias.Fragmentos;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.avellb155max.appcalorias.R;

/**
 * Created by gustavo on 24/10/15.
 */
public class FragmentRefeicoes extends Fragment {
    public static FragmentRefeicoes newInstance(String param1, String param2) {
        FragmentRefeicoes fragment = new FragmentRefeicoes();

        return fragment;
    }

    public FragmentRefeicoes() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_atividade_fisica, container, false);
    }
}
