package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        
           Scanner teclado  = new Scanner(System.in);
           int matriz[][];
           int cantidadFilas , cantidadColumnas;
           
           System.out.print("Digite la cantidad de filas : ");
           cantidadFilas = teclado.nextInt();
        
           System.out.print("Digite la cantidad de columnas : ");
           cantidadColumnas = teclado.nextInt();
           
           System.out.println("");
                  
           matriz = new int[cantidadFilas][cantidadColumnas];
           for(int i = 0;i < cantidadFilas; i++){
               for(int j = 0;j < cantidadFilas; j++){
                   System.out.print("Digite un elemento : ");
                   matriz[i][j] = teclado.nextInt();
             } 
           }
           
           System.out.println("");
               
           System.out.println("La matriz es : ");
           for(int i = 0;i < cantidadFilas; i++){
               for(int j = 0;j < cantidadFilas; j++){
                   System.out.print(matriz[i][j] + "  ");
             } 
               System.out.println("");
           }    
           
           
           System.out.println("");

           
           
           //Transponemos la matriz
           int auxiliar;
           for(int i = 0;i < cantidadFilas; i++){
               for(int j = 0;j < i; j++){
                   auxiliar = matriz[i][j];  
                   matriz[i][j] = matriz[j][i];
                   matriz[j][i] = auxiliar;
               }
           }
           
          
           //Imprimos la matriz
           System.out.println("La matriz transpuesta es : ");
           for(int i = 0;i < cantidadFilas; i++){
               for(int j = 0;j < cantidadFilas; j++){
                   System.out.print(matriz[i][j] + "  ");
             } 
               System.out.println("");
           }    
           
    }
}
