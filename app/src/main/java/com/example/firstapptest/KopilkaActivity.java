package com.example.firstapptest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class KopilkaActivity extends AppCompatActivity {

    TextView textView;
    int counter;
    public Button back;
    public Button addBtn;
    public Button takeBtn;
    private static final int LAUNCH_KOPILKA_ADD_ACTIVITY = 88;
    private static final int LAUNCH_TAKING_MONEY_ACTIVITY = 89;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        textView = findViewById(R.id.tenge);

        if (requestCode == LAUNCH_KOPILKA_ADD_ACTIVITY) {
            if (resultCode == Activity.RESULT_OK) {
                String result = data.getStringExtra("adding");

                counter+=Integer.parseInt(result);

                textView.setText(String.valueOf(counter));
            }
        }

        if (requestCode == LAUNCH_TAKING_MONEY_ACTIVITY) {
            if (resultCode == Activity.RESULT_OK) {
                String result = data.getStringExtra("taking");

                counter-=Integer.parseInt(result);

                textView.setText(String.valueOf(counter));
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kopilka);
        counter = 0;

        back = findViewById(R.id.backFromKopilka);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        addBtn = findViewById(R.id.addMoney);
        takeBtn = findViewById(R.id.takeMoney);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KopilkaActivity.this, KopilkaAdd.class);
                startActivityForResult(intent, LAUNCH_KOPILKA_ADD_ACTIVITY);
            }
        });

        takeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KopilkaActivity.this, KopilkaTake.class);
                startActivityForResult(intent, LAUNCH_TAKING_MONEY_ACTIVITY);
            }
        });
    }



}