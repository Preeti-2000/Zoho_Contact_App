package com.vinayak.zoho_preetihiremath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button mLoginBtn;
    TextView mCreateBtn,forgotTextLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLoginBtn = findViewById(R.id.loginBtn);
        mCreateBtn = findViewById(R.id.textView2);


        mCreateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Reg.class));
            }
        });

        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this, "Login Successfully!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),Home.class));
            }
        });

    }
}