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
public class Ejercicio4 {
    
    int[] vectores=new int[10];    
    
    public void AgregarVector(int vector)
    {
        for (int i = 0; i < vectores.length; i++) {
            if(vectores[i]==0)
            {
               vectores[i]= vector;
               break;
            }
        }
    }
    
    public boolean EstaOrdenado()
    {
        for (int i = 0; i < vectores.length; i++) {
            
            if(vectores[vectores.length-1]!=vectores[i])
            {
                if(vectores[i]>vectores[i+1])
                {
                    return false;
                }
            }
        }
        return true;
    }
    
}
