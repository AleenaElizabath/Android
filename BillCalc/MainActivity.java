package com.example.billcalc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Spinner s1,s2,s3,s4;
Button calc;
EditText e1,e2,e3,e4;
String item1,item2,item3,item4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1=(Spinner) findViewById(R.id.spinner);
        s2=(Spinner) findViewById(R.id.spinner2);
        s3=(Spinner) findViewById(R.id.spinner3);
        s4=(Spinner) findViewById(R.id.spinner4);
        calc=(Button) findViewById(R.id.button3);
        e1=(EditText) findViewById(R.id.editTextNumber);
        e2=(EditText) findViewById(R.id.editTextNumber2);
        e3=(EditText) findViewById(R.id.editTextNumber3);
        e4=(EditText) findViewById(R.id.editTextNumber4);
        ArrayList <String> items=new ArrayList<String>();
        items.add("Nil");
        items.add("Apple");
        items.add("Mango");
        items.add("Orange");
        items.add("Banana");
        ArrayAdapter s=new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,items);
        s1.setAdapter(s);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               item1 =items.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                item1="Null";
            }
        });
        s2.setAdapter(s);
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                item2 =items.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                item2="Null";
            }
        });
        s3.setAdapter(s);
        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                item3 =items.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                item3="Null";
            }
        });
        s4.setAdapter(s);
        s4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                item4 =items.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                item4="Null";
            }
        });
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Billing.class);
                i.putExtra("item1",item1);
                i.putExtra("item2",item2);
                i.putExtra("item3",item3);
                i.putExtra("item4",item4);
                int val1 = 0;
                if (!e1.getText().toString().isEmpty()) {
                    val1 = Integer.parseInt(e1.getText().toString());
                }

                int val2 = 0;
                if (!e2.getText().toString().isEmpty()) {
                    val2 = Integer.parseInt(e2.getText().toString());
                }

                int val3 = 0;
                if (!e3.getText().toString().isEmpty()) {
                    val3 = Integer.parseInt(e3.getText().toString());
                }

                int val4 = 0;
                if (!e4.getText().toString().isEmpty()) {
                    val4 = Integer.parseInt(e4.getText().toString());
                }
                i.putExtra("val1",val1);
                i.putExtra("val2",val2);
                i.putExtra("val3",val3);
                i.putExtra("val4",val4);
                startActivity(i);
            }
        });

    }
}