package com.example.gasluaviet.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gasluaviet.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DonHangCXN extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Button btndth1,btndht1;
    LinearLayout XemCt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donhang_c_x_n);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setBackground(null);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setBackground(null);

        btndth1 = (Button) findViewById(R.id.btdth1);
        btndth1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonHangCXN.this, DonHangDTHActivity.class);
                startActivity(intent);
            }
        });

        btndht1 = (Button) findViewById(R.id.btdht1);
        btndht1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonHangCXN.this, DonHangDHTActivity.class);
                startActivity(intent);
            }
        });

        XemCt1 = (LinearLayout) findViewById(R.id.XemChitiet1);
        XemCt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonHangCXN.this, ChiTietDHActivity.class);
                startActivity(intent);
            }
        });
    }
}