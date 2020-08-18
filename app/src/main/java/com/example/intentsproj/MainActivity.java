package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
     Toast toast;
     EditText etx1;
     EditText etx2;
     String st1;
     String st2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();

        //Getting the View object as defined in the customtoast.xmal
        View layout = li.inflate(R.layout.customtoast,(ViewGroup)
                findViewById(R.id.custom_toast_layout));

        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();

        onClicButtonListner();
    }

    public void onClicButtonListner(){
        btn = (Button) findViewById(R.id.button1);
        etx1 = findViewById(R.id.et1);
        etx2 = findViewById(R.id.et2);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Context context = getApplicationContext();
                        CharSequence text = "Navigating SecondActivity";
                        int duration = Toast.LENGTH_SHORT;
                        toast = Toast.makeText(context,  text, duration);
                        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                        toast.show();
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                        st1 = etx1.getText().toString();
                        intent.putExtra("Value1",st1);

                        st2 = etx2.getText().toString();
                        intent.putExtra("Value2",st2);

                        startActivity(intent);
                        finish();
                    }
                }
        );


    }

}