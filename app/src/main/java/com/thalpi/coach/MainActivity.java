package com.thalpi.coach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button gogus,bacak,sırt,omuz,kol,arka,vkı,yağ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gogus=(Button)findViewById(R.id.btnGogus);
        bacak=(Button)findViewById(R.id.btnBacak);
        sırt=(Button)findViewById(R.id.btnSırt);
        omuz=(Button)findViewById(R.id.btnOmuz);
        kol=(Button)findViewById(R.id.btnBıceps);
        arka=(Button)findViewById(R.id.btnTrıceps);
        vkı=(Button)findViewById(R.id.btnVki);


        gogus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this ,GogusActvity.class);
                startActivity(intent);

            }
        });

        bacak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BacakActivity.class);
                startActivity(intent);
            }
        });

        sırt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SirtActivity.class);
                startActivity(intent);
            }
        });

        omuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,OmuzActivity.class);
                startActivity(intent);
            }
        });

        kol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,KolActivity.class);
                startActivity(intent);
            }
        });

        arka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ArkaActivity.class);
                startActivity(intent);
            }
        });

        vkı.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,OranActivity.class);
                startActivity(intent);
            }
        });

    }

}