package com.example.parcial_2_grupo6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_ford extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_card);

        List<autos> autos;

        autos = new ArrayList<>();
        autos.add(new autos("Ford 1", "B Max", "Comercial", R.drawable.ford_modelo_b_max));
        autos.add(new autos("Ford 2", "Eco Sport", "Comercial", R.drawable.ford_modelo_ecosport));
        autos.add(new autos("Ford 3", "Bronco", "Comercial", R.drawable.ford_modelo_bronco));
        autos.add(new autos("Ford 4", "C Max", "Comercial", R.drawable.ford_modelo_c_max));
        autos.add(new autos("Ford 5", "Edge", "Comercial", R.drawable.ford_modelo_edge));
        autos.add(new autos("Ford 6", "Evos", "Comercial", R.drawable.ford_modelo_evos));
        autos.add(new autos("Ford 1", "B Max", "Comercial", R.drawable.ford_modelo_b_max));
        autos.add(new autos("Ford 2", "Eco Sport", "Comercial", R.drawable.ford_modelo_ecosport));
        autos.add(new autos("Ford 3", "Bronco", "Comercial", R.drawable.ford_modelo_bronco));
        autos.add(new autos("Ford 4", "C Max", "Comercial", R.drawable.ford_modelo_c_max));
        autos.add(new autos("Ford 5", "Edge", "Comercial", R.drawable.ford_modelo_edge));
        autos.add(new autos("Ford 6", "Evos", "Comercial", R.drawable.ford_modelo_evos));



        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recicle);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,autos);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(myAdapter);
    }
}