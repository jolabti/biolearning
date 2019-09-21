package com.corry.biolearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MateriActivity extends AppCompatActivity implements View.OnClickListener {

    AppCompatButton btnMateriK5, btnMateriK6;

    Bundle bundle =null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.materi_nav);
        bundle = getIntent().getExtras();
        btnMateriK5 = findViewById(R.id.btn_materi_kelas_5_id);
        btnMateriK6 = findViewById(R.id.btn_materi_kelas_6_id);

        btnMateriK5.setOnClickListener(this);
        btnMateriK6.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {


        switch (view.getId()){

            case R.id.btn_materi_kelas_5_id:



                if(bundle.getString(getResources().getString(R.string.flaq_quiz))!=null){
                    Intent i = new Intent(MateriActivity.this,QuizActivity.class);
                    i.putExtra(getResources().getString(R.string.flaq_quiz), getResources().getString(R.string.flaq_5));

                    startActivity(i);
                }
                else{

                    Intent gotoLay5 = new Intent(MateriActivity.this, Lay5Activity.class);
                    startActivity(gotoLay5);

                }





                break;

            case R.id.btn_materi_kelas_6_id:

                if(bundle.getString(getResources().getString(R.string.flaq_quiz))!=null){
                    Intent i = new Intent(MateriActivity.this,QuizActivity.class);
                    i.putExtra(getResources().getString(R.string.flaq_quiz), getResources().getString(R.string.flaq_6));

                    startActivity(i);
                }
                else{

                    Intent gotoLay6 = new Intent(MateriActivity.this, Lay6Activity.class);
                    startActivity(gotoLay6);
                }


                break;

        }

    }
}


