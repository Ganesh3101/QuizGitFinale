package com.example.quizgitfinale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bgk,bvg,bm,bg,bs,bv,bf,bco,bcomp,bmath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bgk = findViewById(R.id.button);
        bvg = findViewById(R.id.button2);
        bm = findViewById(R.id.button3);
        bg = findViewById(R.id.button4);
        bs = findViewById(R.id.button5);
        bf = findViewById(R.id.button6);
        bv = findViewById(R.id.button7);
        bco = findViewById(R.id.button8);
        bcomp =findViewById(R.id.button9);
        bmath = findViewById(R.id.button10);

   bvg.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, SelectionVideoGames.class);
        startActivity(intent);
    }
});

        bco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelectionTv.class);
                startActivity(intent);
            }
        });

        bv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelectionComputer.class);
                startActivity(intent);
            }
        });

        bgk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelectionGk.class);
                startActivity(intent);
            }
        });

        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelectionAnime.class);
                startActivity(intent);
            }
        });

        bcomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelectionComputer.class);
                startActivity(intent);
            }
        });

        bf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelectionFilm.class);
                startActivity(intent);
            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelectionMusic.class);
                startActivity(intent);
            }
        });
    }
}