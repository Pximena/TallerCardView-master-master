package com.i044114.taller2.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.i044114.taller2.Models.CardView;
import com.i044114.taller2.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aula7 on 3/10/17.
 */

public class AdapterCardView extends RecyclerView.Adapter<AdapterCardView.ViewHolder> {
    List<CardView> cardViewList = new ArrayList<>();
    Context context;
    // Constructor de la clase
    public AdapterCardView(List<CardView> countryList, Context context) {
        this.cardViewList = countryList;
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
// Configuracion del ViewAdapter
// Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview, parent, false);
// Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
// Encargado de trabajar con el item.xml y sus componentes
        holder.textViewtitulo.setText(cardViewList.get(position).getTitulo());
        holder.textViewurltext.setText(cardViewList.get(position).getUrltext());

        Picasso.with(context).load(cardViewList.get(position).ArregloImages()).into(holder.imageView);
    }
    @Override
    public int getItemCount() {
        return cardViewList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewtitulo;
        ImageView imageView;
        TextView textViewurltext;
        public ViewHolder(View item) {
            super(item);
            textViewtitulo = (TextView) item.findViewById(R.id.id_tv_item_cv_user);
            imageView = (ImageView) item.findViewById(R.id.id_img_item_cardview);
            textViewurltext = (TextView) item.findViewById(R.id.id_tv_item_cv_des);
        }
    }
}
