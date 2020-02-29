package com.example.football;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private int club1score;
    private int club2score;
    private TextView textViewClub1;
    private TextView textViewClub2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewClub1 = findViewById(R.id.club1_score);
        textViewClub2 = findViewById(R.id.club2_score);


    }


    public void add1ForClub1(View view) {
        club1score = club1score + 1;
        displayScoreForClub1(club1score);
        Toast toast = Toast.makeText(this, R.string.club1_message,
                Toast.LENGTH_SHORT);
        toast.show();

    }


    public void add1ForClub2(View view) {
        club2score = club2score + 1;
        displayScoreForClub2(club2score);
        Toast toast = Toast.makeText(this, R.string.Club2_message,
                Toast.LENGTH_SHORT);
        toast.show();

    }

    public void displayScoreForClub1(int score){
        textViewClub1.setText(String.valueOf(score));
    }

    public void displayScoreForClub2(int score){
        textViewClub2.setText(String.valueOf(score));
    }


    public void result(View view) {
        if (club1score == club2score) {
            Toast toast = Toast.makeText(this, R.string.Cl_message,
                    Toast.LENGTH_SHORT);
            toast.show();
        } else if (club1score > club2score) {
            Toast toast = Toast.makeText(this, R.string.Club_message,
                    Toast.LENGTH_SHORT);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, R.string.Clu_message,
                    Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void resetScore(View view) {
        club1score = 0;
        club2score = 0;
        displayScoreForClub1(club1score);
        displayScoreForClub2(club2score);

    }


}

