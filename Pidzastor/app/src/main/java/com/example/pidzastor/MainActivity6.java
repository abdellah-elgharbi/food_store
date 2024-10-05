package com.example.pidzastor;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pidzastor.adapter.Adapter;
import com.example.pidzastor.beans.Repas;
import com.example.pidzastor.servise.Service;

public class MainActivity6 extends AppCompatActivity {
    private Service sr = new Service();
    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main6);

        // Update to taco content
        sr.create(new Repas("Beef Taco", 4, R.drawable.tac1, R.drawable.temps, R.drawable.drapeau, R.drawable.go, 4,
                "Ingredients: Ground beef, lettuce, cheese, sour cream, salsa, corn tortilla",
                "This classic taco features seasoned ground beef, fresh lettuce, shredded cheese, and a dollop of sour cream, all wrapped in a warm corn tortilla. It’s a satisfying combination of flavors with just the right amount of spice.",
                "Delicious beef taco"));

        sr.create(new Repas("Chicken Taco", 4, R.drawable.tac3, R.drawable.temps, R.drawable.drapeau, R.drawable.go, 4,
                "Ingredients: Grilled chicken, cilantro, onions, lime, soft flour tortilla",
                "A flavorful chicken taco made with tender grilled chicken, fresh cilantro, onions, and a squeeze of lime juice, served in a soft flour tortilla. A fresh and light option for taco lovers.",
                "Tasty chicken taco"));

        sr.create(new Repas("Fish Taco", 5, R.drawable.tac5, R.drawable.temps, R.drawable.drapeau, R.drawable.go, 5,
                "Ingredients: Fried fish fillet, cabbage slaw, chipotle mayo, corn tortilla",
                "Crispy fried fish fillets topped with crunchy cabbage slaw and a smoky chipotle mayo, all served in a corn tortilla. This taco has a perfect balance of textures and flavors, making it a favorite seafood option.",
                "Crispy fish taco"));

        list = findViewById(R.id.list);
        list.setAdapter(new Adapter(sr.findAll(), this));
        int seconde_place=sr.findAll().get(0).getId();
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity6.this, MainActivity3.class);
                if (!(sr.findById((int) id) == null) || seconde_place!=0) {
                    intent.putExtra("nom", sr.findById((int) id+seconde_place).getNom());
                    intent.putExtra("description", sr.findById((int) id+seconde_place).getDescription());
                    intent.putExtra("ingrediant", sr.findById((int) id+seconde_place).getDetaisIngred());
                    intent.putExtra("image", sr.findById((int) id+seconde_place).getPhoto());
                    startActivity(intent);
                } else {
                    Log.d("debug", "null");
                }
            }
        });

        findViewById(R.id.imageView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this, MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}
