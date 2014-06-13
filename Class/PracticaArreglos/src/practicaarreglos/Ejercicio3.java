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
public class Ejercicio3 {
    
    int[] vector1=new int[5];    
    int[] vector2=new int[5];  
    
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
    
    public String PromedioMayor()
    {
        int promedio1=0;
        int promedio2=0;
        for (int i = 0; i < vector1.length; i++) {
            
            promedio1+=vector1[i];
            promedio2+=vector2[i];            
        }
        promedio1=promedio1/vector1.length;
        promedio2=promedio2/vector2.length;
        
        if(promedio1>promedio2)
            return "El primer grupo tiene mayor promedio que el segundo";
        else
            return "El segundo grupo tiene mayor promedio que el primero";
    }
    
    
    
}
