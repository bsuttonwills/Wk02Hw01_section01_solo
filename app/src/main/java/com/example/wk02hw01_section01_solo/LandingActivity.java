package com.example.wk02hw01_section01_solo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LandingActivity extends AppCompatActivity {
    String userWelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        userWelcome = getIntent().getStringExtra("userWelcome");
        TextView welc = findViewById(R.id.welcomeText);
        welc.setText("Welcome " + userWelcome);
    }

    public static Intent getIntent(Context context, String value){
        Intent intent = new Intent(context, LandingActivity.class);
        intent.putExtra("userWelcome", value);

        return intent;
    }
}
