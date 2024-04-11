package com.example.firstapptest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class KopilkaAdd extends AppCompatActivity {

    public Button okayBtn;
    public EditText adding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kopilka_add);

        adding = findViewById(R.id.textEnter);
        okayBtn = findViewById(R.id.okay);

        okayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent();
                returnIntent.putExtra("adding", adding.getText().toString());

                setResult(Activity.RESULT_OK, returnIntent);

                finish();
            }
        });
    }

}