package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.siddeshsapp.Seekbar.Calculatetip";
    public static final String MSG1 = "com.siddeshsapp.Seekbar.Calculatetip1";
    EditText etamount;
    SeekBar seek2;
    TextView text1;
    //TextView tamount;
    //TextView ftip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seek2 = (SeekBar) findViewById(R.id.seek2);
        text1 = (TextView) findViewById(R.id.text1);
       // tamount=(TextView)findViewById(R.id.tamount);
       // ftip=(TextView)findViewById(R.id.ftip);
        seek2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                text1.setText("" + progress + "%")
                ;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        //etamount.addTextChangedListener(new TextWatcher() {
            //@Override
            //public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
    public void calctip(View view){
        Intent intent = new Intent(this,Calculatetip.class);

        EditText etamount = findViewById(R.id.etamount);
            double amount = Double.parseDouble(etamount.getText().toString());
            int percent = seek2.getProgress();
            double tip = amount*percent/100.0;
            double total = amount;
            String Message = "Your bill amount is "+total+" INR";
            String Message1= "Your total tip is "+tip+" INR";
            intent.putExtra(MSG,Message);
            intent.putExtra(MSG1,Message1);

        startActivity(intent);


    }

            //@Override
            //public void onTextChanged(CharSequence s, int start, int before, int count) {

            //}

            //@Override
            //public void afterTextChanged(Editable s) {
            //calculate();
           // }
       // });



    }

