package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_8 {
    // Leer dos números y realizar el producto mediante sumas.
    public static void main(String[] args) {
        // crear objeto Scanner para el input por terminal
        Scanner input = new Scanner(System.in);
        // variables
        int num1, num2, sum = 0, cont = 1;
        boolean aux = true;
        // bucle while hasta que se complete la ejecución del programa
        while (aux) {
            // control de excepción InputMismatchException
            try {
                // entrada primer número
                System.out.println("Introduzca un primer número entero mayor o igual que 0.");
                num1 = input.nextInt();
                input.nextLine();
                // entrada segundo número
                System.out.println("Introduzca un segundo número entero mayor o igual que 0.");
                num2 = input.nextInt();
                input.nextLine();
                if (num1 < 0 || num2 < 0) {
                    System.out.println("Introzuca números mayores o iguales que 0.");
                } else {
                    // mostrar el producto de los dos números mediante sumas
                    System.out.println("--------------------");
                    // si uno de los factores es 0, la suma es 0
                    if (num1 == 0 || num2 == 0) {
                        System.out.println(sum);
                    } else {
                        // comprobar factor menor para hacer menos sumas
                        if (num1 > num2) {
                            while (cont <= num2) {
                                System.out.println(sum = sum + num1);
                                cont++;
                            }
                        } else {
                            while (cont <= num1) {
                                System.out.println(sum = sum + num2);
                                cont++;
                            }
                        }
                    }
                    aux = false;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Introduzca un número entero distinto a 0.");
                input.nextLine();
            }
        }
        input.close();
    }

}
