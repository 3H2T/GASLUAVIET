package com.example.gasluaviet.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gasluaviet.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ThanhtoanMomotkActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanhtoan_momotk);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setBackground(null);
    }
}