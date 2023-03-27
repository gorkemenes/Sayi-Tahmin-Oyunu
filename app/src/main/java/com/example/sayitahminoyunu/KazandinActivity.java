package com.example.sayitahminoyunu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class KazandinActivity extends AppCompatActivity {
    ImageView imageView5,imageView6,imageView7;
    Button CikisBut,GeriDonBut;
    TextView TextKazan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kazandin);

        TextKazan = findViewById(R.id.TextKazan);
        CikisBut = findViewById(R.id.CikisBut);
        GeriDonBut= findViewById(R.id.GeriDonBut);
        imageView5 = findViewById(R.id.imageView5);
        imageView6= findViewById(R.id.imageView6);
        imageView7=findViewById(R.id.imageView7);

        GeriDonBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.setBackgroundTintList(GeriDonBut, ColorStateList.valueOf(Color.parseColor("#00FF0D")));
                startActivity(new Intent(KazandinActivity.this,MainActivity.class));
            }
        });
        CikisBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.setBackgroundTintList(CikisBut, ColorStateList.valueOf(Color.parseColor("#00FF0D")));
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
    }
}