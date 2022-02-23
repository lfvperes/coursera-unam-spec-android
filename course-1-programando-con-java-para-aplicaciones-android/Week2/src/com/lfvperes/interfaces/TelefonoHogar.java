package com.lfvperes.interfaces;

public class TelefonoHogar extends Telefono implements IDevolucion {
    private boolean alambrico;

    public TelefonoHogar(int id, double precio, String marca, String modelo, boolean alambrico) {
        super(id, precio, marca, modelo);
        this.alambrico = alambrico;
    }

    public boolean isAlambrico() {
        return alambrico;
    }

    public void setAlambrico(boolean alambrico) {
        this.alambrico = alambrico;
    }

    @Override
    public void hacerDevolucion() {
        System.out.println("Devolución de un Telefono Hogar");
    }
}
