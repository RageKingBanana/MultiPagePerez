package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn1;
    EditText txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        txt1 = (EditText) findViewById(R.id.txt1);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        if(view==btn1)
        {
            ClassInfo.name = txt1.getText().toString();
            Intent in = new Intent(this, Page2.class);
            startActivity(in);
            finish();
        }
    }
}


