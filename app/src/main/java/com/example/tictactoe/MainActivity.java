package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int turnsCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void LetsPlay()
    {
        ImageView cell1 =findViewById(R.id.cell_1);
        ImageView cell2 =findViewById(R.id.cell_2);
        ImageView cell3 =findViewById(R.id.cell_3);
        ImageView cell4 =findViewById(R.id.cell_4);
        ImageView cell5 =findViewById(R.id.cell_5);
        ImageView cell6 =findViewById(R.id.cell_6);
        ImageView cell7 =findViewById(R.id.cell_7);
        ImageView cell8 =findViewById(R.id.cell_8);
        ImageView cell9 =findViewById(R.id.cell_9);
        ImageView Xcell1 =findViewById(R.id.X_cell_1);
        ImageView Xcell2 =findViewById(R.id.X_cell_2);
        ImageView Xcell3 =findViewById(R.id.X_cell_3);
        ImageView Xcell4 =findViewById(R.id.X_cell_4);
        ImageView Xcell5 =findViewById(R.id.X_cell_5);
        ImageView Xcell6 =findViewById(R.id.X_cell_6);
        ImageView Xcell7 =findViewById(R.id.X_cell_7);
        ImageView Xcell8 =findViewById(R.id.X_cell_8);
        ImageView Xcell9 =findViewById(R.id.X_cell_9);

        ImageView Ocell1 =findViewById(R.id.O_cell_1);
        ImageView Ocell2 =findViewById(R.id.O_cell_2);
        ImageView Ocell3 =findViewById(R.id.O_cell_3);
        ImageView Ocell4 =findViewById(R.id.O_cell_4);
        ImageView Ocell5 =findViewById(R.id.O_cell_5);
        ImageView Ocell6 =findViewById(R.id.O_cell_6);
        ImageView Ocell7 =findViewById(R.id.O_cell_7);
        ImageView Ocell8 =findViewById(R.id.O_cell_8);
        ImageView Ocell9 =findViewById(R.id.O_cell_9);



        ImageView Oplay = findViewById(R.id.Oplay);
        ImageView Xplay = findViewById(R.id.Xplay);
        ImageView Xwin =findViewById(R.id.Xwins);
        ImageView Owin =findViewById(R.id.Owins);
//        ImageView noWinner =findViewById(R.id.No_Winner);
        boolean flag_win = false;

        cell1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int y =0 ;
                if(Xcell1.getVisibility() == View.INVISIBLE){
                    if(Ocell1.getVisibility() == View.INVISIBLE) {
                        if(turnsCounter % 2==0){
                            Xcell1.setVisibility(View.VISIBLE);
                            Xplay.setVisibility(View.INVISIBLE);
                            Oplay.setVisibility(View.VISIBLE);
                        }
                        else{
                            Ocell1.setVisibility(View.VISIBLE);
                            Oplay.setVisibility(View.INVISIBLE);
                            Xplay.setVisibility(View.VISIBLE);
                        }
                        ++turnsCounter;
                    }
                }

                Xcell1.setVisibility(View.VISIBLE);
                Xplay.setVisibility(View.INVISIBLE);
                Oplay.setVisibility(View.VISIBLE);

            }
        });

        while(turnsCounter < 9 && !flag_win){
            if(turnsCounter > 4);
//                flag_win = checkWinner();
        }

        if(!flag_win){
            findViewById(R.id.No_Winner).setVisibility(View.VISIBLE);
            Xplay.setVisibility(View.INVISIBLE);
        }



    }
}