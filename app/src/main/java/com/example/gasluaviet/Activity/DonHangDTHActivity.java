package com.example.gasluaviet.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gasluaviet.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DonHangDTHActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Button btncxn2,btndht2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_don_hang_d_t_h);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setBackground(null);

        btncxn2 =(Button) findViewById(R.id.btcxn2);
        btncxn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonHangDTHActivity.this , DonHangCXN.class);
                startActivity(intent);
            }
        });
        btndht2 =(Button) findViewById(R.id.btdht2);
        btndht2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonHangDTHActivity.this , DonHangDHTActivity.class);
                startActivity(intent);
            }
        });
    }
}