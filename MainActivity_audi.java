package com.example.parcial_2_grupo6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_audi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_card);

        List<autos> autos;

        autos = new ArrayList<>();
        autos.add(new autos("Audi 1", "A3", "Comerial", R.drawable.a3));
        autos.add(new autos("Audi 2", "A5", "Deportivo", R.drawable.a5));
        autos.add(new autos("Audi 3", "E-Tron", "Comercial", R.drawable.etron));
        autos.add(new autos("Audi 4", "Q3", "Comercial", R.drawable.q3));
        autos.add(new autos("Audi 5", "R8", "Deportivo", R.drawable.r8));
        autos.add(new autos("Audi 6", "TT", "Dportivo", R.drawable.tt));
        autos.add(new autos("Audi 1", "A3", "Comerial", R.drawable.a3));
        autos.add(new autos("Audi 2", "A5", "Deportivo", R.drawable.a5));
        autos.add(new autos("Audi 3", "E-Tron", "Comercial", R.drawable.etron));
        autos.add(new autos("Audi 4", "Q3", "Comercial", R.drawable.q3));
        autos.add(new autos("Audi 5", "R8", "Deportivo", R.drawable.r8));
        autos.add(new autos("Audi 6", "TT", "Dportivo", R.drawable.tt));



        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recicle);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,autos);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(myAdapter);
    }
}