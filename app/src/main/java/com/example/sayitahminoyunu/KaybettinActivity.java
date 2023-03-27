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

public class KaybettinActivity extends AppCompatActivity {
    TextView textView;
    Button GeriDonBut,CikisBut;
    ImageView imageView3,imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaybettin);
        textView = findViewById(R.id.textView);
        GeriDonBut=findViewById(R.id.GeriDonBut);
        CikisBut=findViewById(R.id.CikisBut);
        imageView3=findViewById(R.id.imageView3);
        imageView4=findViewById(R.id.imageView4);






        GeriDonBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.setBackgroundTintList(GeriDonBut, ColorStateList.valueOf(Color.parseColor("#00FF0D")));
                startActivity(new Intent(KaybettinActivity.this,MainActivity.class));
            }

        });
        CikisBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.setBackgroundTintList(CikisBut, ColorStateList.valueOf(Color.parseColor("#00FF0D")));
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid()); //cıkıs yapmak için.
                System.exit(1);
            }
        });

    }

}