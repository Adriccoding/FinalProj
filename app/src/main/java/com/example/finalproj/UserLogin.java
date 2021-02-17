package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Move_MainMenu(View view) {
        Intent i = new Intent (this, MainMenu.class);
        startActivity(i);
    }

    public void Move_Register(View view) {
        Intent i = new Intent (this, RegisterActivity.class);
        startActivity(i);
    }
}