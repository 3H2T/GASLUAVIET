package com.example.gasluaviet.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.gasluaviet.Adapter.MyAdapter;
import com.example.gasluaviet.R;
import com.example.gasluaviet.model.BanHang;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class DanhmucPkActivity extends AppCompatActivity implements View.OnClickListener {
    MyAdapter myAdapter;
    ArrayList<BanHang> mangBanHang;
    BottomNavigationView bottomNavigationView;

    private RecyclerView rcvPhukien;
    private Button btnvan,btnday;
    private GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhmuc_pk);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar =getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);//hiển thị nút back trên toolbar
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setBackground(null);

        btnvan = findViewById(R.id.btnvan);
        btnday = findViewById(R.id.btnday);
        rcvPhukien = findViewById(R.id.rcv_pk);
        gridLayoutManager =new GridLayoutManager(this, 2);
        rcvPhukien.setLayoutManager(gridLayoutManager);

        myAdapter = new MyAdapter(mangBanHang);
        rcvPhukien.setAdapter(myAdapter);

        btnvan.setOnClickListener( this);
        btnday.setOnClickListener(this);


    }

    private List<BanHang> mangBanHang() {
        List<BanHang> list = new ArrayList<>();
        list.add(new BanHang(R.drawable.van,"Van ngang","450.000đ","21%",BanHang.TYPE_VAN));
        list.add(new BanHang(R.drawable.van,"Van ngang","450.000đ","21%",BanHang.TYPE_VAN));
        list.add(new BanHang(R.drawable.van,"Van ngang","450.000đ","21%",BanHang.TYPE_VAN));
        list.add(new BanHang(R.drawable.van,"Van ngang","450.000đ","21%",BanHang.TYPE_VAN));
        list.add(new BanHang(R.drawable.van,"Van ngang","450.000đ","21%",BanHang.TYPE_VAN));
        list.add(new BanHang(R.drawable.van,"Van ngang","450.000đ","21%",BanHang.TYPE_VAN));
        list.add(new BanHang(R.drawable.van,"Van ngang","450.000đ","21%",BanHang.TYPE_VAN));
        list.add(new BanHang(R.drawable.van,"Van ngang","450.000đ","21%",BanHang.TYPE_VAN));
        list.add(new BanHang(R.drawable.van,"Van ngang","450.000đ","21%",BanHang.TYPE_VAN));
        list.add(new BanHang(R.drawable.van,"Van ngang","450.000đ","21%",BanHang.TYPE_VAN));

        list.add(new BanHang(R.drawable.day,"Dây gas tốt","450.000đ","31%",BanHang.TYPE_DAY));
        list.add(new BanHang(R.drawable.day,"Dây gas tốt ","450.000đ","31%",BanHang.TYPE_DAY));
        list.add(new BanHang(R.drawable.day,"Dây gas tốt ","450.000đ","31%",BanHang.TYPE_DAY));
        list.add(new BanHang(R.drawable.day,"Dây gas tốt ","450.000đ","31%",BanHang.TYPE_DAY));
        list.add(new BanHang(R.drawable.day,"Dây gas tốt ","450.000đ","31%",BanHang.TYPE_DAY));
        list.add(new BanHang(R.drawable.day,"Dây gas tốt ","450.000đ","31%",BanHang.TYPE_DAY));
        list.add(new BanHang(R.drawable.day,"Dây gas tốt ","450.000đ","31%",BanHang.TYPE_DAY));
        list.add(new BanHang(R.drawable.day,"Dây gas tốt ","450.000đ","31%",BanHang.TYPE_DAY));
        list.add(new BanHang(R.drawable.day,"Dây gas tốt ","450.000đ","31%",BanHang.TYPE_DAY));
        list.add(new BanHang(R.drawable.day,"Dây gas tốt ","450.000đ","31%",BanHang.TYPE_DAY));


        return list;
    }

    //bắt sự kiện các nút trên thanh toolbar

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home: // nút back
                onBackPressed();
                return true;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnvan:
                scrollToItem(0);
                break;
            case R.id.btnday:
                scrollToItem(10);
                break;

        }

    }

    private void scrollToItem(int index) {
        if (gridLayoutManager == null){
            return;
        }
        gridLayoutManager.scrollToPositionWithOffset(index,0);
    }

}