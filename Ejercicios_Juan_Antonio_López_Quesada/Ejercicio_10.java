package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.Scanner;

public class Ejercicio_10 {
    // Leer una secuencia de números y mostrar su producto, el proceso finalizará
    // cuando el usuario pulse a la tecla F.
    public static void main(String[] args) {
        // crear objeto Scanner para el input por terminal
        Scanner input = new Scanner(System.in);
        // variables
        String numString;
        int num, prod = 1;
        boolean aux = true;
        // entrada de números en bucle hasta que input es F
        System.out.println("Introduzca los números que quiera hasta que introduzca un F.");
        while (aux) {
            numString = input.nextLine();
            // comprobar si se ha introducido F o f para finalizar
            if (numString.equals("F") || numString.equals("f")) {
                aux = false;
            } else {
                try {
                    // convertir String en int
                    num = Integer.parseInt(numString);
                    // hacer producto
                    prod = prod * num;
                } catch (NumberFormatException ex) {
                    System.out.println("Introduzca un número entero.");
                }
            }
        }
        // mostrar producto
        System.out.println("--------------------");
        System.out.println("PRODUCTO: " + prod);
        input.close();
    }
}
