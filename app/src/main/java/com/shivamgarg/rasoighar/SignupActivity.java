package com.shivamgarg.rasoighar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class SignupActivity extends AppCompatActivity {
    TextView SignUpToLogin;
    ExtendedFloatingActionButton Register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        SignUpToLogin=findViewById(R.id.signUp_to_login);
        Register=findViewById(R.id.common_sign_up_register);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SignupActivity.this,UserDashBoard.class);
                startActivity(i);
            }
        });
        SignUpToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SignupActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });
    }
}