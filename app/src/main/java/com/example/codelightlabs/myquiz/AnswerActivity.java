package com.example.codelightlabs.myquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        int score = getIntent().getExtras().getInt("score");
        score = score*20;
        TextView nilai = (TextView) findViewById(R.id.nilai);
        nilai.setText(new StringBuilder().append("").append(score).toString());


    }
}
