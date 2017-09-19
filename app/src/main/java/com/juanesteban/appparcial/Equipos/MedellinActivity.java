package com.juanesteban.appparcial.Equipos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.juanesteban.appparcial.Informacion.Datos;
import com.juanesteban.appparcial.LocalActivity;
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
        initComp();
        Datos dt=new Datos("asd","asd","","","","","");
        LocalActivity.datos.add(dt);
    }

    private void initComp() {
        tvNombreEquipo=(TextView) findViewById(R.id.tvNombreEquipo);
        tvVisitante=(EditText) findViewById(R.id.tvVisitante);
        editText2=(EditText) findViewById(R.id.editText2);
        etApuesta=(EditText) findViewById(R.id.etApuesta);
        etFecha=(EditText) findViewById(R.id.etFecha);
        etLocal=(EditText) findViewById(R.id.etLocal);
        etVisita=(EditText) findViewById(R.id.etVisita);
        btnFecha=(Button) findViewById(R.id.btnFecha);
        btnAnadir=(Button) findViewById(R.id.btnAnadir);
    }


}
