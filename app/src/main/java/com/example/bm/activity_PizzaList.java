package com.example.bm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_PizzaList extends Activity implements View.OnClickListener {

    private ArrayList<PizzaItem> data = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.chicken_list);

        ListView listView = (ListView)findViewById(R.id.pizza_listview);

        data = new ArrayList<>();

        PizzaItem pizza1 = new PizzaItem(R.drawable.piz,"알볼로 제주점","064-755-8495");
        PizzaItem pizza2 = new PizzaItem(R.drawable.piz,"7번가피자 아라점","064-721-7767");

        data.add(pizza1);
        data.add(pizza2);

        PizzaAdapter adapter = new PizzaAdapter(this,R.layout.pizza_item,data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), activity_PizzaClicked.class);

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
