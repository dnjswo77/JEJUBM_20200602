package com.example.bm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_ChickenList extends Activity implements View.OnClickListener {

    private ArrayList<ChickenItem> data = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.chicken_list);

        ListView listView = (ListView)findViewById(R.id.chicken_listview);

        data = new ArrayList<>();

        ChickenItem chicken1 = new ChickenItem(R.drawable.chn,"노랑통닭 아라점","064-759-5592");
        ChickenItem chicken2 = new ChickenItem(R.drawable.chn,"네네치킨 아라점","064-726-4479");
        ChickenItem chicken3 = new ChickenItem(R.drawable.chn,"엄마치킨","064-726-5330");
        ChickenItem chicken4 = new ChickenItem(R.drawable.chn,"명품치킨","064-723-8292");
        ChickenItem chicken5 = new ChickenItem(R.drawable.chn,"숲노을 치킨","064-724-4719");
        ChickenItem chicken6 = new ChickenItem(R.drawable.chn,"푸라닭 제주대점","064-702-1588");
        ChickenItem chicken7 = new ChickenItem(R.drawable.chn,"멕시카나 치킨","064-7002-8865");

        data.add(chicken1);
        data.add(chicken2);
        data.add(chicken3);
        data.add(chicken4);
        data.add(chicken5);
        data.add(chicken6);
        data.add(chicken7);

        ChickenAdapter adapter = new ChickenAdapter(this,R.layout.chicken_item,data);
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
