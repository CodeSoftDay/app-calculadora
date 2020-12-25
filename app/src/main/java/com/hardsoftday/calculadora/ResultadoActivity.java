package com.hardsoftday.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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

        _btnVolver = findViewById(R.id.btnVolver);

        n1 = Integer.parseInt(getIntent().getExtras().getString("numero1"));
        n2 = Integer.parseInt(getIntent().getExtras().getString("numero2"));
        operacion = getIntent().getExtras().getString("operacion");

        switch (operacion) {

            case "Suma":
                r = n1 + n2;
                break;
            case "Resta":
                r = n1 - n2;
                break;
            case "Multiplicación":
                r = n1 * n2;
                break;
            case "División":
                r = n1 / n2;
                break;
        }

        _texto.setText("La " + operacion + "es:");
        _resultado.setText(String.valueOf(r));

        _btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}