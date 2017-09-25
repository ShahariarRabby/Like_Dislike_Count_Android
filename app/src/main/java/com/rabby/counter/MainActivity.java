package com.rabby.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button likeButton, dislikeButton, resetButton;
    public TextView likeText;
    public TextView dislikeText;
    public int like =0;
    public int dislike = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        likeText = (TextView) findViewById(R.id.likeText);
        dislikeText = (TextView) findViewById(R.id.dislikeText);
        likeButton = (Button) findViewById(R.id.likeButton);
        dislikeButton = (Button) findViewById(R.id.dislikeButton);
        resetButton = (Button) findViewById(R.id.resetButton);
        View.OnClickListener ourLikeClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                like++;
                likeText.setText(Integer.toString(like));
            }
        };

        View.OnClickListener ourDislikeClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dislike++;
                dislikeText.setText(Integer.toString(dislike));
            }
        };

        View.OnClickListener ourResetButton = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                like = 0;
                dislike = 0;
                likeText.setText(Integer.toString(like));
                dislikeText.setText(Integer.toString(dislike));
            }
        };

        likeButton.setOnClickListener(ourLikeClick);
        dislikeButton.setOnClickListener(ourDislikeClick);
        resetButton.setOnClickListener(ourResetButton);

    }
}
