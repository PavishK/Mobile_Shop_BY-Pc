package com.firstapp.mobile_shop;

import android.content.Intent;
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

public class MainActivity2 extends AppCompatActivity {
    private TextView tv;
    private EditText net,pet;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        tv=findViewById(R.id.textView5);
        net=findViewById(R.id.editTextText);
        pet=findViewById(R.id.editTextTextPassword);
        btn1=findViewById(R.id.button);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),MainActivity3.class);
                Toast.makeText(MainActivity2.this, "Please wait..", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=net.getText().toString();
                String password=pet.getText().toString();
                Intent in =new Intent(MainActivity2.this,MainActivity4.class);
                Bundle bundle=new Bundle();
                bundle.putString("keyName",name);
                bundle.putString("keyPass",password);
                in.putExtras(bundle);
                startActivity(in);
            }
        });
    }
}