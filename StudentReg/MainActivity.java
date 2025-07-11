package com.example.studentreg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.AndroidXConsumerKt;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String gender,name1,phone1;
    String lang[]=new String[3];
    Button reg;
    EditText name,phone;
    CheckBox c,py,java;
    RadioGroup gen;
    RadioButton male,female;
    Spinner semester;
    String semester1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reg=(Button) findViewById(R.id.button2);
        name=(EditText) findViewById(R.id.editTextText);
        phone=(EditText) findViewById(R.id.editTextPhone);
        c=(CheckBox) findViewById(R.id.checkBox);
        java=(CheckBox) findViewById(R.id.checkBox2);
        py=(CheckBox) findViewById(R.id.checkBox3);
        gen=(RadioGroup) findViewById(R.id.gender);
        male=(RadioButton) findViewById(R.id.radioButton);
        female=(RadioButton) findViewById(R.id.radioButton2);
        semester=(Spinner) findViewById(R.id.spinner);
        ArrayList <String> sem=new ArrayList<String>();
        sem.add("Nil");
        sem.add("Sem1");
        sem.add("Sem2");
        sem.add("Sem3");
        sem.add("Sem4");
        ArrayAdapter s=new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,sem);
        semester.setAdapter(s);
        semester.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                semester1=sem.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                semester1="Null";
            }
        });
        gen.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton){
                    gender=male.getText().toString();
                }
                else {
                    gender=female.getText().toString();
                }
            }
        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this, MainActivity2.class);
                if(java.isChecked()){
                    lang[0]=java.getText().toString();
                }
                if(py.isChecked()){
                    lang[1]=py.getText().toString();
                }
                if(c.isChecked()) {
                    lang[2] = c.getText().toString();
                }
                name1=name.getText().toString();
                phone1=phone.getText().toString();
                i1.putExtra("gender",gender);
                i1.putExtra("lang",lang);
                i1.putExtra("name",name1);
                i1.putExtra("phone",phone1);
                i1.putExtra("sem",semester1);
                startActivity(i1);
                Toast.makeText(MainActivity.this, "Registered", Toast.LENGTH_SHORT).show();
            }
        });
    }
}