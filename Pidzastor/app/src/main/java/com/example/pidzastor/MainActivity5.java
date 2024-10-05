package com.example.pidzastor;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.pidzastor.adapter.Adapter;
import com.example.pidzastor.beans.Repas;
import com.example.pidzastor.servise.Service;

public class MainActivity5 extends AppCompatActivity {
    private Service sr = new Service();
    private ListView list;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);

        // Change the content to burger information
        sr.create(new Repas("Classic Beef Burger", 5, R.drawable.bur1, R.drawable.temps, R.drawable.drapeau, R.drawable.go, 5,
                "Ingredients: Ground beef, cheddar cheese, lettuce, tomato, onion, pickles, ketchup, mustard, sesame seed bun",
                "A timeless American classic, the beef burger is made with a juicy beef patty grilled to perfection. Served with fresh lettuce, tomato, onion, and pickles, it’s topped with melted cheddar cheese, ketchup, and mustard on a toasted sesame seed bun.",
                "Delicious grilled burger"));

        sr.create(new Repas("Chicken Burger", 4, R.drawable.bur2, R.drawable.temps, R.drawable.drapeau, R.drawable.go, 4,
                "Ingredients: Grilled chicken breast, mayo, lettuce, tomato, Swiss cheese, brioche bun",
                "This chicken burger features a tender, juicy grilled chicken breast paired with creamy mayo, crisp lettuce, and tomato. The Swiss cheese adds a rich flavor, all served on a soft brioche bun.",
                "Healthy chicken burger"));

        sr.create(new Repas("BBQ Bacon Burger", 5, R.drawable.bur3, R.drawable.temps, R.drawable.drapeau, R.drawable.go, 5,
                "Ingredients: Ground beef, BBQ sauce, bacon, cheddar cheese, crispy onion rings, sesame seed bun",
                "A savory burger loaded with smoky BBQ sauce, crispy bacon, cheddar cheese, and crunchy onion rings. This burger is a flavor explosion, served on a classic sesame seed bun.",
                "Smoky BBQ goodness"));

        sr.create(new Repas("Vegan Burger", 4, R.drawable.bur4, R.drawable.temps, R.drawable.drapeau, R.drawable.go, 4,
                "Ingredients: Black bean patty, lettuce, tomato, avocado, vegan cheese, whole grain bun",
                "A healthy and delicious vegan burger made with a black bean patty, fresh avocado, lettuce, tomato, and vegan cheese. Served on a whole grain bun, it's perfect for plant-based diets.",
                "Tasty vegan option"));

        boolean s=sr.create(new Repas("Double Cheeseburger", 6, R.drawable.bur5, R.drawable.temps, R.drawable.drapeau, R.drawable.go, 6,
                "Ingredients: Two beef patties, American cheese, ketchup, mustard, pickles, onion, sesame seed bun",
                "For those who love extra, this double cheeseburger has two juicy beef patties stacked with American cheese, tangy pickles, ketchup, mustard, and onions. It's all layered in a sesame seed bun.",
                "Ultimate cheesy experience"));

        list = findViewById(R.id.list);
        list.setAdapter(new Adapter(sr.findAll(), this));
        int seconde_place=sr.findAll().get(0).getId();
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity5.this, MainActivity3.class);
                if (!(sr.findById((int) id) == null) || seconde_place!=0) {
                    intent.putExtra("nom", sr.findById((int) id+seconde_place).getNom());
                    intent.putExtra("description", sr.findById((int) id+seconde_place).getDescription());
                    intent.putExtra("ingrediant", sr.findById((int) id+seconde_place).getDetaisIngred());
                    intent.putExtra("image", sr.findById((int) id+seconde_place).getPhoto());
                    startActivity(intent);
                } else {

                       Log.d("debug","hg");
                }
            }
        });

        findViewById(R.id.imageView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}
