package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_11 {
    // Lee una secuencia de números y determina cual es el mayor de ellos.
    public static void main(String[] args) {
        // crear objeto Scanner para el input por terminal
        Scanner input = new Scanner(System.in);
        // variables
        int num = 0, may = 0, count = 0, numEntradas = 0;
        boolean aux = true;
        // entrada del número de entradas que se hacen
        System.out.println("¿Cuántos números quiere comparar?");
        while (aux) {
            try {
                numEntradas = input.nextInt();
                input.nextLine();
                if (numEntradas > 0) {
                    aux = false;
                } else {
                    System.out.println("Introduzca un número entero mayor que 0");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Introduzca un número entero mayor que 0.");
                input.nextLine();
            }
        }
        // entrada de números y guardar el mayor de los números
        System.out.println("Introduzca " + numEntradas + " números.");
        while (count < numEntradas) {
            try {
                num = input.nextInt();
                input.nextLine();
                count++;
                if (count == 1) {
                    may = num;
                } else {
                    if (num > may)
                        may = num;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Introduzca un número entero.");
                input.nextLine();
            }
        }
        // mostrar el mayor de los números
        System.out.println("--------------------");
        System.out.println("MAYOR: " + may);
        input.close();
    }
}
