package com.juanesteban.appparcial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.juanesteban.appparcial.Equipos.AguilasActivity;
import com.juanesteban.appparcial.Equipos.AlianzaActivity;
import com.juanesteban.appparcial.Equipos.AmericaActivity;
import com.juanesteban.appparcial.Equipos.BucaramangaActivity;
import com.juanesteban.appparcial.Equipos.CaldasActivity;
import com.juanesteban.appparcial.Equipos.CaliActivity;
import com.juanesteban.appparcial.Equipos.CortuluaActivity;
import com.juanesteban.appparcial.Equipos.EnvigadoActivity;
import com.juanesteban.appparcial.Equipos.EquidadActivity;
import com.juanesteban.appparcial.Equipos.HuilaActivity;
import com.juanesteban.appparcial.Equipos.JaguaresActivity;
import com.juanesteban.appparcial.Equipos.JuniorActivity;
import com.juanesteban.appparcial.Equipos.MedellinActivity;
import com.juanesteban.appparcial.Equipos.MillonariosActivity;
import com.juanesteban.appparcial.Equipos.NacionalActivity;
import com.juanesteban.appparcial.Equipos.PastoActivity;
import com.juanesteban.appparcial.Equipos.PatriotasActivity;
import com.juanesteban.appparcial.Equipos.SantafeActivity;
import com.juanesteban.appparcial.Equipos.TigresActivity;
import com.juanesteban.appparcial.Equipos.TolimaActivity;
import com.juanesteban.appparcial.Informacion.Datos;

import java.util.ArrayList;

public class LocalActivity extends AppCompatActivity {

    public static ArrayList<Datos> datos =new ArrayList<>();

    Button btnNacional;
    Button btnMedellin;
    Button btnAguilas;
    Button btnCortulua;
    Button btnAmerica;
    Button btnBucaramanga;
    Button btnMillonarios;
    Button btnCali;
    Button btnHuila;
    Button btnJaguares;
    Button btnJunior;
    Button btnCaldas;
    Button btnTolima;
    Button btnPatriotas;
    Button btnPasto;
    Button btnEnvigado;
    Button btnAlianza;
    Button btnSantafe;
    Button btnEquidad;
    Button btnTigres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);

        btnNacional = (Button) findViewById(R.id.btnNacional);
        btnMedellin = (Button) findViewById(R.id.btnMedellin);
        btnAguilas = (Button) findViewById(R.id.btnAguilas);
        btnCortulua = (Button) findViewById(R.id.btnCortulua);
        btnAmerica = (Button) findViewById(R.id.btnAmerica);
        btnBucaramanga = (Button) findViewById(R.id.btnBucaramanga);
        btnMillonarios = (Button) findViewById(R.id.btnMillonarios);
        btnCali = (Button) findViewById(R.id.btnCali);
        btnHuila = (Button) findViewById(R.id.btnHuila);
        btnJaguares = (Button) findViewById(R.id.btnJaguares);
        btnJunior = (Button) findViewById(R.id.btnJunior);
        btnCaldas = (Button) findViewById(R.id.btnCaldas);
        btnTolima = (Button) findViewById(R.id.btnTolima);
        btnPatriotas = (Button) findViewById(R.id.btnPatriotas);
        btnPasto = (Button) findViewById(R.id.btnPasto);
        btnEnvigado = (Button) findViewById(R.id.btnEnvigado);
        btnAlianza = (Button) findViewById(R.id.btnAlianza);
        btnSantafe = (Button) findViewById(R.id.btnSantafe);
        btnEquidad = (Button) findViewById(R.id.btnEquidad);
        btnTigres = (Button) findViewById(R.id.btnTigres);


/**
 * Botón Atlético Nacional
 */
        btnNacional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnNacional = new Intent(LocalActivity.this, NacionalActivity.class);
                startActivity(btnNacional);
            }
        });



/**
 * Botón Deportivo Independiente Medellín
 */
        btnMedellin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnMedellin = new Intent(LocalActivity.this, MedellinActivity.class);
                startActivity(btnMedellin);
            }
        });



/**
 * Botón Aguilas
 */
        btnAguilas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnAguilas = new Intent(LocalActivity.this, AguilasActivity.class);
                startActivity(btnAguilas);
            }
        });




        /**
         * Botón Cortuluá
         */
        btnCortulua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnCortulua = new Intent(LocalActivity.this, CortuluaActivity.class);
                startActivity(btnCortulua);
            }
        });

        /**
         * Botón América de Cali
         */
        btnAmerica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnAmerica = new Intent(LocalActivity.this, AmericaActivity.class);
                startActivity(btnAmerica);
            }
        });

        /**
         * Botón Bucaramanga
         */
        btnBucaramanga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnBucaramanga = new Intent(LocalActivity.this, BucaramangaActivity.class);
                startActivity(btnBucaramanga);
            }
        });


        /**
         * Botón Millonarios
         */
        btnMillonarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnMillonarios = new Intent(LocalActivity.this, MillonariosActivity.class);
                startActivity(btnMillonarios);
            }
        });


        /**
         * Botón Cali
         */
        btnCali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnCali = new Intent(LocalActivity.this, CaliActivity.class);
                startActivity(btnCali);
            }
        });



        /**
         * Botón Huila
         */
        btnHuila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnHuila = new Intent(LocalActivity.this, HuilaActivity.class);
                startActivity(btnHuila);
            }
        });


        /**
         * Botón Jaguares
         */
        btnJaguares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnJaguares = new Intent(LocalActivity.this, JaguaresActivity.class);
                startActivity(btnJaguares);
            }
        });


        /**
         * Botón Junior
         */
        btnJunior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnJunior = new Intent(LocalActivity.this, JuniorActivity.class);
                startActivity(btnJunior);
            }
        });



        /**
         * Botón Caldas
         */
        btnCaldas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnCaldas = new Intent(LocalActivity.this, CaldasActivity.class);
                startActivity(btnCaldas);
            }
        });


        /**
         * Botón Tolima
         */
        btnTolima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnTolima = new Intent(LocalActivity.this, TolimaActivity.class);
                startActivity(btnTolima);
            }
        });



        /**
         * Botón Patriotas
         */
        btnPatriotas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnPatriotas = new Intent(LocalActivity.this, PatriotasActivity.class);
                startActivity(btnPatriotas);
            }
        });



        /**
         * Botón Pasto
         */
        btnPasto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnPasto = new Intent(LocalActivity.this, PastoActivity.class);
                startActivity(btnPasto);
            }
        });



        /**
         * Botón Envigado
         */
        btnEnvigado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnEnvigado = new Intent(LocalActivity.this, EnvigadoActivity.class);
                startActivity(btnEnvigado);
            }
        });


        /**
         * Botón Alianza Petrolera
         */
        btnAlianza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnAlianza = new Intent(LocalActivity.this, AlianzaActivity.class);
                startActivity(btnAlianza);
            }
        });


        /**
         * Botón Santafe
         */
        btnSantafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnSantafe = new Intent(LocalActivity.this, SantafeActivity.class);
                startActivity(btnSantafe);
            }
        });



        /**
         * Botón Equidad
         */
        btnEquidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnEquidad = new Intent(LocalActivity.this, EquidadActivity.class);
                startActivity(btnEquidad);
            }
        });



        /**
         * Botón Tigres
         */
        btnTigres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnTigres = new Intent(LocalActivity.this, TigresActivity.class);
                startActivity(btnTigres);
            }
        });


    }
}
