package com.example.filterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FiltersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filters);

        String message = getIntent().getStringExtra("message");
        TextView tv_message = (TextView) findViewById(R.id.tv_message);
        tv_message.setText(message);

    }
}