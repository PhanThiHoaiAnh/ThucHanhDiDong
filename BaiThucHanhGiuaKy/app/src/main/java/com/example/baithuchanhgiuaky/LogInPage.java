package com.example.baithuchanhgiuaky;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LogInPage extends AppCompatActivity {

    Button butBack, butLogIn, butSignUp;
    EditText edtUser, edtPass;
    TextView tv_fgPass, tvSignUp, tvGmail, tvFacebook, tvTwit, tvIG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_log_in);
    }
}
