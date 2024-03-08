package com.example.tarefa01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import java.util.Random;

public class Tela04 extends AppCompatActivity {
    ConstraintLayout layoutTela;
    String[] cores;
    String corMostrada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela04);

        layoutTela = findViewById(R.id.bodyPagina04);
        cores = new String[]{"#f88484", "#84f884", "#8484f8"};
    }

    public void voltarTela02(View view) {
        Intent in = new Intent(Tela04.this, Tela03.class);
        startActivity(in);
    }

    public void mudarBody(View view){
        String cor = (String) view.getTag();
        layoutTela.setBackgroundColor(Color.parseColor(cor));
    }

    public void mudarBodyAleatorio(View view){
        String novaCor;
        do{
            int n = new Random().nextInt(3);
            novaCor = cores[n];
        }while (novaCor.equals(corMostrada) || novaCor.equals(layoutTela.getBackground()));

        corMostrada = novaCor;
        layoutTela.setBackgroundColor(Color.parseColor(novaCor));
    }
}