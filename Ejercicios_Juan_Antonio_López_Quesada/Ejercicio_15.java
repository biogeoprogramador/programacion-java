package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_15 {
    // Generar los N primeros términos de la serie de Fibonacci. El valor N(entero y
    // positivo) deberá ser leído por el teclado. En esta serie los dos primeros
    // números son 1, y el resto se obtiene sumando los dos anteriores:
    // 1,1,2,3,5,8,13,21…
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, num1 = 0, num2 = 1, sum;
        System.out.println("¿Cuántos números quiere de la serie de Fibonacci?");
        n = numInputPositive(input);
        System.out.println("--------------------");
        System.out.println(num2);
        for (int i = 1; i < n; i++) {
            sum = num1 + num2;
            System.out.println(sum);
            num1 = num2;
            num2 = sum;
        }
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
