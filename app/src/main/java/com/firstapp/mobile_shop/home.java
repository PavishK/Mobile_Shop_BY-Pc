package com.firstapp.mobile_shop;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
 * Use the {@link home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class home extends Fragment {

    Button btn,btn1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_home, container, false);
        btn=v.findViewById(R.id.buttonOrder1);
        btn1=v.findViewById(R.id.button23);
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setMessage("Confirm Item Realme 12 pro").setTitle("ORDER InFo").setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getContext(), "Order Comfirmed ✔️ by User", Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                Toast.makeText(getContext(),"Canceld ✖️ by User.",Toast.LENGTH_SHORT).show();
                            }
                        }).setNeutralButton("CHECK ADDERSS", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent in=new Intent(getContext(),MainActivity7.class);
                                Toast.makeText(getContext(), "Opening Delivery Information.", Toast.LENGTH_SHORT).show();
                                startActivity(in);
                            }
                        });
                AlertDialog alert=builder.create();
                alert.setTitle("Order Confirmation ");
                alert.show();

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(getContext(), MainActivity5.class);
                Toast.makeText(getContext(), "View Mode", Toast.LENGTH_SHORT).show();
                startActivity(in);
            }
        });


        return v;
    }
}