package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int turnsCounter = 0;
    boolean flagEndGame = false;
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
    ImageView Ocell7 = findViewById(R.id.O_cell_7);
    ImageView Ocell8 =findViewById(R.id.O_cell_8);
    ImageView Ocell9 =findViewById(R.id.O_cell_9);


    ImageView Oplay = findViewById(R.id.Oplay);
    ImageView Xplay = findViewById(R.id.Xplay);
    ImageView Xwin =findViewById(R.id.Xwins);
    ImageView Owin =findViewById(R.id.Owins);

    ImageView topHorizontal = findViewById(R.id.top_horizontal);
    ImageView bottomHorizontal = findViewById(R.id.bottom_horizontal);
    ImageView middleHorizontal = findViewById(R.id.middel_horizontal);
    ImageView leftVertical = findViewById(R.id.left_vertical);
    ImageView middleVertical = findViewById(R.id.middel_vertical);
    ImageView rightVertical = findViewById(R.id.right_vertical);
    ImageView mainDiagonal = findViewById(R.id.main_diagonal);
    ImageView secondaryDiagonal = findViewById(R.id.secondary_diagonal);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LetsPlay(); //// ?????
    }

    private boolean checkWinner()
    {
        return false;
    }

    private void LetsPlay()
    {

        cell1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagEndGame)  // if the game ended
                {
                    return;
                }
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
                        if(turnsCounter > 4)
                            flagEndGame = checkWinner();
                    }
                }
            }
        });



        cell6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagEndGame)  // if the game ended
                {
                    return;
                }
                if(Xcell6.getVisibility() == View.INVISIBLE){
                    if(Ocell6.getVisibility() == View.INVISIBLE) {
                        if(turnsCounter % 2==0){
                            Xcell6.setVisibility(View.VISIBLE);
                            Xplay.setVisibility(View.INVISIBLE);
                            Oplay.setVisibility(View.VISIBLE);
                        }
                        else{
                            Ocell6.setVisibility(View.VISIBLE);
                            Oplay.setVisibility(View.INVISIBLE);
                            Xplay.setVisibility(View.VISIBLE);
                        }
                        ++turnsCounter;
                        if(turnsCounter > 4)
                            flagEndGame = checkWinner();
                    }
                }
            }
        });

        cell7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagEndGame)  // if the game ended
                {
                    return;
                }
                if(Xcell7.getVisibility() == View.INVISIBLE){
                    if(Ocell7.getVisibility() == View.INVISIBLE) {
                        if(turnsCounter % 2==0){
                            Xcell7.setVisibility(View.VISIBLE);
                            Xplay.setVisibility(View.INVISIBLE);
                            Oplay.setVisibility(View.VISIBLE);
                        }
                        else{
                            Ocell7.setVisibility(View.VISIBLE);
                            Oplay.setVisibility(View.INVISIBLE);
                            Xplay.setVisibility(View.VISIBLE);
                        }
                        ++turnsCounter;
                        if(turnsCounter > 4)
                            flagEndGame = checkWinner();
                    }
                }
            }
        });

        cell8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagEndGame)  // if the game ended
                {
                    return;
                }
                if(Xcell8.getVisibility() == View.INVISIBLE){
                    if(Ocell8.getVisibility() == View.INVISIBLE) {
                        if(turnsCounter % 2==0){
                            Xcell8.setVisibility(View.VISIBLE);
                            Xplay.setVisibility(View.INVISIBLE);
                            Oplay.setVisibility(View.VISIBLE);
                        }
                        else{
                            Ocell8.setVisibility(View.VISIBLE);
                            Oplay.setVisibility(View.INVISIBLE);
                            Xplay.setVisibility(View.VISIBLE);
                        }
                        ++turnsCounter;
                        if(turnsCounter > 4)
                            flagEndGame = checkWinner();
                    }
                }
            }
        });

        cell9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagEndGame)  // if the game ended
                {
                    return;
                }
                if(Xcell9.getVisibility() == View.INVISIBLE){
                    if(Ocell9.getVisibility() == View.INVISIBLE) {
                        if(turnsCounter % 2==0){
                            Xcell9.setVisibility(View.VISIBLE);
                            Xplay.setVisibility(View.INVISIBLE);
                            Oplay.setVisibility(View.VISIBLE);
                        }
                        else{
                            Ocell9.setVisibility(View.VISIBLE);
                            Oplay.setVisibility(View.INVISIBLE);
                            Xplay.setVisibility(View.VISIBLE);
                        }
                        ++turnsCounter;
                        if(turnsCounter > 4)
                            flagEndGame = checkWinner();
                    }
                }
            }
        });

        cell2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagEndGame)  // if the game ended
                {
                    return;
                }
                if(Xcell2.getVisibility() == View.INVISIBLE){
                    if(Ocell2.getVisibility() == View.INVISIBLE) {
                        if(turnsCounter % 2==0){
                            Xcell2.setVisibility(View.VISIBLE);
                            Xplay.setVisibility(View.INVISIBLE);
                            Oplay.setVisibility(View.VISIBLE);
                        }
                        else{
                            Ocell2.setVisibility(View.VISIBLE);
                            Oplay.setVisibility(View.INVISIBLE);
                            Xplay.setVisibility(View.VISIBLE);
                        }
                        ++turnsCounter;
                        flagEndGame = checkWinner();
                    }
                }
            }
        });

        cell3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagEndGame)  // if the game ended
                {
                    return;
                }
                if(Xcell3.getVisibility() == View.INVISIBLE){
                    if(Ocell3.getVisibility() == View.INVISIBLE) {
                        if(turnsCounter % 2==0){
                            Xcell3.setVisibility(View.VISIBLE);
                            Xplay.setVisibility(View.INVISIBLE);
                            Oplay.setVisibility(View.VISIBLE);
                        }
                        else{
                            Ocell3.setVisibility(View.VISIBLE);
                            Oplay.setVisibility(View.INVISIBLE);
                            Xplay.setVisibility(View.VISIBLE);
                        }
                        ++turnsCounter;
                        flagEndGame = checkWinner();
                    }
                }
            }
        });

        cell4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagEndGame)  // if the game ended
                {
                    return;
                }
                if(Xcell4.getVisibility() == View.INVISIBLE){
                    if(Ocell4.getVisibility() == View.INVISIBLE) {
                        if(turnsCounter % 2==0){
                            Xcell4.setVisibility(View.VISIBLE);
                            Xplay.setVisibility(View.INVISIBLE);
                            Oplay.setVisibility(View.VISIBLE);
                        }
                        else{
                            Ocell4.setVisibility(View.VISIBLE);
                            Oplay.setVisibility(View.INVISIBLE);
                            Xplay.setVisibility(View.VISIBLE);
                        }
                        ++turnsCounter;
                        flagEndGame = checkWinner();
                    }
                }
            }
        });

        cell5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagEndGame)  // if the game ended
                {
                    return;
                }
                if(Xcell5.getVisibility() == View.INVISIBLE){
                    if(Ocell5.getVisibility() == View.INVISIBLE) {
                        if(turnsCounter % 2==0){
                            Xcell5.setVisibility(View.VISIBLE);
                            Xplay.setVisibility(View.INVISIBLE);
                            Oplay.setVisibility(View.VISIBLE);
                        }
                        else{
                            Ocell5.setVisibility(View.VISIBLE);
                            Oplay.setVisibility(View.INVISIBLE);
                            Xplay.setVisibility(View.VISIBLE);
                        }
                        ++turnsCounter;
                        flagEndGame = checkWinner();
                    }
                }
            }
        });
    }
    private boolean checkXWinner()
    {
        if(Xcell1.getVisibility() == View.VISIBLE && Xcell2.getVisibility() == View.VISIBLE && Xcell3.getVisibility() == View.VISIBLE) {
            Oplay.setVisibility(View.INVISIBLE);
            Xwin.setVisibility(View.VISIBLE);
            topHorizontal.setVisibility(View.VISIBLE);
            return true;
        }
        if(Xcell1.getVisibility() == View.VISIBLE && Xcell2.getVisibility() == View.VISIBLE && Xcell3.getVisibility() == View.VISIBLE) {
            Oplay.setVisibility(View.INVISIBLE);
            Xwin.setVisibility(View.VISIBLE);
            topHorizontal.setVisibility(View.VISIBLE);
            return true;
        }

    }

}