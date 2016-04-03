package com.example.saurabh.makeorbreak;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView momentoftruth;
    String apidata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            apidata = extras.getString("Response");
        }

        momentoftruth = (TextView)findViewById(R.id.data);
        momentoftruth.setText("Response is: " + apidata);
    }

    public void addClaim(View v) {
        Intent i= new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(i);
    }

}
