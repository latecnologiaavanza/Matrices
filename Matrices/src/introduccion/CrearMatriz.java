package introduccion;

import java.util.Scanner;

public class CrearMatriz {
    public static void main(String[] args) {
     
         Scanner teclado = new Scanner(System.in);
         int matriz[][] = new int[4][3];
         //esta matriz tiene 4 filas y 3 colummas
         
         for(int i = 0;i < 4; i++){
             for(int j = 0;j < 3; j++){
                 System.out.print("Digite un elemento en la posicion ["+i+"]["+j+"] : ");
                 matriz[i][j] = teclado.nextInt();
             }
         }
         
         //Mostramos la matriz
         System.out.println("\nLa matriz es : ");
         for(int i = 0;i < 4; i++){
             for(int j = 0;j < 3; j++){
                 System.out.print(matriz[i][j] + " ");
             }
             System.out.println("");                  
         }
         
       
                 
    }    
}
