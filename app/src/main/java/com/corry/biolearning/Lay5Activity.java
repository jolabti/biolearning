package com.corry.biolearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Lay5Activity extends AppCompatActivity implements View.OnClickListener {

    AppCompatButton btnNavMateriK5_1,btnNavMateriK5_2,btnNavMateriK5_3,btnNavMateriK5_4,btnNavMateriK5_5,btnNavMateriK5_6,btnNavMateriK5_7,btnNavMateriK5_8,btnNavMateriK5_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_5);

        btnNavMateriK5_1 = findViewById(R.id.nav_materi_k5_1_id);
        btnNavMateriK5_2 = findViewById(R.id.nav_materi_k5_2_id);
        btnNavMateriK5_3 = findViewById(R.id.nav_materi_k5_3_id);
        btnNavMateriK5_4 = findViewById(R.id.nav_materi_k5_4_id);
        btnNavMateriK5_5 = findViewById(R.id.nav_materi_k5_5_id);
        btnNavMateriK5_6 = findViewById(R.id.nav_materi_k5_6_id);
        btnNavMateriK5_7 = findViewById(R.id.nav_materi_k5_7_id);
        btnNavMateriK5_8 = findViewById(R.id.nav_materi_k5_8_id);
        btnNavMateriK5_9 = findViewById(R.id.nav_materi_k5_9_id);



        btnNavMateriK5_1.setOnClickListener(this);
        btnNavMateriK5_2.setOnClickListener(this);
        btnNavMateriK5_3.setOnClickListener(this);
        btnNavMateriK5_4.setOnClickListener(this);
        btnNavMateriK5_5.setOnClickListener(this);
        btnNavMateriK5_6.setOnClickListener(this);
        btnNavMateriK5_7.setOnClickListener(this);
        btnNavMateriK5_8.setOnClickListener(this);
        btnNavMateriK5_9.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.nav_materi_k5_1_id:

                Intent i = new Intent(Lay5Activity.this, ContentMateri.class);
                i.putExtra(getResources().getString(R.string.intent_identifier), getResources().getString(R.string.url_k5_1) );

                startActivity(i);
                break;


                case R.id.nav_materi_k5_2_id:

                Intent i2 = new Intent(Lay5Activity.this, ContentMateri.class);
                i2.putExtra(getResources().getString(R.string.intent_identifier), getResources().getString(R.string.url_k5_2) );

                startActivity(i2);
                break;


            case R.id.nav_materi_k5_3_id:

                Intent i3 = new Intent(Lay5Activity.this, ContentMateri.class);
                i3.putExtra(getResources().getString(R.string.intent_identifier), getResources().getString(R.string.url_k5_3) );

                startActivity(i3);
                break;


            case R.id.nav_materi_k5_4_id:

                Intent i4 = new Intent(Lay5Activity.this, ContentMateri.class);
                i4.putExtra(getResources().getString(R.string.intent_identifier), getResources().getString(R.string.url_k5_4) );

                startActivity(i4);
                break;


            case R.id.nav_materi_k5_5_id:

                Intent i5 = new Intent(Lay5Activity.this, ContentMateri.class);
                i5.putExtra(getResources().getString(R.string.intent_identifier), getResources().getString(R.string.url_k5_5) );

                startActivity(i5);
                break;


            case R.id.nav_materi_k5_6_id:

                Intent i6 = new Intent(Lay5Activity.this, ContentMateri.class);
                i6.putExtra(getResources().getString(R.string.intent_identifier), getResources().getString(R.string.url_k5_6) );

                startActivity(i6);
                break;


            case R.id.nav_materi_k5_7_id:

                Intent i7 = new Intent(Lay5Activity.this, ContentMateri.class);
                i7.putExtra(getResources().getString(R.string.intent_identifier), getResources().getString(R.string.url_k5_7) );

                startActivity(i7);
                break;


            case R.id.nav_materi_k5_8_id:

                Intent i8 = new Intent(Lay5Activity.this, ContentMateri.class);
                i8.putExtra(getResources().getString(R.string.intent_identifier), getResources().getString(R.string.url_k5_8) );

                startActivity(i8);
                break;


            case R.id.nav_materi_k5_9_id:

                Intent i9 = new Intent(Lay5Activity.this, ContentMateri.class);
                i9.putExtra(getResources().getString(R.string.intent_identifier), getResources().getString(R.string.url_k5_9) );

                startActivity(i9);
                break;
        }
    }
}
