package com.example.firstapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class GameList extends AppCompatActivity {

    ListView gameList;
    ArrayAdapter<String> adapter;
    EditText editText;
    Button btn;
    ArrayList<String> games = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_list);

        editText = findViewById(R.id.gameName);
        btn = findViewById(R.id.gameAdd);

        fillListView();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                games.add(editText.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
    }

    private void fillListView() {

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, games);

        gameList = findViewById(R.id.gameList);
        gameList.setAdapter(adapter);
    }
}