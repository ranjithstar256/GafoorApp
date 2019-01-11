package com.ndroidmanifester.gafoorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    Spinner listView;
    ArrayAdapter<String> arrayAdapter;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        listView=findViewById(R.id.lv);
        arrayList=new ArrayList<String>();

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("safdsgf");
        arrayList.add("kafdsgf");
        arrayList.add("fsafdsgf");
        arrayList.add("safdsgf");
        arrayList.add("kafdsgf");
        arrayList.add("fsafdsgf");
        arrayList.add("safdsgf");
        arrayList.add("kafdsgf");
        arrayList.add("fsafdsgf");
        arrayList.add("safdsgf");
        arrayList.add("kafdsgf");
        arrayList.add("fsafdsgf");
        arrayList.add("safdsgf");
        arrayList.add("kafdsgf");
        arrayList.add("fsafdsgf");
        arrayList.add("safdsgf");
        arrayList.add("kafdsgf");
        arrayList.add("fsafdsgf");
        arrayList.add("safdsgf");
        arrayList.add("kafdsgf");
        arrayList.add("fsafdsgf");
        arrayList.add("safdsgf");
        arrayList.add("kafdsgf");

        arrayAdapter=new ArrayAdapter<String>(Main3Activity.this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

      /*  listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Main3Activity.this, ""+i, Toast.LENGTH_SHORT).show();
            }
        });*/

      listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
          @Override
          public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
              Toast.makeText(Main3Activity.this, ""+i, Toast.LENGTH_SHORT).show();

          }

          @Override
          public void onNothingSelected(AdapterView<?> adapterView) {

          }
      });

    }
}
