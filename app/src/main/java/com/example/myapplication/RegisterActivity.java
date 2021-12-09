package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText ed1, ed2, ed3, ed4, ed5;
    AppCompatButton b1, b2;
    String NAME, PHONE_NUMBER, EMAIL_ID, USERNAME, PASSWORD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1 = (EditText) findViewById(R.id.name);
        ed2 = (EditText) findViewById(R.id.phno);
        ed3 = (EditText) findViewById(R.id.id);
        ed4 = (EditText) findViewById(R.id.UN);
        ed5 = (EditText) findViewById(R.id.pw);
        b1 = (AppCompatButton) findViewById(R.id.rgr);
        b2=(AppCompatButton)findViewById(R.id.btr);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NAME = ed1.getText().toString();
                Toast.makeText(getApplicationContext(), "NAME", Toast.LENGTH_SHORT).show();
                PHONE_NUMBER = ed2.getText().toString();
                Toast.makeText(getApplicationContext(), "PHONE_NUMBER", Toast.LENGTH_SHORT).show();
                EMAIL_ID = ed3.getText().toString();
                Toast.makeText(getApplicationContext(), "EMAIL_ID", Toast.LENGTH_SHORT).show();
                USERNAME = ed4.getText().toString();
                Toast.makeText(getApplicationContext(), "USERNAME", Toast.LENGTH_SHORT).show();
                PASSWORD = ed5.getText().toString();
                Toast.makeText(getApplicationContext(), "PASSWORD", Toast.LENGTH_SHORT).show();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}


