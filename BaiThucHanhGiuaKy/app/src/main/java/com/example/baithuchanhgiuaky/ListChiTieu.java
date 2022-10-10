package com.example.baithuchanhgiuaky;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TableLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class ListChiTieu extends AppCompatActivity {

    private ListView listView;
    private ArrayList<ThuNhap> arrayList;
    private AdapterThuNhap adtThu;

    private TabLayout mTabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listview);
    }
}
