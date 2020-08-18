package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv1,tv2;
    String st1,st2;

    TextView txresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv1 = findViewById(R.id.tx1);
        tv2 = findViewById(R.id.tx2);
        txresult = findViewById(R.id.textView5);

        st1 = getIntent().getExtras().getString("Value1");
        st2 = getIntent().getExtras().getString("Value2");

        tv1.setText(st1);
        tv2.setText(st2);
    }

    public void addNumbers(View v){
        double n1,n2, result;

        n1 = Double.parseDouble(st1);
        n2 = Double.parseDouble(st2);

        result = n1 + n2;

        txresult.setText(String.valueOf(n1 + " + " + n2 + " = " + result));
    }

    public void addSubstraction(View v){
        double n1,n2, result;

        n1 = Double.parseDouble(st1);
        n2 = Double.parseDouble(st2);

        result = n1 - n2;

        txresult.setText(String.valueOf(n1 + " - " + n2 + " = " + result));
    }

    public void addMultiplication(View v){
        double n1,n2, result;

        n1 = Double.parseDouble(st1);
        n2 = Double.parseDouble(st2);

        result = n1 * n2;

        txresult.setText(String.valueOf(n1 + " * " + n2 + " = " + result));
    }

    public void addDivision(View v){
        double n1,n2, result;

        n1 = Double.parseDouble(st1);
        n2 = Double.parseDouble(st2);

        result = n1 / n2;

        txresult.setText(String.valueOf(n1 + " / " + n2 + "=" + result));
    }
}