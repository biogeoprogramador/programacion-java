package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.Scanner;

public class Ejercicio_6 {
    // Leer una secuencia de 30 números y mostrar la suma y el producto de ellos.
    public static void main(String[] args) {
        // crear objeto Scanner para el input por terminal
        Scanner input = new Scanner(System.in);
        // variables
        int num[] = new int[30];
        int sum = 0, prod = 1;
        boolean aux = true;

        // entrada de números
        System.out.println("Introduzca un teinta números.");
        for (int i = 0; i < num.length; i++) {
            while (aux) {
                try {
                    num[i] = input.nextInt();
                    input.nextLine();
                    aux = false;
                } catch (Exception InputMismatchException) {
                    System.out.println("Introduzca un número entero.");
                    input.nextLine();
                }
            }
            aux = true;
        }

        // Suma y Producto
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
            prod = prod * num[i];
        }
        System.out.println("--------------------");
        System.out.println("SUMA: " + sum);
        System.out.println("PRODUCTO: " + prod);
        input.close();
    }
}
