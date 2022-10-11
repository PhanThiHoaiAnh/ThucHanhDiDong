package com.example.baithuchanhgiuaky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LogInPage extends AppCompatActivity {
    Button butBack, butLogIn;
    EditText edtUser, edtPass;
    TextView tv_fgPass, tvSignUp, tvGmail, tvFacebook, tvTwit, tvIG;
    Object HomePage, SignUpPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_log_in);
        butBack = findViewById(R.id.btnBack1);
        butBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) { openStartPage();
            }
        });

        butLogIn = findViewById(R.id.btn_login1);
        butLogIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) { openHomePage();
            }
        });
    }
    public void openHomePage() {
        Intent intent = new Intent(LogInPage.this, HomePage.class);
        startActivity(intent);
    }

    public void openStartPage() {
        Intent intent = new Intent(LogInPage.this, StartPage.class);
        startActivity(intent);
    }
}
