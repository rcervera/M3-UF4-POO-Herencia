/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Exemple1.Cotxe;
import Exemple1.Tractor;
import Exemple1.Vehicle;
import Exemple2.Esportista;
import Exemple2.Persona;

/**
 *
 * @author Namo
 */
public class ExemplesPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Exemple 1
        Vehicle v = new Vehicle(); // 1
        Cotxe c = new Cotxe();     // 2  Cotxe és un tipus de Vehicle. Classe filla de Vehicle
        Tractor t = new Tractor(); // 3  Tractor és un tipus de Vehicle. Classe filla de Vehicle
        
        v.arrancar(); // 4
        c.arrancar(); // 5
        t.arrancar(); // 6
        
        // Sortida Esperada: 
//        S'ha creat un vehicle (execució Constructor classe Vehicle) // 1
//        S'ha creat un vehicle (execució Constructor classe Vehicle) // 2
//        S'ha creat un vehicle  (execució Constructor classe Vehicle) // 3 
//        S'ha creat un tractor (execució Constructor classe Tractor. Tractor ha redefinit el constructor) // 3
//        Arracant motor... (execució metode arrancar de Vehicle) // 4
//        Arracant motor... (execució metode arrancar de Vehicle) // 5
//        brumm brumm ... (execució metode arrancar de Tractor. Tractor ha redefinit el matode arrancar) // 6
               
        // Exemple 2
        Persona p = new Persona("Ana");
        System.out.println(p.getSalutacio());
        Esportista e1 = new Esportista("Maria");
        System.out.println(e1.getSalutacio());
        Esportista e2 = new Esportista("Josep","Atletisme");
        System.out.println(e2.getSalutacio());

    }
    
}
