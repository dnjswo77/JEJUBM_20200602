package com.example.bm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ChickenItem {

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

    public ChickenItem(int profile, String info, String phone){
        this.profile = profile;
        this.info = info;
        this.phone = phone;
    }



}
