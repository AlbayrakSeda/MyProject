package com.example.sedaalbayrak.egitim;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by sedaalbayrak on 19.05.2018.
 */

public class MainActivity extends Activity {

    Button ekle;
    Button cikar;
    TextView sonuc;
    int yeniDeger;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain);

        yeniDeger = 0;
        ekle = (Button) findViewById(R.id.btn_ekle);
        cikar = (Button) findViewById(R.id.btn_cikar);
        sonuc = (TextView) findViewById(R.id.txt_sonuc);

        ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                yeniDeger++;
                sonuc.setText("Sonuç : "+yeniDeger);
            }
        });

        cikar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                yeniDeger--;
                sonuc.setText("Sonuç : "+yeniDeger);
            }
        });

    }

}
