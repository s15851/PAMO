package com.s15851.bmi_calc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DietActivity extends AppCompatActivity {

    private TextView detailsTextView;
    private ImageView illustrationImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);

        Button back = findViewById(R.id.btBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BmiActivity.class);
                startActivity(intent);
            }
        });

        detailsTextView = findViewById(R.id.detailsTextView);
        illustrationImageView = findViewById(R.id.resultIllustrationImageView);

        displayDiet(BmiActivity.bmiValueString);

    }


    private void displayDiet(String bmiCategory){

        switch(bmiCategory) {
            case "Underweight":
                detailsTextView.setText(R.string.under);
                illustrationImageView.setImageResource(R.drawable.under);
                break;

            case "Healthy range":
                detailsTextView.setText(R.string.normal);
                illustrationImageView.setImageResource(R.drawable.normal);
                break;
            case "Overweight":
                detailsTextView.setText(R.string.over);
                illustrationImageView.setImageResource(R.drawable.over);
                break;
            case "Obese":
                detailsTextView.setText(R.string.obese);
                illustrationImageView.setImageResource(R.drawable.obese);
                break;
        }
    }
}
