package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter {
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private String[] mDataset;
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public MyViewHolder(View v){
            (super v);
            textView = v.findViewById(R.id.tvFirstNameRow);



        }
    }
    public MyAdapter(String[]myDataset) {mDataset= myDataset;}
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,int ViewType){
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.data_row,parent, attachToRoot:false)
        return new MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
}
