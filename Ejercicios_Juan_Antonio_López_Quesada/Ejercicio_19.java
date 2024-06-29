package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_19 {
    // Leer una secuencia de números y mostrar la suma de los 30 números que ocupan
    // posiciones de lectura par.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, pos = 0, i = 0, sum = 0;
        boolean aux = true;
        int[] numPar = new int[30];
        int[] parPos = new int[30];
        System.out.println("Introduzca una serie de números.");
        System.out.println("Presiona 0 para salir.");
        System.out.println("--------------------");
        while (aux) {
            num = numInput(input);
            pos++;
            if ((num % 2 == 0 && num != 0) && (pos % 2 == 0 && pos != 0)) {
                numPar[i] = num;
                parPos[i] = pos;
                i++;
            }
            if ((num == 0) || (i == 30))
                aux = false;
        }
        for (int j = 0; j < 30; j++) {
            System.out.println("NÚMERO PAR: " + numPar[j] + " POSICIÓN PAR: " + parPos[j]);
            sum = sum + numPar[j];
        }
        System.out.println("SUMA NÚMEROS PARES EN POSICIÓN PAR: " + sum);
        input.close();
    }

    public static int numInput(Scanner input) {
        boolean aux = true;
        int num = 0;
        // System.out.println("Introduzca un número entero");
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
        //System.out.println("Introduzca un número entero");
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
