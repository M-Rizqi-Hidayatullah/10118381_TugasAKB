package com.example.a10118381_tugas1akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registrasi extends AppCompatActivity {
    //6-04-2021-10118381-Muhammad Rizqi Hidayatullah-IF9

    private Button btnsimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        btnsimpan = findViewById(R.id.login);


        btnsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registrasi.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}