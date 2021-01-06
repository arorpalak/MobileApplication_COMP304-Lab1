package com.example.palakarora_comp304_lab1_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AIActivity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai);
        t = findViewById(R.id.ai_textView);
        t.setText("AIActivity:");
        t.setText(t.getText() + "\n onCreate executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        t.setText(t.getText() + "\n onStart executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        t.setText(t.getText() + "\n onStop executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        t.setText(t.getText() + "\n onDestroy executed");
    }
}