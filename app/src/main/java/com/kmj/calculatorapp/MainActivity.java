package com.kmj.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    EditText text1,text2;
    Button btnPlus,btnMinus,btnMul,btnDiv;
    Integer result;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text1 = (EditText)findViewById(R.id.edit1);
        text2 = (EditText)findViewById(R.id.edit2);

        btnPlus = (Button)findViewById(R.id.plus);
        btnMinus = (Button)findViewById(R.id.minus);
        btnMul = (Button)findViewById(R.id.mul);
        btnDiv = (Button)findViewById(R.id.div);

        textResult =(TextView)findViewById(R.id.result);


        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp1 = text1.getText().toString();
                String temp2 = text2.getText().toString();
                result = Integer.parseInt(temp1)+Integer.parseInt(temp2);
                textResult.setText(String.valueOf(result));
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp1 = text1.getText().toString();
                String temp2 = text2.getText().toString();
                result = Integer.parseInt(temp1)-Integer.parseInt(temp2);
                textResult.setText(String.valueOf(result));
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp1 = text1.getText().toString();
                String temp2 = text2.getText().toString();
                result = Integer.parseInt(temp1)*Integer.parseInt(temp2);
                textResult.setText(String.valueOf(result));

            }
        });
//        btnDiv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String temp1 = text1.getText().toString();
//                String temp2 = text2.getText().toString();
//                result = Integer.parseInt(temp1)/Integer.parseInt(temp2);
//                textResult.setText(String.valueOf(result));
//            }
//        });

        btnDiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                String temp1 = text1.getText().toString();
                String temp2 = text2.getText().toString();
                result = Integer.parseInt(temp1) / Integer.parseInt(temp2);
                textResult.setText(String.valueOf(result));
                return false;
            }
        });

    }
}