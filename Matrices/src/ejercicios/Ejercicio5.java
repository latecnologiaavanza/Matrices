package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner(System.in);
         int matriz[][];
         int cantidadFilas;
         int cantidadColumnas;
         
         cantidadFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas : "));
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
         System.out.println("\nLa matriz actual es : ");
         for(int i = 0;i < cantidadFilas; i++){
             for(int j = 0;j < cantidadColumnas; j++){
                 System.out.print(matriz[i][j] +  "  ");
             }
             System.out.println("");
         }
         
         
         //Intercambiamos la filas
         int auxiliar;
         for(int i = 0;i < matriz[0].length; i++){
               auxiliar = matriz[0][i];
               matriz[0][i] = matriz[1][i];
               matriz[1][i] = auxiliar;
         }
 
         //Mostramos la matriz intercambiada de filas
         System.out.println("\nLa matriz intercambiada es : ");
         for(int i = 0;i < cantidadFilas; i++){
             for(int j = 0;j < cantidadColumnas; j++){
                 System.out.print(matriz[i][j]  + "  ");
             }
             System.out.println("");
         }
         
    }
}
