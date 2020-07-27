package com.example.signuploginpage;

import androidx.appcompat.app.AppCompatActivity;

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

    public void operationClick(View view){
        if (view.getId() == R.id.Multiplication){
            Toast.makeText(this, "Clicked on multiplication", Toast.LENGTH_LONG).show();
        }
        else if (view.getId() == R.id.Addition){
            Toast.makeText(this, "Clicked on addition", Toast.LENGTH_LONG).show();
        }
    }

    public void numberClick(View view){
        Button clickedButton = findViewById(view.getId());
        Toast.makeText(this, clickedButton.getText(), Toast.LENGTH_LONG).show();
    }
}