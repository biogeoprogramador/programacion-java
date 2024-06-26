package Ejercicios_Juan_Antonio_López_Quesada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_14 {
    // Calcular la media de una secuencia de números.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count, sum = 0;
        double media;
        System.out.println("¿Cuántos números quiere introducir?");
        count = numInputPositive(input);
        System.out.println("Introduzca " + count + " números.");
        for (int i = 0; i < count; i++) {
            sum = sum + numInput(input);
        }
        media = (double) sum / (double) count;
        System.out.println("MEDIA: " + media);
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
