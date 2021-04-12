package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        
          Scanner teclado = new Scanner(System.in);
          int matriz[][] = new int[4][4];
         
          //Rellenamos la matriz
          for(int i = 0;i < 4; i++){
              for(int j = 0;j < 4; j++){
                  System.out.print("Digite un elemento en la posicion["+i+"]["+j+"] : ");
                  matriz[i][j] = teclado.nextInt();
              }
          }
          
          //Mostranos la matriz
          System.out.println("");
          System.out.println("La matriz es : ");
          for(int i = 0;i < 4; i++){
              for(int j = 0;j < 4; j++){
                  System.out.print(matriz[i][j] +  "  ");
              }
              System.out.println("");
          }
          
          
          //Imprimimos la diagonal
          System.out.println("");                  
          System.out.println("La diagonal principal es : ");
          for(int k = 0;k < 4; k++){
              System.out.println(matriz[k][k] + " ");
          }
          
          
    }
}
