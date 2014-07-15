/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase14;

/**
 *
 * @author Jimenez
 */
public class Clase14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo={56,4,85,85,42};
        int[] arreglo2={56,4,85,85,42};
        int[] arregloOrdenado;
        
        OrdenamientoSeleccion os=new OrdenamientoSeleccion();
        arregloOrdenado=os.OrdenS(arreglo, "A");
        System.out.println("Ordenamiento Seleccion");
        for (int i = 0; i < arregloOrdenado.length; i++) {
            System.out.println(arregloOrdenado[i]);
        } 
        
        OrdenamientoBurbuja ob=new OrdenamientoBurbuja();
        arregloOrdenado=ob.OrdenamientoB(arreglo2, "A");
        System.out.println("Ordenamiento burbuja");
        for (int i = 0; i < arregloOrdenado.length; i++) {
            System.out.println(arregloOrdenado[i]);
        } 
        
    }    
}
