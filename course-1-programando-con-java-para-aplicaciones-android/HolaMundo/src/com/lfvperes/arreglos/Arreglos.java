package com.lfvperes.arreglos;

public class Arreglos {
    public static void main(String[] args) {

        int[] myArrayInt = new int[5]; // indices 0-4
        myArrayInt[0] = 5;
        myArrayInt[1] = 9;
        myArrayInt[2] = 2;
        myArrayInt[3] = 8;
        myArrayInt[4] = 72;
//        myArrayInt[5] = 3;  // out of bounds

        System.out.println(myArrayInt[0]);
        System.out.println(myArrayInt[1]);
        System.out.println(myArrayInt[2]);
        System.out.println(myArrayInt[3]);
        System.out.println(myArrayInt[4]);


        double[][] myArrayDouble2D = new double[3][3];  // matrix
        myArrayDouble2D[1][1] = 4;
        System.out.println(myArrayDouble2D[1][1]);

        char[][][] myArrayChar3D = new char[2][2][2];
        myArrayChar3D[0][0][0] = 'a';
        myArrayChar3D[0][0][1] = 'b';
        myArrayChar3D[0][1][0] = 'c';
        myArrayChar3D[1][0][1] = 'f';
    }
}
