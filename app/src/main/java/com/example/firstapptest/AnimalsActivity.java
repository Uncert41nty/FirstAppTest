package com.example.firstapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AnimalsActivity extends AppCompatActivity {

    ArrayList<Animal> animals;
    ListView animalListView;
    AnimalAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);


        animals = new ArrayList<>();

        animalListView = findViewById(R.id.animalListView);

        animals.add(new Animal(getResources().getDrawable(R.drawable.gopnik ),"Гопник"));
        animals.add(new Animal(getResources().getDrawable(R.drawable.zetnik ),"Фашист"));
        animals.add(new Animal(getResources().getDrawable(R.drawable.neo_nats), "Неонацист"));

        adapter = new AnimalAdapter(this, animals);

        animalListView.setAdapter(adapter);
    }




}