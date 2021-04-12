package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner(System.in);
         
         //Creamos las matrices y arreglos 
         String nombres[] = new String[4]; //Creamos el arreglo para guardar los nombres de los empleados
         int sueldos[][] = new int[4][3]; //Creamos la matriz para guardar los sueldos de los empleados
         int sueldosTotales[] = new int[4]; //Creamos el arreglo para guardar  los sueldos totales de cada empleado
         
         
         System.out.println("Digite los datos de los empleados : ");
         System.out.println("");
         
         //Rellenemaos los nombres y los sueldos
         for(int i = 0;i < nombres.length; i++){
             System.out.print("Digite el nombre del empleado : ");
             nombres[i] = teclado.next();
             
             //Creamos un segundo for para guardar los sueldos
             for(int j = 0;j < sueldos[i].length; j++){
                 System.out.print("Digite el sueldo del empleado " + nombres[i] + " : ");
                 sueldos[i][j] = teclado.nextInt();
             }
             
             System.out.println("");
         }
         
         //Vamos a calcular la suma de los sueldos de cada empleado
         for(int i = 0;i < sueldosTotales.length; i++){
             int sumaSueldos = 0;
             for(int j = 0;j < sueldos[i].length; j++){
                  sumaSueldos = sumaSueldos + sueldos[i][j];
             }
             sueldosTotales[i] = sumaSueldos;
         }
         
         //Imprimimos los sueldos y nombres de cada empleado
         System.out.println("");
         System.out.println("Los sueldos totales de los empleados son : ");
         for(int i = 0;i < sueldosTotales.length; i++){
             System.out.println("El sueldo del empleado " + nombres[i] + " es : " + sueldosTotales[i]);
         }
         
         
         System.out.println("");
         
         //Hallamos el nombre del empleado con mayor sueldo
         int sueldoMayor = sueldosTotales[0];
         String nombreEmpleadoConSueldoMayor = nombres[0];
         
         for(int i = 0;i < sueldosTotales.length; i++){
             if(sueldosTotales[i] > sueldoMayor){
                 sueldoMayor = sueldosTotales[i];
                 nombreEmpleadoConSueldoMayor = nombres[i];
             }
         }
         
         //Mostramos el sueldo y nombre del empleado
         System.out.println("El empleado con mayor sueldo es : " + nombreEmpleadoConSueldoMayor + " , con un total de " + sueldoMayor + " soles . ");
         
    }
}
