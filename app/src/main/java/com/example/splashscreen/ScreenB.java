package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ScreenB extends AppCompatActivity {


    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_b);
        tv = findViewById(R.id.tvScreen);
        getSupportActionBar().hide();
        Bundle bundle = getIntent().getExtras();
        tv.setText(bundle.getString("str"));

    }
}