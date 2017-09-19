package com.juanesteban.appparcial.Equipos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.juanesteban.appparcial.R;

public class MedellinActivity extends AppCompatActivity {

    TextView tvNombreEquipo;
    EditText tvVisitante;
    EditText editText2;
    EditText etLocal;
    EditText etVisita;
    EditText etFecha;
    Button btnFecha;
    EditText etApuesta;
    Button btnAnadir;




    private int dia, mes, ano;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medellin);
    }
}
