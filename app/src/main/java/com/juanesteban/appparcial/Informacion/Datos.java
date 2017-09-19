package com.juanesteban.appparcial.Informacion;

/**
 * Created by Juanesteban on 19/09/2017.
 */

public class Datos {

    private String nombre;
    private String rival;
    private String fecha;
    private String local;
    private String visita;
    private String apuesta;
    private String apostador;




    public Datos(String nombre, String rival, String local, String fecha , String visita, String apuesta, String apostador) {
        this.nombre = nombre;
        this.rival = rival;
        this.local = local;
        this.visita = visita;
        this.apuesta = apuesta;
        this.apostador = apostador;
        this.fecha = fecha;


    }

    public Datos() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRival() {
        return rival;
    }

    public void setRival(String rival) {
        this.rival = rival;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getVisita() {
        return visita;
    }

    public void setVisita(String visita) {
        this.visita = visita;
    }

    public String getApuesta() {
        return apuesta;
    }

    public void setApuesta(String apuesta) {
        this.apuesta = apuesta;
    }

    public String getApostador() {
        return apostador;
    }

    public void setApostador(String apostador) {
        this.apostador = apostador;
    }
}
