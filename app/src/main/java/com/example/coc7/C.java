package com.example.coc7;

import android.view.*;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class C extends AppCompatActivity {
    private EditText et_Name;
    private TextView tv_Show;
    private Button btn_Show;
    private Button btn_dice;
    private Button btn_C;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        et_Name = (EditText) findViewById(R.id.et_Name);
        tv_Show = (TextView) findViewById(R.id.tv_Show);
        btn_Show = (Button) findViewById(R.id.btn_Show);
        btn_dice = (Button) findViewById(R.id.btn_dice);

        btn_Show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Show.setText((tv_Show.getText().toString() + et_Name.getText().toString() + "\r\n"));
                et_Name.setText("");
            }
        });

        btn_dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random ran = new Random();
                int num = (ran.nextInt(100) + 1);
                tv_Show.setText((tv_Show.getText().toString() + "擲出的骰子為: \r\n" + num).toString() + "\r\n");

            }
        });


        btn_C=(Button) findViewById(R.id.btn_C);
        btn_C.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });


    }
}