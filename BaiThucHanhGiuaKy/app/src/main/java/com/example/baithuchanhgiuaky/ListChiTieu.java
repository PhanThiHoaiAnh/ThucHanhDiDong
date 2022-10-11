package com.example.baithuchanhgiuaky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class ListChiTieu extends AppCompatActivity {

    private ListView listView;
    private ArrayList<ChiTieu> arrayList;
    private AdapterChiTieu adtChi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listchitieu);

        listView = findViewById(R.id.listView_chi);
        arrayList = new ArrayList<>();
        arrayList.add(new ChiTieu("Ăn uống","Các món ưa thích",R.drawable.anuong));
        arrayList.add(new ChiTieu("Đi chợ","",R.drawable.shopping));
        arrayList.add(new ChiTieu("Ăn ngoài","",R.drawable.anngoai));
        arrayList.add(new ChiTieu("Gaz","",R.drawable.gaz));
        arrayList.add(new ChiTieu("Điện","",R.drawable.dien));
        arrayList.add(new ChiTieu("Nước","",R.drawable.nuoc));
        arrayList.add(new ChiTieu("Cho vay","",R.drawable.money));
        arrayList.add(new ChiTieu("Bạn bè","",R.drawable.friend));

        adtChi = new AdapterChiTieu(ListChiTieu.this, R.layout.layout_item, arrayList);
        listView.setAdapter(adtChi);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent = new Intent();
                    //intent.setClass(ListChiTieu.this, );
                    startActivity(intent);
                }
            }
        });
    }
}
