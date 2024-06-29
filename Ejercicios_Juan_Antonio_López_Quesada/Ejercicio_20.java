package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_20 {
    // Leer un número y determinar su factorial.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, fact = 1;
        System.out.println("Introduzca un mayor igual que 0.");
        num = numInputPositive(input);
        System.out.println("--------------------");
        if (num == 0) {
            System.out.println("El factorial de " + num + " es 1.");
        } else {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("El factorial de " + num + " es " + fact + ".");
        }
        input.close();
    }

    public static int numInputPositive(Scanner input) {
        boolean aux = true;
        int num = 0;
        // System.out.println("Introduzca un número entero");
        while (aux) {
            try {
                num = input.nextInt();
                input.nextLine();
                if (num >= 0) {
                    aux = false;
                } else {
                    System.out.println("Introduzca un número entero mayor o igual que 0.");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Introduzca un número entero mayor o igual que 0.");
                input.nextLine();
            }
        }
        return num;
    }
}
