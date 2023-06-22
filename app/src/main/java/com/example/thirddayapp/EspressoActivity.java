package com.example.thirddayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EspressoActivity extends AppCompatActivity implements View.OnClickListener {
    Button testButton;
    TextView tvTest;
    EditText etTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espresso);
        testButton = findViewById(R.id.btnTest);
         tvTest =findViewById(R.id.tvTest);
         etTest = findViewById(R.id.etTest);
    }

    @Override
    protected void onStart() {
        super.onStart();

        testButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String name = etTest.getText().toString();
        tvTest.setText(name);
    }
}