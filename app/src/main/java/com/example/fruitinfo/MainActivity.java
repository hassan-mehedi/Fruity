package com.example.fruitinfo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    AlertDialog.Builder alertdiaglogbuilder;
    private Button seasonal_fruits;
    private Button vitamin_in_fruits;
    private Button national_fruits;
    private Button fruits_related_videos;
    private Button share_app;
    private Button about_us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seasonal_fruits = findViewById(R.id.seasonalFruitsId);
        vitamin_in_fruits = findViewById(R.id.fruitsVitaminId);
        national_fruits = findViewById(R.id.nationalFruitsId);
        fruits_related_videos = findViewById(R.id.fruitRelatedVideosId);
        share_app = findViewById(R.id.shareThisAppId);
        about_us = findViewById(R.id.aboutUsId);

        seasonal_fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SeasonalFruits.class);
                startActivity(intent);
            }
        });

        vitamin_in_fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FruitsVitamin.class);
                startActivity(intent);
            }
        });

        national_fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NationalFruits.class);
                startActivity(intent);
            }
        });

        fruits_related_videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FruitRelatedVideos.class);
                startActivity(intent);
            }
        });

        share_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");

                String sub,body;
                sub = "Increase your fruit knowledge";
                body = "This app helps you to know about fruits information";

                intent.putExtra(Intent.EXTRA_SUBJECT,sub);
                intent.putExtra(Intent.EXTRA_SUBJECT,body);

                startActivity(Intent.createChooser(intent,"Share with"));
            }
        });

        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public void onBackPressed() {
        alertdiaglogbuilder = new AlertDialog.Builder(MainActivity.this);
        alertdiaglogbuilder.setTitle("Alert");
        alertdiaglogbuilder.setIcon(R.drawable.ex2);
        alertdiaglogbuilder.setMessage("Do you want to exit!");
        alertdiaglogbuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertdiaglogbuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = alertdiaglogbuilder.create();
        alertDialog.show();
    }
}
