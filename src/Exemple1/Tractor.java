/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemple1;

/**
 *
 * @author Ramon Cervera
 */

// La classe Tractor és una classe Filla de Vehicle
// Fem ús de la paraula extends!
public class Tractor  extends Vehicle{

    // Constructor sense paràmetres!!
    public Tractor() {
        // super(); 
                    // Crida al constructor de la classe Pare
                    // quan no té paràmetres,no és necessari cridar-lo
                    // es crida automàticament
        System.out.println("S'ha creat un tractor");       
        
    }

    // Tornem a redefinir el mètode arrencar de la classe Pare
    @Override
    public void arrancar() {
       // super.arrancar();  
            // Si descomentes la linia anterior s'executarà també el mètode arrencar del Pare
        System.out.println("brumm brumm ...");
    }
    
    
    
    
}
