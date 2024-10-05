package com.example.pidzastor;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.window.SplashScreenView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private ImageView imageView;
  public void first_treaf() {
      Thread thread1=new Thread(){
          @Override
          public  void run(){
              try{
                  sleep(3000);
                  Intent intent = new Intent(MainActivity.this,MainActivity4.class);
                  startActivity(intent);

              }catch (InterruptedException e){
                  e.printStackTrace();
              }
          }
      };
      thread1.start();
  }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        first_treaf();
        progressBar = findViewById(R.id.progressBar);
        imageView = findViewById(R.id.imageView4);


        ObjectAnimator progressAnimator = ObjectAnimator.ofInt(progressBar, "progress", 0, 100);
        progressAnimator.setDuration(3000);
        progressAnimator.start();


        ObjectAnimator imageMoveAnimator = ObjectAnimator.ofFloat(imageView, "translationY", 0f, 500f);
        imageMoveAnimator.setDuration(3000);
        imageMoveAnimator.start();

    }
}