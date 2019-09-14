package com.corry.biolearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class Lay6Activity extends AppCompatActivity implements View.OnClickListener {

    AppCompatButton btnNavMateriK6_1, btnNavMateriK6_2, btnNavMateriK6_3, btnNavMateriK6_4, btnNavMateriK6_5, btnNavMateriK6_6, btnNavMateriK6_7, btnNavMateriK6_8, btnNavMateriK6_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_6);

        btnNavMateriK6_1 = findViewById(R.id.nav_materi_k6_1_id);
        btnNavMateriK6_2 = findViewById(R.id.nav_materi_k6_2_id);
        btnNavMateriK6_3 = findViewById(R.id.nav_materi_k6_3_id);
        btnNavMateriK6_4 = findViewById(R.id.nav_materi_k6_4_id);
        btnNavMateriK6_5 = findViewById(R.id.nav_materi_k6_5_id);
        btnNavMateriK6_6 = findViewById(R.id.nav_materi_k6_6_id);
        btnNavMateriK6_7 = findViewById(R.id.nav_materi_k6_7_id);
        btnNavMateriK6_8 = findViewById(R.id.nav_materi_k6_8_id);
        btnNavMateriK6_9 = findViewById(R.id.nav_materi_k6_9_id);


        btnNavMateriK6_1.setOnClickListener(this);
        btnNavMateriK6_2.setOnClickListener(this);
        btnNavMateriK6_3.setOnClickListener(this);
        btnNavMateriK6_4.setOnClickListener(this);
        btnNavMateriK6_5.setOnClickListener(this);
        btnNavMateriK6_6.setOnClickListener(this);
        btnNavMateriK6_7.setOnClickListener(this);
        btnNavMateriK6_8.setOnClickListener(this);
        btnNavMateriK6_9.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.nav_materi_k6_1_id:

                Intent i = new Intent(Lay6Activity.this, ContentMateri.class);
                i.putExtra(getResources().getString(R.string.intent_identifier), getResources().getString(R.string.url_k6_1));

                startActivity(i);
                break;


            case R.id.nav_materi_k6_2_id:

                Intent i2 = new Intent(Lay6Activity.this, ContentMateri.class);
                i2.putExtra(getResources().getString(R.string.intent_identifier), getResources().getString(R.string.url_k6_2));

                startActivity(i2);
                break;


            case R.id.nav_materi_k6_3_id:

                Intent i3 = new Intent(Lay6Activity.this, ContentMateri.class);
                i3.putExtra(getResources().getString(R.string.intent_identifier), getResources().getString(R.string.url_k6_3));

                startActivity(i3);
                break;


            case R.id.nav_materi_k6_4_id:

                Intent i4 = new Intent(Lay6Activity.this, ContentMateri.class);
                i4.putExtra(getResources().getString(R.string.intent_identifier), getResources().getString(R.string.url_k6_4));

                startActivity(i4);
                break;


            case R.id.nav_materi_k6_5_id:

                Intent i5 = new Intent(Lay6Activity.this, ContentMateri.class);
                i5.putExtra(getResources().getString(R.string.intent_identifier), getResources().getString(R.string.url_k6_5));

                startActivity(i5);
                break;


            case R.id.nav_materi_k6_6_id:

                Intent i6 = new Intent(Lay6Activity.this, ContentMateri.class);
                i6.putExtra(getResources().getString(R.string.intent_identifier), getResources().getString(R.string.url_k6_6));

                startActivity(i6);
                break;


            case R.id.nav_materi_k6_7_id:

                Intent i7 = new Intent(Lay6Activity.this, ContentMateri.class);
                i7.putExtra(getResources().getString(R.string.intent_identifier), getResources().getString(R.string.url_k6_7));

                startActivity(i7);
                break;


            case R.id.nav_materi_k6_8_id:

                Intent i8 = new Intent(Lay6Activity.this, ContentMateri.class);
                i8.putExtra(getResources().getString(R.string.intent_identifier), getResources().getString(R.string.url_k6_8));

                startActivity(i8);
                break;


            case R.id.nav_materi_k6_9_id:

                Intent i9 = new Intent(Lay6Activity.this, ContentMateri.class);
                i9.putExtra(getResources().getString(R.string.intent_identifier), getResources().getString(R.string.url_k6_9));

                startActivity(i9);
                break;


        }
    }
}