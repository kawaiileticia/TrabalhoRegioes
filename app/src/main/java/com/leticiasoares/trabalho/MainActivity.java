package com.leticiasoares.trabalho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvregioes = (TextView) findViewById(R.id.tvRegiao);

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

        }//oncreate

    }
