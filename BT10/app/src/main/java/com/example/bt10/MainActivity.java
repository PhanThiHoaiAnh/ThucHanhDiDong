package com.example.bt10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btLogin, btSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLogin = findViewById(R.id.btnLogin_ofStart);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openLogInPage();}
        });

        btSignup = findViewById(R.id.btnSignUp_ofStart);
        btSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { signUp();}
        });
    }
    public void openLogInPage() {
        Intent intent = new Intent(MainActivity.this, LogIn.class);
        startActivity(intent);
    }

    private void signUp() {
        Intent intent = new Intent(MainActivity.this, PageSignUp.class);
        startActivity(intent);
    }
}