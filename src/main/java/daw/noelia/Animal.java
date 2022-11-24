/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.noelia;

import java.time.LocalDate;

/**
 *
 * @author noelia
 */
public class Animal {

    // Atributos
    private LocalDate fechaNacimiento;
    private String nombre;
    private TipoAnimal tipo;
    private double peso;
    private Estado estado;

    // Constructor por defecto
    public Animal() {
    }

    // Constructor parametrizado
    public Animal(LocalDate fechaNacimiento, String nombre, TipoAnimal tipo, double peso, Estado estado) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.estado = estado;
    }

    // Getter y setter
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    // To string
    @Override
    public String toString() {
        return "Animal{" + "fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + ", tipo=" + tipo.getTipo() + ", peso=" + peso + ", estado=" + estado.getEstado() + '}';
    }

    // Métodos
    // Si la cantidad de gramos es negativa le doy su valor absoluto
    public void comer(double cantidadGramos) {
        this.peso += Math.abs(cantidadGramos);
        this.estado = Estado.COMIENDO;
    }

    public void dormir() {
        this.estado = Estado.DURMIENDO;
    }

    public void despertar() {
        this.estado = Estado.DESPIERTO;
    }

    public void descansar() {
        this.estado = Estado.DESPIERTO;
    }

    // Primero filtro si es un número negativo, 
    //creo la excepción para cuando los minutos sean mas de 180
    public void jugar(int cantidadMinutos) {
        cantidadMinutos = Math.abs(cantidadMinutos);
        if (cantidadMinutos > 180) {
            throw new IllegalArgumentException(
                    "No puede jugar más de 180 minutos, no seas animal");
        }
        // Si los minutos de juego son menos de 30 se restan 10 gramos al peso
        //a partir de los 30 para arriba se irán restando de 20 en 20
        if (cantidadMinutos < 30) {
            this.peso -= 10;
        } else {
            this.peso -= 20 * (cantidadMinutos / 30);
        }
    }

    // Método para clonar un animal, si el animal no tiene datos no se clona
    //con el return devuelvo el nuevo animal con sus parametros
    public static Animal clonar(Animal pet) {
        if (pet == null) {
            throw new NullPointerException("No existen datos del animal");
        }
        return new Animal(pet.getFechaNacimiento(), pet.getNombre(), pet.getTipo(),
                pet.getPeso(), pet.getEstado());
    }

}
