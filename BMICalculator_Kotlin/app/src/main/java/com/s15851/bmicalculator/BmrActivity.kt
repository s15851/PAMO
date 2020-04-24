package com.s15851.bmicalculator

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bmr.*
import kotlin.math.roundToInt

class BmrActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmr)

        calcBmr.setOnClickListener { showBmr() }

        btBack.setOnClickListener {
            val intent = Intent(this, BmiActivity::class.java)
            startActivity(intent)
        }
    }

    private fun showBmr() {
        val inputWeight = weight.text.toString()
        val inputHeight = height.text.toString()
        val inputAge = age.text.toString()

        if (inputHeight.isNotEmpty() && inputWeight.isNotEmpty() && inputAge.isNotEmpty()) {
            val heightValue = inputHeight.toDouble()
            val weightValue = inputWeight.toDouble()
            val ageValue = inputAge.toInt()
            calculateBmr(weightValue, heightValue, ageValue)
        }
    }

    private fun calculateBmr(weight: Double, height: Double, age: Int) {
        val bmrValue: Double = 66.4730 + 13.7516 * weight + 5.033 * height - 6.7550 * age
        bmrResult.text = bmrValue.roundToInt().toString() + " calories"
    }
}