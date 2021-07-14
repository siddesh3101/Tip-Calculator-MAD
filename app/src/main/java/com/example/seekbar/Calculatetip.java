package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.widget.TextView;

public class Calculatetip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatetip);
        Intent intent = getIntent();
        Intent intent1 = getIntent();
        String message = intent.getStringExtra(MainActivity.MSG);
        String message1 = intent.getStringExtra(MainActivity.MSG1);
        TextView final1 =findViewById(R.id.final1);
        TextView final2 =findViewById(R.id.final2);
        final1.setText(message);
        final2.setText(message1);


    }
}