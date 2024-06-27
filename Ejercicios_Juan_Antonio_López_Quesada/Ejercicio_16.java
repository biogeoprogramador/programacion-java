package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_16 {
    // Leer una secuencia se números y mostrar cuales de ellos es el mayor y el
    // menor, el proceso finalizará cuando se introduzca un número impar.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count, menor = 0, mayor = 0, num;
        System.out.println("¿Cuántos números quiere introducir?");
        count = numInputPositive(input);
        System.out.println("Introduzca " + count + " números.");
        if (count == 1) {
            num = numInput(input);
            System.out.println("--------------------");
            System.out.println("MENOR: " + num);
            System.out.println("MAYOR: " + num);
        } else {
            for (int i = 0; i < count; i++) {
                num = numInput(input);
                if (i == 0) {
                    menor = num;
                    mayor = num;
                } else {
                    if (num < menor)
                        menor = num;
                    if (num > mayor)
                        mayor = num;
                }
            }
            System.out.println("--------------------");
            System.out.println("MENOR: " + menor);
            System.out.println("MAYOR: " + mayor);
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
