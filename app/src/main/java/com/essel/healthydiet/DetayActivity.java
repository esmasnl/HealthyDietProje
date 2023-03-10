package com.essel.healthydiet;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class DetayActivity extends AppCompatActivity {

    private ImageView imgKitapResimi;
    private TextView txtKitapAdi, txtKitapYazari, txtKitapOzeti;
    private String kitapAdi, kitapYazari, kitapOzeti;
    private Bitmap kitapResimi;

    private void init(){
        imgKitapResimi = (ImageView)findViewById(R.id.detay_activity_imageViewKitapResim);
        txtKitapAdi = (TextView)findViewById(R.id.detay_activity_textViewKitapAdi);
        txtKitapYazari = (TextView)findViewById(R.id.detay_activity_textViewKitapYazari);
        txtKitapOzeti = (TextView)findViewById(R.id.detay_activity_textViewKitapOzeti);

        kitapAdi = ListActivity.kitapDetayi.getKitapAdi();
        kitapYazari = ListActivity.kitapDetayi.getKitapYazari();
        kitapOzeti = ListActivity.kitapDetayi.getKitapOzeti();
        kitapResimi = ListActivity.kitapDetayi.getKitapResimi();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);
        init();

        if (!TextUtils.isEmpty(kitapAdi) && !TextUtils.isEmpty(kitapYazari) && !TextUtils.isEmpty(kitapOzeti)){
            txtKitapAdi.setText(kitapAdi);
            txtKitapYazari.setText(kitapYazari);
            txtKitapOzeti.setText(kitapOzeti);
            imgKitapResimi.setImageBitmap(kitapResimi);
        }


    }
}