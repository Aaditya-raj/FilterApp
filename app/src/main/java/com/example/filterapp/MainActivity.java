package com.example.filterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void filter(View view){
        Toast.makeText(this, "cliked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,FiltersActivity.class);
        intent.putExtra("message","hi! Adi here");
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}