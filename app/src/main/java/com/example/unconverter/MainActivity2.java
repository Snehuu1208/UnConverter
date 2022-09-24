package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textview;
    private EditText editText;
    private Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button7 = findViewById(R.id.button7);
        textview = findViewById(R.id.textview);
        editText = findViewById(R.id.editTextNumberSigned);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = editText.getText().toString();
                int i = Integer.parseInt(s);
                double j = i + 273.0;
                textview.setText("The value in Kelvin is " + j);
            }
        });
    }
}

