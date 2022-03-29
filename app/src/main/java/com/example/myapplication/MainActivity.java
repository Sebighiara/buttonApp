package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Log.d("Warning", "counter: " + MyClass.getInstance().getCounter());

        textView = (TextView) findViewById(R.id.textview);
        if (MyClass.getInstance().getCounter() > 0) {
            textView.setText("Count: " + MyClass.getInstance().getCounter());
        }
        button1.setOnClickListener(view -> {
            int counter = MyClass.getInstance().getCounter();
            MyClass.getInstance().setCounter(++counter);
            textView.setText("Count: " + counter);
            Log.d("Warning", "counter: " + counter);
        });

        button2.setOnClickListener(view -> {
            int counter = MyClass.getInstance().getCounter();
            MyClass.getInstance().setCounter(--counter);
            textView.setText("Count: " + counter);
            Log.d("Warning", "Counter: " + counter);
        });





    }
}