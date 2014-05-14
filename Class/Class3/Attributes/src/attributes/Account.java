/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package attributes;

/**
 *
 * @author Efrén
 */
public class Account {
    
    private double saldoInicial;
    private boolean hayError;
    
    public Account()
    {
        saldoInicial=0;
        hayError=false;
    }
    
    /**
     * Este método sirve para aumentar la cuenta de un usuario
     * @param monto Parámetro para recibir el nuevo monto
     */
    public void Deposito(double monto)
    {
        setSaldoInicial(getSaldoInicial() + monto);
    }
    
    /**
     * Este método sirve para dismunuir la cuenta de un usuario
     * @param monto Parámetro para recibir el nuevo monto
     */
    public void Retiro(double monto)
    {
        if(getSaldoInicial()>=monto)
            setSaldoInicial(getSaldoInicial() - monto);
        else
            setHayError(true);
    }

    /**
     * @return the saldoInicial
     */
    public double getSaldoInicial() {
        return saldoInicial;
    }

    /**
     * @param saldoInicial the saldoInicial to set
     */
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    /**
     * @return the hayError
     */
    public boolean isHayError() {
        return hayError;
    }

    /**
     * @param hayError the hayError to set
     */
    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }
    
    
    
}
