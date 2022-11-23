/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.noelia;

/**
 *
 * @author noelia
 */
public class Persona {
    
    // Atributos
    private String nombre;
    private int edad;

    public Persona() {
    }

    // Constructor parametrizado
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters y setters
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // To string
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    // Métodos
    public void llamar(Animal pet){
        pet.despertar();
    }
    
    public void alimentar(Animal pet, double cantidadGramos){
        pet.comer(cantidadGramos);
    }
    
    public void jugar(Animal pet, int cantidadMinutos){
        try{
            pet.jugar(cantidadMinutos);
        } catch(IllegalArgumentException iae){
            pet.jugar(180);
        }
    }
    
}
