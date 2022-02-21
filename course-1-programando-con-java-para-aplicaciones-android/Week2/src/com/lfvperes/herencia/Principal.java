package com.lfvperes.herencia;

public class Principal {
    public static void main(String[] args) {
        Playera     playera     = new Playera(1, 299.5, "Ch", "Gris", "Polo");
        Jeans       jeans       = new Jeans(1, 199.5, "32", "Azul", "Skinny", 'F');
        Calcetin    calcetin    = new Calcetin(3, 29, "M", "Rojo");

        playera.mostrarDatos("Playera Gris");
        jeans.mostrarDatos("Jeans mujer");
        calcetin.mostrarDatos("Calcetines");
    }
}
