package com.example.parcial_2_grupo6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_subaru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_card);

        List<autos> autos;

        autos = new ArrayList<>();
        autos.add(new autos("Subaru 1", "Forester", "Comercial", R.drawable.forester));
        autos.add(new autos("Subaru 2", "Hatchbacks", "Deportivo", R.drawable.hatchbacks));
        autos.add(new autos("Subaru 3", "Impreza", "Deportivo", R.drawable.impreza));
        autos.add(new autos("Subaru 4", "Legacy", "Comercial", R.drawable.legacy));
        autos.add(new autos("Subaru 5", "WRX", "Deportivo", R.drawable.wrx));
        autos.add(new autos("Subaru 6", "XV", "Comercial", R.drawable.xv));
        autos.add(new autos("Subaru 1", "Forester", "Comercial", R.drawable.forester));
        autos.add(new autos("Subaru 2", "Hatchbacks", "Deportivo", R.drawable.hatchbacks));
        autos.add(new autos("Subaru 3", "Impreza", "Deportivo", R.drawable.impreza));
        autos.add(new autos("Subaru 4", "Legacy", "Comercial", R.drawable.legacy));
        autos.add(new autos("Subaru 5", "WRX", "Deportivo", R.drawable.wrx));
        autos.add(new autos("Subaru 6", "XV", "Comercial", R.drawable.xv));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recicle);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,autos);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(myAdapter);
    }
}