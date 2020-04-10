package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btncalc;
    private Button btnimc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnimc = (Button) findViewById(R.id.btnimc);
        btnimc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImc();
            }
        });

        btncalc = (Button) findViewById(R.id.btncalc);
        btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalc();
            }
        });
    }

    public void openCalc() {
        Intent intent = new Intent(this, Calculadora.class);
        startActivity(intent);
    }
    public void openImc() {
        Intent intent = new Intent(this, Imc.class);
        startActivity(intent);
    }
}
