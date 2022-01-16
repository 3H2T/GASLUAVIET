package com.example.gasluaviet.Activity;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.ActivityNavigator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.gasluaviet.Adapter.CategoryAdapter;
import com.example.gasluaviet.Adapter.MyAdapter;
import com.example.gasluaviet.ultil.BanHang;
import com.example.gasluaviet.R;
import com.example.gasluaviet.fragment.AccoutFragment;
import com.example.gasluaviet.fragment.HomeFragment;
import com.example.gasluaviet.fragment.NotificationFragment;
import com.example.gasluaviet.fragment.OrderFragment;
import com.example.gasluaviet.fragment.SaleFragment;
import com.example.gasluaviet.ultil.Category;
import com.example.gasluaviet.ultil.Gas;
import com.example.gasluaviet.ultil.Gasban;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class TrangchuActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private DrawerLayout mDrawerLayout;
    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;
    ViewFlipper viewFlipper;
    private static final int FRAGMENT_HOME = 0;
    private static final int FRAGMENT_ORDER = 1;
    private static final int FRAGMENT_SALE = 2;
    private static final int FRAGMENT_NOTIFICATION = 3;
    private static final int FRAGMENT_ACCOUNT = 4;

    private int mCurrentFragment = FRAGMENT_HOME;


    BottomNavigationView bottomNavigationView;
    ImageButton giohang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu);

        mDrawerLayout = findViewById(R.id.drawerLayout);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setBackground(null);

        NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        rcvCategory = findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        rcvCategory.setLayoutManager(linearLayoutManager);

        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        replaceFragment(new HomeFragment());
        navigationView.getMenu().findItem(R.id.nav_home).setChecked(true);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,mDrawerLayout,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        Anhxa();
        ActionViewFlipper();
        bottomNavi();
        giohang();


    }

    private void giohang() {
        giohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TrangchuActivity.this,MainActivity.class));
            }
        });
    }

    private void bottomNavi() {
        bottomNavigationView.setSelectedItemId(R.id.bthome);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.donhang:
                        startActivity(new Intent(getApplicationContext(),DonHangCXN.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.thongbao:
                        startActivity(new Intent(getApplicationContext(),DonHangCXN.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.taikhoan:
                        startActivity(new Intent(getApplicationContext(),CapnhatActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }

    private List<Category> getListCategory() {
        List<Category> listCategory = new ArrayList<>();

        List<Gasban> listgas = new ArrayList<>();
        listgas.add(new Gasban(R.drawable.gaspetr,"Petrolimet","450.000đ","21%"));
        listgas.add(new Gasban(R.drawable.gastotal,"Totalgaz ","450.000đ","21%"));
        listgas.add(new Gasban(R.drawable.shellgas,"Shell","450.000đ","31%"));
        listgas.add(new Gasban(R.drawable.gastotal,"Totalgaz ","450.000đ","21%"));
        listgas.add(new Gasban(R.drawable.gaspetr,"Petrolimet","450.000đ","21%"));
        listgas.add(new Gasban(R.drawable.gastotal,"Totalgaz ","450.000đ","21%"));
        listgas.add(new Gasban(R.drawable.shellgas,"Shell","450.000đ","31%"));
        listgas.add(new Gasban(R.drawable.gastotal,"Totalgaz ","450.000đ","21%"));

        List<Gasban> listbep = new ArrayList<>();
        listbep.add(new Gasban(R.drawable.sunhouse,"sunhouse nổi","1500.000đ","21%"));
        listbep.add(new Gasban(R.drawable.sunhouse,"sunhouse nổi","1500.000đ","21%"));
        listbep.add(new Gasban(R.drawable.sunhouse,"sunhouse nổi","1500.000đ","21%"));
        listbep.add(new Gasban(R.drawable.namilux,"namilux","1500.000đ","31%"));
        listbep.add(new Gasban(R.drawable.namilux,"namilux","1500.000đ","31%"));
        listbep.add(new Gasban(R.drawable.namilux,"namilux","1500.000đ","31%"));
        listbep.add(new Gasban(R.drawable.rinnai,"rinnai ","450.000đ","25%"));
        listbep.add(new Gasban(R.drawable.rinnai,"rinnai ","450.000đ","25%"));
        listbep.add(new Gasban(R.drawable.rinnai,"rinnai ","450.000đ","25%"));

        listCategory.add(new Category("Giá bán hôm nay",listgas));
        listCategory.add(new Category("Bình gas",listgas));
        listCategory.add(new Category("Bếp gas",listbep));
        listCategory.add(new Category("Bình gas",listgas));
        return listCategory;
    }

    private void Anhxa() {

        viewFlipper = (ViewFlipper) findViewById(R.id.viewflip);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        giohang = findViewById(R.id.giohang);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_home){
            if (mCurrentFragment != FRAGMENT_HOME){
                replaceFragment(new HomeFragment());
                mCurrentFragment = FRAGMENT_HOME;
            }
        }else if (id == R.id.nav_donhang){
            if (mCurrentFragment != FRAGMENT_ORDER){
                replaceFragment(new OrderFragment());
                mCurrentFragment = FRAGMENT_ORDER;
            }
        }else if (id == R.id.nav_khuyenmai){
            if (mCurrentFragment != FRAGMENT_SALE){
                replaceFragment(new SaleFragment());
                mCurrentFragment = FRAGMENT_SALE;
            }
        }else if (id == R.id.nav_thongbao){
            if (mCurrentFragment != FRAGMENT_NOTIFICATION){
                replaceFragment(new NotificationFragment());
                mCurrentFragment = FRAGMENT_NOTIFICATION;
            }
        }else if (id == R.id.nav_taikhoan){
            if (mCurrentFragment != FRAGMENT_ACCOUNT){
                replaceFragment(new AccoutFragment());
                mCurrentFragment = FRAGMENT_ACCOUNT;
            }
        }

        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    private void Activity(DanhmucbepActivity danhmucbepActivity) {
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }

    private void ActionViewFlipper() {
        ArrayList<String> mangquangcao = new ArrayList<>();
        mangquangcao.add("https://gascongnghiep.com/wp-content/uploads/2016/10/hang-gas-petrolimex.jpg");
        mangquangcao.add("https://gaspetro.net/wp-content/uploads/2018/03/6.jpg");
        mangquangcao.add("https://i.ytimg.com/vi/wQ__R6K9Oe8/maxresdefault.jpg");

        for (int i = 0 ; i < mangquangcao.size(); i++){
            ImageView imageView = new ImageView(getApplicationContext());
            Picasso.with(getApplicationContext()).load(mangquangcao.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipper.addView(imageView);

        }
        viewFlipper.setFlipInterval(4000);
        viewFlipper.setAutoStart(true);

        Animation animation_slide_in = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_in_right);
        Animation animation_slide_out = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_out_right);
        viewFlipper.setInAnimation(animation_slide_in);
        viewFlipper.setOutAnimation(animation_slide_out);
    }

    private void replaceFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.framelayout,fragment);
        transaction.commit();
    }

}