package com.example.personalinformation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class InputInfoActivity extends AppCompatActivity {

    private EditText editName, editAge, editGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_info);

        editName = findViewById(R.id.editName);
        editAge = findViewById(R.id.editAge);
        editGender = findViewById(R.id.editGender);

        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editName.getText().toString();
                String age = editAge.getText().toString();
                String gender = editGender.getText().toString();

                // Create an intent to pass data to the DisplayInfoActivity
                Intent intent = new Intent(InputInfoActivity.this, DisplayInfoActivity.class);
                intent.putExtra("Name", name);
                intent.putExtra("Age", age);
                intent.putExtra("Gender", gender);
                startActivity(intent);
            }
        });
    }
}

