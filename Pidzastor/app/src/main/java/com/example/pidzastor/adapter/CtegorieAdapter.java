package com.example.pidzastor.adapter;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pidzastor.R;
import com.example.pidzastor.beans.cathegorie;

import java.util.List;
import java.util.zip.Inflater;

public class CtegorieAdapter extends BaseAdapter {
    private List <cathegorie> cath;
    private LayoutInflater infter;

    public CtegorieAdapter(List<cathegorie> cath, Activity activity) {
       this.cath=cath;
       infter=(LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return cath.size();
    }

    @Override
    public Object getItem(int position) {
        return cath.get(position);
    }

    @Override
    public long getItemId(int position) {
        return cath.indexOf(cath.get(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= infter.inflate(R.layout.category,null);
        TextView cath_name=convertView.findViewById(R.id.namecathegorue);
        System.out.println("jjjjjjjjjjjjjjj"+cath.get(position).getName()+"");
       ImageView image = convertView.findViewById(R.id.imagecathegorie);
       cath_name.setText(cath.get(position).getName()+"");
       image.setImageResource(cath.get(position).getImage());
       return convertView;
    };
}
