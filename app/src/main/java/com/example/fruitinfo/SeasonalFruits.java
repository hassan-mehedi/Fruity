package com.example.fruitinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class SeasonalFruits extends AppCompatActivity{

    private Button summer,fall,winter,spring,all_season_fruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasonal_fruits);

        summer = findViewById(R.id.summerId);
        fall = findViewById(R.id.fallId);
        winter = findViewById(R.id.winterId);
        spring = findViewById(R.id.springId);
        all_season_fruit = findViewById(R.id.allSeasonFruitsId);

        summer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeasonalFruits.this,SeasonDetails.class);
                intent.putExtra("key","Summer");
                startActivity(intent);
            }
        });
        fall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeasonalFruits.this,SeasonDetails.class);
                intent.putExtra("key","Fall");
                startActivity(intent);
            }
        });
        winter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeasonalFruits.this,SeasonDetails.class);
                intent.putExtra("key","Winter");
                startActivity(intent);
            }
        });
        spring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeasonalFruits.this,SeasonDetails.class);
                intent.putExtra("key","Spring");
                startActivity(intent);
            }
        });
        all_season_fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeasonalFruits.this,SeasonDetails.class);
                intent.putExtra("key","All season fruits");
                startActivity(intent);
            }
        });

    }
}
