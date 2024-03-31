package com.example.day06;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MieAdapter mieAdapter;
    private ArrayList<MieModel> mieModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        getData();

        recyclerView = findViewById(R.id.recycleview);
        mieAdapter = new MieAdapter(mieModel);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mieAdapter);
    }

    private void getData() {
        mieModel = new ArrayList<>();
        mieModel.add(new MieModel("Mie Hype Abis","Mie goreng dengan rasa ayam geprek pedas","Rp. 4.000", R.drawable.miegor1));
        mieModel.add(new MieModel("Mie Goreng Rendang","Mie goreng dengan rasa bumbu rendang","Rp. 4.000", R.drawable.miegor2));
        mieModel.add(new MieModel("Mie Goreng","Mie goreng biasa","Rp. 2.500", R.drawable.miegor3));
        mieModel.add(new MieModel("Mie Goreng Aceh","Mie goreng dengan bumbu khas Aceh","Rp. 4.000", R.drawable.miegor4));
        mieModel.add(new MieModel("Mie Goreng Hot Spicy","Mie goreng dengan pedas diatas rata-rata","Rp. 4.000", R.drawable.miegor5));
    }
}