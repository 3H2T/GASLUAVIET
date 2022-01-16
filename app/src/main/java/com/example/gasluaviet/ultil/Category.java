package com.example.gasluaviet.ultil;

import com.example.gasluaviet.ultil.Gasban;

import java.util.List;

public class Category {
    private String nameCategory;
    private List<Gasban> gasbans;

    public Category(String nameCategory, List<Gasban> gasbans) {
        this.nameCategory = nameCategory;
        this.gasbans = gasbans;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Gasban> getGasbans() {
        return gasbans;
    }

    public void setGasbans(List<Gasban> gasbans) {
        this.gasbans = gasbans;
    }
}
