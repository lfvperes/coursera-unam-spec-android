package com.lfvperes.herencia;

public class Playera extends Ropa {
    private String corte;

    public Playera(int id, double precio, String talla, String color, String corte) {
        super(id, precio, talla, color); // superclase
        this.corte = corte;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    @Override
    public void mostrarDatos(String nombreClase) {
        super.mostrarDatos(nombreClase);
        System.out.println("Corte: " + corte);
    }
}
