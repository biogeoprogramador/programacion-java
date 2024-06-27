package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_17 {
    // Leer una secuencia de números y sumar solo los pares mostrando el resultado
    // del proceso.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count, sum = 0, num;
        System.out.println("¿Cuántos números quiere introducir?");
        count = numInputPositive(input);
        System.out.println("Introduzca " + count + " números.");
        if (count == 1) {
            num = numInput(input);
            if (num % 2 == 0) {
                System.out.println("--------------------");
                System.out.println("Suma de los números pares: " + (sum = num));
            } else {
                System.out.println("--------------------");
                System.out.println("Suma de los números pares: " + sum);
            }
        } else {
            for (int i = 0; i < count; i++) {
                num = numInput(input);
                if (num % 2 == 0)
                    sum = sum + num;
            }
            System.out.println("--------------------");
            System.out.println("Suma de los números pares: " + sum);
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
