package com.example.studentreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView nm,phn,gender,lang1,Semester;
String l1="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nm=(TextView) findViewById(R.id.textView7);
        phn=(TextView) findViewById(R.id.textView9);
        gender=(TextView) findViewById(R.id.textView11);
        lang1=(TextView) findViewById(R.id.textView13);
        Semester=(TextView) findViewById(R.id.textView16);
        Intent i=getIntent();
        String gen=i.getStringExtra("gender");
        String nm1=i.getStringExtra("name");
        String phn1=i.getStringExtra("phone");
        String Semester1=i.getStringExtra("sem");
        String lang[]=i.getStringArrayExtra("lang");
        for (int j=0;j<3;j++){
            if(lang[j]!=null)
                l1=l1+ lang[j]+"\n";

        }
        lang1.setText(l1);
        gender.setText(gen);
        nm.setText(nm1);
        phn.setText(phn1);
        Semester.setText(Semester1);
    }
}