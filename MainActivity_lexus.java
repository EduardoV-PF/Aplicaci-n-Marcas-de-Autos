package com.example.parcial_2_grupo6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_lexus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_card);

        List<autos> autos;

        autos = new ArrayList<>();
        autos.add(new autos("Lexus 1", "CT", "Deportivo", R.drawable.ct));
        autos.add(new autos("Lexus 2", "ES", "Deportivo", R.drawable.es));
        autos.add(new autos("Lexus 3", "LC", "Dperotivo", R.drawable.lc));
        autos.add(new autos("Lexus 4", "LS", "Comercial", R.drawable.ls));
        autos.add(new autos("Lexus 5", "RX", "Comercial", R.drawable.rx));
        autos.add(new autos("Lexus 6", "UX", "Comercial", R.drawable.ux));
        autos.add(new autos("Lexus 1", "CT", "Deportivo", R.drawable.ct));
        autos.add(new autos("Lexus 2", "ES", "Deportivo", R.drawable.es));
        autos.add(new autos("Lexus 3", "LC", "Dperotivo", R.drawable.lc));
        autos.add(new autos("Lexus 4", "LS", "Comercial", R.drawable.ls));
        autos.add(new autos("Lexus 5", "RX", "Comercial", R.drawable.rx));
        autos.add(new autos("Lexus 6", "UX", "Comercial", R.drawable.ux));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recicle);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,autos);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(myAdapter);
    }
}