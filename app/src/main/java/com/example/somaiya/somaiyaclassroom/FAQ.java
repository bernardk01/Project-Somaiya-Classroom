package com.example.somaiya.somaiyaclassroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FAQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        Magnify mag = new Magnify();
        float zoomFactor = 1.25f;
        if(Magnify.getInstance().getData())
            mag.enlarge(true,findViewById(android.R.id.content),zoomFactor);
    }
}