package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class results extends AppCompatActivity {
    TextView displayResultsEl;
    String results;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        displayResultsEl = findViewById(R.id.displayResultsEl);
        Intent intent = getIntent();
        results = intent.getStringExtra("result");
        displayResultsEl.setText("Your Result is ==>" + results);


    }
}