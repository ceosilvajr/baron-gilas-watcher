package com.ceosilvajr.app.gilaswatcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText tvEmail = (EditText) findViewById(R.id.email_input);
        final EditText tvPassword = (EditText) findViewById(R.id.password_input);
        Button btnLogin = (Button) findViewById(R.id.btn_login);
        final Intent intent = new Intent(this, ScheduleActivity.class);



        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = tvEmail.getText().toString();
                String password = tvPassword.getText().toString();

                if (email.equals("blugtu@gmail.com") && password .equals("123")){
                    //to call the intent here

                    startActivity(intent);
                }

                else{
                   // errerMessage.sete("Username and Password are incorrect!");
                }

            }
        });
    }

}
