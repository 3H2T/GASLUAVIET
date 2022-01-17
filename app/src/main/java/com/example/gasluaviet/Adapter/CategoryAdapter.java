package com.example.gasluaviet.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gasluaviet.R;
import com.example.gasluaviet.model.Category;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHoldel>{

    private Context context;
    private List<Category> mListCategory;

    public CategoryAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<Category> list){
        this.mListCategory = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CategoryViewHoldel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category,parent,false);
        return new CategoryViewHoldel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHoldel holder, int position) {
        Category category = mListCategory.get(position);
        if (category == null){
            return;
        }
        holder.tvNameCategory.setText(category.getNameCategory());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, RecyclerView.HORIZONTAL,false);
        holder.rcvGas.setLayoutManager(linearLayoutManager);

        GasbanAdapter gasbanAdapter = new GasbanAdapter();
        gasbanAdapter.setData(category.getGasbans());
        holder.rcvGas.setAdapter(gasbanAdapter);
    }

    @Override
    public int getItemCount() {
        if (mListCategory != null){
            return mListCategory.size();
        }
        return 0;
    }

    public class CategoryViewHoldel extends RecyclerView.ViewHolder {

        private TextView tvNameCategory;
        private RecyclerView rcvGas;

        public CategoryViewHoldel(@NonNull View itemView) {
            super(itemView);

            tvNameCategory = itemView.findViewById(R.id.NameCategory);
            rcvGas = itemView.findViewById(R.id.rcv_gas);
        }
    }
}
