package com.example.firstapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NewCalculator extends AppCompatActivity  implements View.OnClickListener{

    TextView resultText;

    public EditText firstNum;

    public EditText secondNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_calculator);
    }


    @Override
    public void onClick(View v) {
        resultText = findViewById(R.id.result2);
        firstNum = findViewById(R.id.firstData2);
        secondNum = findViewById(R.id.secondData2);

        if (v.getId() == R.id.plusListener) {
            double plusResult;
            plusResult = Double.parseDouble(firstNum.getText().toString()) + Double.parseDouble(secondNum.getText().toString());
            resultText.setText(String.valueOf(plusResult));
        } else if (v.getId() == R.id.multiplyListener) {
            double multiplyResult;
            multiplyResult = Double.parseDouble(firstNum.getText().toString()) * Double.parseDouble(secondNum.getText().toString());
            resultText.setText(String.valueOf(multiplyResult));
        } else if (v.getId() == R.id.minusListener) {
            double minusResult;
            minusResult = Double.parseDouble(firstNum.getText().toString()) - Double.parseDouble(secondNum.getText().toString());
            resultText.setText(String.valueOf(minusResult));
        } else {
            resultText.setText("Something went wrong");
        }
    }


}