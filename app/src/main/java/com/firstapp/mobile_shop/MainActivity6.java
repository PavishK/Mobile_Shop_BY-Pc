package com.firstapp.mobile_shop;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity6 extends AppCompatActivity {
    EditText number1, number2;
    Button addButton, subtractButton, multiplyButton, divideButton;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);
        result = findViewById(R.id.result);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer num1 = Integer.parseInt(number1.getText().toString());
                Integer num2 = Integer.parseInt(number2.getText().toString());
                Integer res = num1 + num2;
                result.setText("RESULT : " + res);
                Toast.makeText(MainActivity6.this, "ADDITION -> "+res, Toast.LENGTH_SHORT).show();
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer num1 = Integer.parseInt(number1.getText().toString());
                Integer num2 = Integer.parseInt(number2.getText().toString());
                Integer res = num1 - num2;
                result.setText("RESULT : " + res);
                Toast.makeText(MainActivity6.this, "SUBTRACTION -> "+res, Toast.LENGTH_SHORT).show();
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer  num1 = Integer .parseInt(number1.getText().toString());
                Integer  num2 = Integer .parseInt(number2.getText().toString());
                Integer res = num1 * num2;
                result.setText("RESULT : " + res);
                Toast.makeText(MainActivity6.this, "MULTIPLICATION -> "+res, Toast.LENGTH_SHORT).show();
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double res = num1 / num2;
                result.setText("RESULT : " + res);
                Toast.makeText(MainActivity6.this, "DIVISION "+res, Toast.LENGTH_SHORT).show();
            }
        });
    }
}