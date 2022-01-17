package com.example.gasluaviet.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gasluaviet.R;

public class QuenMK1 extends AppCompatActivity {
    ImageButton imgbtDLMK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quen_m_k1);

        imgbtDLMK = (ImageButton) findViewById(R.id.imgBtDLMK);

        imgbtDLMK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuenMK1.this , QuenMK2.class);
                startActivity(intent);
            }
        });
    }
}