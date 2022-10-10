package com.example.baithuchanhgiuaky;

public class ThuNhap {

    private String tenTNhap, moTaTN;
    private int hinh;

    public ThuNhap(String tenTNhap, String moTaTN, int hinh) {
        this.tenTNhap = tenTNhap;
        this.moTaTN = moTaTN;
        this.hinh = hinh;
    }

    public String getTenTNhap() {
        return tenTNhap;
    }

    public void setTenTNhap(String tenTNhap) {
        this.tenTNhap = tenTNhap;
    }

    public String getMoTaTN() {
        return moTaTN;
    }

    public void setMoTaTN(String moTaTN) {
        this.moTaTN = moTaTN;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
