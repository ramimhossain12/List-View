package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.concurrent.TimeoutException;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textViewID2);

        Bundle bundle = getIntent().getExtras();
        if (bundle !=null){
            String  value = bundle.getString("playerdetails");
            textView.setText(value);
        }
    }
}