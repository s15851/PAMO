package com.s15851.bmi_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiActivity extends AppCompatActivity {

    private EditText weight;
    private EditText height;
    private TextView bmi;
    private TextView bmiResult;
    private String BMI;
    static String bmiValueString;

    public void setBMI(String BMI) {
        this.BMI = BMI;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);


        Button btLaunchBmrActivity = findViewById(R.id.launchBmr);
        Button btLaunchDietActivity = findViewById(R.id.launchDiet);

        btLaunchBmrActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BmrActivity.class);
                startActivity(intent);
            }
        });

        btLaunchDietActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BmiActivity.this, DietActivity.class);
                intent.putExtra("bmiResult", bmiValueString);
                if (!bmiValueString.isEmpty())
                {
                    startActivity(intent);
                }
            }
        });

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        bmi = findViewById(R.id.bmi);
        bmiResult = findViewById(R.id.bmiResult);
        Button btCalculateBmi = findViewById(R.id.calcBmi);

        btCalculateBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBmi();
            }
        });
    }

    public String calculateBmi(){
        String inputWeight = weight.getText().toString();
        String inputHeight = height.getText().toString();

        if (!inputHeight.isEmpty() && !inputWeight.isEmpty())
        {
            double weightValue = Double.parseDouble(inputWeight);
            double heightValue = Double.parseDouble(inputHeight);
            double bmiValue = (double) (Math.round(weightValue / (heightValue * heightValue) * 10000));

            bmiValueString = Double.toString(bmiValue);

            bmi.setText(bmiValueString);

            if (bmiValue<=18.5)
            {
                bmiValueString = getString(R.string.under);
            }
            else if (bmiValue>18.5 && bmiValue<25)
            {
                bmiValueString = getString(R.string.normal);
            }
            else if (bmiValue>=25 && bmiValue<30)
            {
                bmiValueString = getString(R.string.over);
            }
            else {
                bmiValueString = getString(R.string.obese);
            }
            bmiResult.setText(bmiValueString);
            BMI = bmiValueString;
            setBMI(BMI);

        }
        return bmiValueString;
    }

}

