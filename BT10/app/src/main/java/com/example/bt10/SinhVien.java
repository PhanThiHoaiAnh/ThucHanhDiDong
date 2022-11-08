package com.example.bt10;

public class SinhVien {
    private String tenSV, maSV, tenLop;
    private int hinh;

    public SinhVien(String tenSV, String maSV, String tenLop, int hinh) {
        this.tenSV = tenSV;
        this.maSV = maSV;
        this.tenLop = tenLop;
        this.hinh = hinh;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
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
