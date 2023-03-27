package com.example.sayitahminoyunu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView TahminText;
    Button ButonBasla;
    Button button3;
   public EditText editTextTextPersonName;
    ImageView imageView;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TahminText = findViewById(R.id.TahminText);
        ButonBasla= findViewById(R.id.ButonBasla);
        button3=findViewById(R.id.button3);
        imageView=findViewById(R.id.imageView);
        editTextTextPersonName=findViewById(R.id.editTextTextPersonName);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.setBackgroundTintList(button3, ColorStateList.valueOf(Color.parseColor("#00FF0D")));
                startActivity(new Intent(MainActivity.this,HakkindaActivity.class));

            }
        });

        ButonBasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.setBackgroundTintList(ButonBasla, ColorStateList.valueOf(Color.parseColor("#00FF0D")));
                if (TextUtils.isEmpty(editTextTextPersonName.getText().toString())){
                    editTextTextPersonName.setError("BU ALAN BOŞ BIRAKILAMAZ!!");
                    return;
                }
                Intent i = new Intent(MainActivity.this,SecimActivity.class);
                str = editTextTextPersonName.getText().toString();//buradaki işlemde Edittexti stringe çevirip
                i.putExtra("Value",str);                    // girdiğimiz kullanıcı adını geçiş yaptığımız sayfaya yazdırdık.
                startActivity(i);                                // (SecimActivity)
                finish();


            }
        });
        editTextTextPersonName.setText("");






    }
}