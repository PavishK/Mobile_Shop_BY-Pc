package com.firstapp.mobile_shop;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity5 extends AppCompatActivity {

    private ImageButton previousbtn, nextbtn;
    private ImageSwitcher imgsw;
    private int[] images = {R.drawable.iphone_1,R.drawable.iphon_2,R.drawable.iphone_3,R.drawable.iphone_4};
    private int position = 0;
    Integer[] imageID={ R.drawable.iphone_1,R.drawable.iphon_2,R.drawable.iphone_3,R.drawable.iphone_4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        previousbtn = (ImageButton)findViewById(R.id.imageButton);
        nextbtn = (ImageButton)findViewById(R.id.imageButton2);
        imgsw = (ImageSwitcher) findViewById(R.id.imgSw);
        imgsw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imgVw= new ImageView(MainActivity5.this);
                imgVw.setImageResource(images[position]);
                return imgVw;
            }
        });
        imgsw.setInAnimation(this, android.R.anim.fade_in);
        imgsw.setOutAnimation(this, android.R.anim.fade_out);
        previousbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position>0)
                    position--;
                else if(position<0)
                    position = 0;
                imgsw.setImageResource(images[position]);
            }
        });
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position<images.length)
                    position++;
                if(position>=images.length)
                    position = images.length-1;
                imgsw.setImageResource(images[position]);
            }
        });

        GridView gv = (GridView) findViewById(R.id.gridview);
        gv.setAdapter(new ImageAdapter(this));
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(MainActivity5.this, "Image Position: " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}