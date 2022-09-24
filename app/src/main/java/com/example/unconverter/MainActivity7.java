package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {

    private TextView textView12;
    private EditText editText4;
    private Button button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        button12= findViewById(R.id.button12);
        textView12= findViewById(R.id.textView12);
        editText4 = findViewById(R.id.editText4);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = editText4.getText().toString();
                int c= Integer.parseInt(s);
                double f= (c*(1.8))+32;
                textView12.setText("The value in fahrenheit is " +f);
            }
        });
    }
}