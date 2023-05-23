package com.example.parcial_2_grupo6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_renatul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_card);

        List<autos> autos;

        autos = new ArrayList<>();
        autos.add(new autos("Renatul 1", "Arkana", "Comercial", R.drawable.arkana));
        autos.add(new autos("Renatul 2", "Austrial", "Comercial", R.drawable.austrial));
        autos.add(new autos("Renatul 3", "Captur", "Comercial", R.drawable.captur));
        autos.add(new autos("Renatul 4", "Clio", "Comercial", R.drawable.clio));
        autos.add(new autos("Renatul 5", "Espace", "Comercial", R.drawable.espace));
        autos.add(new autos("Renatul 6", "Grand Scenic", "Comercial", R.drawable.grandscenic));
        autos.add(new autos("Renatul 1", "Arkana", "Comercial", R.drawable.arkana));
        autos.add(new autos("Renatul 2", "Austrial", "Comercial", R.drawable.austrial));
        autos.add(new autos("Renatul 3", "Captur", "Comercial", R.drawable.captur));
        autos.add(new autos("Renatul 4", "Clio", "Comercial", R.drawable.clio));
        autos.add(new autos("Renatul 5", "Espace", "Comercial", R.drawable.espace));
        autos.add(new autos("Renatul 6", "Grand Scenic", "Comercial", R.drawable.grandscenic));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recicle);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,autos);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(myAdapter);
    }
}