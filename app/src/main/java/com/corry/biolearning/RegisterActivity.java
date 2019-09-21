package com.corry.biolearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import com.corry.biolearning.Shareclass.Function;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    AppCompatButton btnConfirm;
    AppCompatEditText edtUsername, edtPassword, edtRepassword;

    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        firebaseAuth = FirebaseAuth.getInstance();


        btnConfirm = findViewById(R.id.register_button_confirm_id);
        edtUsername = findViewById(R.id.register_edtusername_id);
        edtPassword = findViewById(R.id.register_edtpassword_id);
        edtRepassword = findViewById(R.id.register_edtrepassword_id);


        btnConfirm.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.register_button_confirm_id:
                sendRegisterData(edtUsername.getText().toString().trim() == null ? "" : edtUsername.getText().toString().trim() == null ? "" : edtUsername.getText().toString().trim(), edtPassword.getText().toString() == null ? "" : edtPassword.getText().toString(), edtRepassword.getText().toString() == null ? "" : edtRepassword.getText().toString());
                break;
        }
    }


    public void sendRegisterData(String email, String password, String repassword) {


        if (email == null || email.isEmpty()) {

            Function.showToast(this, getResources().getString(R.string.error_email_empty));

        } else if (password == null || password.isEmpty()) {

            Function.showToast(this, getResources().getString(R.string.error_password_empty));

        } else if (!password.equals(repassword)) {

            Function.showToast(this, getResources().getString(R.string.error_unmatch_password));

        } else {

            firebaseAuth.createUserWithEmailAndPassword(email, repassword).addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                    if (!task.isSuccessful()) {

                        Function.showToast(RegisterActivity.this, getResources().getString(R.string.error_register));


                    } else {

                        Function.showToast(RegisterActivity.this, getResources().getString(R.string.success_register));

                        Intent goLogin = new Intent(RegisterActivity.this, LoginActivity.class );
                        startActivity(goLogin);

                    }

                }
            });

        }


    }


}
