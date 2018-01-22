package ga.code.android_quiz_v2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button startbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startbutton = (Button) findViewById(R.id.startbutton);
        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizActivity();
            }
            });
        }
        public void openQuizActivity() {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }
}
