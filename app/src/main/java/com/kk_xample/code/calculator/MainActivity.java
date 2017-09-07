package com.kk_xample.code.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView screen;
    private String str1,str2,str3,result,str,sign;
    private double a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = (TextView) findViewById(R.id.textView);
        str = "";
    }
    public void onClick(View v){
        Button button = (Button) v;
        str += button.getText().toString();
        screen.setText(str);
        a = Double.parseDouble(str);
    }

    public void onClickSign(View v){
        Button button = (Button) v;
        sign = button.getText().toString();
        screen.setText(sign);
        str = "";
    }
    public void calculate(View v) {
        Button button = (Button) v;
        str2 = button.getText().toString();
        b = Double.parseDouble(str2);

        if (sign.equals("+")) {
            result = a+b+"";
        }
        else if (sign.equals("-")) {
            result = a-b+"";
        }
        else if (sign.equals("*")) {
            result = a*b+"";
        }
        else if (sign.equals("/")) {
            result = a/b+"";
        }
        else
        {
            screen.setText("k");
        }
        screen.setText(result);
    }
}