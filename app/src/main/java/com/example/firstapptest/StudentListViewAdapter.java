package com.example.firstapptest;

import android.content.Context;
import android.security.keystore.StrongBoxUnavailableException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.firstapptest.R;
import com.example.firstapptest.Student;

import java.util.ArrayList;

public class StudentListViewAdapter extends ArrayAdapter<Student>{

    Context context;
    View v;
    ArrayList<Student> students;
    public StudentListViewAdapter(@NonNull Context context, ArrayList<Student> students) {
        super(context, R.layout.item_listview_student, students);
        this.context = context;
        this.students = students;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Student student = this.students.get(position);

        LayoutInflater inflater = LayoutInflater.from(this.context);
        v = inflater.inflate(R.layout.item_listview_student,null,false);

        ImageView icon = v.findViewById(R.id.itemStudentImageView);
        TextView name = v.findViewById(R.id.studentName);

        TextView favSubject1 = v.findViewById(R.id.favSubject1);
        ProgressBar firstProgress = v.findViewById(R.id.firstProgressBar);

        TextView favSubject2 = v.findViewById(R.id.favSubject2);
        ProgressBar secondProgress = v.findViewById(R.id.secondProgressBar);

        TextView favSubject3 = v.findViewById(R.id.favSubject3);
        ProgressBar thirdProgress = v.findViewById(R.id.thirdProgressbar);

        icon.setImageDrawable(student.getStudentIcon());
        name.setText(student.getName());

        favSubject1.setText(student.getFirstSubject());
        firstProgress.setProgress(student.getFirstProgress());

        favSubject2.setText(student.getSecondSubject());
        secondProgress.setProgress(student.getSecondProgress());

        favSubject3.setText(student.getThirdSubject());
        thirdProgress.setProgress(student.getThirdProgress());

        if (student.getThirdSubject().isEmpty()) {
            favSubject3.setVisibility(View.GONE);
            thirdProgress.setVisibility(View.GONE);
        }

        return v;
    }
}
