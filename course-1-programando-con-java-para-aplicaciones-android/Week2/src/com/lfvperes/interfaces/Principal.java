package com.lfvperes.interfaces;

public class Principal {
    public static void main(String[] args) {
        Playera playera     = new Playera(1, 299.5, "Ch", "Gris", "Polo");
        PlayeraPersonalizada playeraPersonalizada= new PlayeraPersonalizada(4, 499.50, "M", "Negro", "@ejemplo");
        Jeans jeans         = new Jeans(1, 199.5, "32", "Azul", "Skinny", 'F');
        Calcetin calcetin   = new Calcetin(3, 29, "M", "Rojo");

        playera.mostrarDatos("Playera Gris");
        playeraPersonalizada.mostrarDatos("Playera de @ejemplo");
        jeans.mostrarDatos("Jeans mujer");
        calcetin.mostrarDatos("Calcetines");

        playera.hacerDevolucion();
        jeans.hacerDevolucion();

        Smartphone smartphone = new Smartphone(5, 5999, "Motorola", "Moto G", "Claro");
        smartphone.hacerDevolucion();

        TelefonoHogar telefonoHogar = new TelefonoHogar(6, 1999, "Philips", "ejemplo", true);
        telefonoHogar.hacerDevolucion();

    }
}
