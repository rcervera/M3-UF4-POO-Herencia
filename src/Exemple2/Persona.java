/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemple2;

/**
 *
 * @author Ramon Cervera
 */
public class Persona {

    private String nom;
    protected String Salutacio; // Farem aquest atribut de tipus protected,
                                // així les seves classes filles podran modificar-lo!

    // Persona té un constructor amb un paràmetre: nom !!
    public Persona(String nom) {
        this.nom = nom;
        System.out.println(nom +" es una persona...");
        this.Salutacio ="Hola, sóc una gran persona!";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSalutacio() {
        return Salutacio;
    }
    
    
    
    
}
