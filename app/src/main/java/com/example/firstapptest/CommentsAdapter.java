package com.example.firstapptest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Calendar;

public class CommentsAdapter extends ArrayAdapter<Comment> {
    Context context;
    ArrayList<Comment> comments;
    View v;

    public CommentsAdapter(@NonNull Context context, ArrayList<Comment> comments) {
        super(context, R.layout.item_comments_history, comments);
        this.context = context;
        this.comments = comments;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Comment comment = this.comments.get(position);

        LayoutInflater inflater = LayoutInflater.from(this.context);
        v = inflater.inflate(R.layout.item_comments_history,null,false);

        ImageView userIcon = v.findViewById(R.id.itemCommentUserIcon);
        TextView userName = v.findViewById(R.id.itemCommentUserName);
        TextView userComment = v.findViewById(R.id.itemCommentTextView);
        TextView commentPublishedTime = v.findViewById(R.id.itemCommentPublishedTime);

        userIcon.setImageDrawable(comment.getUserIcon());
        userName.setText(comment.getName());
        userComment.setText(comment.getUserComment());

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(comment.getCommentPublishedTime());

        Calendar currentTime = Calendar.getInstance();
        currentTime.setTimeInMillis(System.currentTimeMillis());

        long differenceBetweenDates = currentTime.getTime().getTime() - calendar.getTime().getTime();
        differenceBetweenDates /=1000;

        if (differenceBetweenDates >= 60) {
            String timestampText = (differenceBetweenDates / 60) + " minutes ago";
            commentPublishedTime.setText(timestampText);
        } else {
            String timestampText = (differenceBetweenDates) + " seconds ago";
            commentPublishedTime.setText(timestampText);
        }

        return v;
    }
}
