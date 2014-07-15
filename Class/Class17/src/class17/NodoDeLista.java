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
public class NodoDeLista {
    
    private String dato;
    private String cuentaBancaria;
    private NodoDeLista siguiente;
    
    public NodoDeLista()
    {
        dato="";
        siguiente=null;
    }

    /**
     * @return the dato
     */
    public String getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(String dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public NodoDeLista getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoDeLista siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the cuentaBancaria
     */
    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    /**
     * @param cuentaBancaria the cuentaBancaria to set
     */
    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
    
}
