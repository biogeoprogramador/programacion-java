package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.Scanner;

public class Ejercicio_9 {
    // Leer dos números y realizar la división mediante restas mostrando el cociente
    // y el resto.
    public static void main(String[] args) {
        // crear objeto Scanner para el input por terminal
        Scanner input = new Scanner(System.in);
        // variables
        int num1, num2, div, rest;
        boolean aux = true;
        // bucle while hasta que se complete la ejecución del programa
        while (aux) {
            // control de excepción InputMismatchException
            try {
                // entrada primer número
                System.out.println("Introduzca un primer número entero mayor que 0.");
                num1 = input.nextInt();
                input.nextLine();
                // entrada segundo número
                System.out.println("Introduzca un segundo número entero mayor que 0.");
                num2 = input.nextInt();
                input.nextLine();
                if (num1 <= 0 || num2 <= 0) {
                    System.out.println("Introzuca números mayores que 0.");
                } else {
                    // mostrar la división mediante restas
                    System.out.println("--------------------");
                    // comprobar número menor para hacer menos restas
                    if (num1 >= num2) {
                        // mostrar las restas y el resto
                        System.out.println(num1);
                        while (num1 >= num2) {
                            System.out.println(num1 = num1 - num2);
                        }
                        System.out.println("Resto: " + num1);
                    } else {
                        // mostrar las restas y el resto
                        System.out.println(num2);
                        while (num2 >= num1) {
                            System.out.println(num2 = num2 - num1);
                        }
                        System.out.println("Resto: " + num2);
                    }
                    aux = false;
                }
            } catch (Exception InputMismatchException) {
                System.out.println("Introduzca un número entero distinto a 0.");
                input.nextLine();
            }
        }
        input.close();
    }
}
