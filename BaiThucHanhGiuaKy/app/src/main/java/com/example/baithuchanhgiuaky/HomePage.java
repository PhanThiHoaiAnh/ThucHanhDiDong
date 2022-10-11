package com.example.baithuchanhgiuaky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    Button butBack, butOut, butPro, butSet, butUse, butMake;
    Object SignUpPage, ProfilePage, ListChiTieu, ListThuNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_home);

        butBack = findViewById(R.id.btnBack_ofHome);
        butOut = findViewById(R.id.btnLogOut_ofHome);
        butPro = findViewById(R.id.btnPro_ofHome);
        butUse = findViewById(R.id.btnUse_ofHome);
        butMake = findViewById(R.id.btnMake_ofHome);

        butBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogInPage();
            }
        });

        butOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStartPage();
            }
        });

        butPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfilePage();
            }
        });

        butUse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openListChiTieu();
            }
        });

        butMake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openListThuNhap();
            }
        });
    }

    public void openLogInPage() {
        Intent intent = new Intent(HomePage.this, LogInPage.class);
        startActivity(intent);
    }
    public void openStartPage() {
        Intent intent = new Intent(HomePage.this, StartPage.class);
        startActivity(intent);
    }

    public void openProfilePage() {
        Intent intent = new Intent(HomePage.this, ProfilePage.class);
        startActivity(intent);
    }

    public void openListChiTieu() {
        Intent intent = new Intent(HomePage.this, ListChiTieu.class);
        startActivity(intent);
    }

    public void openListThuNhap() {
        Intent intent = new Intent(HomePage.this, ListThuNhap.class);
        startActivity(intent);
    }
}
