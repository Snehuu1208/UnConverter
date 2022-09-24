package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    private TextView textView10;
    private EditText editText3;
    private Button button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        button11= findViewById(R.id.button11);
        textView10= findViewById(R.id.textView10);
        editText3 = findViewById(R.id.editText3);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = editText3.getText().toString();
                int f= Integer.parseInt(s);
                double k= (f-32)*(0.555)+273.15;
                textView10.setText("The value in Kelvin is " + k);
            }
        });
    }
}