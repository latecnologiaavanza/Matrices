package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio3 {
    
    /*
       Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir el
       mayor elemento y la fila y columna donde se almacena .

    */
    
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner(System.in);
         int matriz[][];
         int cantidadFilas;
         int cantidadColumnas;
         
         cantidadFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas : "));
         cantidadColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de columnas : "));
         
        matriz = new int[cantidadFilas][cantidadColumnas];
        
        //Rellenamos la matriz
        for(int i = 0;i < cantidadColumnas; i++){
            for(int j = 0;j < cantidadColumnas; j++){
                System.out.print("Digite un elemento en la posicion["+i+"]["+j+"] : ");
                matriz[i][j] = teclado.nextInt();
            }
        }
            
        //Imprimos la matriz
        System.out.println("\nLa matriz es : ");
        for(int i = 0;i < cantidadFilas; i++){
            for(int j = 0;j < cantidadColumnas; j++){
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
        
        
        //Hallamos el elemento mayor de la matriz
        int elementoMayor = matriz[0][0];
        int posicionFila = 0;
        int posicionColumna = 0;
        
        for(int i = 0;i < cantidadFilas; i++){
            for(int j = 0;j < cantidadColumnas; j++){
                if(matriz[i][j] > elementoMayor){
                    elementoMayor = matriz[i][j];
                    posicionFila = i;
                    posicionColumna = j;
                }
            }
        }
        
        //Mostramos el elemento mayor y sus dichas posiciones
        System.out.println("");
        System.out.println("El elemento mayor es : " + elementoMayor + " la fila en la que se ubica es " + posicionFila + " y la columna en la que se ubica es : " + posicionColumna);
        
    }
}
