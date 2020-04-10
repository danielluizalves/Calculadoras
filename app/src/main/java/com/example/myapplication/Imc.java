package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Imc extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        final float[] imc = new float[1];
        Button btCalcular = (Button) findViewById(R.id.btCalcular);
        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editPeso = (TextView) findViewById(R.id.editPeso);
                TextView editAltura = (TextView) findViewById(R.id.editAltura);
                TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
                TextView tvDescrição = (TextView) findViewById(R.id.tvDescricao);
                float peso = Float.parseFloat(editPeso.getText().toString());
                float altura = Float.parseFloat(editAltura.getText().toString());
                imc[0] = peso / (altura * altura);
                if (imc[0] < 18.5) {
                    tvResultado.setText(imc[0] + "");
                    tvDescrição.setText("Baixo peso");
                } else {
                    if (imc[0] < 25) {
                        tvResultado.setText(imc[0] + "");
                        tvDescrição.setText("Peso adequado");
                    } else {
                        if (imc[0] < 30) {
                            tvResultado.setText(imc[0] + "");
                            tvDescrição.setText("Sobrepeso");
                        } else {
                            tvResultado.setText(imc[0] + "");
                            tvDescrição.setText("Obesidade");
                        }
                    }
                }

            }
        });
    }
}