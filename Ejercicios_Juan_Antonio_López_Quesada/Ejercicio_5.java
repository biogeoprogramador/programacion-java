package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.Scanner;

public class Ejercicio_5 {
    // Leer un número y mostrar su tabla de multiplicar.
    public static void main(String[] args) {
        // crear objeto Scanner para el input por terminal
        Scanner input = new Scanner(System.in);
        // variables
        int num = 0, factor = 1;
        boolean aux = true;

        // entrada de número
        System.out.println("Introduzca un número entero.");
        while (aux) {
            try {
                num = input.nextInt();
                input.nextLine();
                aux = false;
            } catch (Exception InputMismatchException) {
                System.out.println("Introduzca un número entero.");
                input.nextLine();
            }
        }
        // tabla de multiplicar
        while (factor <= 10) {
            System.out.println(num + " x " + (factor) + " = " + (num * factor));
            factor++;
        }
        input.close();
    }
}
