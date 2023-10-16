
package tarea1_Estrc_de_Datos;

import java.util.Random;

public class Matriz_1 {
    public static void main(String[] args) {
    
        int[][] matriz = new int[3][3];

     
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(10); 
            }
        }

      
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

   
        int sumatoriaDiagonalPrincipal = 0;
        int sumatoriaDiagonalSecundaria = 0;
        for (int i = 0; i < 3; i++) {
            sumatoriaDiagonalPrincipal += matriz[i][i];
            sumatoriaDiagonalSecundaria += matriz[i][2 - i];
        }

        System.out.println("Sumatoria de la diagonal principal: " + sumatoriaDiagonalPrincipal);
        System.out.println("Sumatoria de la diagonal secundaria: " + sumatoriaDiagonalSecundaria);
    }
}
