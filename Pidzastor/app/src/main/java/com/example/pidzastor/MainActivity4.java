package com.example.pidzastor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.pidzastor.adapter.CtegorieAdapter;
import com.example.pidzastor.beans.cathegorie;
import com.example.pidzastor.servise.ServiceCathegory;

import java.util.List;

public class MainActivity4 extends AppCompatActivity {
    private ServiceCathegory sr=new ServiceCathegory();
    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        sr.create(new cathegorie("Pizzas",R.drawable.pidzza1));
        sr.create(new cathegorie("Burger",R.drawable.bur1));
        sr.create(new cathegorie("tacos",R.drawable.tac1));

        list=findViewById(R.id.list2);
        list.setAdapter(new CtegorieAdapter(sr.findAll(),this));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                if (id==0){
                    intent=new Intent(MainActivity4.this,MainActivity2.class);
                    startActivity(intent);

                } else if (id==1) {
                    intent=new Intent(MainActivity4.this,MainActivity5.class);
                    startActivity(intent);
                } else if (id==2) {
                    intent=new Intent(MainActivity4.this,MainActivity6.class);
                    startActivity(intent);
                }



            }
        });
        findViewById(R.id.imageView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              finishAffinity();
            }});
    };

}