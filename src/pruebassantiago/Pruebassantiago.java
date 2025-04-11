/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebassantiago;

import java.util.Scanner;

public class Pruebassantiago {

    static boolean celula = false;
    static Scanner INPUT = new Scanner(System.in);

   public static void main(String[] args) {
        mostrarMenu();
    }
    
   public static void mostrarMenu(){
       int opcion;
       do {
           System.out.println("Juego de la vida grupo 6");
           System.out.println("1. iniciar la matriz");
           System.out.println("2. mostrar la matriz");
           System.out.println("3. siguiente generacion");
           System.out.println("4. mostrar las reglas");
           System.out.println("5. terminar el programa");
           
           opcion = INPUT.nextInt();
           
           switch(opcion) {
               case 1:
                   iniciarMatriz();
                   break;
               case 2:
                    imprimirMatriz();
                    break;
                case 3:
                    siguienteGeneracion();
                    break;
                case 4:
                    mostrarReglas();
                    break;
                case 5:
                    System.out.println("terminando el programa");
                    break;
                default:
                    System.out.println("opcion no valida");
                   
           }
       } 
       while(opcion !=5);
   }

    
    public static void Matriz(){
        
        boolean sociedadMatriz[][] = new boolean[15][15];
        iniciarMatriz(sociedadMatriz);
    }
    
    public static void iniciarMatriz(boolean sociedadMatriz[][]){
        int piso = 1;
        int techo = 15;
        int cantidadCelulas = 0;
        System.out.print("Con cuentas celulas empezara la simulacion?");
        cantidadCelulas = INPUT.nextInt();
        
        for(int i = 0; i<cantidadCelulas;i++){
            int ValorAleatorio = (int) (Math.random()*(techo-piso+1));
            sociedadMatriz[ValorAleatorio][2] = true;
        }
    }
    
    public static void imprimirMatriz(boolean sociedadMatriz[][]){
        for(int i = 0; i < sociedadMatriz.length; i++) {
            for(int j = 0; j < sociedadMatriz[i].length; j++)
                if (sociedadMatriz[i][j] == false)
                    System.out.print("|_|\t");

            System.out.println();
}
}
    public static void mostrarReglas() {
        System.out.println("\n los lineamientos del automata son: ");
        System.out.println("1-una célula viva con menos de 2 vecinos vivos muere por soledad ");
        System.out.println("2-una célula viva con 2 o 3 vecinos vivos sobrevive ");
        System.out.println("3-una célula viva con más de 3 vecinos vivos muere por superpoblación");
        System.out.println("4-una célula muerta con exactamente 3 vecinos vivos revive por reproducción");
    }
    
}