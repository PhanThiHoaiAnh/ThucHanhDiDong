package com.example.baithuchanh5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<MonAn> arrayList;

    public Adapter(Context context, int layout, List<MonAn> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout, null);

        MonAn food = arrayList.get(i);

        TextView tv_1 = view.findViewById(R.id.tv_name);
        TextView tv_2 = view.findViewById(R.id.tv_mota);
        ImageView imageV = view.findViewById(R.id.imgHinh);

        tv_1.setText(food.getTenMon());
        tv_2.setText(food.getMota());
        imageV.setImageResource(food.getHinh());
        return view;
    }

}
