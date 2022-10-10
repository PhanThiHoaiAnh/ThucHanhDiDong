package com.example.baithuchanhgiuaky;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListThuNhap extends AppCompatActivity {

    private ListView listView;
    private ArrayList<ThuNhap> arrayList;
    private AdapterThuNhap adtThu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listview);

    }
}
