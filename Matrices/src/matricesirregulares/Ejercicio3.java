package matricesirregulares;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner(System.in);
         int matrizIrregular[][] = new int[5][];
         
         System.out.println("Rellene la matriz porfavor : ");
         for(int i = 0;i < matrizIrregular.length; i++){
               matrizIrregular[i] = new int[i+1]; 
               for(int j = 0;j < matrizIrregular[i].length; j++){
                   System.out.print("Digite un elemento para la fila ["+i+"] : ");
                   matrizIrregular[i][j] = teclado.nextInt();
               }
         }
         
         System.out.println("");
         System.out.println("La matriz irregular es : ");
         for(int i = 0;i < matrizIrregular.length; i++){
             for(int j = 0;j < matrizIrregular[i].length; j++){
                 System.out.print(matrizIrregular[i][j] + " ");
             }
             System.out.println("");
         }
         
    }
}
