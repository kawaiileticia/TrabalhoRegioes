package com.leticiasoares.trabalho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityRegioes extends AppCompatActivity {

    private TextView tvRegiao;
    private ImageView ivEsquerda, ivDireita;
    private String tipo;
    private String[] regioes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regioes);
    }
}
