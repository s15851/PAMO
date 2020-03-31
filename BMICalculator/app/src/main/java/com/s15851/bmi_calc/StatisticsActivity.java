package com.s15851.bmi_calc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class StatisticsActivity extends AppCompatActivity {

    BarChart barChart;
    ArrayList<BarEntry> barEntryArrayList;
    ArrayList<String> labelsNames;

    ArrayList<CoronavirusData> coronavirusDataArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        barChart = findViewById(R.id.barChart);
        // create new object of bare entries arraylist and labels arraylist
        barEntryArrayList = new ArrayList<>();
        labelsNames = new ArrayList<>();
        infectionStatistics();

        Button back = findViewById(R.id.btBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BmiActivity.class);
                startActivity(intent);
            }
        });

        for (int i = 0; i < coronavirusDataArrayList.size(); i++) {
            String region = coronavirusDataArrayList.get(i).getRegion();
            int infected = coronavirusDataArrayList.get(i).getInfected();
            barEntryArrayList.add(new BarEntry(i, infected));
            labelsNames.add(region);
        }

        BarDataSet barDataSet = new BarDataSet(barEntryArrayList,"Number of coronavirus infections in voivodships as at 30.03.2020");
        barDataSet.setColor(ContextCompat.getColor(barChart.getContext(), R.color.colorPrimary));
        barDataSet.setValueTextSize(15);
        Description description = new Description();
        description.setText("voivodship");
        barChart.setDescription(description);
        BarData barData = new BarData(barDataSet);
        barChart.setData(barData);
        //set XAxis value formater
        XAxis xAxis = barChart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(labelsNames));
        //set position of labels(regions names)
        xAxis.setPosition(XAxis.XAxisPosition.TOP);
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(false);
        xAxis.setGranularity(1f);
        xAxis.setLabelCount(labelsNames.size());
        xAxis.setLabelRotationAngle(270);
        barChart.animateY(2000);
        barChart.invalidate();
    }

    private void infectionStatistics() {
        coronavirusDataArrayList.clear();
        coronavirusDataArrayList.add(new CoronavirusData("dolnośląskie", 258));
        coronavirusDataArrayList.add(new CoronavirusData("kujawsko-pomorskie", 72));
        coronavirusDataArrayList.add(new CoronavirusData("lubelskie", 114));
        coronavirusDataArrayList.add(new CoronavirusData("lubuskie", 36));
        coronavirusDataArrayList.add(new CoronavirusData("łódzkie", 202));
        coronavirusDataArrayList.add(new CoronavirusData("małopolskie", 174));
        coronavirusDataArrayList.add(new CoronavirusData("mazowieckie", 487));
        coronavirusDataArrayList.add(new CoronavirusData("opolskie", 54));
        coronavirusDataArrayList.add(new CoronavirusData("podkarpackie", 80));
        coronavirusDataArrayList.add(new CoronavirusData("podlaskie", 36));
        coronavirusDataArrayList.add(new CoronavirusData("pomorskie", 48));
        coronavirusDataArrayList.add(new CoronavirusData("śląskie", 209));
        coronavirusDataArrayList.add(new CoronavirusData("świętokrzyskie", 37));
        coronavirusDataArrayList.add(new CoronavirusData("warmińsko-mazurskie", 57));
        coronavirusDataArrayList.add(new CoronavirusData("wielkopolskie", 132));
        coronavirusDataArrayList.add(new CoronavirusData("zachodniopomorskie", 59));
    }
}
