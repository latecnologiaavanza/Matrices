package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    
    /*
       Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir la 
       matriz completa y la última fila .

    */
    
    public static void main(String[] args) {
        
          Scanner teclado = new Scanner(System.in);
          int matriz[][];
          int cantidadFilas , cantidadColumnas;
          
          cantidadFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite la  cantidad de filas : "));
          cantidadColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de columnas : "));
          
          matriz = new int[cantidadFilas][cantidadColumnas];
          
          //Rellenamos la matriz
          for(int i = 0;i < cantidadFilas; i++){
              for(int j = 0;j < cantidadColumnas; j++){
                  System.out.print("Digite un elemento en la posicion ["+i+"]["+j+"] : ");
                  matriz[i][j] = teclado.nextInt();
              }
          }
          
          
          
          //Imprimimos la matriz
          System.out.println("\nLa matriz es : ");
          for(int  i = 0;i < cantidadFilas; i++){
              for(int j = 0;j < cantidadColumnas; j++){
                  System.out.print(matriz[i][j] + "  ");
              }
              System.out.println("");
          }
          
          
          //Imprimimos la última fila
          System.out.println("\nLa ultima fila de la matriz es : ");
          for(int i = 0;i < matriz[matriz.length - 1].length; i++){
              System.out.print(matriz[matriz.length - 1][i] + "  ");
          }
           
          System.out.println("");
          
          
    }    
}
