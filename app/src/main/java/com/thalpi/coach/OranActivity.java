package com.thalpi.coach;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OranActivity extends AppCompatActivity {

    private EditText boy,kg;
    private TextView sonc;
    private Button Hesapla;
    private int s2;
    private double s1,son;
    private String sayı1,sayı2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oran);

        sonc=(TextView)findViewById(R.id.sonuçç);
        boy=(EditText)findViewById(R.id.EditBoy);
        kg=(EditText)findViewById(R.id.EditKg);
        Hesapla=(Button)findViewById(R.id.btnHesap);

        Hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayı1=boy.getText().toString();
                sayı2=kg.getText().toString();

                s1=Double.valueOf(sayı1);
                s2=Integer.valueOf(sayı2);


                son=s2/(s1*s1);

                if (!TextUtils.isEmpty(sayı1) & !TextUtils.isEmpty(sayı2))
                {
                   if (son<18) {
                       sonc.setText("ZAYIF"+son);


                   }
                    if (son>18 & son<25 ) {
                        sonc.setText("NORMAL : " + son);
                    }
                    if (son>25) {
                        sonc.setText("OBEZ : " + son);
                    }

                }


            }
        });



    }
}