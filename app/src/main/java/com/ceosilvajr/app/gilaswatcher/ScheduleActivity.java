package com.ceosilvajr.app.gilaswatcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class ScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        EditText tvFirstgame = (EditText) findViewById(R.id.first_game);

        final Intent intent = new Intent(this, ScheduleActivity.class);


    }


}
