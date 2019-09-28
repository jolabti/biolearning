package com.corry.biolearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.corry.biolearning.Shareclass.Function;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.security.SecureRandom;

public class NavigasiUtamaActivity extends AppCompatActivity implements View.OnClickListener {


    AppCompatButton btnSains, btnQuiz, btnForum;

    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String NUMBER = "0123456789";

    private static final String DATA_FOR_RANDOM_STRING = CHAR_LOWER + CHAR_UPPER + NUMBER;
    private static SecureRandom random = new SecureRandom();

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


                try {



                    Function.writeForumDiscussion(getApplicationContext(), FirebaseAuth.getInstance().getCurrentUser().getEmail(),generateRandomString(100));




                }
                catch (Exception e){
                    e.printStackTrace();
                }

                break;


        }

    }


    public void pindahPage(Intent intent){
        startActivity(intent);

    }

    public static String generateRandomString(int length) {
        if (length < 1) throw new IllegalArgumentException();

        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {

            // 0-62 (exclusive), random returns 0-61
            int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
            char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);

            // debug
            System.out.format("%d\t:\t%c%n", rndCharAt, rndChar);

            sb.append(rndChar);

        }

        return sb.toString();

    }
}
