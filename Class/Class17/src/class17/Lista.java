/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class17;

/**
 *
 * @author Jimenez
 */
public class Lista {
    
    private NodoDeLista raiz;
    
    public Lista()
    {
        raiz=null;
    }
    
    public void Insertar(String dato,String cuentaBancaria)
    {
        NodoDeLista nuevo;
        nuevo=new NodoDeLista();
        nuevo.setDato(dato);
        nuevo.setCuentaBancaria(cuentaBancaria);
        if(raiz==null)
        {
            nuevo.setSiguiente(null);
            raiz=nuevo;
        }
        else
        {
            NodoDeLista auxiliar=raiz;
           while (auxiliar.getSiguiente()!=null) 
            {  
                auxiliar=auxiliar.getSiguiente();             
            }
            auxiliar.setSiguiente(nuevo);
        }        
    }
    
    public void Imprimir()
    {
        NodoDeLista recorrido=raiz;
        System.out.println("Listado de todos los elementos de la lista");
        while(recorrido!=null)
        {
            System.out.println(recorrido.getDato() + " , la cuenta bancaria es " + recorrido.getCuentaBancaria());
            recorrido=recorrido.getSiguiente();
        }
        System.out.println();
    }
    
    public boolean EstaVacia()
    {
        if(raiz==null)
        {
            return true;
        }
        return false;
    }
    
}
