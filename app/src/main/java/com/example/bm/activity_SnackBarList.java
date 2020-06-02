package com.example.bm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_SnackBarList extends Activity implements View.OnClickListener {

    private ArrayList<SnackBarItem> data = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.snackbar_list);

        ListView listView = (ListView)findViewById(R.id.snackbar_listview);

        data = new ArrayList<>();

        SnackBarItem snackbar1 = new SnackBarItem(R.drawable.bun_1,"도스마스 제주대점","064-748-1253");
        SnackBarItem snackbar2 = new SnackBarItem(R.drawable.bun_1,"맘스터치 제주대점","064-726-9299");
        SnackBarItem snackbar3 = new SnackBarItem(R.drawable.bun_1,"맘스터치 아라점","064-755-8299");

        data.add(snackbar1);
        data.add(snackbar2);
        data.add(snackbar3);


        SnackBarAdapter adapter = new SnackBarAdapter(this,R.layout.snackbar_item,data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), activity_ChickenClicked.class);

                intent.putExtra("profile", Integer.toString(data.get(position).getProfile()));
                intent.putExtra("info", data.get(position).getInfo());
                intent.putExtra("phone", data.get(position).getPhone());
                startActivity(intent);
            }
        });


    }

    @Override
    public void onClick(View v) {

    }
}

