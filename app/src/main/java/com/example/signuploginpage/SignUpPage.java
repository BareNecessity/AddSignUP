package com.example.signuploginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;


public class SignUpPage extends AppCompatActivity {
//    private EditText firstNameEditText;
//    private EditText lastNameEditText;
//    private EditText emailEditText;
//    private EditText phoneNumberEditText;
//    private EditText passkeyEditText;
//    private EditText confirmPasskeyEditText;


    private EditText firstNameEditText, lastNameEditText, emailEditText, phoneNumberEditText,
            passkeyEditText, confirmPasskeyEditText;

    //These are used to declare variables for each user Input.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        setViews();




        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signUp();
            }
        });

    }

    private void setViews() {
        firstNameEditText = (EditText) findViewById(R.id.editTextTextPersonName2);
        lastNameEditText = (EditText) findViewById(R.id.editTextTextPersonName3);
        emailEditText = (EditText) findViewById(R.id.editTextTextEmailAddress2);
        phoneNumberEditText = (EditText) findViewById(R.id.editTextPhone);
        passkeyEditText = (EditText) findViewById(R.id.editTextTextPassword);
        confirmPasskeyEditText = (EditText) findViewById(R.id.editTextTextPassword2);
    }

    private void signUp() {
        //This set of code validates the email address.
        String firstName = firstNameEditText.getText().toString();
        String lastName = lastNameEditText.getText().toString();
        String emailAddress = emailEditText.getText().toString();
        String phoneNumber = phoneNumberEditText.getText().toString();
        String password = passkeyEditText.getText().toString();
        String confirmPassword = confirmPasskeyEditText.getText().toString();


        if (firstName.isEmpty()) {
            Toast.makeText(getApplicationContext(), "enter first name", Toast.LENGTH_SHORT).show();
        } else if (lastName.isEmpty()) {
            Toast.makeText(getApplicationContext(), "enter last name", Toast.LENGTH_SHORT).show();
        } else if (!isValidMail(emailAddress)) {
            Toast.makeText(getApplicationContext(), "Email is not valid", Toast.LENGTH_SHORT).show();
        } else if (!isValidMobile(phoneNumber)) {
            Toast.makeText(getApplicationContext(), "Invalid phone number", Toast.LENGTH_SHORT).show();
        } else if (!password.equals(confirmPassword)) {
            Toast.makeText(getApplicationContext(), "Password do not match", Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(getApplicationContext(), "Password match", Toast.LENGTH_SHORT).show();

    }
    private boolean isValidMail(String email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();


    }

    private boolean isValidMobile(String phone) {
        return android.util.Patterns.PHONE.matcher(phone).matches();


    }
}












//      if (emailEditText.getText().toString().isEmpty()) {
//           Toast.makeText(getApplicationContext(), "enter email address", Toast.LENGTH_SHORT).show();
//        } else {
//            String email = emailEditText.getText().toString().trim();
//            if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
//                Toast.makeText(getApplicationContext(), "valid email address", Toast.LENGTH_SHORT).show();
//            } else {
//               Toast.makeText(getApplicationContext(), "Invalid email address", Toast.LENGTH_SHORT).show();
//
//         }
//        }
//    }
//
//







