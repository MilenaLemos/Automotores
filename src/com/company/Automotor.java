package com.company;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Automotor {
    private boolean particular;
    private boolean profesional;
    private Propietario propietario;
    List<Autorizado> autorizados;
    private Integer patente;
    LocalDate fechaDeAlta;

    public Automotor(boolean particular, boolean profesional, Propietario propietario, List<Autorizado> autorizados, Integer patente, LocalDate fechaDeAlta) {
        this.particular = particular;
        this.profesional = profesional;
        this.propietario = propietario;
        this.autorizados = autorizados;
        this.patente = patente;
        this.fechaDeAlta = fechaDeAlta;
    }

    public boolean isParticular() {
        return particular;
    }

    public void setParticular(boolean particular) {
        this.particular = particular;
    }

    public boolean isProfesional() {
        return profesional;
    }

    public void setProfesional(boolean profesional) {
        this.profesional = profesional;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public List<Autorizado> getAutorizados() {
        return autorizados;
    }

    public void setAutorizados(List<Autorizado> autorizados) {
        this.autorizados = autorizados;
    }

    public Integer getPatente() {
        return patente;
    }

    public void setPatente() {
        Random patente = new Random(10000);
    }

    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(LocalDate fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    }
