package com.example.fruitinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class FruitySplashScreen extends AppCompatActivity {

    private int cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_fruity_splash_screen);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(cal=20; cal<=100; cal=cal+20){
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

                Intent intent = new Intent(FruitySplashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
        thread.start();
    }
}
