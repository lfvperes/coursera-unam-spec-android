package com.lfvperes.interfaces;

public class Jeans extends Ropa implements IDevolucion {
    private String corte;
    private char genero;

    public Jeans(int id, double precio, String talla, String color, String corte, char genero) {
        super(id, precio, talla, color);
        this.corte = corte;
        this.genero = genero;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public void mostrarDatos(String nombreClase) {
        super.mostrarDatos(nombreClase);
        System.out.println("Corte: " + corte);
        System.out.println("Género: " + genero);
    }

    @Override
    public void hacerDevolucion() {
        System.out.println("Devolución de Jeans");
    }
}
