package com.example.avellb155max.appcalorias.Classes;

import com.orm.SugarRecord;

/**
 * Created by Gustavo Correia Gonzalez on 21/10/2015.
 */
public class TabelaNutricional extends SugarRecord<TabelaNutricional> {
    String nome;
    String valorCalorico;
    String peso;

    public TabelaNutricional(){
    }

    public TabelaNutricional(String nome, String valorCalorico, String peso){
        this.nome = nome;
        this.valorCalorico = valorCalorico;
        this.peso = peso;
    }
}