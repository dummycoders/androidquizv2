package ga.code.android_quiz_v2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class QuizActivity extends AppCompatActivity {

    Button answer1, answer2, answer3;

    TextView score, question;

    private Questions mQuestions = new Questions();

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionLength = mQuestions.mQuestions.length;

    private int mQuestionNumber = 1;

    Random r;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("Punkte: " + mScore);

        updateQuestion(mQuestionNumber++);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer1.getText() == mAnswer) {
                    mScore++;
                    score.setText("Punkte: " + mScore);
                    updateQuestion(mQuestionNumber++);
                }
                else{
                    gameOver();
                }

            }
            });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer2.getText() == mAnswer) {
                    mScore++;
                    score.setText("Punkte: " + mScore);
                    updateQuestion(mQuestionNumber++);
                }
                else{
                    gameOver();
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer3.getText() == mAnswer) {
                    mScore++;
                    score.setText("Punkte: " + mScore);
                    updateQuestion(mQuestionNumber++);
                }
                else{
                    gameOver();
                }
            }
        });
        }

        private void updateQuestion(int num) {
        question.setText(mQuestions.getQuestions(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
        mQuestionNumber++;
    }

    private void gameOver() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(QuizActivity.this);
        alertDialogBuilder
                .setMessage("Verloren! Dein Punktestand: " + mScore)
                .setCancelable(false)
                .setPositiveButton("Neues Spiel",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                            startActivity(new Intent(getApplicationContext(), QuizActivity.class));
                            }
                        })

                .setNegativeButton("Beenden",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}