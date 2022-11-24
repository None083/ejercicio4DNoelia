/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.noelia;

import java.time.LocalDate;

/**
 *
 * @author noelia
 */
public class Prueba {

    /**
     * 
     */
    public static void main(String[] args) {
        
        Animal a1 = new Animal(LocalDate.of(2022, 4, 
                8), "Monty", TipoAnimal.PERRO, 19900, Estado.COMIENDO);
        Animal a2 = new Animal(LocalDate.of(2022, 11, 
                23), "Pipo", TipoAnimal.LAGARTO, 100, Estado.DURMIENDO);
        Persona p1 = new Persona ("Noelia", 30);
        Persona p2 = new Persona ("Currupepa", 56);
        
        Animal a3 = Animal.clonar(a2);
        
        p1.llamar(a1);
        p1.llamar(a2);
        p1.llamar(a3);
        
        p2.jugar(a2, 120);
        
        p1.alimentar(a1, 1000);
        System.out.println("El peso de " + a1.getNombre() + " es de " + a1.getPeso());
        
        p1.jugar(a1, 200);
        System.out.println("El peso de " + a1.getNombre() + " es de " + a1.getPeso());
        
        System.out.println(a1);
        
        
    }
    
}
