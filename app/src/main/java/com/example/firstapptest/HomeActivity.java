package com.example.firstapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {


    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    @Override
    public void onClick(View v) {
        btn1 = findViewById(R.id.kop1lka);
        btn2 = findViewById(R.id.c4lculator);
        btn3 = findViewById(R.id.gamesActivity);
        btn4 = findViewById(R.id.animalActivity);
        btn5 = findViewById(R.id.studentActivity);

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Kopilka.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, NewCalculator.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, GameList.class);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AnimalsActivity.class);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, StudentListViewActitivity.class);
                startActivity(intent);
            }
        });
    }
}