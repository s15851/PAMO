package com.s15851.bmicalculator

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_quiz.*
import java.util.*

class QuizActivity : AppCompatActivity() {

    private val mQuestions: Questions = Questions()
    private val mQuestionsLength = mQuestions.mQuestions.size
    private var mAnswer: String? = null
    private var mScore = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        val r = Random()
        score.text = "Wynik: $mScore"
        updateQuestion(r.nextInt(mQuestionsLength))
        answer1.setOnClickListener {
            if (answer1.text === mAnswer) {
                mScore++
                score.text = "Wynik: $mScore"
                updateQuestion(r.nextInt(mQuestionsLength))
            } else {
                gameOver()
            }
        }
        answer2.setOnClickListener {
            if (answer2.text === mAnswer) {
                mScore++
                score.text = "Wynik: $mScore"
                updateQuestion(r.nextInt(mQuestionsLength))
            } else {
                gameOver()
            }
        }
        answer3.setOnClickListener {
            if (answer3.text === mAnswer) {
                mScore++
                score.text = "Wynik: $mScore"
                updateQuestion(r.nextInt(mQuestionsLength))
            } else {
                gameOver()
            }
        }
        answer4.setOnClickListener {
            if (answer4.text === mAnswer) {
                mScore++
                score.text = "Wynik: $mScore"
                updateQuestion(r.nextInt(mQuestionsLength))
            } else {
                gameOver()
            }
        }
    }

    private fun updateQuestion(num: Int) {
        question.text = mQuestions.getQuestion(num)
        answer1.text = mQuestions.getChoice1(num)
        answer2.text = mQuestions.getChoice2(num)
        answer3.text = mQuestions.getChoice3(num)
        answer4.text = mQuestions.getChoice4(num)
        mAnswer = mQuestions.getCorrectAnswer(num)
    }

    private fun gameOver() {
        val builder = AlertDialog.Builder(this@QuizActivity)
        builder.setMessage("Game Over! Your score is $mScore points.")
        builder.setCancelable(false)
        builder.setPositiveButton("NEW GAME" ) { _,_ ->
                startActivity(Intent(this, QuizActivity::class.java))
                finish()
            }
        builder.setNegativeButton( "EXIT" ) { _,_ ->
                startActivity(Intent(this, BmiActivity::class.java))
                finish()
            }
        val alertDialog = builder.create()
        alertDialog.show()
    }
}

