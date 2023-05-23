package com.example.parcial_2_grupo6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_maserati extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_card);

        List<autos> autos;

        autos = new ArrayList<>();
        autos.add(new autos("Masserati 1", "Ghibli", "Deportivo", R.drawable.ghibli));
        autos.add(new autos("Masserati 2", "Grand Cabrio", "Deportivo", R.drawable.grancabrio));
        autos.add(new autos("Masserati 3", "Grand Turismo", "Deportivo", R.drawable.granturismo));
        autos.add(new autos("Masserati 4", "Grecale", "Deportivo", R.drawable.grecale));
        autos.add(new autos("Masserati 5", "Levante", "Deportivo", R.drawable.levante));
        autos.add(new autos("Masserati 6", "MC20", "Deportivo", R.drawable.mc20));
        autos.add(new autos("Masserati 1", "Ghibli", "Deportivo", R.drawable.ghibli));
        autos.add(new autos("Masserati 2", "Grand Cabrio", "Deportivo", R.drawable.grancabrio));
        autos.add(new autos("Masserati 3", "Grand Turismo", "Deportivo", R.drawable.granturismo));
        autos.add(new autos("Masserati 4", "Grecale", "Deportivo", R.drawable.grecale));
        autos.add(new autos("Masserati 5", "Levante", "Deportivo", R.drawable.levante));
        autos.add(new autos("Masserati 6", "MC20", "Deportivo", R.drawable.mc20));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recicle);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,autos);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(myAdapter);
    }
}