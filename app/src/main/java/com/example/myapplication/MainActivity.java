package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2;
    AppCompatButton b1,b2;
    String getUSERNAME,getPASSWORD;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.UNAME);
        ed2=(EditText)findViewById(R.id.PWORD);
        b1=(AppCompatButton)findViewById(R.id.LOGIN);
        b2=(AppCompatButton)findViewById(R.id.GTR);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUSERNAME = ed1.getText().toString();
                getPASSWORD = ed2.getText().toString();
                Toast.makeText(getApplicationContext(), "getUSERNAME", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "getPASSWORD", Toast.LENGTH_SHORT).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
               startActivity(i);
            }
        });
        }

}