package com.vinaysomawat.nitwsyllabus;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclickbtn(View v){
        startActivity(new Intent(MainActivity.this, SecondActivity.class));
    }
    public void onclickbtn1(View v)
    {
        Intent i= new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(i);
    }
    public void onclickbtn2(View v)
    {
        Intent i= new Intent(MainActivity.this, FourthActivity.class);
        startActivity(i);
    }
    public void onclickbtn3(View v)
    {
        Intent i= new Intent(MainActivity.this, FifthActivity.class);
        startActivity(i);
    }
}
