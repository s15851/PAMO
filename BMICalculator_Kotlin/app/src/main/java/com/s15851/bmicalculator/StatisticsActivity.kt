package com.s15851.bmicalculator

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import kotlinx.android.synthetic.main.activity_statistics.*


class StatisticsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistics)

        infectionStatistics()

        btBack.setOnClickListener {
            val intent = Intent(this, BmiActivity::class.java)
            startActivity(intent)
        }
    }
    private fun infectionStatistics() {
        val coronavirusData = ArrayList<BarEntry>()
        coronavirusData.add(BarEntry(0f, 258f))
        coronavirusData.add(BarEntry(1f, 72f))
        coronavirusData.add(BarEntry(2f, 114f))
        coronavirusData.add(BarEntry(3f, 36f))
        coronavirusData.add(BarEntry(4f, 202f))
        coronavirusData.add(BarEntry(5f, 174f))
        coronavirusData.add(BarEntry(6f, 487f))
        coronavirusData.add(BarEntry(7f, 54f))
        coronavirusData.add(BarEntry(8f, 80f))
        coronavirusData.add(BarEntry(9f, 36f))
        coronavirusData.add(BarEntry(10f, 48f))
        coronavirusData.add(BarEntry(11f, 209f))
        coronavirusData.add(BarEntry(12f, 37f))
        coronavirusData.add(BarEntry(13f, 57f))
        coronavirusData.add(BarEntry(14f, 132f))
        coronavirusData.add(BarEntry(15f, 59f))

        val barDataSet = BarDataSet(coronavirusData, "voivodeship")

        val labels = ArrayList<String>()
        labels.add("dolnośląskie")
        labels.add("kujawsko-pomorskie")
        labels.add("lubelskie")
        labels.add("lubuskie")
        labels.add("łódzkie")
        labels.add("małopolskie")
        labels.add("mazowieckie")
        labels.add("opolskie")
        labels.add("podkarpackie")
        labels.add("podlaskie")
        labels.add("pomorskie")
        labels.add("świętokrzyskie")
        labels.add("warmińsko-mazurskie")
        labels.add("wielkopolskie")
        labels.add("zachodniopomorskie")

//        val data = BarData(labels, barDataSet)
        val data = BarData(barDataSet)

        barDataSet.color = ContextCompat.getColor(this, R.color.colorPrimary)

        barChart.data = data
//        barChart.xAxis.isEnabled = false
        barChart.xAxis.position = XAxis.XAxisPosition.TOP
        barChart.xAxis.labelRotationAngle = 300f
        barChart.xAxis.labelCount = 16

        barChart.xAxis.enableGridDashedLine(5f, 5f, 0f)
        barChart.axisRight.enableGridDashedLine(5f, 5f, 0f)
        barChart.axisLeft.enableGridDashedLine(5f, 5f, 0f)
        barChart.description.isEnabled = false
        barChart.legend.isEnabled = true
        barChart.setPinchZoom(true)
        barChart.data.setDrawValues(false)

        barChart.animateY(2000)
    }
}

