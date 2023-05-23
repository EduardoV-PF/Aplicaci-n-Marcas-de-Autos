package com.example.parcial_2_grupo6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_lamborghini extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_card);

        List<autos> autos;


        autos = new ArrayList<>();
        autos.add(new autos("Lamborghini 1", "Asterion", "Deportivo", R.drawable.asterion));
        autos.add(new autos("Lamborghini 2", "Aventador IP 780-4", "Deportivo", R.drawable.avntador780));
        autos.add(new autos("Lamborghini 3", "Aventador SVJ", "Deportivo", R.drawable.aventadorsvj));
        autos.add(new autos("Lamborghini 4", "Huracan Evo", "Deportivo", R.drawable.huracanevo));
        autos.add(new autos("Lamborghini 5", "Sian Roadster", "Deportivo", R.drawable.sianrasndter));
        autos.add(new autos("Lamborghini 6", "Urus", "Deportivo", R.drawable.urus));
        autos.add(new autos("Lamborghini 1", "Asterion", "Deportivo", R.drawable.asterion));
        autos.add(new autos("Lamborghini 2", "Aventador IP 780-4", "Deportivo", R.drawable.avntador780));
        autos.add(new autos("Lamborghini 3", "Aventador SVJ", "Deportivo", R.drawable.aventadorsvj));
        autos.add(new autos("Lamborghini 4", "Huracan Evo", "Deportivo", R.drawable.huracanevo));
        autos.add(new autos("Lamborghini 5", "Sian Roadster", "Deportivo", R.drawable.sianrasndter));
        autos.add(new autos("Lamborghini 6", "Urus", "Deportivo", R.drawable.urus));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recicle);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,autos);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(myAdapter);
    }
}