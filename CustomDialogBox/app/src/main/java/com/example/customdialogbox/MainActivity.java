package com.example.customdialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editPrincipal, editRate, editTime;
    private Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrincipal = findViewById(R.id.editPrincipal);
        editRate = findViewById(R.id.editRate);
        editTime = findViewById(R.id.editTime);
        calculateButton = findViewById(R.id.calculateButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double principal = Double.parseDouble(editPrincipal.getText().toString());
                double rate = Double.parseDouble(editRate.getText().toString());
                double time = Double.parseDouble(editTime.getText().toString());

                double simpleInterest = (principal * rate * time) / 100;

                CustomDialog customDialog = new CustomDialog(MainActivity.this);
                customDialog.setResult(simpleInterest);
                customDialog.show();
            }
        });
    }
}
