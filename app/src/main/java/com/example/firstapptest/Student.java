package com.example.firstapptest;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class Student {
    Drawable studentIcon;
    String name;

    String firstSubject;
    int firstProgress;

    String secondSubject;
    int secondProgress;

    String thirdSubject;
    int thirdProgress;

    public Student(Drawable studentIcon, String name, String firstSubject, int firstProgress, String secondSubject, int secondProgress, String thirdSubject, int thirdProgress) {
        this.studentIcon = studentIcon;
        this.name = name;
        this.firstSubject = firstSubject;
        this.firstProgress = firstProgress;
        this.secondSubject = secondSubject;
        this.secondProgress = secondProgress;
        this.thirdSubject = thirdSubject;
        this.thirdProgress = thirdProgress;
    }

    public Drawable getStudentIcon() {
        return studentIcon;
    }

    public void setStudentIcon(Drawable studentIcon) {
        this.studentIcon = studentIcon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstSubject() {
        return firstSubject;
    }

    public void setFirstSubject(String firstSubject) {
        this.firstSubject = firstSubject;
    }

    public int getFirstProgress() {
        return firstProgress;
    }

    public void setFirstProgress(int firstProgress) {
        this.firstProgress = firstProgress;
    }

    public String getSecondSubject() {
        return secondSubject;
    }

    public void setSecondSubject(String secondSubject) {
        this.secondSubject = secondSubject;
    }

    public int getSecondProgress() {
        return secondProgress;
    }

    public void setSecondProgress(int secondProgress) {
        this.secondProgress = secondProgress;
    }

    public String getThirdSubject() {
        return thirdSubject;
    }

    public void setThirdSubject(String thirdSubject) {
        this.thirdSubject = thirdSubject;
    }

    public int getThirdProgress() {
        return thirdProgress;
    }

    public void setThirdProgress(int thirdProgress) {
        this.thirdProgress = thirdProgress;
    }
}
