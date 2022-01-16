package com.example.gasluaviet.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gasluaviet.R;

public class QuenMK2 extends AppCompatActivity {
    Button btnGui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quen_m_k2);

        btnGui = (Button) findViewById(R.id.btGui);

        btnGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuenMK2.this , QuenMK3.class);
                startActivity(intent);
            }
        });
    }
}