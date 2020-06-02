package com.example.bm;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class activity_ChickenCall extends Activity implements OnClickListener{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken_clicked);
        Button bt1 = (Button) findViewById(R.id.btn_call);
        bt1.setOnClickListener(this);
    }
    @Override
    public void onClick(View arg0) {
        switch (arg0.getId()){
            case R.id.btn_call:
                startActivity(new Intent("android.intent.action.CALL",
                        Uri.parse("tel:010-0000-0000")));
                break;
        }
    }
}
