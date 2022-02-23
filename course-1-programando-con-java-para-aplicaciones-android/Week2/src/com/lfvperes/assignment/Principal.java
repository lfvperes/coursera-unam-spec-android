package com.lfvperes.assignment;

public class Principal {
    public static void main(String[] args) {

        Pelicula[] peliculas = new Pelicula[5];
        Serie[] series = new Serie[5];

        peliculas[0] = new Pelicula();
        peliculas[1] = new Pelicula("Avengers", 143, "Joss Whedon", "Adventure", 2012);
        peliculas[2] = new Pelicula("Inglorious Basterds", 153, "Quentin Tarantino", "War", 2009);
        peliculas[3] = new Pelicula("Spider-Man", "Sam Reimi");
        peliculas[4] = new Pelicula("Top Gun", "Jim Cash");

        series[0] = new Serie();
        series[1] = new Serie("Loki", 50, "Kate Herron", "Fantasy", 1);
        series[2] = new Serie("Cobra Kai", "Josh Heald");
        series[3] = new Serie("Lucifer", 42, "Tom Kapinos", "Crime", 8);
        series[4] = new Serie("Peaky Blinders","Steven Knight");


        peliculas[1].marcarVisto();
        peliculas[2].marcarVisto();

        series[1].marcarVisto();
        series[3].marcarVisto();

        System.out.println("Peliculas visualizadas:");
        for (Pelicula p: peliculas) {
            if (p.esVisto()){
                double tiempo = p.tiempoVisto();
                String tiempoFormatado = (int)tiempo + "min " + (int)(60 * (tiempo % 1)) + "s";

                System.out.print("Visto " + p.getTitulo() + ": ");
                System.out.print(tiempoFormatado);
                System.out.print(" de ");
                System.out.print((int)p.getDuracion());
                System.out.println("min");
            }
        }

        System.out.println("\nSeries visualizadas:");
        for (Serie s: series) {
            if (s.esVisto()){
                double tiempo = s.tiempoVisto();
                String tiempoFormatado = (int)tiempo + "min " + (int)(60 * (tiempo % 1)) + "s";

                System.out.print("Visto " + s.getTitulo() + ": ");
                System.out.print(tiempoFormatado);
                System.out.print(" de ");
                System.out.print((int)s.getDuracion());
                System.out.println("min");
            }
        }

        int indMasTemporadas = 0;
        int indMasReciente = 0;
        for (int i = 1; i < 5; i++) {
            if (series[i].getNroTemporadas() > series[indMasTemporadas].getNroTemporadas())
                indMasTemporadas = i;
            if (peliculas[i].getAno() > peliculas[indMasReciente].getAno())
                indMasReciente = i;
        }

        System.out.println("\nSerie con más temporadas:");
        System.out.println(series[indMasTemporadas].toString());
        System.out.println("\nPelicula más reciente:");
        System.out.print(peliculas[indMasReciente].toString());
    }
}
