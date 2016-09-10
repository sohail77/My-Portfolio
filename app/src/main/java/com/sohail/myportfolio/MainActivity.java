package com.sohail.myportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView headTxt;
    Button movieBtn,stockBtn,buildBtn,myapBtn,goBtn,capBtn;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        headTxt=(TextView)findViewById(R.id.headTxt);
        movieBtn=(Button)findViewById(R.id.movieBtn);
        stockBtn=(Button)findViewById(R.id.stockBtn);
        buildBtn=(Button)findViewById(R.id.buildBtn);
        myapBtn=(Button)findViewById(R.id.myapBtn);
        goBtn=(Button)findViewById(R.id.goBtn);
        capBtn=(Button)findViewById(R.id.capBtn);


        movieBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"An app to know about upcoming movies",Toast.LENGTH_SHORT).show();
            }
        });
        stockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"An app to know about Stocks!",Toast.LENGTH_SHORT).show();
            }
        });
        buildBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch my Build it bigger app! ",Toast.LENGTH_SHORT).show();
            }
        });
        myapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch my material designed app",Toast.LENGTH_SHORT).show();
            }
        });
        goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch my Go Ubiquitous app",Toast.LENGTH_SHORT).show();
            }
        });
        capBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch my capstone app!",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
