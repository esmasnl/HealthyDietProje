package com.essel.healthydiet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class ListActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private kitapAdapter adapter;
    static public KitapDetayi kitapDetayi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_list);
        mRecyclerView = (RecyclerView)findViewById(R.id.main_activity_recyclerView);
        adapter = new kitapAdapter(Kitap.getData(this), this);


        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new kitapAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Kitap kitap) {
                kitapDetayi = new KitapDetayi(kitap.getKitapAdi(),kitap.getKitapYazari(), kitap.getKitapOzeti(),kitap.getKitapResim());

                Intent detayIntent = new Intent(ListActivity.this, DetayActivity.class);

                startActivity(detayIntent);
            }
        });

    }
}