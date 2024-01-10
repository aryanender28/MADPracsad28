package com.test.appad28;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class pr5Activity extends AppCompatActivity {

    TextView heading, subHeading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr5);

        heading = (TextView) findViewById(R.id.heading);
        subHeading = (TextView) findViewById(R.id.subHeading);


        heading.setText("Absolute Layout:");
        subHeading.setText("Aryan Dikshit");
    }
}