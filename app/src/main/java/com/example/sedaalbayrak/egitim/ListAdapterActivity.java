package com.example.sedaalbayrak.egitim;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by sedaalbayrak on 21.05.2018.
 */

public class ListAdapterActivity extends Activity {

    String listCountry[] = {"Turkey", "Almanya", "Fransa", "Çin","Afrika"};
    ListView countryListText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listadapter);

        countryListText = (ListView) findViewById(R.id.lv_listCountry);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listCountry);
        countryListText.setAdapter(arrayAdapter);

        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(ListAdapterActivity.this);
                alertDialog.setMessage(listCountry[position]);
                alertDialog.setCancelable(false);
                alertDialog.setPositiveButton("Tamam", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });
            }
        };
        countryListText.setOnItemClickListener(onItemClickListener);
    }


}
