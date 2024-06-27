package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.InputMismatchException;
import java.util.random.RandomGenerator;
import java.util.Scanner;

public class Ejercicio_13 {
    // Generar enteros de 3 en 3 comenzando por 2 hasta el valor máximo menor que
    // 30. Calculando la suma de los enteros generados que sean divisibles por 5.
    public static void main(String[] args) {
        // crear objeto Scanner para el input por terminal
        Scanner input = new Scanner(System.in);
        // variables
        int sum = 0, n = 0, div = 0, num, limInf = 0, limSup = 0;
        boolean aux = true;
        // ¿Cuántos números?
        System.out.println("¿De cuántos números quiere hacer la suma?");
        while (aux) {
            // control de excepción InputMismatchException
            try {
                // entrada de número
                n = input.nextInt();
                input.nextLine();
                // comprobar que el número sea mayor que 0
                if (n > 0) {
                    aux = false;
                } else {
                    System.out.println("Introduzca un número entero mayor que 0.");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Introduzca un número entero mayor que 0.");
                input.nextLine();
            }
        }
        aux = true;
        // ¿Divisor?
        System.out.println("¿Por qué número deben ser divisibles?");
        while (aux) {
            // control de excepción InputMismatchException
            try {
                // entrada de número
                div = input.nextInt();
                input.nextLine();
                // comprobar que el número no sea 0
                if (div != 0) {
                    aux = false;
                } else {
                    System.out.println("Introduzca un número entero que no sea 0.");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Introduzca un número entero que no sea 0.");
                input.nextLine();
            }
        }
        aux = true;
        // ¿Rango de números?
        System.out.println("¿Cuál es el rango de los números?");
        System.out.println("Introduzca el número inferior inclusive:");
        while (aux) {
            // control de excepción InputMismatchException
            try {
                // entrada de número
                limInf = input.nextInt();
                input.nextLine();
                aux = false;
            } catch (InputMismatchException ex) {
                System.out.println("Introduzca un número entero.");
                input.nextLine();
            }
        }
        aux = true;
        System.out.println("Introduzca el número superior inclusive:");
        while (aux) {
            // control de excepción InputMismatchException
            try {
                // entrada de número
                limSup = input.nextInt();
                input.nextLine();
                aux = false;
            } catch (InputMismatchException ex) {
                System.out.println("Introduzca un número entero.");
                input.nextLine();
            }
        }
        for (int i = 0; i < n; i++) {
            num = numDiv(limInf, limSup++, div);
            System.out.println("Número: " + num);
            sum = sum + num;
        }
        System.out.println("La suma de los " + n + " números divisibles por " + div + " es:");
        System.out.println(sum);
        input.close();
    }
    public static int numDiv(int limInf, int limSup, int divisor) {
        boolean i = true;
        int num = 0;
        while (i) {
            num = RandomGenerator.getDefault().nextInt(limInf, limSup);
            if (num % divisor == 0)
                i = false;
        }
        return num;
    }
}
