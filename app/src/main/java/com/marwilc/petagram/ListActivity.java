package com.marwilc.petagram;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    SwipeRefreshLayout sfiMyIndicatorRefresh;
    ListView lstMyList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        sfiMyIndicatorRefresh = (SwipeRefreshLayout) findViewById(R.id.sfiMyIndicatorRefresh);
        lstMyList = (ListView) findViewById(R.id.lstMyList);

        String[] languages = getResources().getStringArray(R.array.Languages);

        lstMyList.setAdapter(new ArrayAdapter(this,android.R.layout.simple_list_item_1, languages));
        sfiMyIndicatorRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

            }
        });
    }

    public void refreshContent(){
        String[] languages = getResources().getStringArray(R.array.Languages);
        lstMyList.setAdapter(new ArrayAdapter(this,android.R.layout.simple_list_item_1, languages));
        sfiMyIndicatorRefresh.setRefreshing(false);
    }
}
