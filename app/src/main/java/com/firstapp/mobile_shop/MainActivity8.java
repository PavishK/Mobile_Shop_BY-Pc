package com.firstapp.mobile_shop;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main8);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Toolbar tb=findViewById(R.id.toolBar);
        setSupportActionBar(tb);
        Button btn=(Button) findViewById(R.id.button6);
        btn.setOnCreateContextMenuListener(this);
    }
    public void onCreateContextMenu(ContextMenu menu, View view,ContextMenu.ContextMenuInfo menuinfo)
    {
        super.onCreateContextMenu(menu,view,menuinfo);
        createMenu(menu);
    }
    private void createMenu(Menu menu)
    {
        MenuItem mnu1=menu.add(0,0,0,"Popular");
        MenuItem mnu2=menu.add(0,1,1,"Most Liked");
        MenuItem mnu3=menu.add(0,2,2,"Celebrity");
        MenuItem mnu4=menu.add(0,3,3,"Most Reply's");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId=item.getItemId();
        if(itemId==R.id.top)
        {
            Toast.makeText(this, "Selected Top Reviews", Toast.LENGTH_SHORT).show();
        }
        else if(itemId==R.id.medium)
        {
            Toast.makeText(this, "Selected Medium Reviews", Toast.LENGTH_SHORT).show();
        }
        else if(itemId==R.id.average)
        {
            Toast.makeText(this, "Selected Average Reviews", Toast.LENGTH_SHORT).show();
        }
        else if(itemId==R.id.bad)
        {
            Toast.makeText(this, "Selected Bad Reviews", Toast.LENGTH_SHORT).show();
        }
        else if(itemId==R.id.exit)
        {
            Toast.makeText(this, "Choose The Way to Do", Toast.LENGTH_SHORT).show();
        }
        else if(itemId==R.id.home)
        {
            Intent in =new Intent(getApplicationContext(), home.class);
            startActivity(in);
        }
        else if(itemId==R.id.logout)
        {
            Toast.makeText(this, "Logging Off...", Toast.LENGTH_SHORT).show();
            Intent in =new Intent(getApplicationContext(), MainActivity.class);
            startActivity(in);
        }
        else if(itemId==0)
        {
            Toast.makeText(getApplicationContext(),"Popular",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=new MenuInflater(this);
        menuInflater.inflate(R.menu.option_menu,menu);
        return true;
    }

}