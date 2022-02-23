package com.lfvperes.assignment;

public class Pelicula extends Producto {
    
    private int ano = 0;

    public Pelicula(String titulo, double duracion, String creador, String genero, int ano) {
        super(titulo, duracion, creador, genero);
        this.ano = ano;
    }

    public Pelicula(String titulo, String creador) {
        super(titulo, creador);
    }

    public Pelicula() {
        super();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Pelicula: " + super.toString() + ", ano=" + ano + "]";
    }
}
