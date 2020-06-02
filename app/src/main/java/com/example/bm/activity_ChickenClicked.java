package com.example.bm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class activity_ChickenClicked extends Activity {

    private int img;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.chicken_clicked);

        Intent intent = getIntent();

        ImageView profile = (ImageView)findViewById(R.id.img_prof);
        TextView info = (TextView)findViewById(R.id.tv_info);
        TextView phone = (TextView)findViewById(R.id.tv_pn);

        img = Integer.parseInt(intent.getStringExtra("profile"));
        profile.setImageResource(img);
        info.setText(intent.getStringExtra("info"));
        phone.setText(intent.getStringExtra("phone"));


    }
}
