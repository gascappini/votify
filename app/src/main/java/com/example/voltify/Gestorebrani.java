package com.example.voltify;

import android.widget.ArrayAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Gestorebrani {
    ArrayList<Brano> listaBrani;

    public Gestorebrani(){

        listaBrani = new ArrayList<Brano>();


    }

    public void addBrano(String titolo, String genere){
        Brano b = new Brano(titolo, genere);
        listaBrani.add(b);
    }


    public void listaBrani(){
        StringBuilder stBui = new StringBuilder();
        for (Brano brV : listaBrani){
            stBui.append(brV.toString());
        }
    }
}
