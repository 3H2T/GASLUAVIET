package com.example.gasluaviet.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gasluaviet.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ChiTietDHActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Button btncxn4,btndth4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_d_h);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setBackground(null);

        btncxn4 =(Button) findViewById(R.id.btcxn4);
        btncxn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChiTietDHActivity.this ,  DonHangCXN.class);
                startActivity(intent);
            }
        });

        btndth4 =(Button) findViewById(R.id.btdth4);
        btndth4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChiTietDHActivity.this ,  DonHangDTHActivity.class);
                startActivity(intent);
            }
        });
    }
}