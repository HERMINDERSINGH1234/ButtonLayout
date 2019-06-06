package com.example.sunshine.buttonlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn2,btn3,btn4;
    EditText ed1,ed2;
    TextView tv;
    int a=10,b=10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btnadd);
        btn2=findViewById(R.id.btnsub);
        btn3=findViewById(R.id.btnmul);
        btn4=findViewById(R.id.btndiv);

        ed1=findViewById(R.id.Num1);
        ed2=findViewById(R.id.Num2);

        tv=findViewById(R.id.Result);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);


    }
    public void buttonclick(View view) {
    }

    @Override
    public void onClick(View v){
        if(!ed1.getText().toString().equals("")&&!ed2.getText().toString().equals("")){
            a=Integer.parseInt(ed1.getText().toString());
            b=Integer.parseInt(ed2.getText().toString());

        }
        else{
            Toast.makeText(this,"Number must not be empty",Toast.LENGTH_SHORT).show();
        }
        if(v.getId()==R.id.btnadd){
            tv.setText(a+b+"");
        }
        if(v.getId()==R.id.btnsub){
            tv.setText(a-b+"");

        }
        if(v.getId()==R.id.btnmul){
            tv.setText(a*b+"");

        }
        if(v.getId()==R.id.btndiv){
            tv.setText(a/b+"");

        }
    }



}


