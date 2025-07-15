package com.example.listview;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity {
ListView l1;
String items[]={"Apple","Ball","Cat","Dog","Egg"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=(ListView) findViewById(R.id.listview);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,items);
        l1.setAdapter(adapter);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "The selected item is "+items[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}