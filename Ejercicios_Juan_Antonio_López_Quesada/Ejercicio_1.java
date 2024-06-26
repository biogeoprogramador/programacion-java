package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        // crear objeto Scanner para el input por terminal
        Scanner input = new Scanner(System.in);
        // variables
        int num, resto;
        boolean aux = true;
        // bucle while hasta que se complete la ejecución del programa
        while (aux) {
            // control de excepción InputMismatchException
            try {
                num = input.nextInt();
                // comprobar que el número no sea 0
                if (num == 0) {
                    System.out.println("Introduzca un número entero distinto a 0.");
                } else {
                    // comprobar si el número es par o impar
                    resto = num % 2;
                    if (resto == 0) {
                        System.out.println(num + " es un número PAR.");
                        aux = false;
                    } else {
                        System.out.println(num + " es un número IMPAR.");
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