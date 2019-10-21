package com.carlesramos.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    private Button bt0;
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Button bt5;
    private Button bt6;
    private Button bt7;
    private Button bt8;
    private Button bt9;
    private Button btPunto;
    private Button btIgual;
    private Button btSumar;
    private Button btRestar;
    private Button btMultiplicar;
    private Button btDividir;
    private Button btModulo;
    private Button btMasDivMenos;
    private Button btCE;
    private TextView tvResultado;
    private StringBuilder sb;
    private ArrayList<String> alResultado;
    private StringBuilder number;
    private float resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt0 = findViewById(R.id.bt0);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
        btPunto = findViewById(R.id.btPunt);
        btIgual = findViewById(R.id.btIgual);
        btSumar = findViewById(R.id.btSumar);
        btRestar = findViewById(R.id.btRestar);
        btMultiplicar = findViewById(R.id.btMultiplicar);
        btDividir = findViewById(R.id.btDividir);
        btModulo = findViewById(R.id.btModulo);
        btMasDivMenos = findViewById(R.id.btMasDivMenos);
        btCE= findViewById(R.id.btCE);
        tvResultado = findViewById(R.id.tvResultado);
        sb = new StringBuilder();
        alResultado = new ArrayList<>();
        number = new StringBuilder();

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                switch (id) {
                    case R.id.bt0:
                        sb.append("0");
                        tvResultado.setText(sb);
                        break;
                    case R.id.bt1:
                        sb.append("1");
                        alResultado.add("1");
                        tvResultado.setText(sb);
                        break;
                    case R.id.bt2:
                        tvResultado.setText("2");
                        break;
                    case R.id.bt3:
                        tvResultado.setText("3");
                        break;
                    case R.id.bt4:
                        tvResultado.setText("4");
                        break;
                    case R.id.bt5:
                        tvResultado.setText("5");
                        break;
                    case R.id.bt6:
                        tvResultado.setText("6");
                        break;
                    case R.id.bt7:
                        tvResultado.setText("7");
                        break;
                    case R.id.bt8:
                        tvResultado.setText("8");
                        break;
                    case R.id.bt9:
                        tvResultado.setText("9");
                        break;
                    case R.id.btPunt:
                        break;
                    case R.id.btIgual:
                        for (String s : alResultado) {
                            number.append(s);
                            int num;
                            if (s.charAt(0) == '+'){

                            }
                        }
                        tvResultado.setText(String.valueOf(resultado));
                        resultado = 0;
                        break;
                    case R.id.btSumar:
                        tvResultado.setText("");
                        alResultado.add(sb.toString());
                        alResultado.add("+");
                        sb = new StringBuilder();
                        break;
                    case R.id.btRestar:
                        break;
                    case R.id.btMultiplicar:
                        break;
                    case R.id.btDividir:
                        break;
                    case R.id.btModulo:
                        break;
                    case R.id.btMasDivMenos:
                        break;
                    case R.id.btCE:
                        break;
                }
            }
        };
        bt0.setOnClickListener(listener);
        bt1.setOnClickListener(listener);
        bt2.setOnClickListener(listener);
        bt3.setOnClickListener(listener);
        bt4.setOnClickListener(listener);
        bt5.setOnClickListener(listener);
        bt6.setOnClickListener(listener);
        bt7.setOnClickListener(listener);
        bt8.setOnClickListener(listener);
        bt9.setOnClickListener(listener);
        btPunto.setOnClickListener(listener);
        btIgual.setOnClickListener(listener);
        btSumar.setOnClickListener(listener);
        btRestar.setOnClickListener(listener);
        btMultiplicar.setOnClickListener(listener);
        btDividir.setOnClickListener(listener);
        btModulo.setOnClickListener(listener);
        btMasDivMenos.setOnClickListener(listener);
        btCE.setOnClickListener(listener);
    }
}
