package com.mdp.plants_apps_candra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText Et_Username, Et_Password;
    private Button Btn_Login, Btn_back_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Et_Username = findViewById(R.id.et_username);
        Et_Password = findViewById(R.id.et_password);

        Btn_back_login = findViewById(R.id.btn_login);
        Btn_back_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Btn_Login = findViewById(R.id.btn_login);
        Btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username, password;

                username = Et_Username.getText().toString();
                password = Et_Password.getText().toString();
                if(username.trim().equals(""))
                {
                    Et_Username.setError("Username Tidak Boleh Kosong");
                }
                else if(password.trim().equals(""))
                {
                    Et_Password.setError("Password Tidak Boleh Kosong");
                }
                else
                {
                    if(username.equals("Candra") && password.equals("2125250012"))
                    {
                        Toast.makeText(LoginActivity.this, "Selamat Anda Berhasil Login " + username, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(LoginActivity.this,"Username atau password salah !",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}