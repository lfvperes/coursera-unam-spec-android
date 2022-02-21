package com.lfvperes.controlflujo;

public class ControlFlujo {
    public static void main(String[] args) {
        // condiccionales if else
        int a = 5;
        int b = 20;

        if (a > b) {
            System.out.println("a es MAYOR");
        } else if (a == b) {
            System.out.println("a y b son iguales");
        } else {
            System.out.println("a no es el mayor y tampoco son iguales");
        }

        // switch
        int c = 1001;
        switch (c) {
            case 1005:
                System.out.println("c es 1005");
                break;

            case 1006:
                System.out.println("c es 1006");
                break;

            case 1007:
                System.out.println("c es 1007");
                break;

            case 1008:
                System.out.println("c es 1008");
                break;

            case 1009:
                System.out.println("c es 1009");
                break;

            default:
                System.out.println("c es otro valor");
                break;
        }

        // bucles (loops)
        // while
        int w = 1;
        while (w <= 5) {
            System.out.println("w: " + (w++)); // 1 hasta 5
//            System.out.println("w: " + (++w)); // 2 hasta 6
        }

        // for
        for (int k = 1; k <=5; k++){
            System.out.println("k: " + k); // 1 hasta 5
        }

        // array
        int[] miArreglo = new int[5];
        for (int ind = 0; ind < miArreglo.length; ind++) {
            miArreglo[ind] = 2 * ind;
            System.out.println("miArreglo["+ind+"]: " + miArreglo[ind]);
        }

        // for each
        for (int el:
             miArreglo) {
            System.out.println(el);
        }

    }
}