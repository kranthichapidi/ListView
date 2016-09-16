package com.example.kchapidi3723.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList listItems=new ArrayList<String>();
    ArrayAdapter<String> myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listItems.add("A");
        listItems.add("B");
        listItems.add("C");
        listItems.add("D");
        myAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listItems);
        ListView myList=(ListView)findViewById(R.id.lstItems);
        myList.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();
    }
    void AddText(View v) {
        EditText textInput=(EditText)findViewById(R.id.txtItems);
        String addText=textInput.getText().toString();
        listItems.add(addText);
        myAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listItems);
        ListView myList=(ListView)findViewById(R.id.lstItems);
        myList.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();
    }
}
