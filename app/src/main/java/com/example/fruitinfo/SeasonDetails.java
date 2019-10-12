package com.example.fruitinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import static com.example.fruitinfo.R.drawable.abc_list_pressed_holo_dark;
import static com.example.fruitinfo.R.drawable.round_apple;
import static com.example.fruitinfo.R.drawable.round_apricot;
import static com.example.fruitinfo.R.drawable.round_avocado;
import static com.example.fruitinfo.R.drawable.round_banana;
import static com.example.fruitinfo.R.drawable.round_blackberry;
import static com.example.fruitinfo.R.drawable.round_clementines;
import static com.example.fruitinfo.R.drawable.round_cherimoya;
import static com.example.fruitinfo.R.drawable.round_cherry;
import static com.example.fruitinfo.R.drawable.round_coconut;
import static com.example.fruitinfo.R.drawable.round_date;
import static com.example.fruitinfo.R.drawable.round_durian;
import static com.example.fruitinfo.R.drawable.round_fig;
import static com.example.fruitinfo.R.drawable.round_grapes;
import static com.example.fruitinfo.R.drawable.round_guava;
import static com.example.fruitinfo.R.drawable.round_jackfruit;
import static com.example.fruitinfo.R.drawable.round_jujube;
import static com.example.fruitinfo.R.drawable.round_kiwano;
import static com.example.fruitinfo.R.drawable.round_kiwi;
import static com.example.fruitinfo.R.drawable.round_lemon;
import static com.example.fruitinfo.R.drawable.round_limes;
import static com.example.fruitinfo.R.drawable.round_lychee;
import static com.example.fruitinfo.R.drawable.round_mango;
import static com.example.fruitinfo.R.drawable.round_mangosteen;
import static com.example.fruitinfo.R.drawable.round_melon;
import static com.example.fruitinfo.R.drawable.round_orange;
import static com.example.fruitinfo.R.drawable.round_papaya;
import static com.example.fruitinfo.R.drawable.round_passion;
import static com.example.fruitinfo.R.drawable.round_peach;
import static com.example.fruitinfo.R.drawable.round_pear;
import static com.example.fruitinfo.R.drawable.round_persimmon;
import static com.example.fruitinfo.R.drawable.round_pineapple;
import static com.example.fruitinfo.R.drawable.round_plums;
import static com.example.fruitinfo.R.drawable.round_pomegranate;
import static com.example.fruitinfo.R.drawable.round_strawbery;
import static com.example.fruitinfo.R.drawable.round_tangerines;
import static com.example.fruitinfo.R.drawable.round_watermelon;

public class SeasonDetails extends AppCompatActivity {

    private GridView gridView;
    int[] image = new int[]{};
    String[] name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season_details);

        gridView = findViewById(R.id.seasonalGridViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){
            String value = bundle.getString("key");

            if(value.equals("Summer")){
                image = new int[]{round_apricot,round_blackberry,round_durian
                ,round_cherry,round_fig,round_jackfruit,round_lychee,round_passion,
                round_peach,round_plums,round_strawbery,round_watermelon};
                name  = getResources().getStringArray(R.array.summer);
                CustomAdapter customAdapter = new CustomAdapter(this,name,image);
                gridView.setAdapter(customAdapter);
            }
            if(value.equals("Fall")){
                image = new int[]{round_guava,round_grapes,round_jujube,round_limes,
                round_passion,round_pear,round_pineapple,round_pomegranate};
                name  = getResources().getStringArray(R.array.fall);
                CustomAdapter customAdapter = new CustomAdapter(this,name,image);
                gridView.setAdapter(customAdapter);
            }
            if(value.equals("Winter")){
                image = new int[]{round_banana,round_cherimoya, round_clementines,round_date,
                round_kiwi,round_orange,round_persimmon,round_tangerines};
                name  = getResources().getStringArray(R.array.winter);
                CustomAdapter customAdapter = new CustomAdapter(this,name,image);
                gridView.setAdapter(customAdapter);
            }
            if(value.equals("Spring")){
                image = new int[]{round_apricot,round_cherimoya,round_limes,round_mango,
                round_melon,round_orange,round_pineapple,round_strawbery};
                name  = getResources().getStringArray(R.array.spring);
                CustomAdapter customAdapter = new CustomAdapter(this,name,image);
                gridView.setAdapter(customAdapter);
            }
            if(value.equals("All season fruits")){
                image = new int[]{round_apple,round_apricot,round_avocado,round_banana,
                round_coconut,round_kiwano,round_lemon,round_papaya};
                name  = getResources().getStringArray(R.array.all_season_fruits);
                CustomAdapter customAdapter = new CustomAdapter(this,name,image);
                gridView.setAdapter(customAdapter);
            }
        }
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = name[position];

                Intent intent = new Intent(SeasonDetails.this,FruitDetails.class);
                intent.putExtra("name",value);
                startActivity(intent);
            }
        });
    }
}
