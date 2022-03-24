package com.barney.kpltpmod5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtUshi = findViewById(R.id.txtUshi);

        SayaTubeVideo data1 = new SayaTubeVideo("Tutorial Design By Contract – Hilmy");

        data1.corona = txtUshi;

        data1.PrintVideoDetails();

    }
}