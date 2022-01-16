package com.example.gasluaviet.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gasluaviet.R;
import com.example.gasluaviet.ultil.BanHang;
import com.example.gasluaviet.ultil.Gas;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.PhukienViewHoldel>{
    private List<BanHang> mBanhangGas;
    public MyAdapter(List<BanHang> mBanhangGas){
        this.mBanhangGas = mBanhangGas;
    }

    @NonNull
    @Override
    public MyAdapter.PhukienViewHoldel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent,false);

        return new MyAdapter.PhukienViewHoldel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.PhukienViewHoldel holder, int position) {
        BanHang banHang = mBanhangGas.get(position);
        if (banHang == null){
            return;
        }
        holder.imgPhukien.setImageResource(banHang.getImage());
        holder.tvNamePhukien.setText(banHang.getName());
        holder.tvPricePhukien.setText(banHang.getPrice());
        holder.tvSalePhukien.setText(banHang.getDiscount());
    }

    @Override
    public int getItemCount() {
        if (mBanhangGas != null){
            return mBanhangGas.size();
        }
        return 0;
    }


    public class PhukienViewHoldel extends RecyclerView.ViewHolder{
        private ImageView imgPhukien;
        private TextView tvNamePhukien;
        private TextView tvPricePhukien;
        private TextView tvSalePhukien;

        public PhukienViewHoldel(@NonNull View itemView) {
            super(itemView);
            imgPhukien = itemView.findViewById(R.id.imageview);
            tvNamePhukien = itemView.findViewById(R.id.Name);
            tvPricePhukien = itemView.findViewById(R.id.gia);
            tvSalePhukien = itemView.findViewById(R.id.giam);
        }
    }
}
