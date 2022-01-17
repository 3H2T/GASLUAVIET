package com.example.gasluaviet.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gasluaviet.R;

public class QuenMK3 extends AppCompatActivity {
    Button btnDLMK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quen_m_k3);

        btnDLMK = (Button) findViewById(R.id.btDLMK);

        btnDLMK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuenMK3.this , QuenMK4.class);
                startActivity(intent);
            }
        });
    }
}