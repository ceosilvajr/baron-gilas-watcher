package com.ceosilvajr.app.gilaswatcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameScoringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_scoring);

        final TextView tvLeftscore = (TextView) findViewById(R.id.left_score);
        Button btn_onepoint = (Button) findViewById(R.id.btn_one_point);
        Button btn_twopoint = (Button) findViewById(R.id.btn_two_point);
        Button btn_threepoint = (Button) findViewById(R.id.btn_three_point);



        btn_onepoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int start_score = 0;

                start_score = start_score + 1;


                tvLeftscore.setText(start_score);
            }
        });

    }


}
