package com.jhonssantiago.sistemasolar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlanetActivity extends AppCompatActivity {
    private ListView listView_itens;
    private MyAdapter myAdapter;
    private ArrayList<Planeta> planetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet);

        Intent i = getIntent();
        int imagem = i.getIntExtra("imagem", 0);
        String nome = i.getStringExtra("nome");
        String c1 = i.getStringExtra("c1");
        String c2 = i.getStringExtra("c2");
        String c3= i.getStringExtra("c3");
        planetas = new ArrayList<>();


        Planeta b = new Planeta(imagem, nome, c1, c2, c3);
        planetas.add(b);

        listView_itens = findViewById(R.id.planeta);
        myAdapter = new MyAdapter(getApplicationContext(), planetas);
        listView_itens.setAdapter(myAdapter);
    }
}