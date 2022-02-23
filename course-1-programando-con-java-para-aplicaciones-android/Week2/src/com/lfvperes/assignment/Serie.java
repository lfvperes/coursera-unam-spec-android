package com.lfvperes.assignment;

public class Serie extends Producto {
    
    private int nroTemporadas = 1;

    public Serie(String titulo, double duracion, String creador, String genero, int nroTemporadas) {
        super(titulo, duracion, creador, genero);
        this.nroTemporadas = nroTemporadas;
    }

    public Serie(String titulo, String creador) {
        super(titulo, creador);
    }

    public Serie() {
    }

    public int getNroTemporadas() {
        return nroTemporadas;
    }

    public void setNroTemporadas(int nroTemporadas) {
        this.nroTemporadas = nroTemporadas;
    }
}
