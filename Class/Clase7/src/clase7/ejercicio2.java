/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase7;

/**
 *
 * @author Jimenez
 * 
 * Cargar un String por teclado e implementar los siguientes métodos:
a) Imprimir la primera mitad de los caracteres de la cadena. 
b) Imprimir el último caracter. 
c) Imprimirlo en forma inversa. 
d) Imprimir cada caracter del String separado con un guión. 
e) Imprimir la cantidad de vocales almacenadas. 
f) Implementar un método que verifique si la cadena se lee igual de izquierda a 
* derecha tanto como de derecha a izquierda (ej. neuquen se lee igual en las dos direcciones)
* 
 */
public class ejercicio2 {
    
    private String cadena;
    
    
    public String MediaCadena()
    {
        String retorno="";
        for (int i = 0; i < getCadena().length()/2 ; i++) {
            retorno+=getCadena().charAt(i);
        }        
        return retorno;
    } 
    
    public String UltimoValor()
    {
        return getCadena().charAt(getCadena().length()-1 )+"";
    }   
    
    public String Alrevez()
    {
       String retorno="";
       
        for (int i = getCadena().length()-1; i >= 0; i--) {
            retorno+=getCadena().charAt(i);
        }        
        return retorno; 
    }
    
    public String Guion()
    {
        String retorno="";
        for (int i = 0; i < getCadena().length() ; i++) {
            
            if(getCadena().length()-1==i)
            {
                retorno+=getCadena().charAt(i);
            }
            else
            {
                retorno+=getCadena().charAt(i)+"-";
            }            
        }        
        return retorno;
    }
    
    public int Vocales()
    {
        int cantidadVocales=0;
        for (int i = 0; i < getCadena().length() ; i++) {
            
            if((getCadena().charAt(i)=='a')||
               (getCadena().charAt(i)=='A')||
               (getCadena().charAt(i)=='e')||
               (getCadena().charAt(i)=='E')||
               (getCadena().charAt(i)=='i')||
               (getCadena().charAt(i)=='I')||
               (getCadena().charAt(i)=='o')||
               (getCadena().charAt(i)=='O')||
               (getCadena().charAt(i)=='u')||
               (getCadena().charAt(i)=='U')) 
            {
                cantidadVocales++;
            }         
        }
        return cantidadVocales;
    }
    
    public boolean Palindromo()
    {
        String palabraAlrevez="";
        
        for (int i = getCadena().length()-1; i >= 0; i--) {
            palabraAlrevez+=getCadena().charAt(i);
        }   
        
        if(getCadena().equals(palabraAlrevez))
        {
            return true;
        }
        else
        {
            return false;
        }         
    }
    

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
}
