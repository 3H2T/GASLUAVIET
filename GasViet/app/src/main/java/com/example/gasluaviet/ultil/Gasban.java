package com.example.gasluaviet.ultil;

public class Gasban {

    private int resourceId;
    private String title;
    private String gia;
    private String giam;

    public Gasban(int resourceId, String title, String gia, String giam) {
        this.resourceId = resourceId;
        this.title = title;
        this.gia = gia;
        this.giam = giam;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
}
