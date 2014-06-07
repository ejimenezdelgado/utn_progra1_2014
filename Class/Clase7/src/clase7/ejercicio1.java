/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase7;

/**
 *
 * @author Jimenez
 * Realizar una clase, que permita cargar una dirección de mail en el constructor, 
    luego en otro método mostrar un mensaje si contiene el caracter '@'.
 */
public class ejercicio1 {
    
    private String email;
        
    public ejercicio1(String pEmail)
    {
        this.email=pEmail;
    }
    
    public String ValidarCorrreo()
    {
        String mensaje="El correo no contiene @";
        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i)=='@')
            {
                mensaje="El correo si contiene @";
            }            
        }
        return mensaje;         
    }    
}
