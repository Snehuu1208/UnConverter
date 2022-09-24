package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private TextView textView4;
    private EditText editText;
    private Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button8 = findViewById(R.id.button8);
        textView4= findViewById(R.id.textView4);
        editText = findViewById(R.id.editText);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = editText.getText().toString();
                int k = Integer.parseInt(s);
                double f = (k -273.15)*(1.8)+32;
                textView4.setText("The value in Fahrenheit is " + f);
            }
        });

    }
}