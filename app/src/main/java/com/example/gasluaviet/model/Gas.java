package com.example.gasluaviet.model;

public class Gas {

    public static final int TYPE_PETRO = 1;
    public static final int TYPE_TOTAL = 2;
    public static final int TYPE_SHELL = 3;


    private int hinh;
    private String ten;
    private String gia;
    private String giam;
    private int type;

    public Gas(int hinh, String ten, String gia, String giam, int type) {
        this.hinh = hinh;
        this.ten = ten;
        this.gia = gia;
        this.giam = giam;
        this.type = type;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getGiam() {
        return giam;
    }

    public void setGiam(String giam) {
        this.giam = giam;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
