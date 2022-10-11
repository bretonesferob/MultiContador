package com.example.multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int contadorGlobal;
    int contador1,contador2,contador3,contador4;

    TextView textoGlobal;
    Button resetGlobal;

    TextView texto1;
    TextView texto2;
    TextView texto3;
    TextView texto4;

    Button reset1;
    Button reset2;
    Button reset3;
    Button reset4;

    Button anadir1;
    Button anadir2;
    Button anadir3;
    Button anadir4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoGlobal = findViewById(R.id.textoglobal);
        texto1 = findViewById(R.id.texto1);
        texto2 = findViewById(R.id.texto2);
        texto3 = findViewById(R.id.texto3);
        texto4 = findViewById(R.id.texto4);
        resetGlobal = findViewById(R.id.resetglobal);
        reset1 = findViewById(R.id.reset1);
        reset2 = findViewById(R.id.reset2);
        reset3 = findViewById(R.id.reset3);
        reset4 = findViewById(R.id.reset4);
        anadir1 = findViewById(R.id.anadir1);
        anadir2 = findViewById(R.id.anadir2);
        anadir3 = findViewById(R.id.anadir3);
        anadir4 = findViewById(R.id.anadir4);

        anadir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorGlobal++;
                contador1++;
                texto1.setText(""+contador1);
                textoGlobal.setText(""+contadorGlobal);
            }

        });
        anadir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorGlobal++;
                contador2++;
                textoGlobal.setText(""+contadorGlobal);
                texto2.setText(""+contador2);
            }

        });
        anadir3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorGlobal++;
                contador3++;
                textoGlobal.setText(""+contadorGlobal);
                texto3.setText(""+contador3);
            }

        });
        anadir4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorGlobal++;
                contador4++;
                textoGlobal.setText(""+contadorGlobal);
                texto4.setText(""+contador4);
            }

        });

        resetGlobal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorGlobal=0;
                contador1 = 0;
                contador2 = 0;
                contador3 = 0;
                contador4 = 0;
                textoGlobal.setText(""+contadorGlobal);
                texto1.setText(""+contador1);
                texto2.setText(""+contador2);
                texto3.setText(""+contador3);
                texto4.setText(""+contador4);
            }
        });
        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1 = 0;
                texto1.setText(""+contador1);
            }
        });
        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador2 = 0;
                texto2.setText(""+contador2);
            }
        });
        reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador3 = 0;
                texto3.setText(""+contador3);
            }
        });
        reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador4 = 0;
                texto4.setText(""+contador4);
            }
        });




    }}