package com.lfvperes.holamundo;

// 21/02/2022
// ASSIGNMENT 1

public class Assignment {
    public static void main(String[] args) {
        int[][] miArreglo = new int[4][4];

        int j, i;
        for (int n = 0; n < miArreglo.length * miArreglo.length; n++) {
            j = n % miArreglo.length;
            i = (n - j)/miArreglo.length;
//            miArreglo[i][j] = 2 * (1 + j + i * miArreglo.length);
            miArreglo[i][j] = 2 * n + 2;
        }


        for (int[] fila:
             miArreglo) {
            for (int elemento:
                 fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
