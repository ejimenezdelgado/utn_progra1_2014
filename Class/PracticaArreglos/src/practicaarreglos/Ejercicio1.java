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
public class Ejercicio1 {
    
    int[] vectores=new int[8];    
    
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
    
    public int Sumatoria()
    {
        int sumatoria=0;
        for (int i = 0; i < vectores.length; i++) {
            sumatoria+=vectores[i];
        }
        return sumatoria;
    }
    
    public int Sumatoria36()
    {
        int sumatoria=0;
        for (int i = 0; i < vectores.length; i++) {
            if(vectores[i]>36)
            {
                sumatoria+=vectores[i];    
            }            
        }
        return sumatoria;
    }
    
    public int Cantidad50()
    {
        int sumatotia=0;
        for (int i = 0; i < vectores.length; i++) {
            if(vectores[i]>=50)
            {
                sumatotia++;    
            }            
        }
        return sumatotia;
    }
    
}
