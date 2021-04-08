package com.example.a10118381_tugas1akb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ApplicationExitInfo;
import android.content.Intent;
import android.media.ExifInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //7-04-2021
    // 10118381
    // Muhammad Rizqi Hidayatullah
    // IF9

    private Button btnprofil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnprofil = findViewById(R.id.profil);

        btnprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });
    }
}