package com.rabby.counter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView  textViewliked, textViewdisliked;
    public int likeCount = 0, dislikeCount = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewdisliked = (TextView) findViewById(R.id.dislikeText);
        textViewliked = (TextView) findViewById(R.id.likeText);
    }

    public void liked(View view) {
        likeCount++;
        textViewliked.setText(Integer.toString(likeCount));
    }

    public void disliked(View view) {
        dislikeCount++;
        textViewdisliked.setText(Integer.toString(dislikeCount));
    }

    public void resetB(View view) {
        dislikeCount = 0;
        likeCount = 0;
        textViewliked.setText(Integer.toString(dislikeCount));
        textViewdisliked.setText(Integer.toString(likeCount));
    }

}
