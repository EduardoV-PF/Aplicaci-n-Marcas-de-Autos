package com.example.parcial_2_grupo6;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class activity_auto extends AppCompatActivity {
TextView tvtitulo, tvcategorias, tvdescripcion;
ImageView img, imgl,imgf;


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
        setContentView(R.layout.activity_auto);




        tvtitulo = (TextView) findViewById(R.id.auto);
        tvcategorias = (TextView) findViewById(R.id.Categoria);
        tvdescripcion = (TextView) findViewById(R.id.Descripcion);
        img = (ImageView) findViewById(R.id.imageminu);
        imgl = (ImageView) findViewById(R.id.imgl);
        imgf = (ImageView) findViewById(R.id.fondo);

        Intent intent = getIntent();
        String titulo = intent.getExtras().getString("Titulo");
        String categoria = intent.getExtras().getString("Categoria");
        String descripcion = intent.getExtras().getString("Descripcion");
        int image = intent.getExtras().getInt("imageminu");


        img.setImageResource(image);
        tvtitulo.setText(titulo);
        tvcategorias.setText(categoria);
        tvdescripcion.setText(descripcion);

        Glide.with(this).load(R.drawable.fondo1).into(imgf);



        if (titulo.equals("Audi 1")
                || titulo.equals("Audi 2")
                || titulo.equals("Audi 3")
                || titulo.equals("Audi 4")
                || titulo.equals("Audi 5")
                || titulo.equals("Audi 6")) {
            imgl.setImageResource(R.drawable.audi_l);
        }

        if (titulo.equals("Bmw 1")
                || titulo.equals("Bmw 2")
                || titulo.equals("Bmw 3")
                || titulo.equals("Bmw 4")
                || titulo.equals("Bmw 5")
                || titulo.equals("Bmw 6")) {
            imgl.setImageResource(R.drawable.bmw_l);
        }

        if (titulo.equals("Dodge 1")
                || titulo.equals("Dodge 2")
                || titulo.equals("Dodge 3")
                || titulo.equals("Dodge 4")
                || titulo.equals("Dodge 5")
                || titulo.equals("Dodge 6")) {
            imgl.setImageResource(R.drawable.dodge);
        }

        if (titulo.equals("Ford 1")
                || titulo.equals("Ford 2")
                || titulo.equals("Ford 3")
                || titulo.equals("Ford 4")
                || titulo.equals("Ford 5")
                || titulo.equals("Ford 6")) {
            imgl.setImageResource(R.drawable.ford_l);
        }

        if (titulo.equals("Jaguar 1")
                || titulo.equals("Jaguar 2")
                || titulo.equals("Jaguar 3")
                || titulo.equals("Jaguar 4")
                || titulo.equals("Jaguar 5")
                || titulo.equals("Jaguar 6")) {
            imgl.setImageResource(R.drawable.jaguar);
        }

        if (titulo.equals("Lamborghini 1")
                || titulo.equals("Lamborghini 2")
                || titulo.equals("Lamborghini 3")
                || titulo.equals("Lamborghini 4")
                || titulo.equals("Lamborghini 5")
                || titulo.equals("Lamborghini 6")) {
            imgl.setImageResource(R.drawable.lamborghini_l);
        }

        if (titulo.equals("Lexus 1")
                || titulo.equals("Lexus 2")
                || titulo.equals("Lexus 3")
                || titulo.equals("Lexus 4")
                || titulo.equals("Lexus 5")
                || titulo.equals("Lexus 6")) {
            imgl.setImageResource(R.drawable.lexus_l);
        }

        if (titulo.equals("Lotus 1")
                || titulo.equals("Lotus 2")
                || titulo.equals("Lotus 3")
                || titulo.equals("Lotus 4")
                || titulo.equals("Lotus 5")
                || titulo.equals("Lotus 6")) {
            imgl.setImageResource(R.drawable.lotus_l);
        }

        if (titulo.equals("Masserati 1")
                || titulo.equals("Masserati 2")
                || titulo.equals("Masserati 3")
                || titulo.equals("Masserati 4")
                || titulo.equals("Masserati 5")
                || titulo.equals("Masserati 6")) {
            imgl.setImageResource(R.drawable.maserati_l);
        }

        if(titulo.equals("Opel 1")
                ||titulo.equals("Opel 2")
                ||titulo.equals("Opel 3")
                ||titulo.equals("Opel 4")
                ||titulo.equals("Opel 5")
                ||titulo.equals("Opel 6")){
            imgl.setImageResource(R.drawable.opel_l);
        }

        if(titulo.equals("Peugeot 1")
                ||titulo.equals("Peugeot 2")
                ||titulo.equals("Peugeot 3")
                ||titulo.equals("Peugeot 4")
                ||titulo.equals("Peugeot 5")
                ||titulo.equals("Peugeot 6")){
            imgl.setImageResource(R.drawable.peugeot_l);
        }

        if(titulo.equals("Renatul 1")
                ||titulo.equals("Renatul 2")
                ||titulo.equals("Renatul 3")
                ||titulo.equals("Renatul 4")
                ||titulo.equals("Renatul 5")
                ||titulo.equals("Renatul 6")){
            imgl.setImageResource(R.drawable.renatul_l);
        }

        if(titulo.equals("Subaru 1")
                ||titulo.equals("Subaru 2")
                ||titulo.equals("Subaru 3")
                ||titulo.equals("Subaru 4")
                ||titulo.equals("Subaru 5")
                ||titulo.equals("Subaru 6")){
            imgl.setImageResource(R.drawable.subaru);
        }

        if(titulo.equals("Toyota 1")
                ||titulo.equals("Toyota 2")
                ||titulo.equals("Toyota 3")
                ||titulo.equals("Toyota 4")
                ||titulo.equals("Toyota 5")
                ||titulo.equals("Toyota 6")){
            imgl.setImageResource(R.drawable.toyota_l);
        }





    }
}