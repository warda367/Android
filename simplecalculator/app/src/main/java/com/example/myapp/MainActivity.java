package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.math.*;

public class MainActivity extends AppCompatActivity {
    private EditText edittext1;
    private EditText edittext2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext1 = (EditText) findViewById(R.id.edittext1);
        edittext2 = (EditText) findViewById(R.id.edittext2);
        textView = (TextView) findViewById(R.id.textView);

    }

    public void plus(View view) {
        int num1 = Integer.parseInt(edittext1.getText().toString());
        int num2 = Integer.parseInt(edittext2.getText().toString());

        int ans = num1 + num2;

        textView.setText(String.valueOf(ans));
    }

    public void power(View view) {
        int num1 = Integer.parseInt(edittext1.getText().toString());
        int num2 = Integer.parseInt(edittext2.getText().toString());

        double ans = Math.pow(num1,num2);

        textView.setText(String.valueOf(ans));
    }

    public void MUl(View view) {
        int num1 = Integer.parseInt(edittext1.getText().toString());
        int num2 = Integer.parseInt(edittext2.getText().toString());

        int ans = num1 + num2;

        textView.setText(String.valueOf(ans));
    }

    public void div(View view) {
        int num1 = Integer.parseInt(edittext1.getText().toString());
        int num2 = Integer.parseInt(edittext2.getText().toString());

        int ans = num1 /num2;

        textView.setText(String.valueOf(ans));
    }

    public void min(View view) {
        int num1 = Integer.parseInt(edittext1.getText().toString());
        int num2 = Integer.parseInt(edittext2.getText().toString());

        int ans = num1 - num2;

        textView.setText(String.valueOf(ans));
    }

    public void mod(View view) {
        int num1 = Integer.parseInt(edittext1.getText().toString());
        int num2 = Integer.parseInt(edittext2.getText().toString());

        int ans = num1 % num2;

        textView.setText(String.valueOf(ans));
    }
    }

