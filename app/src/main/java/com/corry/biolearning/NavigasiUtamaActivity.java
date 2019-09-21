package com.corry.biolearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class NavigasiUtamaActivity extends AppCompatActivity implements View.OnClickListener {


    AppCompatButton btnSains, btnQuiz, btnForum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_nav);

        btnSains = findViewById(R.id.button_materi_sains_id);
        btnQuiz = findViewById(R.id.button_materi_quiz_id);
        btnForum = findViewById(R.id.button_materi_forum_id);

        btnSains.setOnClickListener(this);
        btnQuiz.setOnClickListener(this);
        btnForum.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button_materi_sains_id:


                Toast.makeText(this, "SAINS BUTTON", Toast.LENGTH_SHORT).show();
                Intent intentSains = new Intent(this,MateriActivity.class);
                pindahPage(intentSains);


                break;
            case R.id.button_materi_quiz_id:
                Toast.makeText(this, "QUIZ BUTTON", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(NavigasiUtamaActivity.this,MateriActivity.class);
                i.putExtra(getResources().getString(R.string.flaq_quiz), getResources().getString(R.string.flaq_5));

                startActivity(i);

                break;
            case R.id.button_materi_forum_id:
                Toast.makeText(this, "FORUM BUTTON", Toast.LENGTH_SHORT).show();

                break;


        }

    }


    public void pindahPage(Intent intent){
        startActivity(intent);

    }
}
