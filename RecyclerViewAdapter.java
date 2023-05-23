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
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.MyViewHoler>{
    private Context context;
    private  List <com.example.parcial_2_grupo6.autos> data;

    public RecyclerViewAdapter(Context context, List<com.example.parcial_2_grupo6.autos>data){
        this.context = context;
        this.data = data;

    }
    @NonNull
    @Override
    public MyViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int ViewType){
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.activity_cardview_iten, parent, false);
        return  new MyViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHoler holder, @SuppressLint("RecyclerView") int position){
        holder.tvauto.setText(data.get(position).getMarca());
        holder.imgauto.setImageResource(data.get(position).getMinitu());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, com.example.parcial_2_grupo6.activity_auto.class);
                intent.putExtra("Titulo", data.get(position).getMarca());
                intent.putExtra("Descripcion", data.get(position).getDescripcion());
                intent.putExtra("imageminu", data.get(position).getMinitu());
                intent.putExtra("Categoria", data.get(position).getModelo());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
public class MyViewHoler extends RecyclerView.ViewHolder{
    TextView tvauto;
    ImageView imgauto;
    CardView cardView;
    public MyViewHoler(@NonNull View itemview) {
        super(itemview);
        tvauto = (TextView) itemview.findViewById(R.id.tvtitulo);
        imgauto = (ImageView)  itemview.findViewById(R.id.imgauto);
        cardView = (CardView) itemview.findViewById(R.id.cardview);
    }
}
}