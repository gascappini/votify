package com.example.voltify;

import android.widget.ArrayAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Gestorebrani {
    ArrayList<Brano> listaBrani;

    public Gestorebrani(){

        listaBrani = new ArrayList<Brano>();


    }

    public void addBrano(String titolo, int durata, String autore, String genere, String datacreazione){
        Brano b = new Brano(titolo, durata, autore, genere, datacreazione);
        listaBrani.add(b);
        System.out.println(listaBrani);
    }


    public StringBuilder listaBrani(){
        StringBuilder stBui = new StringBuilder();
        for (Brano brV : listaBrani){
            stBui.append(brV.toString());
        }
        return stBui;
    }
}
