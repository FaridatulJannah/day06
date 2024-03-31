package com.example.day06;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MieAdapter extends RecyclerView.Adapter<MieAdapter.ViewHolder>{

    private ArrayList<MieModel> mieModel;

    public MieAdapter(ArrayList<MieModel> mieModel) {
        this.mieModel = mieModel;
    }

    @NonNull
    @Override
    public MieAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MieAdapter.ViewHolder holder, int position) {
        holder.namaMie.setText(mieModel.get(position).getNamaMie());
        holder.descMie.setText(mieModel.get(position).getDescMie());
        holder.hargaMie.setText(mieModel.get(position).getHargaMie());
        holder.gambarMie.setImageResource(mieModel.get(position).getGambarMie());


    }

    @Override
    public int getItemCount() {
        return mieModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView namaMie, descMie, hargaMie;
        ImageView gambarMie;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaMie = itemView.findViewById(R.id.namaMie);
            descMie = itemView.findViewById(R.id.descMie);
            hargaMie = itemView.findViewById(R.id.HargaMie);
            gambarMie = itemView.findViewById(R.id.gambarMie);

        }
    }
}
