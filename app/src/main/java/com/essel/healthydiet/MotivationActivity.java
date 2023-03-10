package com.essel.healthydiet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MotivationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation);
    }
    @Override
    public void onBackPressed() {
        Intent backIntent = new Intent(this, MainActivity.class);
        finish();
        startActivity(backIntent);
    }
}