package com.juanesteban.appparcial.Adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.juanesteban.appparcial.Informacion.Datos;
import com.juanesteban.appparcial.R;

import java.util.ArrayList;

/**
 * Created by Juanesteban on 19/09/2017.
 */

public class Adapter extends ArrayAdapter<Datos> {

    private Activity context;
    private int id;
    ArrayList<Datos> array;

    public Adapter(Activity context, int resource, ArrayList<Datos> objects) {
        super(context, resource, objects);
        this.context = context;
        this.id = resource;
        this.array = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            convertView = inflater.inflate(id, null);
        }
        final Datos datos = array.get(position);

        TextView nombreEquipos = (TextView) convertView.findViewById(R.id.nombreEquipo);
        TextView nombreRivales = (TextView) convertView.findViewById(R.id.nombreRival);
        TextView nombreApostador = (TextView) convertView.findViewById(R.id.apostador);
        TextView golLocal = (TextView) convertView.findViewById(R.id.local);
        TextView golVisita = (TextView) convertView.findViewById(R.id.visita);
        TextView Apuesta = (TextView) convertView.findViewById(R.id.valor);
        TextView laFechaAsignada = (TextView) convertView.findViewById(R.id.fecha);


        nombreEquipos.setText(datos.getNombre());
        nombreRivales.setText(datos.getRival());
        nombreApostador.setText(datos.getApostador());
        golLocal.setText(datos.getLocal());
        golVisita.setText(datos.getVisita());
        Apuesta.setText(datos.getApuesta());
        laFechaAsignada.setText(datos.getFecha());


        return convertView;
    }


}
