package com.example.firstapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KopilkaTake extends AppCompatActivity {

    public Button okayBtn2;
    public EditText taking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kopilka_take);

        taking = findViewById(R.id.textEnter2);
        okayBtn2 = findViewById(R.id.okay2);

        okayBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent();
                returnIntent.putExtra("taking", taking.getText().toString());

                setResult(Activity.RESULT_OK, returnIntent);

                finish();
            }
        });
    }
}