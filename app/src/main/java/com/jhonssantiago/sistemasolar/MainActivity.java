package com.jhonssantiago.sistemasolar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ListView listView_itens;
    private ArrayList<String> lista_dados;
    private ArrayAdapter adapter;
    private ArrayList<Planeta> planetas_l;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView_itens = findViewById(R.id.listView_itens);
        preencherLista();
        criarLista();
        preencherAdapter();
        listView_itens.setOnItemClickListener(this);
    }

    private void preencherLista(){
        lista_dados = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.planetas)));
    }

    private void criarLista() {
        planetas_l = new ArrayList<>();
    //    Planeta b1 = new Planeta(R.drawable.mercurio, "Mercúrio", "1", "2", "3");
        Planeta b1 = new Planeta(R.drawable.mercury, lista_dados.get(0).toString(), "Duração do dia: 58d 15h 30m", "Temperatura: média: 166,85 ºC; mínima: -183,15 ºC; máxima: 426,85 ºC", "Mercúrio é o menor e mais interno planeta do Sistema Solar, orbitando o Sol a cada 87,969 dias terrestres. A sua órbita tem a maior excentricidade e o seu eixo apresenta a menor inclinação em relação ao plano da órbita dentre todos os planetas do Sistema Solar");
        Planeta b2 = new Planeta(R.drawable.venus, lista_dados.get(1).toString(), "Duração do dia: 116d 18h 0m", "Temperatura: média: 461 ºC", "Vênus é o segundo planeta do Sistema Solar em ordem de distância a partir do Sol, orbitando-o a cada 224,7 dias. Recebeu seu nome em homenagem à deusa romana do amor e da beleza Vénus, equivalente a Afrodite");
        Planeta b3 = new Planeta(R.drawable.terra, lista_dados.get(2).toString(), "Duração do dia: 23h 56m", "Temperatura: média: 14 ºC; mínima: -60 ºC; máxima: +45 ºC", "A Terra é o terceiro planeta mais próximo do Sol, o mais denso e o quinto maior dos oito planetas do Sistema Solar. É também o maior dos quatro planetas telúricos. É por vezes designada como Mundo ou Planeta Azul. Lar de milhões de espécies de seres vivos, incluindo os humanos, a Terra é o único corpo celeste onde é conhecida a existência de vida");
        Planeta b4 = new Planeta(R.drawable.marte, lista_dados.get(3).toString(), "Duração do dia: 1d 0h 37m", "Temperatura: média: -60 ºC; mínima: -140 ºC; máxima: 25 ºC", "Marte é o quarto planeta a partir do Sol, o segundo menor do Sistema Solar. Batizado em homenagem ao deus romano da guerra, muitas vezes é descrito como o Planeta Vermelho, porque o óxido de ferro predominante em sua superfície lhe dá uma aparência avermelhada.");
        Planeta b5 = new Planeta(R.drawable.jupiter, lista_dados.get(4).toString(), "Duração do dia: 9,8h m", "Temperatura: média: -108 ºC", "Júpiter é o maior planeta do Sistema Solar, tanto em diâmetro quanto em massa, e é o quinto mais próximo do Sol. Possui menos de um milésimo da massa solar, contudo tem 2,5 vezes a massa de todos os outros planetas em conjunto. É um planeta gasoso, junto com Saturno, Urano e Netuno.");
        Planeta b6 = new Planeta(R.drawable.saturno, lista_dados.get(5).toString(), "Duração do dia: 10h 34m", "Temperatura: média: -139 ºC", "Saturno é o sexto planeta a partir do Sol e o segundo maior do Sistema Solar atrás de Júpiter. Pertencente ao grupo dos gigantes gasosos, possui cerca de 95 massas terrestres e orbita a uma distância média de 9,5 unidades astronômicas");
        Planeta b7 = new Planeta(R.drawable.urano, lista_dados.get(6).toString(), "Duração do dia: −0,718 33d 17h 14m 24 s", "Temperatura: média: -220 ºC", "Urano é o sétimo planeta a partir do Sol, o terceiro maior e o quarto mais massivo dos oito planetas do Sistema Solar. Foi nomeado em homenagem ao deus grego do céu, Urano.");
        Planeta b8 = new Planeta(R.drawable.netuno, lista_dados.get(7).toString(), "Duração do dia: 0,6713d 16h 6m 36 s", "Temperatura: média: -223,15 ºC", "Netuno ou Neptuno é o oitavo planeta do Sistema Solar, o último a partir do Sol desde a reclassificação de Plutão para a categoria de planeta anão, em 2006. Pertencente ao grupo dos gigantes gasosos, possui um tamanho ligeiramente menor que o de Urano, mas maior massa, equivalente a 17 massas terrestres");
        planetas_l.add(b1);
        planetas_l.add(b2);
        planetas_l.add(b3);
        planetas_l.add(b4);
        planetas_l.add(b5);
        planetas_l.add(b6);
        planetas_l.add(b7);
        planetas_l.add(b8);
    }

    private void preencherAdapter(){
        adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, planetas_l);
        listView_itens.setAdapter(adapter);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
      // String item = (String) adapterView.getItemAtPosition(position);
       // Planeta b = (Planeta) adapterView.getItemAtPosition(position);
        Planeta b = (Planeta) adapter.getItem(position);

        Intent it = new Intent(getApplicationContext(), PlanetActivity.class);
        it.putExtra("imagem", b.getImagem());
        it.putExtra("nome", b.getNome());
        it.putExtra("c1", b.getC1());
        it.putExtra("c2", b.getC2());
        it.putExtra("c3", b.getC3());
        startActivity(it);
      //  Toast.makeText(getApplicationContext(), b.toString(), Toast.LENGTH_SHORT).show();
    }



}