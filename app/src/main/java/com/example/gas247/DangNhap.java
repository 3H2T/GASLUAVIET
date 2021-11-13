package com.example.gas247;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DangNhap extends AppCompatActivity {
    Button btnDK1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        btnDK1 = (Button) findViewById(R.id.btDK1);
        btnDK1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DangNhap.this , DangKy.class);
                startActivity(intent);
            }
        });
    }
}