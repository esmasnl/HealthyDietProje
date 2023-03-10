package com.essel.healthydiet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {

    private EditText sifre;
    private TextView txtSonuc;
    private String kSifre, dogrukSifre = "Saglikliyasam";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        sifre = (EditText)findViewById(R.id.editTxtSifre);
        txtSonuc = (TextView)findViewById(R.id.txtViewSonuc);


    }

    public void btnGirisYap(View  v){
        kSifre = sifre.getText().toString();

        if (!TextUtils.isEmpty(kSifre)){
            if (kSifre.equals(dogrukSifre)){
                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);

            }else
                txtSonuc.setText("Parolayı Yanlış Girdiniz.");
        }else
            txtSonuc.setText("Parolayı Boş Giremezsiniz.");

    }
}