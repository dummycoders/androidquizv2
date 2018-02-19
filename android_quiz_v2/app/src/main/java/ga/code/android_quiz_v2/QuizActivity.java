package ga.code.android_quiz_v2;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizActivity extends Activity {

    Button answer1, answer2, answer3;

    TextView score, question, fragezaehler;

    private Questions mQuestions = new Questions();

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionLength = mQuestions.mQuestions.length;

    private int mQuestionCount = 1;
    private int mQuestionNumber = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);

        score = (TextView) findViewById(R.id.score);
        fragezaehler = (TextView) findViewById(R.id.fragezaehler);
        question = (TextView) findViewById(R.id.question);

        score.setText("Punkte: " + mScore);
        fragezaehler.setText(mQuestionCount + "/" + mQuestionLength);


        updateQuestion(mQuestionNumber++);
        mQuestionCount++;

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer1.getText() == mAnswer) {
                    mScore++;
                    score.setText("Punkte: " + mScore);



                    answer1.setBackgroundResource(R.color.colorCorrect);


                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            fragezaehler.setText(mQuestionCount + "/" + mQuestionLength);
                            updateQuestion(mQuestionNumber++);
                            mQuestionCount++;

                        }
                    }, 1000);

                    openResultsActivity();


                }
                else{
                    score.setText("Punkte: " + mScore);


                    answer1.setBackgroundResource(R.color.colorFalse);
                    if(answer2.getText() == mAnswer) {
                        answer2.setBackgroundResource(R.color.colorCorrect);
                    }
                    if(answer3.getText() == mAnswer) {
                        answer3.setBackgroundResource(R.color.colorCorrect);
                    }


                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            fragezaehler.setText(mQuestionCount + "/" + mQuestionLength);
                            updateQuestion(mQuestionNumber++);
                            mQuestionCount++;

                        }
                    }, 1000);

                    openResultsActivity();

                }

            }
            });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer2.getText() == mAnswer) {
                    mScore++;
                    score.setText("Punkte: " + mScore);
                    answer2.setBackgroundResource(R.color.colorCorrect);



                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            fragezaehler.setText(mQuestionCount + "/" + mQuestionLength);
                            updateQuestion(mQuestionNumber++);
                            mQuestionCount++;

                        }
                    }, 1000);

                    openResultsActivity();

                }
                else{
                    score.setText("Punkte: " + mScore);
                    answer2.setBackgroundResource(R.color.colorFalse);
                    if(answer1.getText() == mAnswer) {
                        answer1.setBackgroundResource(R.color.colorCorrect);
                    }
                    if(answer3.getText() == mAnswer) {
                        answer3.setBackgroundResource(R.color.colorCorrect);
                    }


                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            fragezaehler.setText(mQuestionCount + "/" + mQuestionLength);
                            updateQuestion(mQuestionNumber++);
                            mQuestionCount++;

                        }
                    }, 1000);

                    openResultsActivity();

                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer3.getText() == mAnswer) {
                    mScore++;
                    score.setText("Punkte: " + mScore);
                    answer3.setBackgroundResource(R.color.colorCorrect);



                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            fragezaehler.setText(mQuestionCount + "/" + mQuestionLength);
                            updateQuestion(mQuestionNumber++);
                            mQuestionCount++;

                        }
                    }, 1000);

                    openResultsActivity();

                }
                else{
                    score.setText("Punkte: " + mScore);
                    answer3.setBackgroundResource(R.color.colorFalse);
                    if(answer1.getText() == mAnswer) {
                        answer1.setBackgroundResource(R.color.colorCorrect);
                    }
                    if(answer2.getText() == mAnswer) {
                        answer2.setBackgroundResource(R.color.colorCorrect);
                    }


                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            fragezaehler.setText(mQuestionCount + "/" + mQuestionLength);
                            updateQuestion(mQuestionNumber++);
                            mQuestionCount++;

                        }
                    }, 1000);

                    openResultsActivity();

                }
            }
        });
        }

        private void updateQuestion(int num) {
        answer1.setBackgroundResource(R.color.colorDefault);
        answer2.setBackgroundResource(R.color.colorDefault);
        answer3.setBackgroundResource(R.color.colorDefault);
        question.setText(mQuestions.getQuestions(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
    }


    private void openResultsActivity(){
        if (mQuestionNumber == mQuestionLength) {
            Intent intent = new Intent(this, ResultsActivity.class);
            startActivity(intent);
        }

    }
}