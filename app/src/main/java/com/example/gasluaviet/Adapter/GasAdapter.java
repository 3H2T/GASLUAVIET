package com.example.gasluaviet.Adapter;

import android.nfc.TagLostException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gasluaviet.R;
import com.example.gasluaviet.ultil.Gas;

import java.util.List;

public class GasAdapter extends RecyclerView.Adapter<GasAdapter.GasViewHoldel>{

    private List<Gas> mListGas;

    public GasAdapter(List<Gas> mListGas){
        this.mListGas = mListGas;
    }

    @NonNull
    @Override
    public GasViewHoldel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent,false);

        return new GasViewHoldel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GasViewHoldel holder, int position) {
        Gas gas = mListGas.get(position);
        if (gas == null){
            return;
        }
        holder.imgGas.setImageResource(gas.getHinh());
        holder.tvNameGas.setText(gas.getTen());
        holder.tvPriceGas.setText(gas.getGia());
        holder.tvSaleGas.setText(gas.getGiam());
    }

    @Override
    public int getItemCount() {
        if (mListGas != null){
            return mListGas.size();
        }
        return 0;
    }

    public class GasViewHoldel extends RecyclerView.ViewHolder{

        private ImageView imgGas;
        private TextView tvNameGas;
        private TextView tvPriceGas;
        private TextView tvSaleGas;

        public GasViewHoldel(@NonNull View itemView) {
            super(itemView);

            imgGas = itemView.findViewById(R.id.imageview);
            tvNameGas = itemView.findViewById(R.id.Name);
            tvPriceGas = itemView.findViewById(R.id.gia);
            tvSaleGas = itemView.findViewById(R.id.giam);
        }
    }
}
