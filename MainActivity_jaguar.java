package com.example.parcial_2_grupo6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_jaguar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_card);

        List<autos> autos;

        autos = new ArrayList<>();
        autos.add(new autos("Jaguar 1", "C-Type", "Deportivo", R.drawable.ctype));
        autos.add(new autos("Jaguar 2", "E-Type", "Deportivo", R.drawable.etype));
        autos.add(new autos("Jaguar 3", "F-Type", "Deportivo", R.drawable.ftype));
        autos.add(new autos("Jaguar 4", "XE", "Deportivo", R.drawable.xe));
        autos.add(new autos("Jaguar 5", "F-Pace", "Deportivo", R.drawable.fpace));
        autos.add(new autos("Jaguar 6", "XF", "Deportivo", R.drawable.xf));
        autos.add(new autos("Jaguar 1", "C-Type", "Deportivo", R.drawable.ctype));
        autos.add(new autos("Jaguar 2", "E-Type", "Deportivo", R.drawable.etype));
        autos.add(new autos("Jaguar 3", "F-Type", "Deportivo", R.drawable.ftype));
        autos.add(new autos("Jaguar 4", "XE", "Deportivo", R.drawable.xe));
        autos.add(new autos("Jaguar 5", "F-Pace", "Deportivo", R.drawable.fpace));
        autos.add(new autos("Jaguar 6", "XF", "Deportivo", R.drawable.xf));



        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recicle);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,autos);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(myAdapter);
    }
}