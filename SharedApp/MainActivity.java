package com.example.sharedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nm,pass;
    Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reg=(Button) findViewById(R.id.button16);
        nm=(EditText) findViewById(R.id.editTextText);
        pass=(EditText) findViewById(R.id.editTextTextPassword);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences s1=getSharedPreferences("login",MODE_PRIVATE);
                SharedPreferences.Editor e1=s1.edit();
                e1.putString("User",nm.getText().toString());
                e1.putString("Password",pass.getText().toString());
                e1.apply();
                Intent i=new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
    }
}