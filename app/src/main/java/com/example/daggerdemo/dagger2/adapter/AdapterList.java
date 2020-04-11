package com.example.daggerdemo.dagger2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.daggerdemo.R;

import java.util.List;

public class AdapterList extends RecyclerView.Adapter<AdapterList.HolderList> {

    private Context context;
    private List<String> list;

    public AdapterList(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public HolderList onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_main, parent, false);
        return new HolderList(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderList holder, int position) {
        String data = list.get(position);
        holder.initData(data);
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    static class HolderList extends RecyclerView.ViewHolder {

        HolderList(@NonNull View itemView) {
            super(itemView);
        }

        void initData(String data) {
        }
    }
}
