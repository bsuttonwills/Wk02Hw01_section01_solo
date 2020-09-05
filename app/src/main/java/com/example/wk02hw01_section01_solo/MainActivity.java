package com.example.wk02hw01_section01_solo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button loginButton;
    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginButton);
        user = findViewById(R.id.editTextUser);
        pass = findViewById(R.id.editTextTextPassword2);




//        Log.i("user: ", user.getText().toString());
//        Log.i("pass: ", pass.getText().toString());

        loginButton.setOnClickListener(new View.OnClickListener() {
            String username = user.getText().toString();
            String password = pass.getText().toString();

            @Override
            public void onClick(View view) {

                Log.i("User onClick", username);
                Log.i("Pass onClick", password);

                checkInfo(user.getText().toString(), pass.getText().toString());
//                if (user.getText().toString().equals("din_djarin") || pass.getText().toString().equals("baby_yoda_ftw")) {
////                    Intent i = new Intent("LandingActivity");
//                    Intent i = LandingActivity.getIntent(getApplicationContext(), username);
//                    startActivity(i);
//                }
//                else {
//                    user.setBackgroundColor(Color.RED);
//                    pass.setBackgroundColor(Color.RED);
//                }


            }
        });


    }
    public void checkInfo(String name, String pword) {
        if (name.equals("din_djarin") && pword.equals("baby_yoda_ftw")) {
            Intent i = LandingActivity.getIntent(getApplicationContext(), name);
            startActivity(i);
        } else {
            user.setBackgroundColor(Color.RED);
            pass.setBackgroundColor(Color.RED);
            Toast.makeText(getApplicationContext(), "Wrong username or password", Toast.LENGTH_SHORT).show();
        }
    }


}