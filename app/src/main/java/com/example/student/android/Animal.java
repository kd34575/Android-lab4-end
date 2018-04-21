package com.example.student.android;

import java.io.Serializable;

/**
 * Created by Student on 2018-04-21.
 */

public class Animal implements Serializable {
    private int id;
    private String gatunek;
    private String kolor;
    private float wielkosc;
    private String opis;

    public Animal(){   }

    public Animal(String gatunek, String kolor, float wielkosc, String opis) {

        this.gatunek = gatunek;
        this.kolor = kolor;
        this.wielkosc = wielkosc;
        this.opis = opis;
    }

    public int getId() {
        return id;
    }

    public String getGatunek() {
        return gatunek;
    }

    public String getKolor() {
        return kolor;
    }

    public float getWielkosc() {
        return wielkosc;
    }

    public String getOpis() {
        return opis;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setWielkosc(float wielkosc) {
        this.wielkosc = wielkosc;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", gatunek='" + gatunek + '\'' +
                ", kolor='" + kolor + '\'' +
                ", wielkosc=" + wielkosc +
                '}';
    }
}
