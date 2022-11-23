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
    private String tipo;
    private double peso;
    private String estado;

    // Constructor por defecto
    public Animal() {
    }

    // Constructor parametrizado
    public Animal(LocalDate fechaNacimiento, String nombre, String tipo, double peso, String estado) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.estado = estado;
    }

    // Getter y setter
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
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
        return "Animal{" + "fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + ", tipo=" + tipo + ", peso=" + peso + ", estado=" + estado + '}';
    }

    // Métodos
    // Si la cantidad de gramos es negativa le doy su valor absoluto
    public void comer(double cantidadGramos) {
        this.peso += Math.abs(cantidadGramos);
    }

    public void dormir() {
        this.estado = "durmiendo";
    }

    public void despertar() {
        this.estado = "despierto";
    }

    public void descansar() {
        this.estado = "descansando";
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
