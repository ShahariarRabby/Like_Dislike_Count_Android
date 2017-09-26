package com.rabby.counter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView  textViewLiked, textViewDisliked;
    public int likeCount = 0, dislikeCount = 0 ;
    public String likeSave = "like";
    public String dislikeSave = "dislike";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewDisliked = (TextView) findViewById(R.id.dislikeText);
        textViewLiked = (TextView) findViewById(R.id.likeText);
    }

    public void liked(View view) {
        likeCount++;
        textViewLiked.setText(Integer.toString(likeCount));
    }

    public void disliked(View view) {
        dislikeCount++;
        textViewDisliked.setText(Integer.toString(dislikeCount));
    }

    public void resetB(View view) {
        dislikeCount = 0;
        likeCount = 0;
        textViewLiked.setText(Integer.toString(dislikeCount));
        textViewDisliked.setText(Integer.toString(likeCount));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(likeSave,likeCount);
        outState.putInt(dislikeSave,dislikeCount);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        int like_save = savedInstanceState.getInt(likeSave);
        int dislike_save = savedInstanceState.getInt(dislikeSave);
        textViewLiked.setText(Integer.toString(like_save));
        textViewDisliked.setText(Integer.toString(dislike_save));
        likeCount = like_save;
        dislikeCount = dislike_save;
    }
}
