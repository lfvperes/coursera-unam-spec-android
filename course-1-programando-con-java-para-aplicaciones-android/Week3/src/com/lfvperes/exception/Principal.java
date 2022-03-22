package com.lfvperes.exception;

public class Principal {
    public static void main(String[] args) {
        try {
            int[] numeros = {5, 2, 8};
            System.out.println(numeros[0]);
            System.out.println(numeros[1]);
            System.out.println(numeros[2]);
            System.out.println(numeros[3]);
        } catch (ArrayIndexOutOfBoundsException arrayError) {
            System.out.println("Estas intentando entrar a una localidad que no esta definida");
        } catch (Exception e){
            System.out.println("Ocurrió este error: ");
            e.printStackTrace();
        } finally {
            System.out.println(":)");
        }


    }
}
