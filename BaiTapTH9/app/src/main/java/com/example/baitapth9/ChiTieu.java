package com.example.baitapth9;

public class ChiTieu {
    private String tenChT, moTa;
    private int hinh;

    public ChiTieu(String tenChT, String moTa, int hinh) {
        this.tenChT = tenChT;
        this.moTa = moTa;
        this.hinh = hinh;
    }

    public String getTenChT() {
        return tenChT;
    }

    public void setTenChT(String tenChT) {
        this.tenChT = tenChT;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
