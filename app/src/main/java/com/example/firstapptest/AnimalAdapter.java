package com.example.firstapptest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AnimalAdapter extends ArrayAdapter<Animal> {
    Context context;
    ArrayList<Animal> animals;
    View v;
    public AnimalAdapter(@NonNull Context context, ArrayList<Animal> animals) {
        super(context, R.layout.list_view_animals, animals);
        this.context = context;
        this.animals = animals;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Animal animal = this.animals.get(position);

        LayoutInflater inflater = LayoutInflater.from(this.context);
        v = inflater.inflate(R.layout.list_view_animals, null, false);

        ImageView icon = v.findViewById(R.id.animalImage);
        TextView textName = v.findViewById(R.id.animalText);

        icon.setImageDrawable(animal.getImage());
        textName.setText(animal.getName());



        return v;
    }
}
