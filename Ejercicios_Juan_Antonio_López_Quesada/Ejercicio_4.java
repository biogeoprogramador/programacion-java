package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.Scanner;

public class Ejercicio_4 {
    // Leer 3 números y mostrar el mayor de ellos.
    public static void main(String[] args) {
        // crear objeto Scanner para el input por terminal
        Scanner input = new Scanner(System.in);
        // variables
        int num1, num2, num3;
        boolean aux = true;
        // bucle while hasta que se complete la ejecución del programa
        while (aux) {
            // control de excepción InputMismatchException
            try {
                // entrada primer número
                System.out.println("Introduzca un número entero.");
                num1 = input.nextInt();
                input.nextLine();
                // entrada segundo número
                System.out.println("Introduzca un número entero.");
                num2 = input.nextInt();
                input.nextLine();
                // entrada tercer número
                System.out.println("Introduzca un número entero.");
                num3 = input.nextInt();
                input.nextLine();

                // determinar numero mayor
                if (num1 == num2 && num1 == num3) {
                    System.out.println("Los números son iguales");
                    aux=false;
                } else {
                    if (num1 >= num2 && num1 >= num3) {
                        System.out.println(num1 + " es el número mayor.");
                        aux = false;
                    } else {
                        if (num2 >= num1 && num2 >= num3) {
                            System.out.println(num2 + " es el número mayor");
                            aux = false;
                        } else {
                            System.out.println(num3 + " es el número mayor ");
                            aux = false;
                        }
                    }
                }
            } catch (Exception InputMismatchException) {
                System.out.println("Introduzca un número entero distinto a 0.");
                input.nextLine();
            }
        }
        input.close();
    }
}
