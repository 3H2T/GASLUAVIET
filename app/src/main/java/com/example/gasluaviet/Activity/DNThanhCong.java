package com.example.gasluaviet.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gasluaviet.R;

public class DNThanhCong extends AppCompatActivity {
    Button btOK ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_n_thanh_cong);

        btOK = findViewById(R.id.btDKTC);

        btOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DNThanhCong.this , DangNhap.class);
                startActivity(intent);
            }
        });

    }
}