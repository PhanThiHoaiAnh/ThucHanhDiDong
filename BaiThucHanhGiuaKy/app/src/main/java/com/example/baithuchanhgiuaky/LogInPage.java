package com.example.baithuchanhgiuaky;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogInPage extends AppCompatActivity {
    Button butBack, butLogIn, butSignUp;
    EditText edtUser, edtPass;
    TextView tv_fgPass, tvGmail, tvFacebook, tvTwit, tvIG;
    CheckBox checkPass;
    Object HomePage, SignUpPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_log_in);
        butBack = findViewById(R.id.btnBack_ofLIn);
        butBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) { openStartPage();
            }
        });

        butSignUp = findViewById(R.id.signup_OfLIn);
        butSignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) { openSignUpPage();
            }
        });

        edtUser = findViewById(R.id.edtName_ofLIn);
        edtPass = findViewById(R.id.edtPass_ofLIn);
        butLogIn= findViewById(R.id.btn_login_ofLIn);

        butLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = "hoaianhphan";
                String passWord = "hoaianhphan";
                if (edtUser.getText().toString().equals(userName) && edtPass.getText().toString().equals(passWord)){
                    Toast.makeText(getApplicationContext(),"Đăng nhập thành công", Toast.LENGTH_LONG).show();
                    openHomePage();
                }else {
                    Toast.makeText(getApplicationContext(),"Tài khoản hoặc Mật khẩu sai. Vui lòng kiếm tra lại!", Toast.LENGTH_LONG).show();
                }
            }
        });

        checkPass = findViewById(R.id.checkBox);
        checkPass.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isCHecked) {
                    if (isCHecked){
                        //show pass
                        edtPass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    } else {
                        edtPass.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
            }
        });

        tvGmail= new TextView(this);
        tvGmail .setText("https://gmail.com");
        Linkify.addLinks(tvGmail , Linkify.WEB_URLS);

        tvFacebook= new TextView(this);
        tvFacebook .setText("https://facebook.com");
        Linkify.addLinks(tvFacebook , Linkify.WEB_URLS);

        tvTwit= new TextView(this);
        tvTwit .setText("https://twitter.com");
        Linkify.addLinks(tvTwit , Linkify.WEB_URLS);

        tvIG= new TextView(this);
        tvIG .setText("https://www.instagram.com");
        Linkify.addLinks(tvIG , Linkify.WEB_URLS);
    }

    public void openSignUpPage() {
        Intent intent = new Intent(LogInPage.this, SignUpPage.class);
        startActivity(intent);
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
