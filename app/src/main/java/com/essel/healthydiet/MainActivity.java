package com.essel.healthydiet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.add_menu_add_book){
           //intent geçiş
            Intent addBoookIntent = new Intent(this, AddBookActivity.class);
            finish();
            startActivity(addBoookIntent);
        } else if (item.getItemId() == R.id.add_menu_add_motivation){
            //intent geçiş
            Intent addMotivationIntent = new Intent(this, MotivationActivity.class);
            finish();
            startActivity(addMotivationIntent);
        }else if (item.getItemId() == R.id.add_menu_add_activity){
            //intent geçiş
            Intent addPhysicallyIntent = new Intent(this, PhysicallyActivity.class);
            finish();
            startActivity(addPhysicallyIntent);
        }else if (item.getItemId() == R.id.add_menu_add_list){
            Intent addListIntent = new Intent(this, ListActivity.class);
            finish();
            startActivity(addListIntent);

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}