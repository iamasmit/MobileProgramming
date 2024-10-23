package com.example.simpleintrest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText principalEditText, interestRateEditText, timeEditText;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        principalEditText = findViewById(R.id.principalEditText);
        interestRateEditText = findViewById(R.id.interestRateEditText);
        timeEditText = findViewById(R.id.timeEditText);
        resultTextView = findViewById(R.id.resultTextView);

        Button calculateButton = findViewById(R.id.calculateButton);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateSimpleInterest();
            }
        });
    }

    private void calculateSimpleInterest() {
        double principal = Double.parseDouble(principalEditText.getText().toString());
        double rate = Double.parseDouble(interestRateEditText.getText().toString());
        double time = Double.parseDouble(timeEditText.getText().toString());
        double simpleInterest = (principal * rate * time) / 100.0;
        showResultDialog(simpleInterest);
    }

    private void showResultDialog(double simpleInterest) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Simple Interest Calculation Result");
        builder.setMessage("Simple Interest: " + simpleInterest);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }


}
