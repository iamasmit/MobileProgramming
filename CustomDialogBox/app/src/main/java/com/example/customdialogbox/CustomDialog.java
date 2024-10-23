package com.example.customdialogbox;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;

public class CustomDialog extends Dialog {

    private TextView resultText;

    public CustomDialog(Context context) {
        super(context);
        setContentView(R.layout.custom_dialog);
        resultText = findViewById(R.id.resultText);
    }

    public void setResult(double simpleInterest) {
        resultText.setText("Simple Interest: " + simpleInterest);
    }
}
