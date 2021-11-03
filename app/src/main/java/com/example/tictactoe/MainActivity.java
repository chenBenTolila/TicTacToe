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
        ImageView cell1 =findViewById(R.id.cell_1);
        ImageView Xcell1 =findViewById(R.id.X_cell_1);
        ImageView Oplay = findViewById(R.id.Oplay);
        ImageView Xplay = findViewById(R.id.Xplay);


        cell1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xcell1.setVisibility(View.VISIBLE);
                Xplay.setVisibility(View.INVISIBLE);
                Oplay.setVisibility(View.VISIBLE);

            }
        });
    }
}