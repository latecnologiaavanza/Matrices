package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio15 {
    public static void main(String[] args) {
        
          Scanner teclado = new Scanner(System.in);
          int matriz[][];
          int cantidadFilas;
          int cantidadColumnas;
          int limite;
          
          cantidadFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas : "));
          cantidadColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de columnas : "));
          
          matriz = new int[cantidadFilas][cantidadColumnas];
          
          System.out.println("Digite el limite que desea para generar los numeros en la matriz : ");
          limite = teclado.nextInt();
          
          
          //Rellenamos la matriz
          for(int i = 0;i < cantidadFilas; i++){
              for(int j = 0;j < cantidadColumnas; j++){
                   matriz[i][j] = (int)(Math.random() * limite);
              }
          }
          
          System.out.println("");
                  
         
          //Imprimimos la matriz
          for(int i = 0;i < cantidadFilas; i++){
              for(int j = 0;j < cantidadColumnas; j++){
                  System.out.print(matriz[i][j] + "   ");
              }
              System.out.println("");
          }
          
    }
}
