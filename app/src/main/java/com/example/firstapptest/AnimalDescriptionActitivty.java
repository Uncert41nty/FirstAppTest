package com.example.firstapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalDescriptionActitivty extends AppCompatActivity {
    ImageView animalIcon;
    TextView animalName, animalDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_description_actitivty);

        animalIcon = findViewById(R.id.animalActivityIcon);
        animalName = findViewById(R.id.animalActivityName);
        animalDescription = findViewById(R.id.animalActivityDescription);

        Intent returnIntent = getIntent();
        String iconCode = returnIntent.getStringExtra("favIcon");

        byte[] decodedString = Base64.decode(iconCode, Base64.DEFAULT);
        Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString,0,decodedString.length);

        animalIcon.setImageBitmap(decodedByte);
        animalName.setText(returnIntent.getStringExtra("name"));
        animalDescription.setText(returnIntent.getStringExtra("description"));
    }


}