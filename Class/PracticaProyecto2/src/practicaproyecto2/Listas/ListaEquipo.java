/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaproyecto2.Listas;

import Nodos.NodoEquipo;
import Nodos.NodoJugador;

/**
 *
 * @author Jimenez
 */
public class ListaEquipo {
    
    private NodoEquipo raiz;
    
    public void Insertar(String nombre,ListaJugador jugadores)
    {
        NodoEquipo nuevo;
        nuevo=new NodoEquipo();
        nuevo.setNombre(nombre);
        nuevo.setJugadores(jugadores.getListaJugadores());
        if(raiz==null)
        {
            nuevo.setSiguienteEquipo(null);
            raiz=nuevo;
        }
        else
        {
            NodoEquipo auxiliar=raiz;
            while (auxiliar.getSiguienteEquipo()!=null) 
            {  
                auxiliar=auxiliar.getSiguienteEquipo();             
            }
            auxiliar.setSiguienteEquipo(nuevo);
        }        
    }
    
    public void Imprimir()
    {
        NodoEquipo recorridoEquipo=raiz;
        
        System.out.println("Listado de todos los elementos de la lista");
        while(recorridoEquipo!=null)
        {
            System.out.println(recorridoEquipo.getNombre());
            
            NodoJugador recorridoJugadores=recorridoEquipo.getJugadores();
            while(recorridoJugadores!=null)
            {
                System.out.println(recorridoJugadores.getNombre() + " " +recorridoJugadores.getEdad());
                recorridoJugadores=recorridoJugadores.getSiguienteJugador();
            }
            recorridoEquipo=recorridoEquipo.getSiguienteEquipo();
        }
        System.out.println();
    }
    
    public boolean EstaVacia()
    {
        return raiz==null;
    }
}
