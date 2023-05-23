package com.example.parcial_2_grupo6;

/*
         Parcial #1

Eduardo Vasquez     8-944-948
Jonathan Amador     8-952-1987
Eduardo Barría      6-722-570
Alberto Consiglieri 20-70-3971
Miguel Ortega       8-943-1355
Fernando Rios       8-946-1621
*/


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.VideoView;
import android.media.MediaPlayer;




public class MainActivity extends AppCompatActivity {
   public VideoView videoV;
   public MediaPlayer mMediaPlayer;
   public int VideoPostion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        videoV = (VideoView) findViewById(R.id.videoV);
        ImageView inicio = (ImageView) findViewById(R.id.inicio);

/*proceso de impresion de video de fondo*/

        Uri uri = Uri.parse("android.resource://"
                + getPackageName()
                + "/" + R.raw.autov);

        videoV.setVideoURI(uri);
        videoV.start();

        videoV.setOnPreparedListener((mediaPlayer) -> {
            mMediaPlayer = mediaPlayer;
            mMediaPlayer.setLooping(true);
            if(VideoPostion!=0) {
                mMediaPlayer.seekTo(VideoPostion);
                mMediaPlayer.start();
            }
        });
        /*animacion de boton*/

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        inicio.startAnimation(animation);


        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, MainActivity1.class);
                startActivity(intent);
            }

        });


    }


    @Override
    protected void onResume (){
        super.onResume();
        ImageView inicio = (ImageView) findViewById(R.id.inicio);
        videoV.start();
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        inicio.startAnimation(animation);
    }
}