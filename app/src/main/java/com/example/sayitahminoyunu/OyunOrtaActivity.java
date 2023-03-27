package com.example.sayitahminoyunu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class OyunOrtaActivity extends AppCompatActivity {

    int sayac=5;
    Button ButonTahminEt;
    TextView TextKalanHak;
    EditText EditTextSayi;
    int BilSayi;
    TextView TextArtAz;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyun_temel);

        ButonTahminEt = findViewById(R.id.ButonTahminEt);
        TextKalanHak = findViewById(R.id.TextKalanHak);
        EditTextSayi= findViewById(R.id.EditTextSayi);
        TextArtAz=findViewById(R.id.TextArtAz);


        Random R = new Random();
        BilSayi = R.nextInt(51); //0-50


        ButonTahminEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.setBackgroundTintList(ButonTahminEt, ColorStateList.valueOf(Color.parseColor("#00FF0D")));



                if (TextUtils.isEmpty(EditTextSayi.getText().toString())){
                    EditTextSayi.setError("BU ALAN BOŞ BIRAKILAMAZ!!");
                    return;
                } //    Boş Kalır İse Uyarı ver.
                int tahmin = Integer.parseInt(EditTextSayi.getText().toString()); //EditTexti inte çevirdik.
                if(tahmin<0 || tahmin>50){
                    EditTextSayi.setError("LÜTFEN 0 İLE 50 ARASINDA BİR SAYI GİRİNİZ!!");
                }
                if(tahmin==BilSayi){
                    startActivity(new Intent(OyunOrtaActivity.this,KazandinActivity.class));
                    finish();
                    return;
                }

                if(tahmin<BilSayi && tahmin>0 && tahmin<50){
                    sayac --;
                    TextArtAz.setText("ARTTIR");
                    TextKalanHak.setText("KALAN HAK:"+sayac);

                }
                if(tahmin>BilSayi && tahmin>0 && tahmin<50){
                    sayac --;
                    TextArtAz.setText("AZALT");
                    TextKalanHak.setText("KALAN HAK:"+sayac);
                }
                if(sayac==0 && tahmin!=BilSayi){

                    startActivity(new Intent(OyunOrtaActivity.this,KaybettinActivity.class));
                }
                if(sayac==0 && tahmin==BilSayi)
                {
                    startActivity(new Intent(OyunOrtaActivity.this,KazandinActivity.class));
                }



                EditTextSayi.setText("");

            }



        });


    }

}