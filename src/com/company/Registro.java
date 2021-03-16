package com.company;

public class Registro {
    private String nombreDeSeccional;
    private Integer numeroDeSeccional;
    private Automotor automotor;

    public Registro(String nombreDeSeccional, Integer numeroDeSeccional, Automotor automotor) {
        this.nombreDeSeccional = nombreDeSeccional;
        this.numeroDeSeccional = numeroDeSeccional;
        this.automotor = automotor;
    }

    public String getNombreDeSeccional() {
        return nombreDeSeccional;
    }

    public void setNombreDeSeccional(String nombreDeSeccional) {
        this.nombreDeSeccional = nombreDeSeccional;
    }

    public Integer getNumeroDeSeccional() {
        return numeroDeSeccional;
    }

    public void setNumeroDeSeccional(Integer numeroDeSeccional) {
        this.numeroDeSeccional = numeroDeSeccional;
    }

    public Automotor getAutomotor() {
        return automotor;
    }

    public void setAutomotor(Automotor automotor) {
        this.automotor = automotor;
    }
}
