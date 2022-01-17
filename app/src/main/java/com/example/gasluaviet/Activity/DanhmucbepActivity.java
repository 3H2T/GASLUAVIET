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

import com.example.gasluaviet.Adapter.GasAdapter;
import com.example.gasluaviet.R;
import com.example.gasluaviet.model.Gas;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class DanhmucbepActivity extends AppCompatActivity implements View.OnClickListener{
    BottomNavigationView bottomNavigationView;

    private RecyclerView rcvGas;
    private Button btnSun,btnNa,btnRi;
    private GridLayoutManager gridLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhmucbep);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar =getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);//hiển thị nút back trên toolbar
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setBackground(null);

        btnSun = findViewById(R.id.btnsun);
        btnNa = findViewById(R.id.btnna);
        btnRi = findViewById(R.id.btnrin);
        rcvGas = findViewById(R.id.rev_gas);
        gridLayoutManager =new GridLayoutManager(this, 2);
        rcvGas.setLayoutManager(gridLayoutManager);

        GasAdapter adapter = new GasAdapter(getListGas());
        rcvGas.setAdapter(adapter);

        btnSun.setOnClickListener(this);
        btnNa.setOnClickListener(this);
        btnRi.setOnClickListener(this);

    }

    private List<Gas> getListGas() {
        List<Gas> list = new ArrayList<>();
        list.add(new Gas(R.drawable.sunhouse,"sunhouse nổi","1500.000đ","21%",Gas.TYPE_PETRO));
        list.add(new Gas(R.drawable.sunhouse,"sunhouse nổi","1500.000đ","21%",Gas.TYPE_PETRO));
        list.add(new Gas(R.drawable.sunhouse,"sunhouse nổi","1500.000đ","21%",Gas.TYPE_PETRO));
        list.add(new Gas(R.drawable.sunhouse,"sunhouse nổi","1500.000đ","21%",Gas.TYPE_PETRO));
        list.add(new Gas(R.drawable.sunhouse,"sunhouse nổi","1500.000đ","21%",Gas.TYPE_PETRO));
        list.add(new Gas(R.drawable.sunhouse,"sunhouse nổi","1500.000đ","21%",Gas.TYPE_PETRO));
        list.add(new Gas(R.drawable.sunhouse,"sunhouse nổi","1500.000đ","21%",Gas.TYPE_PETRO));
        list.add(new Gas(R.drawable.sunhouse,"sunhouse nổi","1500.000đ","21%",Gas.TYPE_PETRO));
        list.add(new Gas(R.drawable.sunhouse,"sunhouse nổi","1500.000đ","21%",Gas.TYPE_PETRO));
        list.add(new Gas(R.drawable.sunhouse,"sunhouse nổi","1500.000đ","21%",Gas.TYPE_PETRO));

        list.add(new Gas(R.drawable.namilux,"namilux","1500.000đ","31%",Gas.TYPE_TOTAL));
        list.add(new Gas(R.drawable.namilux,"namilux","1500.000đ","31%",Gas.TYPE_TOTAL));
        list.add(new Gas(R.drawable.namilux,"namilux","1500.000đ","31%",Gas.TYPE_TOTAL));
        list.add(new Gas(R.drawable.namilux,"namilux","1500.000đ","31%",Gas.TYPE_TOTAL));
        list.add(new Gas(R.drawable.namilux,"namilux","1500.000đ","31%",Gas.TYPE_TOTAL));
        list.add(new Gas(R.drawable.namilux,"namilux","1500.000đ","31%",Gas.TYPE_TOTAL));
        list.add(new Gas(R.drawable.namilux,"namilux","1500.000đ","31%",Gas.TYPE_TOTAL));
        list.add(new Gas(R.drawable.namilux,"namilux","1500.000đ","31%",Gas.TYPE_TOTAL));
        list.add(new Gas(R.drawable.namilux,"namilux","1500.000đ","31%",Gas.TYPE_TOTAL));
        list.add(new Gas(R.drawable.namilux,"namilux","1500.000đ","31%",Gas.TYPE_TOTAL));

        list.add(new Gas(R.drawable.rinnai,"rinnai ","450.000đ","25%",Gas.TYPE_SHELL));
        list.add(new Gas(R.drawable.rinnai,"rinnai ","450.000đ","25%",Gas.TYPE_SHELL));
        list.add(new Gas(R.drawable.rinnai,"rinnai ","450.000đ","25%",Gas.TYPE_SHELL));
        list.add(new Gas(R.drawable.rinnai,"rinnai ","450.000đ","25%",Gas.TYPE_SHELL));
        list.add(new Gas(R.drawable.rinnai,"rinnai ","450.000đ","25%",Gas.TYPE_SHELL));
        list.add(new Gas(R.drawable.rinnai,"rinnai ","450.000đ","25%",Gas.TYPE_SHELL));
        list.add(new Gas(R.drawable.rinnai,"rinnai ","450.000đ","25%",Gas.TYPE_SHELL));
        list.add(new Gas(R.drawable.rinnai,"rinnai ","450.000đ","25%",Gas.TYPE_SHELL));
        list.add(new Gas(R.drawable.rinnai,"rinnai ","450.000đ","25%",Gas.TYPE_SHELL));
        list.add(new Gas(R.drawable.rinnai,"rinnai ","450.000đ","25%",Gas.TYPE_SHELL));

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
            case R.id.btnsun:
                scrollToItem(0);
                break;
            case R.id.btnna:
                scrollToItem(10);
                break;
            case R.id.btnrin:
                scrollToItem(20);
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