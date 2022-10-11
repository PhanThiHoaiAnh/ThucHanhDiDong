package com.example.baithuchanhgiuaky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpPage extends AppCompatActivity {

    Button btBack, btLIn;
    Object StartPage, LogInPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_sign_up);

        btBack = findViewById(R.id.btnBack2);
        btLIn = findViewById(R.id.buttonLogIn2);

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStartPage();
            }
        });

        btLIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogInPage();
            }
        });
    }

    public void openLogInPage() {
        Intent intent = new Intent(SignUpPage.this, LogInPage.class);
        startActivity(intent);
    }

    public void openStartPage() {
        Intent intent = new Intent(SignUpPage.this, StartPage.class);
        startActivity(intent);
    }
}
