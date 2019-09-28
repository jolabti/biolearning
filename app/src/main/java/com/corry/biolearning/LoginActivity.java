package com.corry.biolearning;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {


    FirebaseAuth firebaseAuth;
    AppCompatButton btnLogin;
    AppCompatEditText edtUsername, edtPassword;
    AppCompatButton btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();

        edtUsername = findViewById(R.id.login_edt_username_id);
        edtPassword = findViewById(R.id.login_edt_password_id);
        btnLogin = findViewById(R.id.login_button_id);

        btnRegister = findViewById(R.id.registrasi_button_id);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent gotoRegister = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(gotoRegister);
                finish();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                processLogin(edtUsername.getText().toString() == null ? "" : edtUsername.getText().toString().trim(), edtPassword.getText().toString() == null ? "" : edtPassword.getText().toString());

            }
        });
    }


    public void processLogin(String email, String password) {


        if (email.isEmpty() || email == null) {
            Function.showToast(LoginActivity.this, getResources().getString(R.string.error_email_empty));
        } else if (password.isEmpty() || password == null) {
            Function.showToast(LoginActivity.this, getResources().getString(R.string.error_email_empty));
        } else {

            firebaseAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful()) {

                                FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();



                                if (!firebaseUser.getEmail().isEmpty() || firebaseUser.getEmail() != null) {

                                    Function.showToast(LoginActivity.this, firebaseUser.getEmail());

                                    Intent gotoNavigasiUtama = new Intent(LoginActivity.this, NavigasiUtamaActivity.class);
                                    startActivity(gotoNavigasiUtama);

                                }


                            } else if (!task.isSuccessful()) {

                                Function.showToast(LoginActivity.this, getResources().getString(R.string.error_login));
                                Log.d("trace_failed", task.getResult().getUser().getEmail());
                                Log.d("trace_failed", task.getException().getMessage());

                            }

                        }
                    });
        }


    }
}
