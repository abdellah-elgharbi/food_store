package com.example.pidzastor.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.ImageFormat;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pidzastor.R;
import com.example.pidzastor.beans.Repas;

import java.util.List;
import java.util.zip.Inflater;

public class Adapter extends BaseAdapter {
    private List<Repas> repas;
    private LayoutInflater infter;

    public Adapter(List<Repas> repas, Activity activity) {
        this.repas = repas;
        infter=(LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override


    public int getCount() {
        return repas.size();
    }

    @Override
    public Object getItem(int position) {
        return repas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return repas.indexOf(repas.get(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=infter.inflate(R.layout.items_pidza,null);
        TextView nbr_ingrediant=convertView.findViewById(R.id.nbr_ingrediant);
        TextView food_name=convertView.findViewById(R.id.food_name);
        TextView res_time=convertView.findViewById(R.id.rest_time);
        ImageView imageFood=convertView.findViewById(R.id.food_image);
        ImageView icone1=convertView.findViewById(R.id.icone1);
        ImageView icone2=convertView.findViewById(R.id.icone2);
        ImageView icone3=convertView.findViewById(R.id.icone3);
        nbr_ingrediant.setText(repas.get(position).getNbrImgredients()+"");
        food_name.setText(repas.get(position).getNom()+"");
        res_time.setText(repas.get(position).getDuree()+"");
        imageFood.setImageResource(repas.get(position).getPhoto());
        icone1.setImageResource(repas.get(position).getIcone());
        icone2.setImageResource(repas.get(position).getIcone1());
        icone3.setImageResource(repas.get(position).getIcone2());
        return convertView;
    }
}
