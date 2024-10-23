package com.example.personalinformation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);

        // Get data from the intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String age = intent.getStringExtra("Age");
        String gender = intent.getStringExtra("Gender");

        // Display the received data in TextViews
        TextView textName = findViewById(R.id.textName);
        TextView textAge = findViewById(R.id.textAge);
        TextView textGender = findViewById(R.id.textGender);

        textName.setText("Name: " + name);
        textAge.setText("Age: " + age);
        textGender.setText("Gender: " + gender);
    }
}

