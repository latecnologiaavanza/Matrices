package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    
    /*
      Crear y cargar una matriz de 3 filas por 4 columnas. Imprimir la 
      primer fila. Imprimir la última fila e imprimir la primera columna.

    */
    
    public static void main(String[] args) {
     
           Scanner teclado = new Scanner(System.in);
           int matriz[][] = new int[3][4];
           
           //Rellenamos la matriz
           for(int i = 0;i < 3; i++){
               for(int j = 0;j < 4; j++){
                   System.out.print("Digite un elemento en la posicion ["+i+"]["+j+"] :  ");
                   matriz[i][j] = teclado.nextInt();
               }
           }
          
           //Imprimimos la matriz
           System.out.println("");
           System.out.println("La matriz es : ");
           for(int i = 0;i < 3; i++){
               for(int j = 0;j < 4; j++){
                   System.out.print(matriz[i][j] + "  ");
               }
               System.out.println("");
           }
    
           //Imprimimos la primera fila
           System.out.println("\nLa primera fila : ");
           for(int i = 0;i < 4; i++){
               System.out.println(matriz[0][i] + " ");
           }
           
           //Imprimimos la ultima fila
           System.out.println("\nLa ultima fila : ");
           for(int i = 0;i < 4; i++){
               System.out.println(matriz[2][i] + " ");
           }
           
           //Imprimos la primera columna
           System.out.println("\nLa primera columna : ");
           for(int i = 0;i < 3; i++){
               System.out.println(matriz[i][0] + "  ");
           }
    }   
      
}
