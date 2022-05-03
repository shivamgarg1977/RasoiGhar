package com.shivamgarg.rasoighar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class LoginActivity extends AppCompatActivity {
    TextView LoginToSignup;
    ExtendedFloatingActionButton Register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginToSignup=findViewById(R.id.login_to_signup);
        Register=findViewById(R.id.login_register_button);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(LoginActivity.this,UserDashBoard.class);
                startActivity(i);

            }
        });
        LoginToSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(i);
            }
        });

    }
}