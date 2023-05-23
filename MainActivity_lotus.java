package com.example.parcial_2_grupo6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_lotus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_card);

        List<autos> autos;

        autos = new ArrayList<>();
        autos.add(new autos("Lotus 1", "Electre", "Deportivo", R.drawable.electre));
        autos.add(new autos("Lotus 2", "Elise", "Deportivo", R.drawable.elise));
        autos.add(new autos("Lotus 3", "Emira", "Deportivo", R.drawable.emira));
        autos.add(new autos("Lotus 4", "Evora", "Deportivo", R.drawable.evora));
        autos.add(new autos("Lotus 5", "Exige", "Deportivo", R.drawable.exige));
        autos.add(new autos("Lotus 6", "Evija", "Deportivo", R.drawable.evija));
        autos.add(new autos("Lotus 1", "Electre", "Deportivo", R.drawable.electre));
        autos.add(new autos("Lotus 2", "Elise", "Deportivo", R.drawable.elise));
        autos.add(new autos("Lotus 3", "Emira", "Deportivo", R.drawable.emira));
        autos.add(new autos("Lotus 4", "Evora", "Deportivo", R.drawable.evora));
        autos.add(new autos("Lotus 5", "Exige", "Deportivo", R.drawable.exige));
        autos.add(new autos("Lotus 6", "Evija", "Deportivo", R.drawable.evija));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recicle);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,autos);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(myAdapter);
    }
}