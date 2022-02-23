package com.lfvperes.assignment;

public class Producto implements Visualizable {
    
    private String titulo;
    private boolean visto = false;
    private double duracion = 0;
    private String creador;
    private String genero = null;
    
    public Producto(String titulo, double duracion, String creador, String genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.creador = creador;
        this.genero = genero;
    }

    public Producto(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Producto() {
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getDuracion() {
        return duracion;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    public String getCreador() {
        return creador;
    }
    public void setCreador(String creador) {
        this.creador = creador;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Producto [creador=" + creador + ", duracion=" + duracion + ", genero=" + genero + ", titulo=" + titulo
                + ", visto=" + visto + "]";
    }

    @Override
    public void marcarVisto() {
        this.visto = true;
    }

    @Override
    public boolean esVisto() {
        return this.visto;
    }

    @Override
    public double tiempoVisto() {
        return Visualizable.tiempoVistoTotal;
    }
    
}
