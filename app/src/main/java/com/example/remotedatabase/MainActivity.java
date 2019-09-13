package com.example.remotedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1,num2;
    TextView res;
    private Button action,sin_bt;
    private Button action1;
    private Button action2;
    private Button action3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.xml_username);
        num2 = findViewById(R.id.xml_password);
        res = findViewById(R.id.resultview);
        action = findViewById(R.id.xml_action);
        action1 = findViewById(R.id.xml_action1);
        action2 = findViewById(R.id.xml_action2);
        action3 = findViewById(R.id.xml_action3);

        sin_bt=findViewById(R.id.sin_bt);



        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                insert();

            }
        });


        action1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                insert1();

            }
        });


        action2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                insert2();

            }
        });



        action3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                insert3();

            }
        });



        sin_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                insert4();

            }
        });




    }

    public void insert()
    {

        double a = Float.parseFloat(num1.getText().toString());
        double b = Float.parseFloat(num2.getText().toString());
        double s = a + b;

        res.setText("result:"+ s);
        String x=Double.toString(s);
        BackgroundTask bg = new BackgroundTask(this);
        bg.execute(x);

    }

    public void insert1()
    {

        double a = Float.parseFloat(num1.getText().toString());
        double b = Float.parseFloat(num2.getText().toString());
        double s1 = a - b;

        res.setText("result:"+ s1);
        String x1=Double.toString(s1);
        BackgroundTask bg1 = new BackgroundTask(this);
        bg1.execute(x1);

    }


    public void insert2()
    {

        double a = Float.parseFloat(num1.getText().toString());
        double b = Float.parseFloat(num2.getText().toString());
        double s2 = a * b;

        res.setText("result:"+ s2);
        String x2=Double.toString(s2);
        BackgroundTask bg2 = new BackgroundTask(this);
        bg2.execute(x2);

    }


    public void insert3()
    {

        double a = Float.parseFloat(num1.getText().toString());
        double b = Float.parseFloat(num2.getText().toString());
        double s3 = a / b;

        res.setText("result:"+ s3);
        String x3=Double.toString(s3);
        BackgroundTask bg3 = new BackgroundTask(this);
        bg3.execute(x3);

    }




    public void insert4()
    {

        double a = Float.parseFloat(num1.getText().toString());
        double b = Float.parseFloat(num2.getText().toString());
        double s4 = Math.sin(Math.toRadians(a));

        res.setText("result:"+ s4);
        String x4=Double.toString(s4);
        BackgroundTask bg4 = new BackgroundTask(this);
        bg4.execute(x4);

    }






}