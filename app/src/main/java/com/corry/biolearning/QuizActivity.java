package com.corry.biolearning;

import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

public class QuizActivity extends AppCompatActivity {

    AppCompatTextView soal1, soal2, soal3, soal4, soal5;

    RadioGroup rg1, rg2,rg3,rg4,rg5;


    RadioButton jawaban1_a, jawaban1_b, jawaban1_c, jawaban1_d;
    RadioButton jawaban2_a, jawaban2_b, jawaban2_c, jawaban2_d;
    RadioButton jawaban3_a, jawaban3_b, jawaban3_c, jawaban3_d;
    RadioButton jawaban4_a, jawaban4_b, jawaban4_c, jawaban4_d;
    RadioButton jawaban5_a, jawaban5_b, jawaban5_c, jawaban5_d;


    int hitungBenar = 0;

    int collectionAnswerK5[] = {R.string.quiz_k5_1_jawaban_d, R.string.quiz_k5_2_jawaban_b, R.string.quiz_k5_3_jawaban_d, R.string.quiz_k5_4_jawaban_c, R.string.quiz_k5_5_jawaban_d};
    int collectionAnswerK6[] = {R.string.quiz_k6_1_jawaban_d, R.string.quiz_k6_2_jawaban_b, R.string.quiz_k6_3_jawaban_b, R.string.quiz_k6_4_jawaban_c, R.string.quiz_k6_5_jawaban_a};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Bundle bundle = getIntent().getExtras();

        rg1 = findViewById(R.id.rg1);
        rg2 = findViewById(R.id.rg2);
        rg3 = findViewById(R.id.rg3);
        rg4 = findViewById(R.id.rg4);
        rg5 = findViewById(R.id.rg5);
        soal1 = findViewById(R.id.quiz_soal_1);
        soal2 = findViewById(R.id.quiz_soal_2);
        soal3 = findViewById(R.id.quiz_soal_3);
        soal4 = findViewById(R.id.quiz_soal_4);
        soal5 = findViewById(R.id.quiz_soal_5);


        jawaban1_a = findViewById(R.id.jawaban_q1_a);
        jawaban1_b = findViewById(R.id.jawaban_q1_b);
        jawaban1_c = findViewById(R.id.jawaban_q1_c);
        jawaban1_d = findViewById(R.id.jawaban_q1_d);

        jawaban2_a = findViewById(R.id.jawaban_q2_a);
        jawaban2_b = findViewById(R.id.jawaban_q2_b);
        jawaban2_c = findViewById(R.id.jawaban_q2_c);
        jawaban2_d = findViewById(R.id.jawaban_q2_d);

        jawaban3_a = findViewById(R.id.jawaban_q3_a);
        jawaban3_b = findViewById(R.id.jawaban_q3_b);
        jawaban3_c = findViewById(R.id.jawaban_q3_c);
        jawaban3_d = findViewById(R.id.jawaban_q3_d);

        jawaban4_a = findViewById(R.id.jawaban_q4_a);
        jawaban4_b = findViewById(R.id.jawaban_q4_b);
        jawaban4_c = findViewById(R.id.jawaban_q4_c);
        jawaban4_d = findViewById(R.id.jawaban_q4_d);

        jawaban5_a = findViewById(R.id.jawaban_q5_a);
        jawaban5_b = findViewById(R.id.jawaban_q5_b);
        jawaban5_c = findViewById(R.id.jawaban_q5_c);
        jawaban5_d = findViewById(R.id.jawaban_q5_d);


