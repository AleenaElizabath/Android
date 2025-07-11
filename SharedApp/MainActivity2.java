package com.example.sharedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView nm,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nm=(TextView) findViewById(R.id.textView3);
        pass=(TextView) findViewById(R.id.textView4);
        SharedPreferences s1=getSharedPreferences("login",MODE_PRIVATE);
        nm.setText(s1.getString("User","Not found!!"));
        pass.setText(s1.getString("Password","Not found!!"));

    }
}