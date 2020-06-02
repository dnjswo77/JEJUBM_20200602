package com.example.bm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_KoreanList extends Activity implements View.OnClickListener {

    private ArrayList<KoreanItem> data = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.korean_list);

        ListView listView = (ListView)findViewById(R.id.korean_listview);

        data = new ArrayList<>();

        KoreanItem korean1 = new KoreanItem(R.drawable.kor,"아라불족","064-724-4885");
        KoreanItem korean2 = new KoreanItem(R.drawable.kor,"부부족발","064-755-7727");
        KoreanItem korean3 = new KoreanItem(R.drawable.kor,"배꼽시계","064-724-4656");
        KoreanItem korean4 = new KoreanItem(R.drawable.kor,"개미와베짱이","064-726-4939");
        KoreanItem korean5 = new KoreanItem(R.drawable.kor,"신전떡볶이 제주대점","064-723-4448");
        KoreanItem korean6 = new KoreanItem(R.drawable.kor,"빠샤시 떡볶이","064-702-8832");


        data.add(korean1);
        data.add(korean2);
        data.add(korean3);
        data.add(korean4);
        data.add(korean5);
        data.add(korean6);

        KoreanAdapter adapter = new KoreanAdapter(this,R.layout.korean_item,data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), activity_KoreanClicked.class);

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
