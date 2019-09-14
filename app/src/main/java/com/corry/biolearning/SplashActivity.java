package com.corry.biolearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {


    private  Handler myHandler = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_splash);

        myHandler = new Handler();

        myHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

//                Intent gotoLogin = new Intent(SplashActivity.this, LoginActivity.class);
//                startActivity(gotoLogin);
//
                Intent gotoMenuKelas = new Intent(SplashActivity.this, MateriActivity.class);
                startActivity(gotoMenuKelas);

            }
        }, 3000);
    }
}
