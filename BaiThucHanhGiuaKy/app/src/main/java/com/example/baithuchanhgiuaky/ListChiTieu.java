package com.example.baithuchanhgiuaky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class ListChiTieu extends AppCompatActivity {

    private ListView listView_CT;
    private ArrayList<ChiTieu> arrList;
    private AdapterChiTieu adtChi;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listchitieu);

        btnBack = findViewById(R.id.btnBack_ofChi);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openHomePage();}
        });

        listView_CT = findViewById(R.id.listView_chi);
        arrList = new ArrayList<>();
        arrList.add(new ChiTieu("Ăn uống"," món ưa thích,...",R.drawable.anuong));
        arrList.add(new ChiTieu("Đi chợ","rau củ quả..",R.drawable.shopping));
        arrList.add(new ChiTieu("Ăn ngoài","",R.drawable.anngoai));
        arrList.add(new ChiTieu("Gaz","gaz mini, ga bình",R.drawable.gaz));
        arrList.add(new ChiTieu("Điện","bật, tắt..",R.drawable.dien));
        arrList.add(new ChiTieu("Nước","",R.drawable.nuoc));
        arrList.add(new ChiTieu("Cho vay","",R.drawable.money));
        arrList.add(new ChiTieu("Bạn bè","",R.drawable.friend));

        adtChi = new AdapterChiTieu(ListChiTieu.this, R.layout.layout_item, arrList);
        listView_CT.setAdapter(adtChi);

        listView_CT.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent = new Intent();
                    intent.setClass(ListChiTieu.this, Item_child.class);
                    startActivity(intent);
                }
            }
        });
    }
    public void openHomePage() {
        Intent intent = new Intent(ListChiTieu.this, HomePage.class);
        startActivity(intent);
    }
}
