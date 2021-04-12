package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner(System.in);
         int matriz[][];
         int cantidadFilas;
         int cantidadColumnas;
         
         cantidadFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas : "));
         cantidadColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de columnas : "));
         
         matriz = new int[cantidadFilas][cantidadColumnas];
         
         //Llenamos la matriz
        for(int i = 0;i < cantidadFilas; i++){
            for(int j = 0;j < cantidadColumnas; j++){
                System.out.print("Digite un elemento en la posicion["+i+"]["+j+"] : ");
                matriz[i][j] = teclado.nextInt();
            }
        }
        
        //Mostramos la matriz
        System.out.println("");
        System.out.println("La matriz es : ");
        for(int i = 0;i < cantidadFilas; i++){
            for(int j = 0;j < cantidadColumnas; j++){
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
 
        //Imprimimos los vertices
        System.out.println("");

        //Imprimimos el vertices superios izquierdo
        System.out.println("El vertice superior izquierdo es : " + matriz[0][0]);
        
        //Imprimimos el vertices superior derecho
        System.out.println("El vertice superior derecho es : "  + matriz[0][matriz[0].length - 1]);
        
        //Imprimimos el vertice inferior izquierdo
        System.out.println("El vertice inferior izquierdo es : " + matriz[matriz.length - 1][0]);
        
        //Imprimimos el vertice inferior derecho
        System.out.println("El vertice inferior derecho es : " + matriz[matriz.length - 1][matriz[matriz.length - 1].length - 1]);
        

        
         
    }
}
