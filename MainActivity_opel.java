package com.example.parcial_2_grupo6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_opel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_card);

        List<autos> autos;

        autos = new ArrayList<>();
        autos.add(new autos("Opel 1", "Astra", "Comercial", R.drawable.opelastra));
        autos.add(new autos("Opel 2", "Corsa", "Comercial", R.drawable.opel_corsa));
        autos.add(new autos("Opel 3", "Grandland", "Comercial", R.drawable.opel_modelo_gama_grandland));
        autos.add(new autos("Opel 4", "Mokka", "Comercial", R.drawable.opel_modelo_gama_mokka));
        autos.add(new autos("Opel 5", "Grandland", "Comercial", R.drawable.opel_modelo_gama_grandland));
        autos.add(new autos("Opel 6", "Zafira Life", "Comercial", R.drawable.opel_modelo_zafira_life));
        autos.add(new autos("Opel 1", "Astra", "Comercial", R.drawable.opelastra));
        autos.add(new autos("Opel 2", "Corsa", "Comercial", R.drawable.opel_corsa));
        autos.add(new autos("Opel 3", "Grandland", "Comercial", R.drawable.opel_modelo_gama_grandland));
        autos.add(new autos("Opel 4", "Mokka", "Comercial", R.drawable.opel_modelo_gama_mokka));
        autos.add(new autos("Opel 5", "Grandland", "Comercial", R.drawable.opel_modelo_gama_grandland));
        autos.add(new autos("Opel 6", "Zafira Life", "Comercial", R.drawable.opel_modelo_zafira_life));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recicle);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,autos);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(myAdapter);
    }
}