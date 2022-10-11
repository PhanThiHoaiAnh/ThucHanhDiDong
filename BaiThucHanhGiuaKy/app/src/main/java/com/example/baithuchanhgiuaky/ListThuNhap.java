package com.example.baithuchanhgiuaky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ListThuNhap extends AppCompatActivity {

    private ListView listView_TN;
    private ArrayList<ThuNhap> arrList;
    private AdapterThuNhap adtThu;
    private Button btnBackT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listthhunhap);

        btnBackT = findViewById(R.id.btBackThu);
        btnBackT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openHomePage();}
        });

        listView_TN = findViewById(R.id.listView_thu);
        arrList = new ArrayList<>();
        arrList.add(new ThuNhap("Nước","",R.drawable.nuoc));
        arrList.add(new ThuNhap("Cho vay","",R.drawable.money));
        arrList.add(new ThuNhap("Kinh doanh online","",R.drawable.friend));
        arrList.add(new ThuNhap("Bán đồ ăn","",R.drawable.anuong));
        arrList.add(new ThuNhap("Kinh doanh trực tiếp","rau củ quả..",R.drawable.shopping));
        arrList.add(new ThuNhap("Gaz","gaz mini, ga bình",R.drawable.gaz));
        arrList.add(new ThuNhap("Điện","bật, tắt..",R.drawable.dien));
        arrList.add(new ThuNhap("Ăn ngoài","",R.drawable.anngoai));

        adtThu = new AdapterThuNhap(ListThuNhap.this, R.layout.layout_item, arrList);
        listView_TN.setAdapter(adtThu);

        listView_TN.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent = new Intent();
                    intent.setClass(ListThuNhap.this, Item_child.class);
                    startActivity(intent);
                }
            }
        });
    }
    public void openHomePage() {
        Intent intent = new Intent(ListThuNhap.this, HomePage.class);
        startActivity(intent);
    }
}
