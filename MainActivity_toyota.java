package com.example.parcial_2_grupo6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_toyota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_card);

        List<autos> autos;

        autos = new ArrayList<>();
        autos.add(new autos("Toyota 1", "Agya", "Comercial", R.drawable.agya));
        autos.add(new autos("Toyota 2", "Corolla", "Comercial", R.drawable.corolla));
        autos.add(new autos("Toyota 3", "Raize", "Comercial", R.drawable.raize));
        autos.add(new autos("Toyota 4", "Rav 4", "Comercial", R.drawable.rav4));
        autos.add(new autos("Toyota 5", "Rush", "Comercial", R.drawable.rush));
        autos.add(new autos("Toyota 6", "Yaris Sedan", "Comercial", R.drawable.yarisedan));
        autos.add(new autos("Toyota 1", "Agya", "Comercial", R.drawable.agya));
        autos.add(new autos("Toyota 2", "Corolla", "Comercial", R.drawable.corolla));
        autos.add(new autos("Toyota 3", "Raize", "Comercial", R.drawable.raize));
        autos.add(new autos("Toyota 4", "Rav 4", "Comercial", R.drawable.rav4));
        autos.add(new autos("Toyota 5", "Rush", "Comercial", R.drawable.rush));
        autos.add(new autos("Toyota 6", "Yaris Sedan", "Comercial", R.drawable.yarisedan));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recicle);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,autos);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(myAdapter);
    }
}