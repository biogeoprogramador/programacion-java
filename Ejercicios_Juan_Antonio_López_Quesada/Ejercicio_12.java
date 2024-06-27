package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_12 {
    // Dado un número mostrar su valor en binario.
    public static void main(String[] args) {
        // crear objeto Scanner para el input por terminal
        Scanner input = new Scanner(System.in);
        // variables
        int num = 0, div = 1, resto, entrada = 0;
        String numBin = "", auxString = "";
        boolean aux = true;
        // bucle while hasta que se complete la ejecución del programa
        System.out.println("Introduzca un número entero.");
        while (aux) {
            // control de excepción InputMismatchException
            try {
                entrada = input.nextInt();
                input.nextLine();
                if (entrada >= 0) {
                    num = entrada;
                    while (div != 0) {
                        div = num / 2;
                        // dividimos el número 1 vez
                        resto = num % 2;
                        // obtenemos el resto que puede ser 1 o 0
                        num = div;
                        // el resultado de la división lo guardamos para la
                        // proxima pasada por el bucle while
                        auxString = resto + numBin;
                        // guardamos el resto en un String a la izquierda de
                        // otro String numBin
                        numBin = auxString;
                        // guardamos lo anterior en el String numBin que sería
                        // el resultado final
                    }
                    aux = false;
                } else {
                    num = entrada * -1;
                    while (div != 0) {
                        div = num / 2;
                        // dividimos el número 1 vez
                        resto = num % 2;
                        // obtenemos el resto que puede ser 1 o 0
                        num = div;
                        // el resultado de la división lo guardamos para la
                        // proxima pasada por el bucle while
                        auxString = resto + numBin;
                        // guardamos el resto en un String a la izquierda de
                        // otro String numBin
                        numBin = auxString;
                        // guardamos lo anterior en el String numBin que sería
                        // el resultado final
                    }
                    aux = false;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Introduzca un número entero.");
                input.nextLine();
            }
        }
        System.out.println("--------------------");
        System.out.println("El número " + entrada + " en su notación binaria es:");
        if (entrada >= 0) {
            System.out.println(numBin);
        } else {
            System.out.println("-" + numBin);
        }
        input.close();
    }
}
