package com.s15851.bmicalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_diet.*

class DietActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diet)

        displayDiet(BmiActivity.bmiValueString)

        btBack.setOnClickListener {
            val intent = Intent(this, BmiActivity::class.java)
            startActivity(intent)
        }
    }

    private fun displayDiet(bmiCategory: String) {
        when (bmiCategory) {
            "Underweight" -> {
                detailsTextView.setText(R.string.under)
                detailsTextView2.setText(R.string.under_diet)
                resultIllustrationImageView.setImageResource(R.drawable.under)
            }
            "Healthy range" -> {
                detailsTextView.setText(R.string.normal)
                detailsTextView2.setText(R.string.normal_diet)
                resultIllustrationImageView.setImageResource(R.drawable.normal)
            }
            "Overweight" -> {
                detailsTextView.setText(R.string.over)
                detailsTextView2.setText(R.string.over_diet)
                resultIllustrationImageView.setImageResource(R.drawable.over)
            }
            "Obese" -> {
                detailsTextView.setText(R.string.obese)
                detailsTextView2.setText(R.string.obese_diet)
                resultIllustrationImageView.setImageResource(R.drawable.obese)
            }
        }
    }
}