package com.lfvperes.operadores;

public class Operadores {
    public static void main(String[] args) {

        // operadores aritmeticos + - * / %
        int a = 2;
        int b = 5;
        int c = 0;

        System.out.println("a=" + a + " y b=" + b);
        // suma
        c = a + b;
        System.out.println("Suma resultado: " + c);

        // resta
        c = a - b;
        System.out.println("Resta resultado: " + c);

        // multiplicacion
        c = a * b;
        System.out.println("Multiplicacion resultado: " + c);

        // division
        c = a / b;
        System.out.println("Division resultado: " + c);

        // modulo
        c = a % b;
        System.out.println("Modulo resultado: " + c);

        // operadores de asignacion con operacion
        // += -= *= /= %=
        c = 2;
        c += a; // c = c + a; 4
        System.out.println("c += a -> " + c);

        c *= a;
        System.out.println("c *= a -> " + c);

        c -= a;
        System.out.println("c -= a -> " + c);

        c /= a;
        System.out.println("c /= a -> " + c);

        c %= a;
        System.out.println("c %= a -> " + c);


        // operadores prefijo y posfijo ++ --

        int i= 3;

        // incremento prefijo: incrementa y despues lo asigna
        // i = i + 1;
        System.out.println("prefijo: " + (++i));
        System.out.println("despues: " + i);

        // incremento postfijo: asigna y despues lo incrementa
        System.out.println("posfijo: " + (i++));
        System.out.println("despues: " + i);

        // decremento prefijo y posfijo
        i--;
        --i;

        // equidad y operadores relacionales
        // equidad: == !=
        a = 5;
        b = 4;
        System.out.println("a == b: "+ (a == b));
        System.out.println("a != b: "+ (a != b));

        // relacionales: > < >= <=
        System.out.println("a < b: " + (a < b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a >= b: " + (a >= b));

        // operadores logicos && (AND), || (OR), ! (NOT)
        boolean m = true;
        boolean n = false;

        // AND &&
        System.out.println("m && n: " + (m && n));

        // OR ||
        System.out.println("m || n: " + (m || n));

        // NOT !
        System.out.println("!m: " + (!m));

    }
}
