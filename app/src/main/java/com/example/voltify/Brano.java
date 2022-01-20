package com.example.voltify;

import java.util.Date;

public class Brano {
    private String titolo;
    private int durata;
    private String autore;
    private String genere;
    private Date datacreazione;

    public Brano(String titolo, String genere){
        this.titolo=titolo;
        this.genere=genere;
    }


    public String Brano(){
        public String getTitolo(){
            return titolo;
        }
    }

    public void setTitolo(String titolo){

        this.titolo = titolo;
    }
}
