package com.s15851.bmi_calc;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent startIntent = new Intent(MainActivity.this, BmiActivity.class);
                startActivity(startIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
