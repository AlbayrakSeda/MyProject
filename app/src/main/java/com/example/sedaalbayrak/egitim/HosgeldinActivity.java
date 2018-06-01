package com.example.sedaalbayrak.egitim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by sedaalbayrak on 19.05.2018.
 */

public class HosgeldinActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hosgeldin);

        Thread thread = new Thread(){

            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();

                }finally{
                    Intent intent = new Intent("com.example.sedaalbayrak.egitim.MAINACTIVITY");
                    startActivity(intent);
                }
            }
        };

        thread.start();
    }
}