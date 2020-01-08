package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button login,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=findViewById(R.id.Login);
        signup=findViewById(R.id.signup);
    }
    //Onclick for Login
    public void Login(View view)
    {
        Log.i("Login","Sucessful");
        Intent i = new Intent(MainActivity.this,Login.class);
        startActivity(i);
    }
    //Onclick for Signup
    public void SignUp(View view)
    {
        Intent i = new Intent(this,Signup.class);
        startActivity(i);
    }
}
