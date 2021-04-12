package matricesirregulares;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner(System.in);
         int cantidadFilas;
         int matrizIrregular[][];
         
         cantidadFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas que desea para la matriz irregular : "));
         matrizIrregular = new int[cantidadFilas][];
         
         //Rellenamos la matriz irregular
         for(int i = 0;i < matrizIrregular.length;i++){
              System.out.print("Digite la cantidad de elementos para la fila " + i + " : "); 
              int nColumnas = teclado.nextInt();
              matrizIrregular[i] = new int[nColumnas];
              
              for(int j = 0;j < matrizIrregular[i].length; j++){
                  System.out.print("Digite un elemento en la posicion ["+i+"]["+j+"] : ");
                  matrizIrregular[i][j] = teclado.nextInt();
              }
              System.out.println("");       
         }
      
         System.out.println("");
            
         //Imprimimos la matriz
         System.out.println("La matriz irregular es : ");
         for(int i = 0;i < matrizIrregular.length; i++){
             for(int j = 0;j < matrizIrregular[i].length; j++){
                 System.out.print(matrizIrregular[i][j] + "  ");      
             }
             System.out.println("");
         }
                 
    }
}
