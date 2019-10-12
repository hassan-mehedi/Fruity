package com.example.fruitinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class NationalFruits extends AppCompatActivity {

    private ListView listView;
    private String[] country_names;
    private SearchView searchView;
    ArrayAdapter adapter;
    String[] national_fruits_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national_fruits);

        listView = findViewById(R.id.listViewId);
        searchView = findViewById(R.id.countrySearchId);

        country_names = getResources().getStringArray(R.array.country_names);
        national_fruits_name = getResources().getStringArray(R.array.national_fruits_name);

        adapter = new ArrayAdapter(NationalFruits.this,R.layout.national_fruits_sample_view,R.id.sampleTextViewId,country_names);
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);
                return false;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = national_fruits_name[position];

                if (value.equals("No national fruit")){
                    Toast.makeText(NationalFruits.this,value,Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(NationalFruits.this,FruitDetails.class);
                    intent.putExtra("name",value);
                    startActivity(intent);
                }


            }
        });
    }
}
