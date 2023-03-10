package com.essel.healthydiet;

import android.graphics.Bitmap;

public class KitapDetayi {
    private String kitapAdi, kitapYazari, kitapOzeti;
    private Bitmap kitapResimi;


    public KitapDetayi(String kitapAdi, String kitapYazari, String kitapOzeti, Bitmap kitapResimi) {
        this.kitapAdi = kitapAdi;
        this.kitapYazari = kitapYazari;
        this.kitapOzeti = kitapOzeti;
        this.kitapResimi = kitapResimi;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public String getKitapYazari() {
        return kitapYazari;
    }

    public String getKitapOzeti() {
        return kitapOzeti;
    }

    public Bitmap getKitapResimi() {
        return kitapResimi;
    }
}
