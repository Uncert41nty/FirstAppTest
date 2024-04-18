package com.example.firstapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Comparator;

public class CommentsActivity extends AppCompatActivity {

    ListView listView;
    Button publishBtn;
    EditText editText;
    CommentsAdapter adapter;
    ArrayList<Comment> comments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);
        definviews();
        makeButtonWork();
        fillComments();

        comments.sort(comparator);

        adapter = new CommentsAdapter(this, comments);
        listView.setAdapter(adapter);
    }

    private void definviews() {
        listView = findViewById(R.id.commentsListView);
        publishBtn = findViewById(R.id.commentsPublishButton);
        editText = findViewById(R.id.commentsEditText);
    }

    private void makeButtonWork() {
        publishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String commentText = editText.getText().toString();
                Comment newComment = new Comment(getResources().getDrawable(R.drawable.vika), "Цыган", commentText, System.currentTimeMillis());
                comments.add(newComment);
                comments.sort(comparator);

                adapter.notifyDataSetChanged();
                editText.setText("");
            }
        });
    }

    private void fillComments() {
        comments = new ArrayList<>();
        comments.add(new Comment(getResources().getDrawable(R.drawable.ytka), "Ytka", "Геншин скатился, трейлер Арлекино полная хрень!", System.currentTimeMillis() - 5000));
        comments.add(new Comment(getResources().getDrawable(R.drawable.sofia), "Мать Фалько", "Разработчики свернули не туда.........", System.currentTimeMillis() - 3000));
    }

    public static Comparator<Comment> comparator = new Comparator<Comment>() {
        @Override
        public int compare(Comment o1, Comment o2) {
            long result1 = o1.getCommentPublishedTime();
            long result2 = o2.getCommentPublishedTime();

            return Long.compare(result2, result1);
        }
    };
}