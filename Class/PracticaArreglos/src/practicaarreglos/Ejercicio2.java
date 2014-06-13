/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaarreglos;

/**
 *
 * @author Jimenez
 */
public class Ejercicio2 {
    
    int[] vector1=new int[4];    
    int[] vector2=new int[4];  
    int[] sumatoria=new int[4]; 
         
    public void AgregarVector1(int vector)
    {
        for (int i = 0; i < vector1.length; i++) {
            if(vector1[i]==0)
            {
               vector1[i]= vector;
               break;
            }
        }
    }
    
    public void AgregarVector2(int vector)
    {
        for (int i = 0; i < vector2.length; i++) {
            if(vector2[i]==0)
            {
               vector2[i]= vector;
               break;
            }
        }
    }
    
       // 0 1 2 3
 // 1  // 1 2 3 4
 // 2  // 1 2 3 4
 // 3  // 2 4 6 8
    public void Sumatoria()
    {
        for (int i = 0; i < vector1.length; i++) {
            sumatoria[i]=vector1[i]+vector2[i];
        }
    }
    
    public String Imprimir()
    {
        String imprimir="";
        for (int i = 0; i < sumatoria.length; i++) {
            imprimir+="El total de la sumatoria # "+(i+1)+ " es de "+ sumatoria[i] +" \n ";
        }
        return imprimir;
    } 
    
}
