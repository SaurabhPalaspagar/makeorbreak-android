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

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;


public class MainActivity extends AppCompatActivity {

    EditText userName;
    EditText phoneNumber;
    Button loginButton;
    String resp;

    //Login user
    public void logInUser(){

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

        int hasID = 1;
        if (hasID == 1) {
            Intent i= new Intent(MainActivity.this, Main2Activity.class);
            i.putExtra("Response", resp);
            startActivity(i);
        }
        else {
            logInUser();
        }



    }

    public String getUrl(String name, String email) {
        return "http://52.36.159.253/api/v0.1/user/login?" + "name=" + name + "&email=" + email;
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
            i.putExtra("Response", resp);
            startActivity(i);
        }

    }
}
