package com.example.fruitinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import static com.example.fruitinfo.R.drawable.round_apricot;
import static com.example.fruitinfo.R.drawable.round_avocado;
import static com.example.fruitinfo.R.drawable.round_banana;
import static com.example.fruitinfo.R.drawable.round_blackberry;
import static com.example.fruitinfo.R.drawable.round_coconut;
import static com.example.fruitinfo.R.drawable.round_date;
import static com.example.fruitinfo.R.drawable.round_dragonfruit;
import static com.example.fruitinfo.R.drawable.round_durian;
import static com.example.fruitinfo.R.drawable.round_fig;
import static com.example.fruitinfo.R.drawable.round_guava;
import static com.example.fruitinfo.R.drawable.round_jackfruit;
import static com.example.fruitinfo.R.drawable.round_jujube;
import static com.example.fruitinfo.R.drawable.round_mango;
import static com.example.fruitinfo.R.drawable.round_mangosteen;
import static com.example.fruitinfo.R.drawable.round_passion;
import static com.example.fruitinfo.R.drawable.round_peach;
import static com.example.fruitinfo.R.drawable.round_persimmon;
import static com.example.fruitinfo.R.drawable.round_pineapple;
import static com.example.fruitinfo.R.drawable.round_pomegranate;
import static com.example.fruitinfo.R.drawable.round_rambutan;
import static com.example.fruitinfo.R.drawable.round_watermelon;
import static com.example.fruitinfo.R.drawable.round_waxapple;

public class FruitsVitamin extends AppCompatActivity {

    private GridView gridView;
    int[] images = new int[]{round_apricot,round_avocado,round_banana,round_blackberry
    ,round_coconut,round_date,round_dragonfruit,round_durian,round_fig,round_guava,
    round_jackfruit,round_jujube,round_mango,round_mangosteen,round_passion,round_peach,
    round_persimmon,round_pineapple,round_pomegranate,round_rambutan,round_watermelon,round_waxapple};

    String[] name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits_vitamin);

        gridView = findViewById(R.id.gridViewId);
        name = getResources().getStringArray(R.array.namess);

        CustomAdapter customAdapter = new CustomAdapter(this,name,images);
        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = name[position];

                Intent intent = new Intent(FruitsVitamin.this,FruitDetails.class);
                intent.putExtra("name",value);
                startActivity(intent);
            }
        });

    }
}
