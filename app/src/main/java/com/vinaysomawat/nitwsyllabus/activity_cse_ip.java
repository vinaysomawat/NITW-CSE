package com.vinaysomawat.nitwsyllabus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Vinay Somawat on 17-09-2018.
 */

public class activity_cse_ip extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_ip);
    }
    public void nextclickip(View v)
    {
        startActivity(new Intent(activity_cse_ip.this,activity_cse_snp.class));
    }
}
