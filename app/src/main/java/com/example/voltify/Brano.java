package com.example.voltify;

import java.util.Date;

public class Brano {
    private String titolo;
    private int durata;
    private String autore;
    private String genere;
    private String datacreazione;

    public Brano(String titolo, int durata, String autore, String genere, String datacreazione){
        this.titolo=titolo;
        this.durata=durata;
        this.autore=autore;
        this.genere=genere;
        this.datacreazione=datacreazione;
    }


    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getDatacreazione() {
        return datacreazione;
    }

    public void setDatacreazione(String datacreazione) {
        this.datacreazione = datacreazione;
    }

    @Override
    public String toString() {
        return "Brano: " +
                "titolo='" + titolo + '\'' +
                ", durata=" + durata +
                ", autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                ", datacreazione='" + datacreazione + '\'';
    }
}
