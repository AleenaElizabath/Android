package com.example.billcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Billing extends AppCompatActivity {
TextView item1,item2,item3,item4,q1,q2,q3,q4,total,p1,p2,p3,p4;
String l1="",l2="",l3="",l4="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing);
        Intent i2=new Intent(Billing.this,MainActivity.class);
        item1=(TextView) findViewById(R.id.textView10);
        item2=(TextView) findViewById(R.id.textView13);
        item3=(TextView) findViewById(R.id.textView16);
        item4=(TextView) findViewById(R.id.textView19);
        q1=(TextView) findViewById(R.id.textView11);
        q2=(TextView) findViewById(R.id.textView14);
        q3=(TextView) findViewById(R.id.textView17);
        q4=(TextView) findViewById(R.id.textView20);
        total=(TextView) findViewById(R.id.textView25);
        p1=(TextView) findViewById(R.id.textView12);
        p2=(TextView) findViewById(R.id.textView15);
        p3=(TextView) findViewById(R.id.textView18);
        p4=(TextView) findViewById(R.id.textView21);
        String items1=getIntent().getStringExtra("item1");
        String items2=getIntent().getStringExtra("item2");
        String items3=getIntent().getStringExtra("item3");
        String items4=getIntent().getStringExtra("item4");
        Integer v1=getIntent().getIntExtra("val1",0);
        Integer v2=getIntent().getIntExtra("val2",0);
        Integer v3=getIntent().getIntExtra("val3",0);
        Integer v4=getIntent().getIntExtra("val4",0);
        Integer t1=50*v1;
        Integer t2=50*v2;
        Integer t3=50*v3;
        Integer t4=50*v4;
        Integer tt=t1+t2+t3+t4;
        total.setText(String.valueOf(tt));
        p1.setText(String.valueOf(t1));
        p2.setText(String.valueOf(t2));
        p3.setText(String.valueOf(t3));
        p4.setText(String.valueOf(t4));
        item1.setText(items1);
        item2.setText(items2);
        item3.setText(items3);
        item4.setText(items4);
        q1.setText(String.valueOf(v1));
        q2.setText(String.valueOf(v2));
        q3.setText(String.valueOf(v3));
        q4.setText(String.valueOf(v4));
    }
}