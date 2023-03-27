package com.example.sayitahminoyunu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SecimActivity extends AppCompatActivity{

    Button TemelGiris,OrtaGiris,ZorGiris;
    TextView Textisim,TextHosGeldiniz;
    ImageView imageView2;
    String str;
    Button SecimGeri;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secim);

        TemelGiris = findViewById(R.id.TemelGiris);
        OrtaGiris = findViewById(R.id.OrtaGiris);
        ZorGiris = findViewById(R.id.ZorGiris);
        Textisim = findViewById(R.id.Textisim);
        TextHosGeldiniz = findViewById(R.id.TextHosGeldiniz);
        imageView2=findViewById(R.id.imageView2);
        SecimGeri=findViewById(R.id.SecimGeri);

        str = getIntent().getExtras().getString("Value");
        Textisim.setText(str); //Mainden gelen edittexti yazdırdık.

        TemelGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.setBackgroundTintList(TemelGiris, ColorStateList.valueOf(Color.parseColor("#00FF0D")));

                startActivity(new Intent(SecimActivity.this,OyunTemelActivity.class));
                finish();
            }
        });
        OrtaGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.setBackgroundTintList(OrtaGiris, ColorStateList.valueOf(Color.parseColor("#00FF0D")));

                startActivity(new Intent(SecimActivity.this,OyunOrtaActivity.class));
                finish();
            }
        });
        ZorGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.setBackgroundTintList(ZorGiris, ColorStateList.valueOf(Color.parseColor("#00FF0D")));

                startActivity(new Intent(SecimActivity.this,OyunZorActivity.class));
                finish();
            }
        });

        SecimGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.setBackgroundTintList(SecimGeri, ColorStateList.valueOf(Color.parseColor("#00FF0D")));

                Intent i = new Intent(SecimActivity.this,MainActivity.class);
                startActivity(i);
            }
        });


    }
}