package com.example.baithuchanh5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<MonAn> arrayList;
    private Adapter adtFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);
        arrayList = new ArrayList<>();
        arrayList.add(new MonAn("Cơm chiên","25.000 VNĐ",R.drawable.comchien));
        arrayList.add(new MonAn("Gà rán","25.000 VNĐ",R.drawable.garan));
        arrayList.add(new MonAn("Hamberger","35.000 VNĐ",R.drawable.hbg1));
        arrayList.add(new MonAn("Khoai lang lắc","20.000 VNĐ",R.drawable.khoailac));
        arrayList.add(new MonAn("Khoai tây chiên","25.000 VNĐ",R.drawable.khoaitay));
        arrayList.add(new MonAn("Mỳ xào bò","30.000 VNĐ",R.drawable.mibo));
        arrayList.add(new MonAn("Mỳ Ý","45.000 VNĐ",R.drawable.miy));
        arrayList.add(new MonAn("Salad rau củ","40.000 VNĐ",R.drawable.salad));
        arrayList.add(new MonAn("Xôi xéo Hà Nội","35.000 VNĐ",R.drawable.xoixeo));

        adtFood = new Adapter(MainActivity.this, R.layout.layoutitem, arrayList);
        listView.setAdapter(adtFood);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}