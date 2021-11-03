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
    }
    private void LetsPlay()
    {
        ImageView cell1 =findViewById(R.id.cell_1);
        ImageView Xcell1 =findViewById(R.id.X_cell_1);
        ImageView Xcell2 =findViewById(R.id.X_cell_2);
        ImageView Xcell3 =findViewById(R.id.X_cell_3);
        ImageView Xcell4 =findViewById(R.id.X_cell_4);
        ImageView Xcell5 =findViewById(R.id.X_cell_5);
        ImageView Xcell6 =findViewById(R.id.X_cell_6);
        ImageView Xcell7 =findViewById(R.id.X_cell_7);
        ImageView Xcell8 =findViewById(R.id.X_cell_8);
        ImageView Xcell9 =findViewById(R.id.X_cell_9);
        ImageView Oplay = findViewById(R.id.Oplay);
        ImageView Xplay = findViewById(R.id.Xplay);
        ImageView Xwin =findViewById(R.id.Xwins);
        ImageView Owin =findViewById(R.id.Owins);
        ImageView noWinner =findViewById(R.id.No_Winner);
        int turnsCounter = 0;

        cell1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xcell1.setVisibility(View.VISIBLE);
                Xplay.setVisibility(View.INVISIBLE);
                Oplay.setVisibility(View.VISIBLE);

            }
        });
//        while(turnsCounter < 9);

    }
}