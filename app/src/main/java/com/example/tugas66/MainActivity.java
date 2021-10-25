package com.example.tugas66;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambahData();
        recyclerView = findViewById(R.id.recyclerview);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void tambahData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new mahasiswa("Yoga Adi Saputra","1618053","2016"));
        mahasiswaArrayList.add(new mahasiswa("Saputra","1618050","2016"));
        mahasiswaArrayList.add(new mahasiswa("Adi","1618051","2016"));


    }
}
