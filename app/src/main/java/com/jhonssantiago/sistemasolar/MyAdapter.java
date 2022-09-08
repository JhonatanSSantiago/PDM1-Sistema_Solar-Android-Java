package com.jhonssantiago.sistemasolar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<Planeta> arrayListPlanetas;

    public MyAdapter(Context context, ArrayList<Planeta> arrayListPlanetas) {
        this.arrayListPlanetas = arrayListPlanetas;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return arrayListPlanetas.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayListPlanetas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Planeta p = arrayListPlanetas.get(position);

        view = inflater.inflate(R.layout.planeta_details, null); //view vazia

        TextView textViewTitulo = view.findViewById(R.id.textView_nome); //preenchendo view
        textViewTitulo.setText(p.getNome());
        ImageView image = view.findViewById(R.id.img_item);
        image.setImageResource(p.getImagem());
        TextView textViewCategoria = view.findViewById(R.id.textView_c1);
        textViewCategoria.setText(p.getC1());
        TextView textViewSinopse = view.findViewById(R.id.textView_c2);
        textViewSinopse.setText(p.getC2());
        TextView textViewPreco = view.findViewById(R.id.textView_c3);
        textViewPreco.setText(p.getC3());

        return view;
    }
}
