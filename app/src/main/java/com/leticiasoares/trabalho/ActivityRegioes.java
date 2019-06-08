package com.leticiasoares.trabalho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActivityRegioes extends AppCompatActivity {

    private ImageView ivEsquerda, ivDireita;
    private String[][] estados;
    private String[] regioes;

    private int contadorRegioes;
    private int contadorEstados;
    private LinearLayout layout;
    private TextView tvRegioes;
    private TextView tvEstados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regioes);


        tvRegioes = (TextView) findViewById(R.id.tvRegioes);
        tvEstados = (TextView) findViewById(R.id.tvEstados);
        layout = (LinearLayout) findViewById(R.id.layout);


        regioes = new String[]{
                "Norte", "Nordeste", "Sul", "Sudeste", "Centro-oeste"};

        estados = new String[][]{
                {"Acre", "Amapa", "Amazonas", "Pará", "Rondônia", "Roraima", "Tocantins"},
                {"Alagoas", "Bahia", "Ceará", "Maranhão", "Paraíba", "Pernambuco", "Piauí"},
                {"Paraná", "Santa Catarina", "Rio Grande do Sul"},
                {"São Paulo", "Rio de Janeiro","Espírito Santo", "Minas Gerais"},
                {"Mato Grosso", "Mato Grosso do Sul", "Goiás", "Distrito Federal"}

        };

        tvRegioes.setText(regioes[contadorRegioes]);
        tvEstados.setText((estados[contadorRegioes][contadorEstados]));

        layout.setOnTouchListener (new OnSwipeTouchListener(this))
        {
            public void onSwipeTop() {
                super.onSwipeTop ();
                if (contadorRegioes >= regioes.length) {
                    contadorRegioes++;
                };

                tvRegioes.setText(regioes[contadorRegioes]);
                contadorEstados = 0;
                tvEstados.setText(estados[contadorRegioes][contadorEstados]);

            }
            public void onSwipeBottom() {
                super.onSwipeBottom();
                contadorRegioes++;
                if (contadorRegioes >= regioes.length) {
                    contadorRegioes = 0;
                }
                tvRegioes.setText(regioes[contadorRegioes]);
                contadorEstados = 0;
                tvEstados.setText(estados [contadorRegioes][contadorEstados]);
            }
            public void onSwipeLeft() {
                super.onSwipeLeft();
                if (contadorEstados >= estados.length) {
                    contadorEstados++;
                }
                tvEstados.setText(estados[contadorRegioes][contadorEstados]);
            }
            public void onSwipeRight() {
                super.onSwipeRight();
                if (contadorEstados >= estados.length) {
                    contadorEstados++;
                }
                tvEstados.setText(estados[contadorRegioes][contadorEstados]);
            }
        }
    }
}
