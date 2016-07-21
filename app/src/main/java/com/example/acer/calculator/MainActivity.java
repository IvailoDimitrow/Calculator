package com.example.acer.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15;
    TextView txtview,txtView2,txtView3,txtView4;
    boolean multiplied,partition,subtraction,plus;
    int firstNumber,secondNumber;
    String firstNumberStr,secondNumberString;
    String btnText,btnText2,btnText3,btnText4,btnText5,btnText6,btnText7,btnText8,btnText9,btnText10,btnText11,btnText12,btnText13,btnText14,btnText15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btn = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);
        btn5 = (Button)findViewById(R.id.button5);
        btn6 = (Button)findViewById(R.id.button6);
        btn7 = (Button)findViewById(R.id.button7);
        btn8 = (Button)findViewById(R.id.button8);
        btn9 = (Button)findViewById(R.id.button9);
        btn10 = (Button)findViewById(R.id.button10);
        btn11 = (Button)findViewById(R.id.button11);
        btn12 = (Button)findViewById(R.id.button12);
        btn13 = (Button)findViewById(R.id.button13);
        btn14 = (Button)findViewById(R.id.button14);
        btn15 = (Button)findViewById(R.id.button15);

        txtview = (TextView)findViewById(R.id.textView);
        txtView2 = (TextView)findViewById(R.id.textView2);
        txtView3 = (TextView)findViewById(R.id.textView3);
        txtView4 = (TextView)findViewById(R.id.textView4);

        btnText = btn.getText().toString();
        btnText2 = btn2.getText().toString();
        btnText3 = btn3.getText().toString();
        btnText4 = btn4.getText().toString();
        btnText5 = btn5.getText().toString();
        btnText6 = btn6.getText().toString();
        btnText7 = btn7.getText().toString();
        btnText8 = btn8.getText().toString();
        btnText9 = btn9.getText().toString();
        btnText13 = btn13.getText().toString();
        firstNumberStr = txtview.getText().toString();
        secondNumberString = txtView3.getText().toString();
        firstNumber = Integer.valueOf(firstNumberStr.);
        secondNumber = Integer.valueOf(secondNumberString.);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtView2.getText() == "+" || txtView2.getText() == "-" || txtView2.getText() == ":" || txtView2.getText() == "*"){
                    txtView3.setText(txtView3.getText() + btnText);
                }
                else {
                    txtview.setText(txtview.getText() + btnText);

                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtView2.getText() == "+" || txtView2.getText() == "-" || txtView2.getText() == ":" || txtView2.getText() == "*"){
                    txtView3.setText(txtView3.getText() + btnText2);
                }
                else {
                    txtview.setText(txtview.getText() + btnText2);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtView2.getText() == "+" || txtView2.getText() == "-" || txtView2.getText() == ":" || txtView2.getText() == "*"){
                    txtView3.setText(txtView3.getText() + btnText3);
                }
                else {
                    txtview.setText(txtview.getText() + btnText3);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtView2.getText() == "+" || txtView2.getText() == "-" || txtView2.getText() == ":" || txtView2.getText() == "*"){
                    txtView3.setText(txtView3.getText() + btnText4);
                }
                else{
                    txtview.setText(txtview.getText() + btnText4);
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtView2.getText() == "+" || txtView2.getText() == "-" || txtView2.getText() == ":" || txtView2.getText() == "*"){
                    txtView3.setText(txtView3.getText() + btnText5);
                }
                else {
                    txtview.setText(txtview.getText() + btnText5);
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtView2.getText() == "+" || txtView2.getText() == "-" || txtView2.getText() == ":" || txtView2.getText() == "*"){
                    txtView3.setText(txtView3.getText() + btnText6);
                }
                else{
                    txtview.setText(txtview.getText() + btnText6);
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtView2.getText() == "+" || txtView2.getText() == "-" || txtView2.getText() == ":" || txtView2.getText() == "*"){
                    txtView3.setText(txtView3.getText() + btnText7);
                }
               else{
                    txtview.setText(txtview.getText() + btnText7);
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtView2.getText() == "+" || txtView2.getText() == "-" || txtView2.getText() == ":" || txtView2.getText() == "*"){
                    txtView3.setText(txtView3.getText() + btnText8);
                }
                if(txtView2 != null){
                    txtview.setText(txtview.getText() + btnText8);
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtView2.getText() == "+" || txtView2.getText() == "-" || txtView2.getText() == ":" || txtView2.getText() == "*"){
                    txtView3.setText(txtView3.getText() + btnText9);
                }
                else {
                    txtview.setText(txtview.getText() + btnText9);
                }
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtView2.getText() == "+" || txtView2.getText() == "-" || txtView2.getText() == ":" || txtView2.getText() == "*"){
                    txtView3.setText(txtView3.getText() + btnText13);
                }
                else{
                    txtview.setText(txtview.getText() + btnText13);
                }
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                partition = true;
                txtView2.setText(":");
                subtraction = false;
                multiplied = false;
                plus = false;
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              multiplied = true;
                txtView2.setText("*");
                subtraction = false;
                plus = false;
                partition = false;
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 plus = true;
                txtView2.setText("+");
                subtraction = false;
                multiplied = false;
                partition = false;
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtraction = true;
                txtView2.setText("-");
                plus = false;
                multiplied = false;
                partition  = false;
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if(plus == true) {
              int result =   firstNumber + secondNumber;
                  txtView4.setText(result);
              }
                if(partition == true){
                    int result =   firstNumber/secondNumber;
                    txtView4.setText(result);
                }
                if(multiplied == true){
                    int result =   firstNumber*secondNumber;
                    txtView4.setText(result);
                }
                if(subtraction == true){
                    int result =   firstNumber - secondNumber;
                    txtView4.setText(result);
                }
            }
        });
    }
}
