package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this,activity2.class);
                startActivity(i);
            }
        };
        Timer opening = new Timer();
        opening.schedule(tt,4000);

    }
}
