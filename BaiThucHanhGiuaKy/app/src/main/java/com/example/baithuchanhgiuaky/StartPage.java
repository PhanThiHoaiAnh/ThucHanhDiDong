package com.example.baithuchanhgiuaky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StartPage extends AppCompatActivity {

    Button btLogin, btSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        btLogin = findViewById(R.id.btnLogin1);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openLogInPage();}
        });

        btSignup = findViewById(R.id.btnSignup1);
        btSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openSignUpPage();}
        });
    }

        public void openLogInPage() {
            Intent intent = new Intent(StartPage.this, LogInPage.class);
            startActivity(intent);
        }

        public void openSignUpPage() {
            Intent intent = new Intent(StartPage.this, SignUpPage.class);
            startActivity(intent);
        }
}
