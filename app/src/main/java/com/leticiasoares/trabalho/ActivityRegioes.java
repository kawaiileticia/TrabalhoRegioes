package com.leticiasoares.trabalho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActivityRegioes extends AppCompatActivity {

    private TextView tvRegiao;
    private ImageView ivEsquerda, ivDireita;
    private String [] estadosNorte;
    private String [] estadosNordeste;
    private String [] estadosSul;
    private String [] estadosSudeste;
    private String [] estadosCentroeste;
    private String [] regioes;

    private int contadorRegioes;
    private int contadorEstados;
    private LinearLayout layout;
    private TextView tvregioes;
    private TextView tvEstados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regioes);


        tvregioes = (TextView) findViewById(R.id.tvRegiao);
        tvEstados = (TextView) findViewById(R.id.tvEstados);
        layout = (LinearLayout)findViewById(R.id.layout);

        regioes = new String[] {
                "Norte",
                "Nordeste",
                "Sul" ,
                "Sudeste",
                "Centro-oeste",
        };

        estadosNorte = new String[] {
                "Acre",
                "Amapa",
                "Amazonas",
                "Pará",
                "Rondônia",
                "Roraima",
                "Tocantins"
        };

        estadosSul = new String [] {
                "Paraná",
                "Santa Catarina",
                "Rio Grande do Sul"
        };

        estadosSudeste = new String []{
                "Espirito Santo",
                "Minas",
                "Rio de Janeiro",
                "Sao Paulo",
        };
        estadosNordeste = new String[] {
                "Alagoas",
                "Bahia",
                "Ceará",
                "Maranhão",
                "Paraíba",
                "Pernambuco",
                "Piauí"
        };
        estadosCentroeste = new String[] {
                "Mato Grosso",
                "Mato Grosso do Sul",
                "Goiás",
                "Distrito Federal"
        };

        public void onSwipeTop(){}
        public void onSwipeBottom(){}
        public void onSwipeLeft(){
            super.onSwipeLeft();
            if(contadorEstados >= estados.length){
                contadorEstados ++;
            }tvEstados.setText( estados[contadorEstados);
        }
        public void onSwipeRight(){}
    }
}
