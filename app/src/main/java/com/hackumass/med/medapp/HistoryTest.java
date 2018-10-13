package com.hackumass.med.medapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class HistoryTest extends AppCompatActivity {
    RecyclerView rv;
    LinearLayoutManager llm;
    ArrayList<History> days=new ArrayList<>();
    RVAdapter rvAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_test);
        rv= findViewById(R.id.history_rv);
        llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        ArrayList<String> symptoms=new ArrayList<>();
        symptoms.add("Cough");
        symptoms.add("Cold");
        ArrayList<Medication> medications=new ArrayList<>();
        medications.add(new Medication("med",1,1,true));
        medications.add(new Medication("asasdasd",1,1,true));
        medications.add(new Medication("sdfsdf",1,1,true));
        days.add(new History("day1",1,symptoms,medications));
        rvAdapter=new RVAdapter(days);
        rv.setAdapter(rvAdapter);
    }
}
