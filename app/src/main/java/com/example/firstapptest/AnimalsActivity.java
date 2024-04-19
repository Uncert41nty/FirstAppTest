package com.example.firstapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.ByteArrayOutputStream;
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

        animals.add(new Animal(getResources().getDrawable(R.drawable.gopnik),"Гопник", "Обитает в убитых районах городов либо выходит на охоту при трудном финансовом положении"));
        animals.add(new Animal(getResources().getDrawable(R.drawable.zetnik),"Фашист", "Начинает войну против себе подобных"));
        animals.add(new Animal(getResources().getDrawable(R.drawable.neo_nats), "Неонацист", "Больное на голову вид живого существа которое должно быть мёртвым"));


        adapter = new AnimalAdapter(this, animals);

        animalListView.setAdapter(adapter);

        itemClickListener();
    }


    private void itemClickListener() {
        animalListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(AnimalsActivity.this, AnimalDescriptionActitivty.class);
                Animal chosenAnimal = animals.get(position);
                intent.putExtra("name",chosenAnimal.getName());
                intent.putExtra("description", chosenAnimal.getDescription());

                Bitmap bitmap = ((BitmapDrawable) animals.get(position).getImage()).getBitmap();
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 70, stream);
                String imgString = Base64.encodeToString(stream.toByteArray(), Base64.NO_WRAP);

                intent.putExtra("favIcon", imgString);
                startActivity(intent);
            }
        });
    }




}