package com.lfvperes.learnoop;

public class Principal {
    public static void main(String[] args) {

        Telefono miTelefono = new Telefono();
        miTelefono.mostrarDatos();

        Telefono tuTelefono = new Telefono(3874, "Samsung", 1500);
        tuTelefono.modelo = "A52s"; // public
        tuTelefono.mostrarDatos();


        tuTelefono.setPrecio(-150);
        tuTelefono.mostrarDatos();


        // herencia y polimorfismo

    }
}
