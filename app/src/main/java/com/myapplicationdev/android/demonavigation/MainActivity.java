package com.myapplicationdev.android.demonavigation;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    Button btnNewActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNewActivity = findViewById(R.id.btnNewActivity);

        ((View) btnNewActivity).setOnClickListener(new
                                                  View.OnClickListener() {
                                                      @Override
                                                      public void onClick(View v) {
                                                          Intent i = new Intent(MainActivity.this,
                                                                  newActivity.class);
                                                          startActivity(i);
                                                      }
                                                  });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"YEs",Toast.LENGTH_LONG).show();
            }
        });
    }
}
