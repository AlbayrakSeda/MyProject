package com.example.sedaalbayrak.egitim;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by sedaalbayrak on 20.05.2018.
 */

public class MenuActivity extends ListActivity {

    String list[] = {"MainActivity", "HosgeldinActivity", "MenuActivity"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        setListAdapter(arrayAdapter);

        Intent intent = new Intent("com.");
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String selectListItem = list[position];

        try {
            Class selectClass;
            selectClass = Class.forName("com.example.sedaalbayrak.egitim."+selectListItem);
            Intent intent = new Intent(this, selectClass);
            startActivity(intent);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
