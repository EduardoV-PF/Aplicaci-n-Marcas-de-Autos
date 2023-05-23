package com.example.parcial_2_grupo6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity1 extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[],s2[];
    int images[]= {R.drawable.audi_l,
                   R.drawable.bmw_l,
                   R.drawable.dodge,
                   R.drawable.ford_l,
                   R.drawable.jaguar,
                   R.drawable.lamborghini_l,
                   R.drawable.lexus_l,
                   R.drawable.lotus_l,
                   R.drawable.maserati_l,
                   R.drawable.opel_l,
                   R.drawable.peugeot_l,
                   R.drawable.renatul_l,
                   R.drawable.subaru,
                   R.drawable.toyota_l};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);


        recyclerView=findViewById(R.id.recyclerView);


        s1=getResources().getStringArray(R.array.Autos);
        s2=getResources().getStringArray(R.array.Descripcion);

    MyAdapter myAdapter =  new MyAdapter( this,s1,s2,images);
    recyclerView.setAdapter(myAdapter);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}