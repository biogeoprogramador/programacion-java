package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_7 {
    // Leer una secuencia de números, hasta que se introduce un número negativo y
    // mostrar la suma de dichos números.
    public static void main(String[] args) {
        // crear objeto Scanner para el input por terminal
        Scanner input = new Scanner(System.in);
        // variables
        int num = 0, sum = 0;
        // entrada de números en bucle hasta num negativo
        System.out.println("Introduzca los números que quiera hasta que introduzca un número negativo.");
        while (num >= 0) {
            try {
                num = input.nextInt();
                input.nextLine();
                // suma si entrada no negativo
                if (num >= 0)
                    sum = sum + num;
            } catch (InputMismatchException ex) {
                System.out.println("Introduzca un número entero.");
                input.nextLine();
            }
        }
        System.out.println("--------------------");
        System.out.println("SUMA: " + sum);
        input.close();
    }
}