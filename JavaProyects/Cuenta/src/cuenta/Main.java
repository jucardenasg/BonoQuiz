/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

/**
 *
 * @author Juan
 */
public class Main {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1,123,"f",100);
        
        System.out.print("Numero" + cuenta.numero);
        System.out.print("Clave" + cuenta.clave);
        System.out.print("Dueno" + cuenta.dueno);
        System.out.print("Saldo" + cuenta.saldo);
    }
    
}
