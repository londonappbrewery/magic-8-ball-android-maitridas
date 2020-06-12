package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnask = (Button)findViewById(R.id.btxask);
        final ImageView imgball = (ImageView)findViewById(R.id.imgball);
        final int[] ballarray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        btnask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomnumber = new Random();
                imgball.setImageResource(ballarray[randomnumber.nextInt(5)]);
            }
        });

    }
}
