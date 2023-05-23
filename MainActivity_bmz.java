package com.example.parcial_2_grupo6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_bmz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_card);

        List<autos> autos;

        autos = new ArrayList<>();
        autos.add(new autos("Bmw 1", "IX", "Escala", R.drawable.ix));
        autos.add(new autos("Bmw 2", "X1", "Escala", R.drawable.x1));
        autos.add(new autos("Bmw 3", "X3 M", "Escala", R.drawable.x3_m));
        autos.add(new autos("Bmw 4", "X5 M", "Escala", R.drawable.x5_m));
        autos.add(new autos("Bmw 5", "X6", "Escala", R.drawable.x6));
        autos.add(new autos("Bmw 6", "X7", "Escala", R.drawable.x7));
        autos.add(new autos("Bmw 1", "IX", "Escala", R.drawable.ix));
        autos.add(new autos("Bmw 2", "X1", "Escala", R.drawable.x1));
        autos.add(new autos("Bmw 3", "X3 M", "Escala", R.drawable.x3_m));
        autos.add(new autos("Bmw 4", "X5 M", "Escala", R.drawable.x5_m));
        autos.add(new autos("Bmw 5", "X6", "Escala", R.drawable.x6));
        autos.add(new autos("Bmw 6", "X7", "Escala", R.drawable.x7));




        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recicle);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,autos);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(myAdapter);
    }
}