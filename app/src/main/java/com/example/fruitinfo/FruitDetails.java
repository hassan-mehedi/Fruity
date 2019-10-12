package com.example.fruitinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.nio.BufferUnderflowException;

public class FruitDetails extends AppCompatActivity {

    private TextView textView1, textView2;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_details);

        imageView = findViewById(R.id.imageViewId);
        textView1 = findViewById(R.id.headerTextViewId);
        textView2 = findViewById(R.id.paragraphTextViewId);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String fruit_name = bundle.getString("name");
            showPage(fruit_name);
        }
    }

    void showPage(String fruit_name){
        if(fruit_name.equals("Jujube")){
            imageView.setImageResource(R.drawable.round_jujube);
            textView1.setText("Jujube");
            textView2.setText(R.string.Jujube);
        }
        if(fruit_name.equals("Mango")){
            imageView.setImageResource(R.drawable.round_mango);
            textView1.setText("Mango");
            textView2.setText(R.string.Mango);
        }
        if(fruit_name.equals("Durian")){
            imageView.setImageResource(R.drawable.round_durian);
            textView1.setText("Durian");
            textView2.setText(R.string.Durian);
        }
        if(fruit_name.equals("Jackfruit")){
            imageView.setImageResource(R.drawable.round_jackfruit);
            textView1.setText("jackfruit");
            textView2.setText(R.string.jackfruit);
        }
        if(fruit_name.equals("Persimmon")){
            imageView.setImageResource(R.drawable.round_persimmon);
            textView1.setText("Persimmon");
            textView2.setText(R.string.Jujube);
        }
        if(fruit_name.equals("Pomegranate")){
            imageView.setImageResource(R.drawable.round_pomegranate);
            textView1.setText("Pomegranate");
            textView2.setText(R.string.Pomegranate);
        }
        if(fruit_name.equals("Mangosteen")){
            imageView.setImageResource(R.drawable.round_mangosteen);
            textView1.setText("Mangosteen");
            textView2.setText(R.string.Mangosteen);
        }
        if(fruit_name.equals("Rambutan")){
            imageView.setImageResource(R.drawable.round_rambutan);
            textView1.setText("Rambutan");
            textView2.setText(R.string.Rambutan);
        }
        if(fruit_name.equals("Date")){
            imageView.setImageResource(R.drawable.round_date);
            textView1.setText("Date");
            textView2.setText(R.string.Date);
        }
        if(fruit_name.equals("Fig")){
            imageView.setImageResource(R.drawable.round_fig);
            textView1.setText("Fig");
            textView2.setText(R.string.Fig);
        }
        if(fruit_name.equals("Peach")){
            imageView.setImageResource(R.drawable.round_peach);
            textView1.setText("Peach");
            textView2.setText(R.string.Peach);
        }
        if(fruit_name.equals("Chicken egg banana")){
            imageView.setImageResource(R.drawable.round_banana);
            textView1.setText("Chicken egg banana");
            textView2.setText(R.string.Chicken_egg_banana);
        }
        if(fruit_name.equals("Banana")){
            imageView.setImageResource(R.drawable.round_banana);
            textView1.setText("Banana");
            textView2.setText(R.string.Banana);
        }
        if(fruit_name.equals("Blackberry")){
            imageView.setImageResource(R.drawable.round_blackberry);
            textView1.setText("Blackberry");
            textView2.setText(R.string.Blackberry);
        }
        if(fruit_name.equals("Coconut")){
            imageView.setImageResource(R.drawable.round_coconut);
            textView1.setText("Coconut");
            textView2.setText(R.string.Coconut);
        }
        if(fruit_name.equals("Apricot")){
            imageView.setImageResource(R.drawable.round_apricot);
            textView1.setText("Apricot");
            textView2.setText(R.string.Apricot);
        }
        if(fruit_name.equals("Avocado")){
            imageView.setImageResource(R.drawable.round_avocado);
            textView1.setText("Avocado");
            textView2.setText(R.string.Avocado);
        }
        if(fruit_name.equals("Watermelon")){
            imageView.setImageResource(R.drawable.round_watermelon);
            textView1.setText("Watermelon");
            textView2.setText(R.string.Watermelon);
        }
        if(fruit_name.equals("Dragonfruit")){
            imageView.setImageResource(R.drawable.round_dragonfruit);
            textView1.setText("Dragonfruit");
            textView2.setText(R.string.Dragonfruit);
        }
        if(fruit_name.equals("Pineapple")){
            imageView.setImageResource(R.drawable.round_pineapple);
            textView1.setText("Pineapple");
            textView2.setText(R.string.Pineapple);
        }
        if(fruit_name.equals("Guava")){
            imageView.setImageResource(R.drawable.round_guava);
            textView1.setText("Guava");
            textView2.setText(R.string.Guava);
        }
        if(fruit_name.equals("Waxapple")){
            imageView.setImageResource(R.drawable.round_waxapple);
            textView1.setText("Wax Apple");
            textView2.setText(R.string.Waxapple);
        }
        if(fruit_name.equals("Cherry")){
            imageView.setImageResource(R.drawable.round_cherry);
            textView1.setText("Cherry");
            textView2.setText(R.string.Cherry);
        }
        if(fruit_name.equals("Lychee")){
            imageView.setImageResource(R.drawable.round_lychee);
            textView1.setText("Lychee");
            textView2.setText(R.string.Lychee);
        }
        if(fruit_name.equals("Plum")){
            imageView.setImageResource(R.drawable.round_plums);
            textView1.setText("Plum");
            textView2.setText(R.string.Plum);
        }
        if(fruit_name.equals("Strawberry")){
            imageView.setImageResource(R.drawable.round_strawbery);
            textView1.setText("Strawberry");
            textView2.setText(R.string.Strawberry);
        }
        if(fruit_name.equals("Kiwano")){
            imageView.setImageResource(R.drawable.round_kiwano);
            textView1.setText("Kiwano");
            textView2.setText(R.string.Kiwano);
        }
        if(fruit_name.equals("Lemon")){
            imageView.setImageResource(R.drawable.round_lemon);
            textView1.setText("Lemon");
            textView2.setText(R.string.Lemon);
        }
        if(fruit_name.equals("Papaya")){
            imageView.setImageResource(R.drawable.round_papaya);
            textView1.setText("Papaya");
            textView2.setText(R.string.Papaya);
        }
        if(fruit_name.equals("Grape")){
            imageView.setImageResource(R.drawable.round_grapes);
            textView1.setText("Grape");
            textView2.setText(R.string.Grape);
        }
        if(fruit_name.equals("Lime")){
            imageView.setImageResource(R.drawable.round_limes);
            textView1.setText("Lime");
            textView2.setText(R.string.Lime);
        }
        if(fruit_name.equals("Cherimoya")){
            imageView.setImageResource(R.drawable.round_cherimoya);
            textView1.setText("Cherimoya");
            textView2.setText(R.string.Cherimoya);
        }
        if(fruit_name.equals("Clementine")){
            imageView.setImageResource(R.drawable.round_clementines);
            textView1.setText("Clementine");
            textView2.setText(R.string.Clementine);
        }
        if(fruit_name.equals("Kiwifruit")){
            imageView.setImageResource(R.drawable.round_kiwi);
            textView1.setText("Kiwifruit");
            textView2.setText(R.string.Kiwifruit);
        }
        if(fruit_name.equals("Orange")){
            imageView.setImageResource(R.drawable.round_orange);
            textView1.setText("Orange");
            textView2.setText(R.string.Orange);
        }
        if(fruit_name.equals("Tangerine")){
            imageView.setImageResource(R.drawable.round_tangerines);
            textView1.setText("Tangerine");
            textView2.setText(R.string.Tangerine);
        }
        if(fruit_name.equals("Melon")){
            imageView.setImageResource(R.drawable.round_melon);
            textView1.setText("Melon");
            textView2.setText(R.string.Melon);
        }
        if(fruit_name.equals("Pear")){
            imageView.setImageResource(R.drawable.round_pear);
            textView1.setText("Pear");
            textView2.setText(R.string.Pear);
        }
        if(fruit_name.equals("Apple")){
            imageView.setImageResource(R.drawable.round_apple);
            textView1.setText("Apple");
            textView2.setText(R.string.Apple);
        }
    }
}
