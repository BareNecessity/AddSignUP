package com.example.signuploginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    public void operationClick(View view) {
        if (view.getId() == R.id.Multiplication) {
            Toast.makeText(this, "Clicked on multiplication", Toast.LENGTH_LONG).show();
        } else if (view.getId() == R.id.Addition) {
            Toast.makeText(this, "Clicked on addition", Toast.LENGTH_LONG).show();
        } else if (view.getId() == R.id.ClearScreen) {
            Toast.makeText(this, "Clicked on Clear Screen", Toast.LENGTH_LONG).show();
        } else if (view.getId() == R.id.PlusOrMinus) {
            Toast.makeText(this, "Clicked on Plus or Minus", Toast.LENGTH_LONG).show();
        } else if (view.getId() == R.id.Modulus) {
            Toast.makeText(this, "Clicked on modulus", Toast.LENGTH_LONG).show();
        } else if (view.getId() == R.id.Division) {
            Toast.makeText(this, "Clicked on division", Toast.LENGTH_LONG).show();
        } else if (view.getId() == R.id.Multiplication) {
            Toast.makeText(this, "Clicked on multiplication", Toast.LENGTH_LONG).show();
        } else if (view.getId() == R.id.Subtraction) {
            Toast.makeText(this, "Clicked on Subtraction", Toast.LENGTH_LONG).show();
        } else if (view.getId() == R.id.EqualSign) {
            Toast.makeText(this, "Clicked on Equal Sign", Toast.LENGTH_LONG).show();
        }
        else if (view.getId() == R.id.Clear) {
            Toast.makeText(this, "Clicked on Delete", Toast.LENGTH_LONG).show();
        }
    }


    public void numberClick(View view){
        Button clickedButton = findViewById(view.getId());
        Toast.makeText(this, clickedButton.getText(), Toast.LENGTH_LONG).show();
    }
}