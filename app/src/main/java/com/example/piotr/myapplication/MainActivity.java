package com.example.piotr.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText num1 = findViewById(R.id.inputEdit1);
        final EditText num2 = findViewById(R.id.inputEdit2);

        final Button btnPlus = findViewById(R.id.ButtonPlus);
        final Button btnMinus = findViewById(R.id.ButtonMinus);
        final Button btnMul = findViewById(R.id.ButtonMul);
        final Button btnDiv = findViewById(R.id.ButtonDiv);
        final TextView textEquals = findViewById(R.id.TextEquals);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer value1 = Integer.parseInt(num1.getText().toString());
                Integer value2 = Integer.parseInt(num2.getText().toString());
                int result = Calculator.add(value1,value2);
                textEquals.setText(String.valueOf(result));
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer value1 = Integer.parseInt(num1.getText().toString());
                Integer value2 = Integer.parseInt(num2.getText().toString());
                int result = Calculator.sub(value1,value2);
                textEquals.setText(String.valueOf(result));
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer value1 = Integer.parseInt(num1.getText().toString());
                Integer value2 = Integer.parseInt(num2.getText().toString());
                int result = Calculator.mul(value1,value2);
                textEquals.setText(String.valueOf(result));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer value1 = Integer.parseInt(num1.getText().toString());
                Integer value2 = Integer.parseInt(num2.getText().toString());
                int result = Calculator.div(value1,value2);
                textEquals.setText(String.valueOf(result));
            }
        });

    }
}
