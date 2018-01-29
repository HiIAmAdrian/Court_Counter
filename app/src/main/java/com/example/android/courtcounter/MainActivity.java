package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0,scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment3(View view)
    {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    public void increment2(View view)
    {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }
    public void increment1(View view)
    {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }
    public void increment31(View view)
    {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    public void increment21(View view)
    {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    public void increment11(View view)
    {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View v)
    {
        scoreTeamA = scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
