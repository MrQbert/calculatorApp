package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

public class activity2 extends AppCompatActivity {
    String operators[] = {"Addition","Subtraction","Multiplication","Division"};
    String operatorChoice;
    Spinner sp;
    ArrayAdapter adapter;
    ImageView imgEl;
    EditText numInput1;
    EditText numInput2;
    Double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        // Creating the spinner
        sp= findViewById(R.id.operatorChoice);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, operators);
        sp.setAdapter(adapter);

        imgEl = findViewById(R.id.operatorImgEl);
        // Getting the Inputs
        numInput1 = findViewById(R.id.num1);
        numInput2= findViewById(R.id.num2);


        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int selection, long l) {
                if(selection ==0){
                   imgEl.setImageResource(R.drawable.plus);
                   operatorChoice = "addition";
                }
                else if(selection == 1){
                    imgEl.setImageResource(R.drawable.substraction);
                    operatorChoice = "subtraction";
                }
                else if(selection ==2){
                    imgEl.setImageResource(R.drawable.multiplication);
                    operatorChoice = "multiplication";
                }
                else if(selection == 3){
                    imgEl.setImageResource(R.drawable.division);
                    operatorChoice = "division";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
    public void calcNow(View v){
        // Turning Inputs to Numbers
        Double num1 = Double.parseDouble(numInput1.getText().toString());
        Double num2 = Double.parseDouble(numInput2.getText().toString());
        Calc calcNow = new Calc(num1, num2);
        if(operatorChoice == "addition"){
            result = calcNow.Addition();
        }else if(operatorChoice== "subtraction"){
            result = calcNow.Subtraction();
        }else if(operatorChoice== "multiplication"){
            result = calcNow.Multiplication();
        }else if(operatorChoice=="division"){
            result = calcNow.Division();
        }

        String resultText = result.toString();
        Intent i = new Intent(this,results.class);
        i.putExtra("result", resultText);
        startActivity(i);



    }
}