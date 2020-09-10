package com.example.magic8ball;

import androidx.appcompat.app.AppCompatActivity;

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


        final ImageView ball = (ImageView)findViewById(R.id.magicball);

        Button askbtn = (Button)findViewById(R.id.askbutton);

        final int [] ballarray ={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,

        };

        askbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();

                int number = rand.nextInt(5);



                  ball.setImageResource(ballarray[number]);

            }
        });



    }
}