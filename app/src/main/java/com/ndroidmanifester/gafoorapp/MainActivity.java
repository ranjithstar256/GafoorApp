package com.ndroidmanifester.gafoorapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button; // declaration above oncreate mtd
    EditText editText;
    TextView textView;
    Button b;


    // page side ...
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sme,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button2); // initilazation inside oncreate
        b = findViewById(R.id.button3); // initilazation inside oncreate
        editText = findViewById(R.id.editText10);
        textView = findViewById(R.id.textView8);


        button.setOnClickListener(new View.OnClickListener() { //usage
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("New Message!");
                builder.setMessage("Message from Abc");
                builder.setIcon(android.R.drawable.ic_media_play);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "hi", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("No",null);
                builder.setNeutralButton("Cancel",null);
                builder.show();
             }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = editText.getText().toString();

                Intent n = new Intent(MainActivity.this, Main3Activity.class);
                n.putExtra("ab",data);
                startActivity(n);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id  = item.getItemId();
        switch (id){
            case R.id.me1:
                Toast.makeText(this, "settings clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.me2:
                Toast.makeText(this, "about clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}