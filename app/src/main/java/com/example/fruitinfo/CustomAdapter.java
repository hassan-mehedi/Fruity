package com.example.fruitinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.concurrent.CopyOnWriteArrayList;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] name;
    int[] image;

    CustomAdapter(Context context, String[] name, int[] image){
        this.context = context;
        this.name = name;
        this.image = image;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater;
        if(convertView==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.vitamin_sample_view,parent,false);
        }
        ImageView imageView = convertView.findViewById(R.id.vitaminImageViewId);
        TextView textView = convertView.findViewById(R.id.vitaminTextViewId);
        imageView.setImageResource(image[position]);
        textView.setText(name[position]);

        return convertView;
    }
}
