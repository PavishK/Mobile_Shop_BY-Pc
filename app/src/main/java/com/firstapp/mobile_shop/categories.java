package com.firstapp.mobile_shop;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link categories#newInstance} factory method to
 * create an instance of this fragment.
 */
public class categories extends Fragment {
    private Button btn1;


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_categories, container, false);

        btn1=v.findViewById(R.id.button_exp);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getContext(), MainActivity6.class);
                Toast.makeText(getContext(), "Opening Calci.", Toast.LENGTH_SHORT).show();
                startActivity(in);
            }
        });



        return v;
    }
}