package com.hardsoftday.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    TextView _recibeNumero1, _recibeNumero2, _texto, _resultado;
    Button _btnVolver;

    int n1, n2, r;
    String operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        _recibeNumero1 = findViewById(R.id.recibeNumero1);
        _recibeNumero2 = findViewById(R.id.recibeNumero2);
        _texto = findViewById(R.id.texto);
        _resultado = findViewById(R.id.resultado);

        _btnVolver = findViewById(R.id.btnCalcular);

        n1 = Integer.parseInt(getIntent().getExtras().getString("numero1"));
        n2 = Integer.parseInt(getIntent().getExtras().getString("numero2"));
        operacion = getIntent().getExtras().getString("operacion");

        switch (operacion) {
            case  "suma":
                r = n1 + n2;
        }

    }
}