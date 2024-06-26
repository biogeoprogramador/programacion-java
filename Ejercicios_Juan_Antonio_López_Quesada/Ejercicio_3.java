package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.Scanner;

public class Ejercicio_3 {
    // Leer 2 números y determinar el mayor de ellos.
    public static void main(String[] args) {
        // crear objeto Scanner para el input por terminal
        Scanner input = new Scanner(System.in);
        // variables
        int num1, num2;
        boolean aux = true;
        // bucle while hasta que se complete la ejecución del programa
        while (aux) {
            // control de excepción InputMismatchException
            try {
                // entrada primer número
                System.out.println("Introduzca un número entero.");
                num1 = input.nextInt();
                input.nextLine();
                // entrada segundo número
                System.out.println("Introduzca un número entero.");
                num2 = input.nextInt();
                input.nextLine();

                // determinar numero mayor
                if (num1 == num2) {
                    aux = false;
                    System.out.println(num1 + " es igual que " + num2);
                }
                else {
                    if (num1 > num2) {
                        System.out.println(num1 + " es mayor que " + num2);
                        aux = false;
                    } else {
                        System.out.println(num2 + " es mayor que " + num1);
                        aux = false;
                    }
                }
            } catch (Exception InputMismatchException) {
                System.out.println("Introduzca un número entero distinto a 0.");
                input.nextLine();
            }
        }
        input.close();
    }
}
