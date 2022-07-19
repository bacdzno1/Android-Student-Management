package com.example.studentmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] studentName = { "Nguyen Thanh Bac", "Tran Quang Dai", "Le Ngoc Dong",
                "Nguyen Thanh Bac", "Tran Quang Dai", "Le Ngoc Dong",
                "Nguyen Thanh Bac", "Tran Quang Dai", "Le Ngoc Dong",};

        String[] studentId = { "20194229", "20194006", "20194229", "20194006", "20194229", "20194006", "20194229", "20194006", "20194006" };

//        String[] studentInfo

        StudentAdapter adapter = new StudentAdapter(
                this,
                R.layout.student_element,
                studentName);

        ListView listview = (ListView) findViewById(R.id.student_list);
        listview.setAdapter(adapter);
    }
}