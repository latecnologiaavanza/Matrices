package ejercicios;

import java.util.Scanner;


/*
  Sumar , restar y multiplicar una matriz de 3 x 3 
*/

public class Ejercicio17 {
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner(System.in);
         int primeraMatriz[][] = new int[3][3];
         int segundaMatriz[][] = new int[3][3];
         int matrizResultadoSuma[][] = new int[3][3];
         int matrizResultadoResta[][] = new int[3][3];
         int matrizResultadoMultiplicacion[][] = new int[3][3];
         
         
         //Llenamos la primera matriz
         System.out.println("Digite los elementos de la primera matriz");
         for(int i = 0;i < 3; i++){
             for(int j = 0;j < 3; j++){
                 System.out.print("Digite un elemento en la posicion ["+i+"]["+j+"] : ");
                 primeraMatriz[i][j] = teclado.nextInt();
             }
         }
         
         System.out.println("");
         
         //Llenamos la segunda matriz
         System.out.println("Digite los elementos de la segunda matriz");
         for(int i = 0;i < 3; i++){
             for(int j = 0;j < 3; j++){
                 System.out.print("Digite un elemento en la posicion ["+i+"]["+j+"] : ");
                 segundaMatriz[i][j] = teclado.nextInt();
             }
         }
         
         //Sumamos las matrices
         for(int i = 0;i < primeraMatriz.length; i++){
             for(int j = 0;j < segundaMatriz.length; j++){
                 matrizResultadoSuma[i][j] = primeraMatriz[i][j] + segundaMatriz[i][j];
             }
         }
         
         //Restamos las matrices
         for(int i = 0;i < primeraMatriz.length; i++){
             for(int j = 0;j < segundaMatriz.length; j++){
                 matrizResultadoResta[i][j] = primeraMatriz[i][j] - segundaMatriz[i][j];
             }
         }
         
         //Multiplicamos las matrices
         for(int i = 0;i < primeraMatriz.length; i++){
             for(int j = 0;j < segundaMatriz.length; j++){
                 matrizResultadoMultiplicacion[i][j] = primeraMatriz[i][j] * segundaMatriz[i][j];
             }
         }
         
         
         System.out.println("");
         
         //Imprimos las matrices
         System.out.println("la suma de las matrices es : ");
         for(int i = 0;i < primeraMatriz.length; i++){
             for(int j = 0;j < primeraMatriz.length; j++){
                 System.out.print(" [ " + primeraMatriz[i][j] + " ] ");
             }
             
             if(i == 1){
                 System.out.print("     +    ´");
             }
             else{
                 System.out.print("          ´");
             }
             
             for(int j = 0;j < segundaMatriz.length; j++){
                 System.out.print(" [ " + segundaMatriz[i][j] + " ] ");
             }
             
             if(i == 1){
                 System.out.print("     =    ´");
             }
             else{
                 System.out.print("          ´");
             }
             
             for(int j = 0;j < matrizResultadoSuma.length; j++){
                 System.out.print(" [ " + matrizResultadoSuma[i][j] + " ] ");
             }
             
             System.out.println("");
         }
         
         System.out.println("");
         System.out.println("La resta de matrices : ");
         
         for(int i = 0;i < primeraMatriz.length; i++){
             for(int j = 0;j < primeraMatriz.length; j++){
                 System.out.print(" [ " + primeraMatriz[i][j] + " ] ");
             }
             
             if(i == 1){
                 System.out.print("     -    ´");
             }
             else{
                 System.out.print("          ´");
             }
             
             for(int j = 0;j < segundaMatriz.length; j++){
                 System.out.print(" [ " + segundaMatriz[i][j] + " ] ");
             }
             
             if(i == 1){
                 System.out.print("     =    ´");
             }
             else{
                 System.out.print("          ´");
             }
             
             for(int j = 0;j < matrizResultadoSuma.length; j++){
                 System.out.print(" [ " + matrizResultadoResta[i][j] + " ] ");
             }
             
             System.out.println("");
         }
         
         System.out.println("");
         System.out.println("La multiplicacion de las matrices es : ");
         for(int i = 0;i < primeraMatriz.length; i++){
             for(int j = 0;j < primeraMatriz.length; j++){
                 System.out.print(" [ " + primeraMatriz[i][j] + " ] ");
             }
             
             if(i == 1){
                 System.out.print("     X    ´");
             }
             else{
                 System.out.print("          ´");
             }
             
             for(int j = 0;j < segundaMatriz.length; j++){
                 System.out.print(" [ " + segundaMatriz[i][j] + " ] ");
             }
             
             if(i == 1){
                 System.out.print("     =    ´");
             }
             else{
                 System.out.print("          ´");
             }
             
             for(int j = 0;j < matrizResultadoSuma.length; j++){
                 System.out.print(" [ " + matrizResultadoMultiplicacion[i][j] + " ] ");
             }
             
             System.out.println("");
         } 
         
    }
    
}
