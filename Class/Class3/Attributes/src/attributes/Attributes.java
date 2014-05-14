/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package attributes;

import java.util.Scanner;

/**
 *
 * @author Efrén
 */
public class Attributes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              
        boolean validar=true;
        int opcion;
        char continuar;
        double monto;
        
        Account oAccount=new Account();
        Scanner teclado=new Scanner(System.in);     
        
        while(validar)
        {
            System.out.println("Digite 1 si quiere realizar un depósito y 2 si quiere realizar un retiro");
            opcion=Integer.parseInt(teclado.nextLine());
            
            if(opcion==1)
            {
                System.out.println("Digite el monto a depósitar");
                monto=Double.parseDouble(teclado.nextLine());
                oAccount.Deposito(monto);
            }
            
            if(opcion==2)
            {
                System.out.println("Digite el monto a retirar");
                monto=Double.parseDouble(teclado.nextLine());
                oAccount.Retiro(monto);
                if(oAccount.isHayError())
                {
                   System.out.println("El monto que usted va a retirar no puede ser retirado"); 
                }
            }
            
             System.out.println("El saldo final es de "+oAccount.getSaldoInicial()); 
             System.out.println("Desea continuar con otra transacción S/N "); 
             continuar=teclado.nextLine().charAt(0);
             if((continuar=='S')||(continuar=='s'))
             {
                 validar=true;                
             }     
             if((continuar=='N')||(continuar=='n'))
                 validar=false;
        }  
        
    }
    
}
