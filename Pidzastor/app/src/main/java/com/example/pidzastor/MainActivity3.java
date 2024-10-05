package com.example.pidzastor;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    private TextView desctiption;
    private TextView nom;
    private TextView preparation;
    private ImageView photo;
    private Button button1;
    private  Button button2;
    private  Button button3;
    private int count;

    private  ImageView image;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       count = 1;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        desctiption=findViewById(R.id.description);
        photo=findViewById(R.id.food_image);
        nom=findViewById(R.id.food_name);
        button1=findViewById(R.id.increment);
        button2=findViewById(R.id.order);
        button3=findViewById(R.id.button);
        preparation=findViewById(R.id.ingrediant_des);
        desctiption.setText(this.getIntent().getStringExtra("description").toString());
        nom.setText(this.getIntent().getStringExtra("nom").toString());
        preparation.setText(this.getIntent().getStringExtra("ingrediant").toString());
        photo.setImageResource(this.getIntent().getIntExtra("image",0));
        System.out.println(this.getIntent().getIntExtra("image",0));
        button2.setText(button2.getText()+""+ count);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                button2.setText("order "+ (count));
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                button2.setText("order "+ (count));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity3.this);
                alert.setMessage("your  order is prepared");
                alert.setNegativeButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alert.create().show();

            }
        });
        image=findViewById(R.id.imageView);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intent);
            }
        });

    }
}

