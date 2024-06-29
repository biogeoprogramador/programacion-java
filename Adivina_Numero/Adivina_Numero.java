package Adivina_Numero;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Adivina_Numero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int num, numRand, numMayor, count = 0;
        boolean aux = true;
        System.out.println("Debe acertar un número entre 0 y un número que usted elija.");
        System.out.println("Elija ese número:");
        numMayor = numInputPositive(input);
        System.out.println("Introduzca un número entero entre 0 y " + numMayor + " incluidos.");
        numRand = rand.nextInt(numMayor + 1);
        System.out.println("--------------------");
        while (aux) {
            num = numInputRango(input, numMayor);
            count++;
            if (num > numRand) {
                System.out.println("MENOS");
                System.out.println("--------------------");
            }
            if (num < numRand) {
                System.out.println("MÁS");
                System.out.println("--------------------");
            }
            if (num == numRand) {
                System.out.println("--------------------");
                System.out.println("¡Ha acertado el número!¡Felicidades!");
                System.out.println("Intentos: " + count);
                System.out.println("--------------------");
                aux = false;
            }
        }
        input.close();
    }

    public static int numInputPositive(Scanner input) {
        boolean aux = true;
        int num = 0;
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

    public static int numInputRango(Scanner input, int limSup) {
        boolean aux = true;
        int num = 0;
        while (aux) {
            try {
                num = input.nextInt();
                input.nextLine();
                if ((num >= 0) && (num <= (limSup))) {
                    aux = false;
                } else {
                    System.out.println("Introduzca un número entero entre 0 y " + (limSup) + " incluidos.");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Introduzca un número entero entre 0 y " + (limSup) + " incluidos.");
                input.nextLine();
            }
        }
        return num;
    }

}
