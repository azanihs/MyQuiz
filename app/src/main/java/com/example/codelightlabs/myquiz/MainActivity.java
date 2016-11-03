package com.example.codelightlabs.myquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView answer1 ;
    TextView answer2 ;
    TextView answer3 ;
    TextView answer4 ;
    TextView answer5 ;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get answer textview
        answer1 = (TextView) findViewById(R.id.answer1);
        answer2 = (TextView) findViewById(R.id.answer2);
        answer3 = (TextView) findViewById(R.id.answer3);
        answer4 = (TextView) findViewById(R.id.answer4);
        answer5 = (TextView) findViewById(R.id.answer5);

        //get button submit
        submit = (Button) findViewById(R.id.SUBMIT);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score = MainActivity.getScore(1,answer1.getText().toString());
                score +=MainActivity.getScore(2,answer2.getText().toString());
                score +=MainActivity.getScore(3,answer3.getText().toString());
                score +=MainActivity.getScore(4,answer4.getText().toString());
                score +=MainActivity.getScore(5,answer5.getText().toString());

                Intent intent = new Intent(MainActivity.this,AnswerActivity.class);
                intent.putExtra("score",score);
                startActivity(intent);
            }
        });




    }


    private static int getScore(int questionNum,String answer){
        String[] answers ={"yunus","musa","sulaiman","muhammad","nuh"};

        if(answer.equals(answers[questionNum-1])){
            return 1;
        }

        return 0;
    }
}
