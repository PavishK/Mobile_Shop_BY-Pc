package com.firstapp.mobile_shop;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        Bundle b=getIntent().getExtras();

        String UserName=b.getString("keyName");
        String pass=b.getString("keyPass");

        Button btn1,btn2,btn3;
        btn1=findViewById(R.id.button);
        btn2=findViewById(R.id.button3);
        btn3=findViewById(R.id.button2);

        Toast.makeText(MainActivity4.this, " Hello "+UserName, Toast.LENGTH_SHORT).show();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragmentContainerView, home.class,null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragmentContainerView, categories.class,null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragmentContainerView, reviews.class,null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });
    }
}