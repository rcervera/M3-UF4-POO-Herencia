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

// Classe Pare
public class Vehicle {
    private String matricula; // atribut d'un vehicle

    // Constructor sense arguments. 
    public Vehicle() {
        System.out.println("S'ha creat un vehicle");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void arrancar() { // metode d'un vehicle
        System.out.println("Arracant motor...");
    }
    
}
