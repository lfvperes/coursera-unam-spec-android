package com.lfvperes.interfaces;

public class Smartphone extends Telefono implements IDevolucion {

    private String SIM;

    public Smartphone(int id, double precio, String marca, String modelo, String SIM) {
        super(id, precio, marca, modelo);
        this.SIM = SIM;
    }

    public String getSIM() {
        return SIM;
    }

    public void setSIM(String SIM) {
        this.SIM = SIM;
    }

    @Override
    public void hacerDevolucion() {
        System.out.println("Devolución de un Smartphone");
    }
}
