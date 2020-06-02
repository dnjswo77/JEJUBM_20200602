package com.example.bm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_ChineseList extends Activity implements View.OnClickListener {

    private ArrayList<ChineseItem> data = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.chinese_list);

        ListView listView = (ListView)findViewById(R.id.chinese_listview);

        data = new ArrayList<>();

        ChineseItem chinese1 = new ChineseItem(R.drawable.chi,"월궁","064-724-3477");
        ChineseItem chinese2 = new ChineseItem(R.drawable.chi,"평화","064-724-1344");

        data.add(chinese1);
        data.add(chinese2);


        ChineseAdapter adapter = new ChineseAdapter(this,R.layout.chinese_item,data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), activity_ChineseClicked.class);

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

