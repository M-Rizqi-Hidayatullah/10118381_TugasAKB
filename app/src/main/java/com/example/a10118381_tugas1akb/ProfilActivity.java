package com.example.a10118381_tugas1akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfilActivity extends AppCompatActivity {

    //7-04-2021
    // 10118381
    // Muhammad Rizqi Hidayatullah
    // IF9

    private Button btnkembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        btnkembali = findViewById(R.id.kembali);

        btnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kembali1 = new Intent(ProfilActivity.this, ProfilActivity.class);
                startActivity(kembali1);
            }
        });
    }
}