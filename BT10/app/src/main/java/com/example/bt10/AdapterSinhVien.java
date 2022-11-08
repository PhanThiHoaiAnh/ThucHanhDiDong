package com.example.bt10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterSinhVien extends BaseAdapter {

    private Context context;
    private int layout;
    private List<ItemSinhVien> arrayList;

    public AdapterSinhVien(Context context, int layout, List<ItemSinhVien> arrayList) {
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

        ItemSinhVien svien = arrayList.get(i);

        TextView tvName_106 = view.findViewById(R.id.tv_name);
        TextView tvId_106 = view.findViewById(R.id.tv_idSV);
        TextView tvLop_106 = view.findViewById(R.id.textLop);
        ImageView imageV = view.findViewById(R.id.imgHinh);

        tvName_106.setText(svien.getTenChitieu());
        tvId_106.setText(svien.getMaSV());
        tvLop_106.setText(svien.getTenLop());
        imageV.setImageResource(svien.getHinh());
        return view;
    }
}
