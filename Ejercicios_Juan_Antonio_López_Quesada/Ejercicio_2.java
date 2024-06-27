package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_2 {
    // Leer 2 números y mostrar el producto de ellos.
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
                System.out.println("Introduzca un primer número entero.");
                num1 = input.nextInt();
                input.nextLine();
                // entrada segundo número
                System.out.println("Introduzca un segundo número entero.");
                num2 = input.nextInt();
                input.nextLine();
                // mostrar el prooducto de los dos números
                System.out.println(num1 * num2 + " es el producto de los números.");
                aux = false;
            } catch (InputMismatchException ex) {
                System.out.println("Introduzca un número entero distinto a 0.");
                input.nextLine();
            }
        }
        input.close();
    }
}
