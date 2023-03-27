package com.example.sayitahminoyunu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HakkindaActivity extends AppCompatActivity {
   private Button button3;
   private TextView TemelSeviye, OrtaSeviye ,ZorSeviye;
   private TextView TemelBir, Temeliki, TemelUc;
   private TextView OrtaBir, Ortaiki,OrtaUc;
   private TextView ZorBir, Zoriki, ZorUc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hakkinda);

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.setBackgroundTintList(button3, ColorStateList.valueOf(Color.parseColor("#00FF0D")));
                startActivity(new Intent(HakkindaActivity.this,MainActivity.class));
                finish();
            }
        });



    }
}