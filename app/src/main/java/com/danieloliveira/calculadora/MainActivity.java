package com.danieloliveira.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    AppCompatButton somabtn, subtrairbtn, multiplicacaobtn, dividirbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        somabtn = findViewById(R.id.somabtn);
        subtrairbtn = findViewById(R.id.subtrairbtn);
        multiplicacaobtn = findViewById(R.id.multiplicacaobtn);
        dividirbtn = findViewById(R.id.divisaobtn);

        somabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crie uma Intent para iniciar a atividade soma_activity
                Intent intent = new Intent(MainActivity.this, soma_activity.class);
                startActivity(intent);
            }

        });

        subtrairbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, subtracao_activity.class);
                startActivity(intent);
            }
        });

        multiplicacaobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, multiplicacao_activity.class);
                startActivity(intent);
            }
        });

        dividirbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, divisao_activity.class);
                startActivity(intent);
            }
        });
    }
}