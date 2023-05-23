package com.example.parcial_2_grupo6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_dodge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_card);

        List<autos> autos;

        autos = new ArrayList<>();
        autos.add(new autos("Dodge 1", "charger", "Deportivo", R.drawable.charger));
        autos.add(new autos("Dodge 2", "challenger", "Deportivo", R.drawable.challenger));
        autos.add(new autos("Dodge 3", "charger01", "Deportivo", R.drawable.charger01));
        autos.add(new autos("Dodge 4", "Dart", "Deportivo", R.drawable.dart));
        autos.add(new autos("Dodge 5", "Ram", "Deportivo", R.drawable.ram));
        autos.add(new autos("Dodge 6", "Srt8", "Deportivo", R.drawable.srt8));
        autos.add(new autos("Dodge 1", "charger", "Deportivo", R.drawable.charger));
        autos.add(new autos("Dodge 2", "challenger", "Deportivo", R.drawable.challenger));
        autos.add(new autos("Dodge 3", "charger01", "Deportivo", R.drawable.charger01));
        autos.add(new autos("Dodge 4", "Dart", "Deportivo", R.drawable.dart));
        autos.add(new autos("Dodge 5", "Ram", "Deportivo", R.drawable.ram));
        autos.add(new autos("Dodge 6", "Srt8", "Deportivo", R.drawable.srt8));



        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recicle);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,autos);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(myAdapter);
    }
}