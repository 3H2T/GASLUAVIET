package com.example.gasluaviet.ultil;





public class BanHang {

    public static final int TYPE_VAN = 1;
    public static final int TYPE_DAY = 2;

    private int image;
    private String name;
    private String price;
    private String discount;
    private int type;

    public BanHang(int image, String name, String price, String discount, int type) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.type = type;


    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
