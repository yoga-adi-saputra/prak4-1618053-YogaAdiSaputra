package com.example.tugas66;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {

    private ArrayList<mahasiswa> dataList;

    public MahasiswaAdapter(ArrayList<mahasiswa> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MahasiswaAdapter.MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_mahasiswa,parent,false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaAdapter.MahasiswaViewHolder holder, int position) {
        holder.tvNama.setText(dataList.get(position).getNama());
        holder.tvNim.setText(dataList.get(position).getNim());
        holder.tvAngkatan.setText(dataList.get(position).getAngkatan());

    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNama, tvNim, tvAngkatan;
        public MahasiswaViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvNim = itemView.findViewById(R.id.tv_nim);
            tvAngkatan = itemView.findViewById(R.id.tv_angkatan);
        }
    }
}

