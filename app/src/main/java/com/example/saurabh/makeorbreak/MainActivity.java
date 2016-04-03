package com.example.saurabh.makeorbreak;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    EditText userName;
    EditText phoneNumber;
    Button loginButton;

    //Login user
    public void logInUser(View view){

        userName=(EditText) findViewById(R.id.username);
        phoneNumber=(EditText) findViewById(R.id.phonenumber);
        loginButton =(Button)findViewById(R.id.loginButton);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void logIn(View v) {
        if(v.getId() == R.id.loginButton) // just for instance
        {
            Intent i= new Intent(MainActivity.this, Main2Activity.class);
            startActivity(i);
        }

    }
}
