package com.example.gasluaviet.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gasluaviet.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CapnhatActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ImageButton imgCapNhat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capnhat);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setBackground(null);

        imgCapNhat = (ImageButton) findViewById(R.id.imgCN);
        imgCapNhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CapnhatActivity.this , CapnhatTaikhoan.class);
                startActivity(intent);
            }
        });
    }
}