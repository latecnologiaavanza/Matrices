package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio19 {
     public static void main(String[] args) {
        
           Scanner teclado = new Scanner(System.in);
           int nFilas , nColumnas;
           int matriz[][];
           
           nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas que desea : "));
           nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de columnas que desea : "));
           
           matriz = new int[nFilas][nColumnas];
           
           for(int i = 0;i < nFilas; i++){
               for(int k = 0;k < nColumnas; k++){
                   System.out.print("Digite un elemento en la posicion ["+i+"]["+k+"] : ");
                   matriz[i][k] = teclado.nextInt();
               }
           }
           
           System.out.println("\nLa matriz es : ");
           for(int i = 0;i < nFilas; i++){
               for(int k = 0;k < nColumnas; k++){
                    System.out.print(matriz[i][k] + "   ");
               }
               System.out.println("");
           }
           
           System.out.println("");
           
           //Sumamos cada fila y columna de la matriz
           int sumaFila;
           int sumaColumna;
           
           for(int i = 0;i < nFilas; i++){
               sumaFila = 0;
               for(int j = 0;j < nColumnas; j++){
                    sumaFila = sumaFila + matriz[i][j];
               }
               System.out.println("La suma de la fila " + i + " es : " + sumaFila);
           }
           
           System.out.println("");
           
           for(int j = 0;j < nColumnas; j++){
               sumaColumna = 0;
               for(int i = 0;i < nFilas; i++){
                   sumaColumna = sumaColumna + matriz[i][j];
               }
               System.out.println("La suma de la columna " + j + " es : " + sumaColumna);
           }
           
    }
}
