package com.s15851.bmi_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmrActivity extends AppCompatActivity {

    Button launchDiet, btCalculateBmr;
    TextView bmrResultTextView;
    EditText weightTextView;
    EditText heightTextView;
    EditText ageTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmr);

        launchDiet = findViewById(R.id.launchDiet);
        btCalculateBmr = findViewById(R.id.calcBmr);
        bmrResultTextView = findViewById(R.id.bmrResult);
        weightTextView = findViewById(R.id.weight);
        heightTextView = findViewById(R.id.height);
        ageTextView = findViewById(R.id.age);

        btCalculateBmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBmr();
            }
        });

        Button back = findViewById(R.id.btBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BmiActivity.class);
                startActivity(intent);
            }
        });

    }

    private void showBmr()
    {
        String inputWeight = weightTextView.getText().toString();
        String inputHeight = heightTextView.getText().toString();
        String inputAge = ageTextView.getText().toString();

        if (!inputHeight.isEmpty() && !inputWeight.isEmpty() && !inputAge.isEmpty()) {
            float heightValue = Float.parseFloat(inputHeight);
            float weightValue = Float.parseFloat(inputWeight);
            int ageValue = Integer.parseInt(inputAge);

            calculateBmr(weightValue, heightValue, ageValue);
        }
    }
    public void calculateBmr(double weight, double height, double age)
    {
        double bmrResult;

        bmrResult = 66.4730 + 13.7516 * weight + 5.033 * height - 6.7550 * age;

        bmrResultTextView.setText(String.valueOf(Math.round(bmrResult))+" calories");
    }
}
