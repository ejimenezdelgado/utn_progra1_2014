/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaarreglos;

import java.util.Scanner;

/**
 *
 * @author Jimenez
 */
public class PracticaArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion=0;  
        Scanner teclado= new Scanner(System.in);
        
        do { 
            System.out.println("Digite la opcion del ejercicio a evaluar");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Salir");            
            opcion=teclado.nextInt();
            switch (opcion) {
                case 1:
                    Ejercicio1 oEjercicio1=new Ejercicio1();
                    
                    for (int i = 0; i < 8; i++) {
                        teclado= new Scanner(System.in);
                        System.out.println("Digite valor # " +(i+1) );
                        oEjercicio1.AgregarVector(teclado.nextInt());
                    }
                    System.out.println("La sumatoria del vector es "+oEjercicio1.Sumatoria());  
                    System.out.println("La sumatoria del vector mayor a 36 es "+oEjercicio1.Sumatoria36()); 
                    System.out.println("La cantidad de elementos del vector mayores a 50 es "+oEjercicio1.Cantidad50());  
                    break;
                case 2:
                        Ejercicio2 oEjercicio2=new Ejercicio2();
                    
                    for (int i = 0; i < 4; i++) {
                        teclado= new Scanner(System.in);
                        System.out.println("Digite valor del vector 1 # " +(i+1) );
                        oEjercicio2.AgregarVector1(teclado.nextInt());
                    }
                    for (int i = 0; i < 4; i++) {
                        teclado= new Scanner(System.in);
                        System.out.println("Digite valor del vector 2 # " +(i+1) );
                        oEjercicio2.AgregarVector2(teclado.nextInt());
                    }
                    oEjercicio2.Sumatoria();
                    System.out.println("La sumatoria es : "+oEjercicio2.Imprimir());  
                    break;
                case 3:
                        Ejercicio3 oEjercicio3=new Ejercicio3();
                    
                    for (int i = 0; i < 5; i++) {
                        teclado= new Scanner(System.in);
                        System.out.println("Digite valor del vector 1 # " +(i+1) );
                        oEjercicio3.AgregarVector1(teclado.nextInt());
                    }
                    for (int i = 0; i < 5; i++) {
                        teclado= new Scanner(System.in);
                        System.out.println("Digite valor del vector 2 # " +(i+1) );
                        oEjercicio3.AgregarVector2(teclado.nextInt());
                    }
                    System.out.println(oEjercicio3.PromedioMayor());  
                    break;
                    
                case 4:
                        Ejercicio4 oEjercicio4=new Ejercicio4();
                    
                    for (int i = 0; i < 10; i++) {
                        teclado= new Scanner(System.in);
                        System.out.println("Digite valor del vector 1 # " +(i+1) );
                        oEjercicio4.AgregarVector(teclado.nextInt());
                    }
                    boolean estado=oEjercicio4.EstaOrdenado();
                    if(estado)
                        System.out.println("El vector esta ordenado :");  
                    else
                        System.out.println("El vector esta desordenado:");  
                    break;
            }
        }while (opcion<=5);
    }
    
}
