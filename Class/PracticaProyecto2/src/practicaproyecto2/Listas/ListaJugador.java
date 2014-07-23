/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaproyecto2.Listas;

import Nodos.NodoJugador;

/**
 *
 * @author Jimenez
 */
public class ListaJugador {

    private NodoJugador listaJugadores;

    public void Insertar(String nombre, int edad) {
        NodoJugador nuevo;
        nuevo = new NodoJugador();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        if (getListaJugadores() == null) {
            nuevo.setSiguienteJugador(null);
            setListaJugadores(nuevo);
        } else {
            NodoJugador auxiliar = getListaJugadores();
            while (auxiliar.getSiguienteJugador() != null) {
                auxiliar = auxiliar.getSiguienteJugador();
            }
            auxiliar.setSiguienteJugador(nuevo);
        }
    }

    public void Imprimir() {
        NodoJugador recorridoJugador = getListaJugadores();

        System.out.println("Listado de todos los elementos de la lista");
        while (recorridoJugador != null) {
            System.out.println(recorridoJugador.getNombre() + " " + recorridoJugador.getEdad());
            recorridoJugador = recorridoJugador.getSiguienteJugador();
        }
        System.out.println();
    }

    public boolean EstaVacia() {
        return getListaJugadores() == null;
    }

    public void EliminarJugador(String nombre) {
        NodoJugador siguienteJugador = listaJugadores;
        NodoJugador anterior = siguienteJugador;

        if (siguienteJugador == null) {
            System.out.println("Lista de jugadores vacia");
            return;
        }
        while (siguienteJugador != null) 
        {
            if (nombre.equals(siguienteJugador.getNombre())) 
            {
                if (siguienteJugador == listaJugadores) 
                {
                    listaJugadores = siguienteJugador.getSiguienteJugador();
                    return;
                }
                anterior.setSiguienteJugador(siguienteJugador.getSiguienteJugador());
                return;
            }
            anterior = siguienteJugador;
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
    }
    
    public NodoJugador BuscarJugador(String nombre)
    {
        NodoJugador siguienteJugador = listaJugadores;
        while (siguienteJugador != null) 
        {
            if (nombre.equals(siguienteJugador.getNombre())) 
            {
                return siguienteJugador;
            }
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
        return null;
    }
    
    public void ModificarJugador(String nombre,String nuevoNombre,int edad)
    {
        NodoJugador siguienteJugador = listaJugadores;
        while (siguienteJugador != null) 
        {
            if (nombre.equals(siguienteJugador.getNombre())) 
            {
                siguienteJugador.setNombre(nuevoNombre);
                siguienteJugador.setEdad(edad);
                return;
            }
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
    }

    /**
     * @return the listaJugadores
     */
    public NodoJugador getListaJugadores() {
        return listaJugadores;
    }

    /**
     * @param listaJugadores the listaJugadores to set
     */
    private void setListaJugadores(NodoJugador listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

}
