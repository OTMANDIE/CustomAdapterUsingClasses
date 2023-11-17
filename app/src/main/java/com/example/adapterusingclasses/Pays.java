package com.example.adapterusingclasses;

public class Pays {

    private int img;
    private String currency;
    private String code_ISO;

    Pays(int img, String currency, String code_ISO) {
        this.img = img;
        this.currency = currency;
        this.code_ISO = code_ISO;
    }

    public int getImg() {
        return this.img;
    }
    public String getCurrency() {
        return currency;
    }
    public String getCode_ISO() {
        return code_ISO;
    }

}
