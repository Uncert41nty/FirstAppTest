package com.example.firstapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kopilka extends AppCompatActivity implements View.OnClickListener{

    TextView textView;
    EditText editText;
    int counter;
    public Button back;


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

    }


    @Override
    public void onClick(View v) {

        textView = findViewById(R.id.tenge);
        editText = findViewById(R.id.textEnter);


        if (v.getId() == R.id.addMoney){
            int addResult;
            addResult = counter + Integer.parseInt(editText.getText().toString());
            counter = addResult;
            textView.setText(String.valueOf(addResult));
        } else if (v.getId() == R.id.takeMoney) {
            int takeResult;
            takeResult = counter - Integer.parseInt(editText.getText().toString());
            counter = takeResult;
            textView.setText(String.valueOf(takeResult));
        }

    }

}