package com.cmc.curso.primergit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText tvTexto01;
    private EditText tvTexto02;
    private Button btnValidar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        atarComponentes();
        btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validar();
            }
        });

    }

    public void atarComponentes() {
        tvTexto01 = findViewById(R.id.et01);
        tvTexto02 = findViewById(R.id.et02);
        btnValidar = findViewById(R.id.btnValidar);
    }

    public boolean validar() {
        boolean correcto = true;

        if (tvTexto01.getText() != null && tvTexto01.getText().toString().isEmpty()) {
            tvTexto01.requestFocus();
            tvTexto01.setError("El Valor del texto 01 es obligatorio");
            correcto = false;
        } else {
            if (tvTexto02.getText() != null && tvTexto02.getText().toString().isEmpty()) {
                tvTexto02.requestFocus();
                tvTexto02.setError("El Valor del texto 02 es obligatorio");
                correcto = false;
            }else
                Toast.makeText(this,"Se encuentra validado",Toast.LENGTH_LONG).show();
        }

        return correcto;
    }

}
