package com.example.parcial_2_grupo6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter <MyAdapter.MyViewHolder>{

    String data1[],data2[];
    int images[];
    Context context;


    public MyAdapter(Context ct, String s1[], String s2[], int img[]){
     context = ct;
     data1=s1;
     data2=s2;
     images=img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_file, parent,false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.tex1.setText(data1[position]);
        holder.tex2.setText(data2[position]);
        holder.myImage.setImageResource(images[position]);


        holder.mainLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (data1[position].equals("AUDI")){
                    Intent intent = new Intent(context, MainActivity_audi.class);
                    context.startActivities(new Intent[]{intent});
                }

                if (data1[position].equals("BMW")){
                    Intent intent = new Intent(context, MainActivity_bmz.class);
                    context.startActivities(new Intent[]{intent});
                }

                if (data1[position].equals("DODGE")){
                    Intent intent = new Intent(context, MainActivity_dodge.class);
                    context.startActivities(new Intent[]{intent});
                }


                if (data1[position].equals("FORD")){
                    Intent intent = new Intent(context, MainActivity_ford.class);
                    context.startActivities(new Intent[]{intent});
                }

                if (data1[position].equals("JAGUAR")){
                    Intent intent = new Intent(context, MainActivity_jaguar.class);
                    context.startActivities(new Intent[]{intent});
                }

                if (data1[position].equals("LAMBORGHINI")){
                    Intent intent = new Intent(context, MainActivity_lamborghini.class);
                    context.startActivities(new Intent[]{intent});
                }

                if (data1[position].equals("LEXUS")){
                    Intent intent = new Intent(context, MainActivity_lexus.class);
                    context.startActivities(new Intent[]{intent});
                }

                if (data1[position].equals("LOTUS")){
                    Intent intent = new Intent(context, MainActivity_lotus.class);
                    context.startActivities(new Intent[]{intent});
                }

                if (data1[position].equals("MASERATI")){
                    Intent intent = new Intent(context, MainActivity_maserati.class);
                    context.startActivities(new Intent[]{intent});
                }


                if (data1[position].equals("OPEL")){
                    Intent intent = new Intent(context, MainActivity_opel.class);
                    context.startActivities(new Intent[]{intent});
                }

                if (data1[position].equals("PEUGEOT")){
                    Intent intent = new Intent(context, MainActivity_peugeot.class);
                    context.startActivities(new Intent[]{intent});
                }

                if (data1[position].equals("RENATUL")){
                    Intent intent = new Intent(context, MainActivity_renatul.class);
                    context.startActivities(new Intent[]{intent});
                }


                if (data1[position].equals("SUBARU")){
                    Intent intent = new Intent(context, MainActivity_subaru.class);
                    context.startActivities(new Intent[]{intent});
                }

                if (data1[position].equals("TOYOTA")){
                    Intent intent = new Intent(context, MainActivity_toyota.class);
                    context.startActivities(new Intent[]{intent});
                }





            }
        });

    }


    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tex1,tex2;
        ImageView myImage;
        ConstraintLayout mainLayout1;


        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            tex1=itemView.findViewById(R.id.Marcas);
            tex2=itemView.findViewById(R.id.descripcion);
            myImage=itemView.findViewById(R.id.My_Image);
            mainLayout1  = itemView.findViewById(R.id.mainLayout);
        }
    }
}
