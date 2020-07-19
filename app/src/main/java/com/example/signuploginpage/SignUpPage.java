package com.example.signuploginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpPage extends AppCompatActivity {
    private EditText firstNameEditText;
    private EditText lastNameEditText;
    private EditText emailEditText;
    private EditText phoneNumberEditText;
    private EditText passkeyEditText;
    private EditText confirmPasskeyEditText;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    //These are used to declare variables for each user Input.





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
        firstNameEditText = (EditText) findViewById(R.id.editTextTextPersonName2);
        lastNameEditText= (EditText) findViewById(R.id.editTextTextPersonName3);
        emailEditText = (EditText) findViewById(R.id.editTextTextEmailAddress2);
        phoneNumberEditText = (EditText) findViewById(R.id.editTextPhone);
        passkeyEditText = (EditText) findViewById(R.id.editTextTextPassword);
        confirmPasskeyEditText = (EditText) findViewById(R.id.editTextTextPassword2);
        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {
                //This set of code validates the email address.
                if (emailEditText.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "enter email address", Toast.LENGTH_SHORT).show();
                } else {
                    if (emailEditText.getText().toString().trim().matches(emailPattern)) {
                        Toast.makeText(getApplicationContext(), "valid email address", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Invalid email address", Toast.LENGTH_SHORT).show();

                    }

                }
            }
            });


        }
        }





