package Otros;
import java.util.Random;

public class Rellenar_Mostrar_Array {
    public static void main(String[] args) {
        Random rand = new Random();
        // variables
        int numMaximo = 101;
        int fila = rand.nextInt(11);
        int columna =rand.nextInt(11);

        System.out.println("FILAS: "+fila);
        System.out.println("COLUMNAS: "+columna);

        int [][] matriz = new int[fila][columna];

        // rellenar
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=rand.nextInt(numMaximo);
            }
        }
        // mostrar
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
        }



        

    }
}
