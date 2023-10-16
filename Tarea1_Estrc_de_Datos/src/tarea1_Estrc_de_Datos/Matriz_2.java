
package tarea1_Estrc_de_Datos;

import javax.swing.*;

public class Matriz_2 {

    public static void main(String[] args) {
 int nf, nc, i,j;
       
       nf = Integer.parseInt(JOptionPane.showInputDialog(null,
       "Digite la cantidad de filas para la matriz"));
       nc = Integer.parseInt(JOptionPane.showInputDialog(null,
       "Digite la cantidad de columnas para la matriz"));
       
    int sumatoriaDiagonalPrincipal = 0;
    int sumatoriaDiagonalSecundaria = 0;
       
       int mat[][] = new int[nf][nc];
       
       //Llenar matriz
       for(i=0;i<nf;i++){
          for(j=0;j<nc;j++){
              
             mat[i][j] = Integer.parseInt(
             JOptionPane.showInputDialog(null,
             "Digite los valores de la matriz"
            +" en la posicion " + "[" + i + "] "
            + " [ " + j + "]" ));
           
          } 
       }
       // imprimir matriz//
       String resultado = "";
       for(i=0;i<nf;i++){
          for(j=0;j<nc;j++){
              
            resultado += mat[i][j]; 
            resultado += " |  ";
          }
          resultado += "\n";
       }
       
       // Calcular la sumatoria de las diagonales de la matriz
      
        for(i=0;i<nf;i++){
      
            sumatoriaDiagonalPrincipal += mat[i][i];
            sumatoriaDiagonalSecundaria += mat[i][2 - i];
      
       }
        
       JOptionPane.showMessageDialog(null, resultado);
       JOptionPane.showMessageDialog(null, "Sumatoria de la diagonal principal: " + sumatoriaDiagonalPrincipal);
       JOptionPane.showMessageDialog(null, "Sumatoria de la diagonal secundaria: " + sumatoriaDiagonalSecundaria);
    }
    
}