        if (bundle.getString(getResources().getString(R.string.flaq_quiz)) != null && bundle.getString(getResources().getString(R.string.flaq_quiz)).equals(getResources().getString(R.string.flaq_5))) {


            soal1.setText(showDataText(R.string.quiz_k5_1_soal));
            soal2.setText(showDataText(R.string.quiz_k5_2_soal));
            soal3.setText(showDataText(R.string.quiz_k5_3_soal));
            soal4.setText(showDataText(R.string.quiz_k5_4_soal));
            soal5.setText(showDataText(R.string.quiz_k5_5_soal));


            jawaban1_a.setText(showDataText(R.string.quiz_k5_1_jawaban_a));
            jawaban1_b.setText(showDataText(R.string.quiz_k5_1_jawaban_b));
            jawaban1_c.setText(showDataText(R.string.quiz_k5_1_jawaban_c));
            jawaban1_d.setText(showDataText(R.string.quiz_k5_1_jawaban_d));


            rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    // checkedId is the RadioButton selected
                    RadioButton rb = (RadioButton) findViewById(checkedId);

                    if (checkJawaban(rb, getResources().getString(collectionAnswerK5[0]))) {

                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK5[0]))), Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK5[0]))), Toast.LENGTH_LONG).show();

                    }
                }
            });


            jawaban2_a.setText(showDataText(R.string.quiz_k5_2_jawaban_a));
            jawaban2_b.setText(showDataText(R.string.quiz_k5_2_jawaban_b));
            jawaban2_c.setText(showDataText(R.string.quiz_k5_2_jawaban_c));
            jawaban2_d.setText(showDataText(R.string.quiz_k5_2_jawaban_d));

            rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    // checkedId is the RadioButton selected
                    RadioButton rb = (RadioButton) findViewById(checkedId);

                    Log.d("trace_jwaban_rg2", rb.getText().toString());

                    if (checkJawaban(rb, getResources().getString(collectionAnswerK5[1]))) {

                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK5[1]))), Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK5[1]))), Toast.LENGTH_LONG).show();

                    }
                }
            });

            jawaban3_a.setText(showDataText(R.string.quiz_k5_3_jawaban_a));
            jawaban3_b.setText(showDataText(R.string.quiz_k5_3_jawaban_b));
            jawaban3_c.setText(showDataText(R.string.quiz_k5_3_jawaban_c));
            jawaban3_d.setText(showDataText(R.string.quiz_k5_3_jawaban_d));

            rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    // checkedId is the RadioButton selected
                    RadioButton rb = (RadioButton) findViewById(checkedId);

                    if (checkJawaban(rb, getResources().getString(collectionAnswerK5[2]))) {

                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK5[2]))), Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK5[2]))), Toast.LENGTH_LONG).show();

                    }
                }
            });

            jawaban4_a.setText(showDataText(R.string.quiz_k5_4_jawaban_a));
            jawaban4_b.setText(showDataText(R.string.quiz_k5_4_jawaban_b));
            jawaban4_c.setText(showDataText(R.string.quiz_k5_4_jawaban_c));
            jawaban4_d.setText(showDataText(R.string.quiz_k5_4_jawaban_d));

            rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    // checkedId is the RadioButton selected
                    RadioButton rb = (RadioButton) findViewById(checkedId);

                    if (checkJawaban(rb, getResources().getString(collectionAnswerK5[3]))) {

                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK5[3]))), Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK5[3]))), Toast.LENGTH_LONG).show();

                    }
                }
            });

            jawaban5_a.setText(showDataText(R.string.quiz_k5_5_jawaban_a));
            jawaban5_b.setText(showDataText(R.string.quiz_k5_5_jawaban_b));
            jawaban5_c.setText(showDataText(R.string.quiz_k5_5_jawaban_c));
            jawaban5_d.setText(showDataText(R.string.quiz_k5_5_jawaban_d));

            rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    // checkedId is the RadioButton selected
                    RadioButton rb = (RadioButton) findViewById(checkedId);

                    if (checkJawaban(rb, getResources().getString(collectionAnswerK5[4]))) {

                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK5[4]))), Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK5[4]))), Toast.LENGTH_LONG).show();

                    }
                }
            });


        } else if (bundle.getString(getResources().getString(R.string.flaq_quiz)) != null && bundle.getString(getResources().getString(R.string.flaq_quiz)).equals(getResources().getString(R.string.flaq_6))) {

            soal1.setText(showDataText(R.string.quiz_k6_1_soal));
            soal2.setText(showDataText(R.string.quiz_k6_2_soal));
            soal3.setText(showDataText(R.string.quiz_k6_3_soal));
            soal4.setText(showDataText(R.string.quiz_k6_4_soal));
            soal5.setText(showDataText(R.string.quiz_k6_5_soal));


            jawaban1_a.setText(showDataText(R.string.quiz_k6_1_jawaban_a));
            jawaban1_b.setText(showDataText(R.string.quiz_k6_1_jawaban_b));
            jawaban1_c.setText(showDataText(R.string.quiz_k6_1_jawaban_c));
            jawaban1_d.setText(showDataText(R.string.quiz_k6_1_jawaban_d));


            rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    // checkedId is the RadioButton selected
                    RadioButton rb = (RadioButton) findViewById(checkedId);

                    if (checkJawaban(rb, getResources().getString(collectionAnswerK6[0]))) {

                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK6[0]))), Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK6[0]))), Toast.LENGTH_LONG).show();

                    }
                }
            });


            jawaban2_a.setText(showDataText(R.string.quiz_k6_2_jawaban_a));
            jawaban2_b.setText(showDataText(R.string.quiz_k6_2_jawaban_b));
            jawaban2_c.setText(showDataText(R.string.quiz_k6_2_jawaban_c));
            jawaban2_d.setText(showDataText(R.string.quiz_k6_2_jawaban_d));

            rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    // checkedId is the RadioButton selected
                    RadioButton rb = (RadioButton) findViewById(checkedId);

                    if (checkJawaban(rb, getResources().getString(collectionAnswerK6[1]))) {

                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK6[1]))), Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK6[1]))), Toast.LENGTH_LONG).show();

                    }
                }
            });

            jawaban3_a.setText(showDataText(R.string.quiz_k6_3_jawaban_a));
            jawaban3_b.setText(showDataText(R.string.quiz_k6_3_jawaban_b));
            jawaban3_c.setText(showDataText(R.string.quiz_k6_3_jawaban_c));
            jawaban3_d.setText(showDataText(R.string.quiz_k6_3_jawaban_d));


            rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    // checkedId is the RadioButton selected
                    RadioButton rb = (RadioButton) findViewById(checkedId);

                    if (checkJawaban(rb, getResources().getString(collectionAnswerK6[2]))) {

                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK6[2]))), Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK6[2]))), Toast.LENGTH_LONG).show();

                    }
                }
            });

            jawaban4_a.setText(showDataText(R.string.quiz_k6_4_jawaban_a));
            jawaban4_b.setText(showDataText(R.string.quiz_k6_4_jawaban_b));
            jawaban4_c.setText(showDataText(R.string.quiz_k6_4_jawaban_c));
            jawaban4_d.setText(showDataText(R.string.quiz_k6_4_jawaban_d));

            rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    // checkedId is the RadioButton selected
                    RadioButton rb = (RadioButton) findViewById(checkedId);

                    if (checkJawaban(rb, getResources().getString(collectionAnswerK6[3]))) {

                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK6[3]))), Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK6[3]))), Toast.LENGTH_LONG).show();

                    }
                }
            });

            jawaban5_a.setText(showDataText(R.string.quiz_k6_5_jawaban_a));
            jawaban5_b.setText(showDataText(R.string.quiz_k6_5_jawaban_b));
            jawaban5_c.setText(showDataText(R.string.quiz_k6_5_jawaban_c));
            jawaban5_d.setText(showDataText(R.string.quiz_k6_5_jawaban_d));

            rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    // checkedId is the RadioButton selected
                    RadioButton rb = (RadioButton) findViewById(checkedId);

                    if (checkJawaban(rb, getResources().getString(collectionAnswerK6[4]))) {

                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK6[4]))), Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), Boolean.toString(checkJawaban(rb, getResources().getString(collectionAnswerK6[4]))), Toast.LENGTH_LONG).show();

                    }
                }
            });


        }


    }

    public String showDataText(int sourceSoal) {


        return getResources().getString(sourceSoal);


    }


    public Boolean checkJawaban(RadioButton radioButton, String realAnswer) {

        boolean mybool = false;

        if (radioButton.getText().equals(realAnswer)) {
            mybool = true;
        }

        return mybool;
    }
}
