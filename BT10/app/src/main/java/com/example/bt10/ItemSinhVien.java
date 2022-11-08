package com.example.bt10;

public class ItemSinhVien {

    private String tenChitieu, maSV;
    private String tenLop;
    private int hinh;

    public ItemSinhVien(String tenChitieu, String maSV, String tenLop, int hinh) {
        this.tenChitieu = tenChitieu;
        this.maSV = maSV;
        this.tenLop = tenLop;
        this.hinh = hinh;
    }

    public String getTenChitieu() {
        return tenChitieu;
    }

    public void setTenChitieu(String tenChitieu) {
        this.tenChitieu = tenChitieu;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
