package com.example.gasluaviet.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gasluaviet.R;

public class DangKy extends AppCompatActivity {
    TextView tvDN;
    Button btDK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);

        tvDN = findViewById(R.id.tvDN);
        btDK = findViewById(R.id.btDKTK);

        tvDN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DangKy.this , DangNhap.class);
                startActivity(intent);
            }
        });

        btDK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DangKy.this , DNThanhCong.class);
                startActivity(intent);
            }
        });
    }
}