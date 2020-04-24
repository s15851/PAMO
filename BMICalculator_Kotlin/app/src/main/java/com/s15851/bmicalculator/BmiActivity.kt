package com.s15851.bmicalculator

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bmi.*


class BmiActivity : AppCompatActivity() {

    companion object {
        var bmiValueString = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)

        calcBmi.setOnClickListener { calculateBmi() }

        launchStatistics.setOnClickListener {
            val intent = Intent(this, StatisticsActivity::class.java)
            startActivity(intent)
        }
//        launchQuiz.setOnClickListener {
//            val intent = Intent(this, QuizActivity::class.java)
//            startActivity(intent)
//        }
        launchBmr.setOnClickListener {
            val intent = Intent(this, BmrActivity::class.java)
            startActivity(intent)
        }
        launchDiet.setOnClickListener {
            val intent = Intent(this, DietActivity::class.java)
            intent.putExtra("bmiResult", bmiValueString)
            if (bmiValueString.isEmpty()) {
                alert()
            } else {
                startActivity(intent)
            }
        }
    }

    private fun calculateBmi(): String {

        val inputWeight = weight.text.toString()
        val inputHeight = height.text.toString()

        if (inputHeight.isNotEmpty() && inputWeight.isNotEmpty()) {
            val heightValue = inputHeight.toDouble()
            val weightValue = inputWeight.toDouble()
            val bmiValue = (weightValue / (heightValue * heightValue) * 10000)
            bmi.text = "%.2f".format(bmiValue)


            fun bmiResult(bmiValue: Double) : String {
                if (bmiValue <= 18.5) {
                    bmiValueString = getString(R.string.under)
                } else if (bmiValue > 18.5 && bmiValue < 25) {
                    bmiValueString = getString(R.string.normal)
                } else if (bmiValue >= 25 && bmiValue < 30) {
                    bmiValueString = getString(R.string.over)
                } else {
                    bmiValueString = getString(R.string.obese)
                }
                return bmiValueString
            }

            bmiResult.text = bmiResult(bmiValue)
        }
        return bmiValueString
    }

    private fun alert() {
        val builder = AlertDialog.Builder(this@BmiActivity)
        builder.setMessage("To launch recommended diet, You must calculate your BMI first")
        builder.setCancelable(false)
        builder.setNegativeButton("Back") { _,_ ->
                startActivity(Intent(this, BmiActivity::class.java))
                finish()
            }
        val alertDialog = builder.create()
        alertDialog.show()
    }
}