package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private TextView textView6;
    private EditText editText1;
    private Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button9 = findViewById(R.id.button9);
        textView6= findViewById(R.id.textView6);
        editText1 = findViewById(R.id.editText1);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = editText1.getText().toString();
                int f= Integer.parseInt(s);
                double c = (f -32)*0.555;
                textView6.setText("The value in Celsius is " + c);
            }
        });
    }
}