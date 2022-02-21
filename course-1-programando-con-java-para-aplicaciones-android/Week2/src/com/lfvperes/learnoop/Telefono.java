package com.lfvperes.learnoop;

public class Telefono {

    // atributos
    private int id;
    private String marca;
    public String modelo;
    private double precio;

    // overload constructor
    public Telefono() {
        this.id = 0;
        this.marca = "Motorola";
        this.modelo = "Moto E";
        this.precio = 1.0;
    }

    // constructor
    public Telefono(int id, String marca, double precio) {
        this.id = id;
        this.marca = marca;
        this.precio = precio;
    }

    // getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 1) {
            this.precio = precio;
        } else {
            this.precio = 1.0;
//            System.out.println("El precio no es válido");
        }
    }

    // comportamientos (metodos)
    public void mostrarDatos(){
        System.out.println("Datos del telefono");
        System.out.println("ID: " + this.id);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Precio: R$" + this.precio);

    }

}
