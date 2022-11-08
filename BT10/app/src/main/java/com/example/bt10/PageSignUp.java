package com.example.bt10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class PageSignUp extends AppCompatActivity {
    private EditText edtMail, edtPass;
    private Button btnLogIn, btnSignUp, btnBack;
    private FirebaseAuth mAuth;
    private CheckBox checkPass1, checkPass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_sign_up);

        mAuth = FirebaseAuth.getInstance();

        edtMail = findViewById(R.id.edtUName);
        edtPass = findViewById(R.id.edtPass);
        btnLogIn = findViewById(R.id.buttonLogIn2);
        btnSignUp = findViewById(R.id.buttonSignUp2);
        btnBack = findViewById(R.id.btnBack2);

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logIn();
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signUp();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPage();
            }
        });

        checkPass1 = findViewById(R.id.checkBox);
        checkPass1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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

        checkPass2 = findViewById(R.id.checkBox);
        checkPass2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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
    }

    private void mainPage() {
        Intent intent = new Intent(PageSignUp.this, MainActivity.class);
        startActivity(intent);
    }

    private void logIn() {
        Intent intent = new Intent(PageSignUp.this, MainActivity.class);
        startActivity(intent);
    }

    private void signUp() {
        String email, pass;
        email = edtMail.getText().toString();
        pass = edtPass.getText().toString();
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Vui lòng nhập Username/Email của bạn", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(pass)) {
            Toast.makeText(this, "Vui lòng nhập Password của bạn", Toast.LENGTH_SHORT).show();
            return;
        }

        mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(getApplicationContext(), "Tạo tài khoản thành công!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(PageSignUp.this, MainActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), "Tạo tài khoản không thành công!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}