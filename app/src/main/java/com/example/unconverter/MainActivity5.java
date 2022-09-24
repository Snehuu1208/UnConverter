package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    private TextView textView8;
    private EditText editText2;
    private Button button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        button10= findViewById(R.id.button10);
        textView8= findViewById(R.id.textView8);
        editText2 = findViewById(R.id.editText2);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = editText2.getText().toString();
                int k= Integer.parseInt(s);
                double c= (k-273.15);
                textView8.setText("The value in Celsius is " + c);
            }
        });
    }
}