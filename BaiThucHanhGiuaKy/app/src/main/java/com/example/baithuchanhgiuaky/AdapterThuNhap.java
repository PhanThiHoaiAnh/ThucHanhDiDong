package com.example.baithuchanhgiuaky;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterThuNhap extends BaseAdapter {

    private Context context;
    private int layout;
    private List<ThuNhap> arrList;

    public AdapterThuNhap(Context context, int layout, List<ThuNhap> arrList) {
        this.context = context;
        this.layout = layout;
        this.arrList = arrList;
    }

    @Override
    public int getCount() {
        return 0;
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
        LayoutInflater inflater  = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout, null);

        ThuNhap chi = arrList.get(i);
        TextView tv1 = view.findViewById(R.id.tv_name);
        TextView tv2 = view.findViewById(R.id.tv_chuthich);
        ImageView imageView = view. findViewById(R.id.imgHinh);

        tv1.setText(chi.getTenTNhap());
        tv2.setText(chi.getMoTaTN());
        imageView.setImageResource(chi.getHinh());

        return view;
    }
}
