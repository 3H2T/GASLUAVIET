package com.example.gas247;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DonHangActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donhang);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setBackground(null);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();

        Fragment fragment = new ChoXacNhan();
        fragmentTransaction.add(R.id.linerContent ,fragment);
        fragmentTransaction.commit();
    }

    public void AddFragment(View view){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();

        Fragment fragment = null;

        switch (view.getId()){
            case R.id.btdth1: fragment = new DangThucHien();
                break;
            case R.id.btcxn1: fragment = new ChoXacNhan();
                break;
            case R.id.layoutXemCT: fragment = new ChiTietDonHang();
                break;
            case R.id.layoutXemCTDH : fragment = new ChiTietDonHang();
                break;
            case R.id.btdht1: fragment = new DaHoanThanh();
                break;
        }
        fragmentTransaction.replace(R.id.linerContent ,fragment);
        fragmentTransaction.commit();
    }

}