package com.example.stephen.testgame;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private
    ImageButton rock, paper, scissor, lizard, spock;
    Button H2P;
    TextView scoreU, scoreC;
    int score1 = 0;
    int score2 = 0;
    String score1string = "";
    String score2string = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        H2P = (Button) findViewById(R.id.H2P);

        rock = (ImageButton) findViewById(R.id.rock);
        paper = (ImageButton) findViewById(R.id.paper);
        scissor = (ImageButton) findViewById(R.id.scissor);
        lizard = (ImageButton) findViewById(R.id.lizard);
        spock = (ImageButton) findViewById(R.id.spock);

        scoreU = (TextView) findViewById(R.id.scoreU);
        scoreC = (TextView) findViewById(R.id.scoreC);

        score1string = "0";
        scoreU.setText(score1string);

        score2string = "0";
        scoreC.setText(score2string);

        H2P.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, HelpPopup.class));
            }

        });
    }


        public static String PowerOfAI(){
            String[] Powers = {"rock", "paper", "scissor", "lizard", "spock"};
            Random r = new Random();
            int power = r.nextInt((4-1)+1)+1;
            return Powers[power];
        }

        public void cmpResult(String userChoice) {
            String gameOutcome = "";
            String computerChoice = PowerOfAI();
            if (userChoice.equals(computerChoice)) {
                gameOutcome = "It's a tie! Both chose " + userChoice;
            }
            else if (userChoice.equals("rock")) {
                if (computerChoice.equals("lizard") || computerChoice.equals("scissor")) {
                    gameOutcome = "User wins with " + userChoice + " against " + computerChoice;
                    score1++;
                    score1string = "" + score1;
                    scoreU.setText(score1string);
                }
                else {
                    gameOutcome = "User loses with " + userChoice + " against " + computerChoice;
                    score2++;
                    score2string = "" + score2;
                    scoreC.setText(score2string);
                }
            }
            else if (userChoice.equals("paper")) {
                if (computerChoice.equals("spock") || computerChoice.equals("rock")) {
                    gameOutcome = "User wins with " + userChoice + " against " + computerChoice;
                    score1++;
                    score1string = "" + score1;
                    scoreU.setText(score1string);
                }
                else {
                    gameOutcome = "User loses with " + userChoice + " against " + computerChoice;
                    score2++;
                    score2string = "" + score2;
                    scoreC.setText(score2string);
                }
            }
            else if (userChoice.equals("scissor")) {
                if (computerChoice.equals("lizard") || computerChoice.equals("paper")) {
                    gameOutcome = "User wins with " + userChoice + " against " + computerChoice;
                    score1++;
                    score1string = "" + score1;
                    scoreU.setText(score1string);
                }
                else {
                    gameOutcome = "User loses with " + userChoice + " against " + computerChoice;
                    score2++;
                    score2string = "" + score2;
                    scoreC.setText(score2string);
                }
            }
            else if (userChoice.equals("lizard")) {
                if (computerChoice.equals("spock") || computerChoice.equals("paper")) {
                    gameOutcome = "User wins with " + userChoice + " against " + computerChoice;
                    score1++;
                    score1string = "" + score1;
                    scoreU.setText(score1string);
                }
                else {
                    gameOutcome = "User loses with " + userChoice + " against " + computerChoice;
                    score2++;
                    score2string = "" + score2;
                    scoreC.setText(score2string);
                }
            }
            else if (userChoice.equals("spock")) {
                if (computerChoice.equals("scissor") || computerChoice.equals("rock")) {
                    gameOutcome = "User wins with " + userChoice + " against " + computerChoice;
                    score1++;
                    score1string = "" + score1;
                    scoreU.setText(score1string);
                }
                else {
                    gameOutcome = "User loses with " + userChoice + " against " + computerChoice;
                    score2++;
                    score2string = "" + score2;
                    scoreC.setText(score2string);
                }
            }
            Toast.makeText(this, gameOutcome, Toast.LENGTH_SHORT).show();
        }

        public void rock(View view) {
            cmpResult("rock");
        }

        public void paper(View view) {
            cmpResult("paper");
        }

        public void scissor(View view) {
            cmpResult("scissor");
        }

        public void lizard(View view) {
            cmpResult("lizard");
        }

        public void spock(View view) {
            cmpResult("spock");
        }

}
