package com.vinaysomawat.nitwsyllabus;

import android.content.Intent;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * Created by Vinay Somawat on 21-09-2018.
 */

public class welcome_activity extends AppCompatActivity {
    private int[] layouts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.welcome_activity1);
    }
    public void btnclick(View v)
    {
        startActivity(new Intent(welcome_activity.this,MainActivity.class));
    }
    public void btnclick2(View v)
    {
        startActivity(new Intent(welcome_activity.this,activity_about.class));
    }
    }

