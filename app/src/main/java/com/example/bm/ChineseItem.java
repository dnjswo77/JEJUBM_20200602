package com.example.bm;

public class ChineseItem {

    private int profile;
    private String info;
    private String phone;

    public int getProfile(){
        return profile;
    }

    public String getInfo(){
        return info;
    }

    public String getPhone(){
        return phone;
    }

    public ChineseItem(int profile, String info, String phone){
        this.profile = profile;
        this.info = info;
        this.phone = phone;
    }



}