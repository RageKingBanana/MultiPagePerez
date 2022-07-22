package com.example.sampleapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Page2  extends AppCompatActivity implements View.OnClickListener {
    Button btn2;
    TextView edit1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        btn2 = (Button) findViewById(R.id.btn2);
        edit1 = (TextView) findViewById(R.id.textview1);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==btn2)
        {
            Intent in2 = new Intent (this, MainActivity.class);
            startActivity(in2);
            finish();
        }
    }

}
