package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        // variables
        Scanner input = new Scanner(System.in);
        int num, resto;
        boolean aux = true;
        // controlar excepcion de input no numérico
        while (aux) {
            try {
                num = input.nextInt();
                if (num == 0) {
                    System.out.println("Introduzca un número entero distinto a 0.");
                } else {
                    resto = num % 2;

                    if (resto == 0) {
                        System.out.println(num + " es un número par.");
                        aux = false;
                    } else {
                        System.out.println(num + " es un número impar.");
                        aux = false;
                    }
                }

            } catch (Exception InputMismatchException) {
                System.out.println("Introduzca un número entero distinto a 0.");
                input.nextLine();
            }
        }

    }
}