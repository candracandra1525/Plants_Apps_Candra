package com.mdp.plants_apps_candra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private EditText Et_Fullname, Et_Email, Et_Pass, Et_ConfirmPass;
    private Button Btn_SignUp, Btn_back_register;
    private TextView Tv_Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Et_Fullname = findViewById(R.id.et_fullname);
        Et_Email = findViewById(R.id.et_fullname);
        Et_Pass = findViewById(R.id.et_pass);
        Et_ConfirmPass = findViewById(R.id.et_konfirmpass);
        Btn_back_register = findViewById(R.id.btn_back_register);
        Btn_back_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Btn_SignUp = findViewById(R.id.btn_signup);
        Btn_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullname, email, pass, konfirmpass;
                fullname = Et_Fullname.getText().toString();
                email = Et_Email.getText().toString();
                pass = Et_Pass.getText().toString();
                konfirmpass = Et_ConfirmPass.getText().toString();

                if(fullname.trim().equals(""))
                {
                    Et_Fullname.setError("Full Name Belum di Isi !");
                }
                else if(email.trim().equals(""))
                {
                    Et_Email.setError("Email belum di Isi !");
                }
                else if(pass.trim().equals(""))
                {
                    Et_Pass.setError("Password belum di Isi !");
                }
                else if(konfirmpass.trim().equals(""))
                {
                    Et_ConfirmPass.setError("Konfirmasi Password belum di Isi !");
                }
                else
                {
                    if(pass != konfirmpass)
                    {
                        Toast.makeText(RegisterActivity.this, "Password Don't Match !", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(RegisterActivity.this, "Congratulation, Your Account is Registered !", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                        startActivity(intent);
                    }
                }
            }
        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


    }
}