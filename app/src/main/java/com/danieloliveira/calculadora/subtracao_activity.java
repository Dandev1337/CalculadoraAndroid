package com.danieloliveira.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class subtracao_activity extends AppCompatActivity {

    EditText fstnumber, sndnumber;
    AppCompatButton equalbtn;
    TextView result;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtracao);
        fstnumber = findViewById(R.id.fstnumber);
        sndnumber = findViewById(R.id.sndnumber);
        equalbtn = findViewById(R.id.equalbtn);
        result = findViewById(R.id.result);

        equalbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String num1Str = fstnumber.getText().toString();
                String num2Str = sndnumber.getText().toString();

                // Verifique se os campos não estão vazios
                if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
                    // Converta as strings em números inteiros
                    int num1 = Integer.parseInt(num1Str);
                    int num2 = Integer.parseInt(num2Str);

                    // Realize a soma
                    int soma = num1 - num2;

                    // Exiba o resultado
                    result.setText(String.valueOf(soma));

                } else {
                    // Exiba uma mensagem de erro se um dos campos estiver vazio
                    Toast.makeText(getApplicationContext(), "Preencha ambos os campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}