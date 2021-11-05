package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int turnsCounter = 0;
    boolean flagEndGame = false;
    ImageView cell1, cell2, cell3, cell4, cell5, cell6, cell7, cell8, cell9;
    ImageView Xcell1, Xcell2, Xcell3, Xcell4, Xcell5, Xcell6, Xcell7, Xcell8, Xcell9;
    ImageView Ocell1, Ocell2, Ocell3, Ocell4, Ocell5, Ocell6, Ocell7, Ocell8, Ocell9;
    ImageView Oplay, Xplay, Xwin, Owin, topHorizontal, bottomHorizontal, middleHorizontal, leftVertical;
    ImageView middleVertical, rightVertical, mainDiagonal, secondaryDiagonal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LetsPlay(); //// ?????
    }


    private boolean checkWinner()
    {
        boolean winner;
        if(turnsCounter %2 == 0)
            winner = checkOWinner();
        else
            winner = checkXWinner();
        if(!winner && turnsCounter > 8) {
            Oplay.setVisibility(View.INVISIBLE);
            findViewById(R.id.No_Winner).setVisibility(View.INVISIBLE);
            winner = true;
        }
        return winner;
    }

    private void LetsPlay()
    {
        cell1 =findViewById(R.id.cell_1);
        cell2 =findViewById(R.id.cell_2);
        cell3 =findViewById(R.id.cell_3);
        cell4 =findViewById(R.id.cell_4);
        cell5 =findViewById(R.id.cell_5);
        cell6 =findViewById(R.id.cell_6);
        cell7 =findViewById(R.id.cell_7);
        cell8 =findViewById(R.id.cell_8);
        cell9 =findViewById(R.id.cell_9);
        Xcell1 =findViewById(R.id.X_cell_1);
        Xcell2 =findViewById(R.id.X_cell_2);
        Xcell3 =findViewById(R.id.X_cell_3);
        Xcell4 =findViewById(R.id.X_cell_4);
        Xcell5 =findViewById(R.id.X_cell_5);
        Xcell6 =findViewById(R.id.X_cell_6);
        Xcell7 =findViewById(R.id.X_cell_7);
        Xcell8 =findViewById(R.id.X_cell_8);
        Xcell9 =findViewById(R.id.X_cell_9);
        Ocell1 =findViewById(R.id.O_cell_1);
        Ocell2 =findViewById(R.id.O_cell_2);
        Ocell3 =findViewById(R.id.O_cell_3);
        Ocell4 =findViewById(R.id.O_cell_4);
        Ocell5 =findViewById(R.id.O_cell_5);
        Ocell6 =findViewById(R.id.O_cell_6);
        Ocell7 = findViewById(R.id.O_cell_7);
        Ocell8 =findViewById(R.id.O_cell_8);
        Ocell9 =findViewById(R.id.O_cell_9);


        Oplay = findViewById(R.id.Oplay);
        Xplay = findViewById(R.id.Xplay);
        Xwin =findViewById(R.id.Xwins);
        Owin =findViewById(R.id.Owins);

        topHorizontal = findViewById(R.id.top_horizontal);
        bottomHorizontal = findViewById(R.id.bottom_horizontal);
        middleHorizontal = findViewById(R.id.middel_horizontal);
        leftVertical = findViewById(R.id.left_vertical);
        middleVertical = findViewById(R.id.middel_vertical);
        rightVertical = findViewById(R.id.right_vertical);
        mainDiagonal = findViewById(R.id.main_diagonal);
        secondaryDiagonal = findViewById(R.id.secondary_diagonal);

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
                        if(turnsCounter > 4)
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
                        if(turnsCounter > 4)
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
                        if(turnsCounter > 4)
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
                        if(turnsCounter > 4)
                            flagEndGame = checkWinner();
                    }
                }
            }
        });
    }

    private boolean checkXWinner()
    {
        if(Xcell1.getVisibility() == View.VISIBLE && Xcell2.getVisibility() == View.VISIBLE && Xcell3.getVisibility() == View.VISIBLE) {
            Oplay.setVisibility(View.INVISIBLE);   // might delete
            Xwin.setVisibility(View.VISIBLE);
            topHorizontal.setVisibility(View.VISIBLE);
            return true;
        }

        if(Xcell1.getVisibility() == View.VISIBLE && Xcell5.getVisibility() == View.VISIBLE && Xcell9.getVisibility() == View.VISIBLE) {
            Oplay.setVisibility(View.INVISIBLE);   // might delete
            Xwin.setVisibility(View.VISIBLE);
            mainDiagonal.setVisibility(View.VISIBLE);
            return true;
        }

        if(Xcell1.getVisibility() == View.VISIBLE && Xcell4.getVisibility() == View.VISIBLE && Xcell7.getVisibility() == View.VISIBLE) {
            Oplay.setVisibility(View.INVISIBLE);
            Xwin.setVisibility(View.VISIBLE);
            leftVertical.setVisibility(View.VISIBLE);
            return true;
        }

        if(Xcell2.getVisibility() == View.VISIBLE && Xcell5.getVisibility() == View.VISIBLE && Xcell8.getVisibility() == View.VISIBLE) {
            Oplay.setVisibility(View.INVISIBLE);
            Xwin.setVisibility(View.VISIBLE);
            middleVertical.setVisibility(View.VISIBLE);
            return true;
        }

        if(Xcell3.getVisibility() == View.VISIBLE && Xcell5.getVisibility() == View.VISIBLE && Xcell7.getVisibility() == View.VISIBLE) {
            Oplay.setVisibility(View.INVISIBLE);
            Xwin.setVisibility(View.VISIBLE);
            secondaryDiagonal.setVisibility(View.VISIBLE);
            return true;
        }

        if(Xcell3.getVisibility() == View.VISIBLE && Xcell6.getVisibility() == View.VISIBLE && Xcell9.getVisibility() == View.VISIBLE) {
            Oplay.setVisibility(View.INVISIBLE);
            Xwin.setVisibility(View.VISIBLE);
            rightVertical.setVisibility(View.VISIBLE);
            return true;
        }

        if(Xcell4.getVisibility() == View.VISIBLE && Xcell5.getVisibility() == View.VISIBLE && Xcell6.getVisibility() == View.VISIBLE) {
            Oplay.setVisibility(View.INVISIBLE);
            Xwin.setVisibility(View.VISIBLE);
            middleHorizontal.setVisibility(View.VISIBLE);
            return true;
        }

        if(Xcell7.getVisibility() == View.VISIBLE && Xcell8.getVisibility() == View.VISIBLE && Xcell9.getVisibility() == View.VISIBLE) {
            Oplay.setVisibility(View.INVISIBLE);
            Xwin.setVisibility(View.VISIBLE);
            bottomHorizontal.setVisibility(View.VISIBLE);
            return true;
        }
        return false;

    }

    private boolean checkOWinner(){
        if(Ocell1.getVisibility() == View.VISIBLE && Ocell2.getVisibility() == View.VISIBLE && Ocell3.getVisibility() == View.VISIBLE) {
            Xplay.setVisibility(View.INVISIBLE); //???
            Owin.setVisibility(View.VISIBLE);
            topHorizontal.setVisibility(View.VISIBLE);
            return true;
        }

        if(Ocell1.getVisibility() == View.VISIBLE && Ocell5.getVisibility() == View.VISIBLE && Ocell9.getVisibility() == View.VISIBLE) {
            Xplay.setVisibility(View.INVISIBLE); //???
            Owin.setVisibility(View.VISIBLE);
            mainDiagonal.setVisibility(View.VISIBLE);
            return true;
        }

        if(Ocell1.getVisibility() == View.VISIBLE && Ocell4.getVisibility() == View.VISIBLE && Ocell7.getVisibility() == View.VISIBLE) {
            Xplay.setVisibility(View.INVISIBLE); //???
            Owin.setVisibility(View.VISIBLE);
            leftVertical.setVisibility(View.VISIBLE);
            return true;
        }
        if(Ocell2.getVisibility() == View.VISIBLE && Ocell5.getVisibility() == View.VISIBLE && Ocell8.getVisibility() == View.VISIBLE) {
            Xplay.setVisibility(View.INVISIBLE); //???
            Owin.setVisibility(View.VISIBLE);
            middleVertical.setVisibility(View.VISIBLE);
            return true;
        }
        if(Ocell3.getVisibility() == View.VISIBLE && Ocell5.getVisibility() == View.VISIBLE && Ocell7.getVisibility() == View.VISIBLE) {
            Xplay.setVisibility(View.INVISIBLE); //???
            Owin.setVisibility(View.VISIBLE);
            secondaryDiagonal.setVisibility(View.VISIBLE);
            return true;
        }
        if(Ocell3.getVisibility() == View.VISIBLE && Ocell6.getVisibility() == View.VISIBLE && Ocell9.getVisibility() == View.VISIBLE) {
            Xplay.setVisibility(View.INVISIBLE); //???
            Owin.setVisibility(View.VISIBLE);
            rightVertical.setVisibility(View.VISIBLE);
            return true;
        }
        if(Ocell4.getVisibility() == View.VISIBLE && Ocell5.getVisibility() == View.VISIBLE && Ocell6.getVisibility() == View.VISIBLE) {
            Xplay.setVisibility(View.INVISIBLE); //???
            Owin.setVisibility(View.VISIBLE);
            middleHorizontal.setVisibility(View.VISIBLE);
            return true;
        }
        if(Ocell7.getVisibility() == View.VISIBLE && Ocell8.getVisibility() == View.VISIBLE && Ocell9.getVisibility() == View.VISIBLE) {
            Xplay.setVisibility(View.INVISIBLE); //???
            Owin.setVisibility(View.VISIBLE);
            bottomHorizontal.setVisibility(View.VISIBLE);
            return true;
        }
        return false;
    }
}