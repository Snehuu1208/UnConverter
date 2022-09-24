package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.textView);
    }

    public void button(View v){
            Intent i= new Intent(MainActivity.this,MainActivity2.class);
            startActivity(i);
    }
    public void button2(View v){
        Intent i= new Intent(MainActivity.this,MainActivity3.class);
        startActivity(i);
    }
    public void button3(View v){
        Intent i= new Intent(MainActivity.this,MainActivity4.class);
        startActivity(i);
    }
    public void button4(View v){
        Intent i= new Intent(MainActivity.this,MainActivity5.class);
        startActivity(i);
    }
    public void button5(View v){
        Intent i= new Intent(MainActivity.this,MainActivity6.class);
        startActivity(i);
    }
    public void button6(View v){
        Intent i= new Intent(MainActivity.this,MainActivity7.class);
        startActivity(i);
    }


}
