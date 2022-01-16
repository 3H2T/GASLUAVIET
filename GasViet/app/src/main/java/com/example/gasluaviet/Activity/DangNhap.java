package com.example.gasluaviet.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gasluaviet.R;

public class DangNhap extends AppCompatActivity {
    Button btnDK1,btnDN1;
    TextView tvqmk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        btnDK1 = (Button) findViewById(R.id.btDK1);
        btnDN1  = (Button) findViewById(R.id.btDN1);
        tvqmk   = (TextView) findViewById(R.id.tvQMK);
        btnDK1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DangNhap.this , DangKy.class);
                startActivity(intent);
            }
        });

        btnDN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DangNhap.this , TrangchuActivity.class);
                startActivity(intent);
            }
        });

        tvqmk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DangNhap.this , QuenMK1.class);
                startActivity(intent);
            }
        });
    }
}