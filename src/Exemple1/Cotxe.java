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
// La classe Cotxe és filla de la classe Vehicle. 
// Fem ús de la paraula extends!
public class Cotxe extends Vehicle {
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
