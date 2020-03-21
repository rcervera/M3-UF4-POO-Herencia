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

// Esportista és de filla de la classe Persona
// Heretarà d'ella els seus atributs i els seus mètodes 
public class Esportista extends Persona{
    private String esportPracticat;
    // El constructor en la classe Esportista és obligatori ara
    // ja que el constructor en Persona té un paràmetre
    public Esportista(String nom) {
        super(nom);
            // La instrucció super(nom) serveix per executar el constructor de la classe Pare
            // En aquests exemple serà obligatori també, degut al paràmetre.
            // Ha de ser la primera instrucció dins del constructor d'Esportista
        System.out.println(nom+ " es un esportista...");  
        
        this.Salutacio ="Hola, soc un esportista d'Elit!";
            // Canviem el valor de l'atribut de Persona. Podem fer-ho al estar definit com pivate
        // this.nom = nom;  
                //seria INCORRECTE, nom és atribut privat de Persona. Podem accedir-hi fent ús de setter o constructor
       // this.setNom(nom); Així CORRECTE
    }
    
    // Penseu que podem tenir més d'un Constructor: sobrecàrrega
    public Esportista(String nom, String esport) {
        super(nom); // Obligatori !
        this.esportPracticat = esport;
        System.out.println(nom+ " fa "+ this.esportPracticat);
    }
    
}
