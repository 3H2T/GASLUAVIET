package com.example.gasluaviet.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gasluaviet.R;

public class DangNhap extends AppCompatActivity {
    Button btnDK1,btnDN1;
    TextView tvqmk;
    EditText mk,sdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        btnDK1 = (Button) findViewById(R.id.btDK1);
        btnDN1  = (Button) findViewById(R.id.btDN1);
        tvqmk   = (TextView) findViewById(R.id.tvQMK);
        mk = (EditText) findViewById(R.id.mk);
        sdt = (EditText)findViewById(R.id.sdt);
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
            String phone = "0123456789";
            String password = "12345";
            if (sdt.getText().toString().equals(phone) && mk.getText().toString().equals(password)){
                Toast.makeText(getApplicationContext(),"Đăng nhập thành công",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(DangNhap.this , TrangchuActivity.class);
                startActivity(intent);
            }
            else{
                Toast.makeText(getApplicationContext(),"Đăng nhập thất bại",Toast.LENGTH_LONG).show();
            }}
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