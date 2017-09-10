package com.kk_xample.code.calculator;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    private Button add,substract,multiply,divide,equal;
    private Button one,two,three,four,five,six,seven,eight,nine,zero,point;
    private Button clean1,clean2,history,off;
    private TextView intro,result;
    private final char ADDITION = '+', SUBSTRACTION = '-', MULTIPLICATION = '*', DIVISION = '/',EQUAL = '=';
    private double val1 = Double.NaN, val2;
    private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intro.setText(intro.getText().toString()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intro.setText(intro.getText().toString()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intro.setText(intro.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intro.setText(intro.getText().toString()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intro.setText(intro.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intro.setText(intro.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intro.setText(intro.getText().toString()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intro.setText(intro.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intro.setText(intro.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intro.setText(intro.getText().toString()+"9");
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intro.setText(intro.getText().toString()+".");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                result.setText(intro.getText().toString()+"+");
                intro.setText(null);}
        });
        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBSTRACTION;
                result.setText(intro.getText().toString()+"-");
                intro.setText(null);}
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = MULTIPLICATION;
                result.setText(intro.getText().toString()+"*");
                intro.setText(null);}
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = DIVISION;
                result.setText(intro.getText().toString()+"/");
                intro.setText(null);}
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                result.setText(result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
            }
        });
        clean1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (intro.getText().length() > 0) {
                    CharSequence name = intro.getText().toString();
                    intro.setText(name.subSequence(0,name.length()-1));
                }
            }
        });
        clean2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Double.NaN;
                val2 = Double.NaN;
                intro.setText(null);
                result.setText(null);
            }
        });
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               val1 = Double.NaN;
                val2 = Double.NaN;
                intro.setText(null);
                result.setText(null);
            }
        });
        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
    private void setUIViews() {
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);
        zero = (Button)findViewById(R.id.zero);
        point = (Button)findViewById(R.id.point);

        add = (Button)findViewById(R.id.add);
        substract = (Button)findViewById(R.id.substract);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);
        equal = (Button)findViewById(R.id.equals);

        clean1 = (Button)findViewById(R.id.cancelOne);
        clean2 = (Button)findViewById(R.id.cancelAll);
        history = (Button)findViewById(R.id.history);
        off = (Button)findViewById(R.id.off);

        intro = (TextView)findViewById(R.id.tvControl);
        result = (TextView)findViewById(R.id.tvResult);
    }
    private void compute() {
        if (!Double.isNaN(val1)) {
            val2 = Double.parseDouble(intro.getText().toString());

            switch (ACTION) {
                case ADDITION :
                    val1 = val1 + val2;
                    break;
                case SUBSTRACTION :
                    val1 = val1 - val2;
                    break;
                case MULTIPLICATION :
                    val1 = val1 * val2;
                    break;
                case DIVISION :
                    val1 = val1 / val2;
                    break;
                case EQUAL :
                    break;
            }
        }
        else {
            val1 = Double.parseDouble(intro.getText().toString());
        }
    }
}