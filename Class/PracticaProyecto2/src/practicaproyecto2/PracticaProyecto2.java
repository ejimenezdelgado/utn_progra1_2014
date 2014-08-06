/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaproyecto2;

import Nodos.NodoJugador;
import java.util.Scanner;
import practicaproyecto2.Listas.ListaEquipo;
import practicaproyecto2.Listas.ListaJugador;

/**
 *
 * @author Jimenez
 */
public class PracticaProyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado=new Scanner(System.in);
        
       ListaJugador alemania=new ListaJugador();
        alemania.Insertar("Klose", 36);
        alemania.Insertar("Luka", 26);
        alemania.Insertar("Reus", 23);
        
        ListaJugador costaRica=new ListaJugador();
        costaRica.Insertar("Campbell", 21);
        costaRica.Insertar("Ruiz", 27);
        costaRica.Insertar("Navas", 26);
        costaRica.Insertar("Duarte", 25);
        costaRica.Insertar("Bolaños", 30);
        costaRica.EliminarJugador("Duarte");
        costaRica.Imprimir();
        
        ListaEquipo equipos =new ListaEquipo();
        equipos.Insertar("Alemania", alemania);
        equipos.Insertar("Costa Rica", costaRica);
        equipos.Imprimir();
        /*
        System.out.println("Digite el nombre del jugador a buscar de Costa Rica");
        String nombre=teclado.nextLine();
        
        NodoJugador jugador= costaRica.BuscarJugador(nombre);
        System.out.println(jugador.getNombre());
        System.out.println(jugador.getEdad());
        
        
        System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
        teclado=new Scanner(System.in); 
        nombre=teclado.nextLine();
        
        System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
        teclado=new Scanner(System.in); 
        String nombreNuevo=teclado.nextLine();
        
        System.out.println("Digite la edad del jugador de Costa Rica a modificar");
        teclado=new Scanner(System.in); 
        int edad=teclado.nextInt();
        
        costaRica.ModificarJugador(nombre,nombreNuevo,edad);
        costaRica.Imprimir();*/
        
        costaRica.Invertir(costaRica.getListaJugadores());
      
        
    }
    
}
