package com.example.parcial_2_grupo6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_peugeot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_card);

        List<autos> autos;

        autos = new ArrayList<>();
        autos.add(new autos("Peugeot 1", "108", "Comercial", R.drawable.peg108));
        autos.add(new autos("Peugeot 2", "508", "Comercial", R.drawable.peg508));
        autos.add(new autos("Peugeot 3", "4008", "Comercial", R.drawable.peg4008));
        autos.add(new autos("Peugeot 4", "5008", "Comercial", R.drawable.peg5008));
        autos.add(new autos("Peugeot 5", "RCZR", "Comercial", R.drawable.rczr));
        autos.add(new autos("Peugeot 6", "Rifte", "Comercial", R.drawable.rifte));
        autos.add(new autos("Peugeot 1", "108", "Comercial", R.drawable.peg108));
        autos.add(new autos("Peugeot 2", "508", "Comercial", R.drawable.peg508));
        autos.add(new autos("Peugeot 3", "4008", "Comercial", R.drawable.peg4008));
        autos.add(new autos("Peugeot 4", "5008", "Comercial", R.drawable.peg5008));
        autos.add(new autos("Peugeot 5", "RCZR", "Comercial", R.drawable.rczr));
        autos.add(new autos("Peugeot 6", "Rifte", "Comercial", R.drawable.rifte));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recicle);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,autos);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(myAdapter);
    }
}