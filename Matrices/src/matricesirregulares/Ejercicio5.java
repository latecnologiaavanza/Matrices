package matricesirregulares;

import java.util.Scanner;

public class Ejercicio5 {
     
    /*
     Confeccionar una clase para administrar los días que han faltado los 3 empleados
     de una empresa. Definir un vector de 3 elementos de tipo String para cargar los
     nombres y una matriz irregular para cargar los días que han faltado cada empleado
     cargar el número de día que faltó , Cada fila de la matriz representan los días de
     cada empleado.Mostrar los empleados con la cantidad de inasistencias. 
     Cuál empleado faltó menos días.

    */
    
    
    public static void main(String[] args) {
        
          Scanner teclado = new Scanner(System.in);
          String nombres[] = new String[3];
          int dias[][] = new int[3][];
          
          //Rellenamos la matriz
          for(int i = 0;i < nombres.length; i++){
               System.out.print("Digite un nombre : ");
               nombres[i] = teclado.next();
               
               System.out.print("Digite la cantidad de dias que ha faltado el empleado " + nombres[i] + " : ");
               int cantidadFaltas = teclado.nextInt();
               
               dias[i] = new int[cantidadFaltas];
               for(int j = 0;j < dias[i].length; j++){
                   System.out.print("Digite el nº de dia : ");  
                   dias[i][j] = teclado.nextInt();
               }
               System.out.println("");
          }
          
          System.out.println("");
          
         //Imprimos la cantidad de inasistencias
         for(int i = 0;i < nombres.length; i++){
             System.out.println("El empleado " + nombres[i] + " tiene " + dias[i].length + " faltas . ");
         } 
         
         System.out.println("");
         
         //Calculamos el empleado con menor nº de inasistencias
         String nombre = nombres[0];
         int faltas = dias[0].length;
         
         for(int i = 1;i < nombres.length; i++){
             if(dias[i].length < faltas){
                  faltas = dias[i].length;
                  nombre = nombres[i];
             }
         }
         
         System.out.println("\nEl empleado con menor nº de faltas es " + nombre + " , cuenta con " + faltas + " faltas");
    }
}
