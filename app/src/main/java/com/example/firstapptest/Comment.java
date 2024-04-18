package com.example.firstapptest;

import android.graphics.drawable.Drawable;

public class Comment {
    private Drawable userIcon;
    private String name;
    private String userComment;
    private long commentPublishedTime;

    public Comment(Drawable userIcon, String name, String userComment, long commentPublishedTime) {
        this.userIcon = userIcon;
        this.name = name;
        this.userComment = userComment;
        this.commentPublishedTime = commentPublishedTime;
    }

    public Drawable getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(Drawable userIcon) {
        this.userIcon = userIcon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserComment() {
        return userComment;
    }

    public void setUserComment(String userComment) {
        this.userComment = userComment;
    }

    public long getCommentPublishedTime() {
        return commentPublishedTime;
    }

    public void setCommentPublishedTime(long commentPublishedTime) {
        this.commentPublishedTime = commentPublishedTime;
    }
}
