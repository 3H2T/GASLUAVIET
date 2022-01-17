package com.example.gasluaviet.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gasluaviet.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DonHangDHTActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Button btncxn3,btndth3;
    LinearLayout XemCt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_don_hang_d_h_t);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setBackground(null);

        btncxn3 =(Button) findViewById(R.id.btcxn3);
        btncxn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonHangDHTActivity.this ,  DonHangCXN.class);
                startActivity(intent);
            }
        });

        btndth3 =(Button) findViewById(R.id.btdth3);
        btndth3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonHangDHTActivity.this ,  DonHangDTHActivity.class);
                startActivity(intent);
            }
        });

        XemCt3 = (LinearLayout) findViewById(R.id.XemChitiet3);
        XemCt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonHangDHTActivity.this, ChiTietDHActivity.class);
                startActivity(intent);
            }
        });
    }
}