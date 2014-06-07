/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase9;

import java.util.Scanner;

/**
 *
 * @author Jimenez
 */
public class Clase9 {

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
            System.out.println("4. Salir");            
            opcion=teclado.nextInt();
            switch (opcion) {
                case 1:
                    ejercicio1 oejercicio1=new ejercicio1();
                    
                    for (int i = 0; i < 5; i++) {
                        teclado= new Scanner(System.in);
                        System.out.println("Digite el salario del trabajador # " +(i+1) );
                        oejercicio1.AgregarSalario(teclado.nextDouble());
                    }
                    System.out.println(oejercicio1.ImprimirSueldos());                                        
                    break;
                    
                case 2:
                    ejercicio2 oejercicio2=new ejercicio2();
                    for (int i = 0; i < 5; i++) {
                        teclado= new Scanner(System.in);
                        System.out.println("Digite la altura de la persona # " +(i+1) );
                        oejercicio2.AgregarAltura(teclado.nextFloat());                        
                    }
                    System.out.println("El promedio es : "+oejercicio2.Promedio());  
                    System.out.println(oejercicio2.ContarPersonas());
                    break;
                        
                default:
                    break;
            }  
        } while (opcion<5);
        
        
        
        
        
       /* double[] sueldos=new double[5];        
        int cantidadTrabajadores=1;
        double sueldo=0;
        
        */
        
        
        
        
      /*  do{
            
            System.out.println("Digite el sueldo del trabajador #"+cantidadTrabajadores);
            
            sueldo=teclado.nextDouble();
            
            sueldos[cantidadTrabajadores-1]=sueldo;
            
            cantidadTrabajadores++;
            
        }while(cantidadTrabajadores<6);
        
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("El sueldo del trabajador #"+ (i+ 1) +" es de " + sueldos[i]);
        }*/
        
       /* int cantidadPersonas=1;
        float alturaPersona=0;
        ejercicio2 oejercicio2=new ejercicio2();
         do{
            
            System.out.println("Digite la altura de la persona #"+cantidadPersonas);
            
            alturaPersona=teclado.nextFloat();
            oejercicio2.AgregarAltura(alturaPersona);          
            cantidadPersonas++;
            
        }while(cantidadPersonas<6);
        
        System.out.println("El promedio es"+ oejercicio2.Promedio());  
        System.out.println(oejercicio2.ContarPersonas());
        
        */
    }
    
}
