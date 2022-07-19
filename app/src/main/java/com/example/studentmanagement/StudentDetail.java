package com.example.studentmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class StudentDetail extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_detail);

        imageView = (ImageView) findViewById(R.id.student_image);
        imageView.setImageResource(R.drawable.ic_launcher_background);
    }
}