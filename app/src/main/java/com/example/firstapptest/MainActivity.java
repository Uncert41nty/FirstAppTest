package com.example.firstapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView resultText;
        resultText = findViewById(R.id.result);

        EditText firstNum;
        firstNum = findViewById(R.id.firstData);

        EditText secondNum;
        secondNum = findViewById(R.id.secondData);

        Button plus;
        plus = findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int plusResult;
            plusResult = Integer.parseInt(firstNum.getText().toString()) + Integer.parseInt(secondNum.getText().toString());
            resultText.setText(String.valueOf(plusResult));
            }
        });



        Button minus;
        minus = findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int minusResult;
                minusResult = Integer.parseInt(firstNum.getText().toString()) - Integer.parseInt(secondNum.getText().toString());
                resultText.setText(String.valueOf(minusResult));
            }
        });



        Button multiply;
        multiply = findViewById(R.id.multiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int multiplyResult;
                multiplyResult = Integer.parseInt(firstNum.getText().toString()) * Integer.parseInt(secondNum.getText().toString());
                resultText.setText(String.valueOf(multiplyResult));
            }
        });


        Button division;
        division = findViewById(R.id.division);
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int divisionResult;
                divisionResult = Integer.parseInt(firstNum.getText().toString()) / Integer.parseInt(secondNum.getText().toString());
                resultText.setText(String.valueOf(divisionResult));
            }
        });
    }
}