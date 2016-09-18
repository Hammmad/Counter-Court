package com.example.shekhchilli.courtcounter;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int TeamBscore = 0;
    public int TeamAscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TeamAPoints(3,R.id.threepoint_buttonA);
        TeamAPoints(2,R.id.twopoint_buttonA);
        TeamAPoints(1,R.id.onepoint_buttonA);
        TeamBPoints(3,R.id.threepoint_buttonB);
        TeamBPoints(2,R.id.twopoint_buttonB);
        TeamBPoints(1,R.id.onepoint_buttonB);
        ResetbuttonClick();

    }

    public void TeamAPoints(final int points, int buttonId){


        Button button = (Button) findViewById(buttonId);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v ) {

                    TextView textview= (TextView) findViewById(R.id.score_textviewA);
                    TeamAscore +=points;
                    textview.setText(String.valueOf(TeamAscore));
                }
            });
        }
    }

    public void TeamBPoints(final int points, int buttonId){


        Button button = (Button) findViewById(buttonId);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v ) {

                    TextView textview= (TextView) findViewById(R.id.score_textviewB);
                    TeamBscore +=points;
                    textview.setText(String.valueOf(TeamBscore));
                }
            });
        }
    }

    public void ResetbuttonClick(){

        Button button = (Button) findViewById(R.id.reset_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TeamAscore = 0;
                TeamBscore = 0;
                TextView textviewA = (TextView) findViewById(R.id.score_textviewA);
                TextView textviewB = (TextView) findViewById(R.id.score_textviewB);
                textviewA.setText(String.valueOf(TeamAscore));
                textviewB.setText(String.valueOf(TeamBscore));
            }
        });
    }
}
