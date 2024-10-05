package com.example.pidzastor;

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

public class MainActivity2 extends AppCompatActivity {
 private Service sr= new Service();
 private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        sr.create(new Repas("Vegetarian Pizza ",3,R.drawable.piddza5,R.drawable.temps,R.drawable.drapeau,R.drawable.go,3,"Dough: All-purpose flour, water, yeast, salt\n" +
                "Sauce: San Marzano tomatoes (or tomato sauce), olive oil, garlic\n" +
                "Toppings: Fresh mozzarella cheese, fresh basil leaves, extra virgin olive oil, salt","Pizza originated in Italy and is traditionally made with a thin, hand-stretched dough that’s crisp at the edges and soft in the middle. Topped with a simple tomato sauce, fresh mozzarella cheese, and fragrant basil leaves, this Neapolitan-style pizza is known for its light and airy crust, baked to perfection in a wood-fired oven. The flavors are balanced yet rich, with a slight char on the crust adding depth","jjjjjjjjjjjjjjjjjjjjjjjjj"));
        sr.create(new Repas("BBQ Chicken Pizza",2,R.drawable.pidzza1,R.drawable.temps,R.drawable.drapeau,R.drawable.go,3,"Dough: All-purpose flour, water, yeast, salt\n" +
                "Sauce: Tomato sauce (seasoned with oregano and garlic)\n" +
                "Toppings: Mozzarella cheese, sliced pepperoni, red pepper flakes (optional)","In the U.S., pizza often comes with a thicker, more doughy crust and is loaded with generous amounts of toppings. From pepperoni and sausage to heaps of cheese and vegetables, American pizza is hearty and filling. It’s commonly baked in electric ovens, with the crust offering a chewy texture that contrasts the rich, melted cheese and savory toppings","jjjjjjjjjjjjjjjjjjjjjjjjj"));
        sr.create(new Repas("Hawaiian Pizza ",5,R.drawable.pidzza4,R.drawable.temps,R.drawable.drapeau,R.drawable.go,3,"Dough: Whole wheat or all-purpose flour, water, yeast, salt\n" +
                "Sauce: Tomato sauce (or pesto for a twist)\n" +
                "Toppings: Mozzarella cheese, bell peppers, onions, mushrooms, black olives, spinach, artichokes","A Chicago specialty, deep-dish pizza is more like a pie, with its high, thick crust forming a deep basin for layers of cheese, meat, and chunky tomato sauce. Unlike typical pizzas, the cheese is placed directly on the crust, with the sauce layered on top of the other toppings. Baked in a deep pan, this pizza is rich, indulgent, and often eaten with a knife and fork","jjjjjjjjjjjjjjjjjjjjjjjjj"));
        sr.create(new Repas(" Pepperoni Pizza",8,R.drawable.pidzza3,R.drawable.temps,R.drawable.drapeau,R.drawable.go,3,"Dough: All-purpose flour, water, yeast, salt\n" +
                "Sauce: Barbecue sauce\n" +
                "Toppings: Cooked chicken (shredded or diced), red onions, cilantro, mozzarella cheese, gouda cheese","Gourmet pizza takes pizza to a new level of sophistication with artisanal ingredients and creative combinations. Think toppings like truffle oil, goat cheese, prosciutto, arugula, and figs on a crispy, wood-fired crust. Each bite is an explosion of bold, complex flavors, making it more of a fine dining experience than the traditional comfort food","jjjjjjjjjjjjjjjjjjjjjjjjj"));
        sr.create(new Repas("Margherita Pizza",10,R.drawable.pidzza2,R.drawable.temps,R.drawable.drapeau,R.drawable.go,3,"Dough: All-purpose flour, water, yeast, salt\n" +
                "Sauce: Tomato sauce\n" +
                "Toppings: Mozzarella cheese, diced ham, pineapple chunks, red onion (optional)","For plant-based enthusiasts, vegetarian or vegan pizza offers an array of colorful vegetables as toppings. It can be topped with roasted bell peppers, artichokes, spinach, olives, and mushrooms on a tomato base. Vegan pizzas replace traditional cheese with plant-based alternatives like cashew or almond cheese, offering the same savory, creamy texture without dairy. The crust is often gluten-free, made from alternative flours like cauliflower or almond flour","jjjjjjjjjjjjjjjjjjjjjjjjj"));
        list=findViewById(R.id.list);
        int seconde_place=sr.findAll().get(0).getId();
        list.setAdapter(new Adapter(sr.findAll(),this));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                if (!(sr.findById((int) id) == null) || seconde_place!=0) {
                    intent.putExtra("nom", sr.findById((int) id+seconde_place).getNom());
                    intent.putExtra("description", sr.findById((int) id+seconde_place).getDescription());
                    intent.putExtra("ingrediant", sr.findById((int) id+seconde_place).getDetaisIngred());
                    intent.putExtra("image", sr.findById((int) id+seconde_place).getPhoto());
                    startActivity(intent);
                }else{
                    Log.d("debug","null");

                }


            }
        });
        findViewById(R.id.imageView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(intent);
            }
        });

    }
}