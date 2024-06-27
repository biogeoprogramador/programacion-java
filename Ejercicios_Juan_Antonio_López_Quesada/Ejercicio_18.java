package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_18 {
    // Leer una secuencia de números y mostrar los 30 primeros pares leídos.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limInf, limSup, count = 0;
        System.out.println("Rango de números para mostrar los 30 primeros números pares.");
        System.out.println("Introduzca el límite inferior del rango.");
        limInf = numInput(input);
        System.out.println("Introduzca el límite superior del rango.");
        limSup = numInput(input);
        System.out.println("--------------------");
        for (int i = limInf; i <= limSup; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.println(i);
                count++;
            }
            if (count == 30) {
                break;
            }
        }
        input.close();
    }

    public static int numInput(Scanner input) {
        boolean aux = true;
        int num = 0;
        System.out.println("Introduzca un número entero");
        while (aux) {
            // control de excepción InputMismatchException
            try {
                // entrada de número
                num = input.nextInt();
                input.nextLine();
                aux = false;
            } catch (InputMismatchException ex) {
                System.out.println("Introduzca un número entero mayor que 0.");
                input.nextLine();
            }
        }
        return num;
    }

    public static int numInputPositive(Scanner input) {
        boolean aux = true;
        int num = 0;
        System.out.println("Introduzca un número entero");
        while (aux) {
            try {
                num = input.nextInt();
                input.nextLine();
                if (num > 0) {
                    aux = false;
                } else {
                    System.out.println("Introduzca un número entero mayor que 0.");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Introduzca un número entero mayor que 0.");
                input.nextLine();
            }
        }
        return num;
    }
}
