package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class activity2 extends AppCompatActivity {
    String operators[] = {"Addition","Subtraction","Multiplication","Division"};
    Spinner sp;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        sp= findViewById(R.id.operatorChoice);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, operators);
        sp.setAdapter(adapter);

    }
}