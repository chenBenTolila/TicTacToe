package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView cell1 = (ImageView) findViewById(R.id.cell_1);
        ImageView Xcell1 = (ImageView) findViewById(R.id.X_cell_1);
        cell1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xcell1.setVisibility(View.VISIBLE);
            }
        });
    }
}