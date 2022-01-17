package com.example.gasluaviet.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gasluaviet.R;
import com.example.gasluaviet.model.Gasban;

import java.util.List;

public class GasbanAdapter extends RecyclerView.Adapter<GasbanAdapter.GasbanViewHoldel>{

    private List<Gasban> mGasbans;
    public void setData(List<Gasban> list){
        this.mGasbans = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public GasbanViewHoldel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gas,parent,false);
        return new GasbanViewHoldel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GasbanViewHoldel holder, int position) {
        Gasban gasban = mGasbans.get(position);
        if (gasban == null){
            return;
        }

        holder.imgGas.setImageResource(gasban.getResourceId());
        holder.tvtitle.setText(gasban.getTitle());
        holder.tvgiaban.setText(gasban.getGia());
        holder.tvgiamgia.setText(gasban.getGiam());


    }

    @Override
    public int getItemCount() {
        if (mGasbans != null){
            return mGasbans.size();
        }
        return 0;
    }

    public class GasbanViewHoldel extends RecyclerView.ViewHolder{

        private ImageView imgGas;
        private TextView tvtitle;
        private TextView tvgiaban;
        private TextView tvgiamgia;
        public GasbanViewHoldel(@NonNull View itemView) {
            super(itemView);

            imgGas = itemView.findViewById(R.id.imggas);
            tvtitle = itemView.findViewById(R.id.Name);
            tvgiaban = itemView.findViewById(R.id.gia);
            tvgiamgia = itemView.findViewById(R.id.giam);

        }
    }
}
