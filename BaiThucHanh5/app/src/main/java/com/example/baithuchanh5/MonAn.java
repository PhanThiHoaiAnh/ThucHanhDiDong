package com.example.baithuchanh5;

public class MonAn {

    private String tenMon, mota;
    private int hinh;

    public MonAn(String tenMon, String mota, int hinh) {
        this.tenMon = tenMon;
        this.mota = mota;
        this.hinh = hinh;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
