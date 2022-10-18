package com.example.baitapth9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SelectedActivity extends AppCompatActivity {

    TextView tvUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selected_user);

        tvUser = findViewById(R.id.selectedUser);


        Intent intent =getIntent();


        if(intent.getExtras() != null){
            User userModel = (User) intent.getSerializableExtra("data");

            tvUser.setText(userModel.getUserName());
        }

    }
}