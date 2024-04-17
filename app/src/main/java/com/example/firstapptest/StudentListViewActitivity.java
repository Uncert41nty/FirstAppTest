package com.example.firstapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class StudentListViewActitivity extends AppCompatActivity {

    ArrayList<Student> students;
    StudentListViewAdapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list_view_actitivity);

        listView = findViewById(R.id.studentListView);

        students = new ArrayList<>();
        students.add(new Student(getResources().getDrawable(R.drawable.sofia), "Софья", "Документальное обеспечение", 79, "Управление территориями и недвижимым имуществом", 85, "", 0));
        students.add(new Student(getResources().getDrawable(R.drawable.ytka), "Рахат", "Алгебра", 95, "Критическое мышление", 83, "Приципы Финансов", 75));
        students.add(new Student(getResources().getDrawable(R.drawable.vika), "Виктория", "Безопасность жизнедеятельности", 95, "Начертальное архитектурное проектирование", 90, "", 0));

        adapter = new StudentListViewAdapter(this, students);
        listView.setAdapter(adapter);
    }
}