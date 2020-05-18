package com.example.calculadoracomlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtValor1, edtValor2;
    Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir;
    TextView txvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarObjetos();
        calcularSoma();
    }

    private void inicializarObjetos() {
        edtValor1 = findViewById(R.id.edtValor1);
        edtValor2 = findViewById(R.id.edtValor2);
        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        txvResultado = findViewById(R.id.txvResultado);
    }

    private void calcularSoma() {
        //coloca a ação no botão
        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //aqui começa a soma
                int v1 = Integer.parseInt(edtValor1.getText().toString());
                int v2 = Integer.parseInt(edtValor2.getText().toString());
                String resultado = String.valueOf(v1 + v2);
                txvResultado.setText("O valor da soma é: " + resultado);
            }
        });
    }

    private void calcularSubtrair() {
        //coloca a ação no botão
        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int v1 = Integer.parseInt(edtValor1.getText().toString());
                int v2 = Integer.parseInt(edtValor2.getText().toString());
                String resultado = String.valueOf(v1 - v2);
                txvResultado.setText("O valor da subtr é: " + resultado);
            }
        });
    }

    private void calcularMultiplicacao() {
        //coloca a ação no botão
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //aqui começa a soma
                int v1 = Integer.parseInt(edtValor1.getText().toString());
                int v2 = Integer.parseInt(edtValor2.getText().toString());
                String resultado = String.valueOf(v1 * v2);
                txvResultado.setText("O valor da mult é: " + resultado);
            }
        });
    }

    private void calcularDividir() {
        //coloca a ação no botão
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //aqui começa a soma
                int v1 = Integer.parseInt(edtValor1.getText().toString());
                int v2 = Integer.parseInt(edtValor2.getText().toString());
                String resultado = String.valueOf(v1 / v2);
                txvResultado.setText("O valor da divisão é: " + resultado);
            }
        });
    }




}
