/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.noelia;

/**
 *
 * @author noelia
 */
public class Animal {
    private String fechaNacimiento;
    private String nombre;
    private String tipo;
    private double peso;
    private String estado;

    public Animal() {
    }

    public Animal(String fechaNacimiento, String nombre, String tipo, double peso, String estado) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
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

    @Override
    public String toString() {
        return "Animal{" + "fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + ", tipo=" + tipo + ", peso=" + peso + ", estado=" + estado + '}';
    }
    
    public void comer(double cantidadGramos){
        
        if (this.peso < 0){
            this.peso = Math.abs(this.peso) + cantidadGramos;
        }else{
            this.peso = this.peso + cantidadGramos;
        }
        
    }
    
    
    
}

//static Animal clonar (Animal pet){
//Animal aux = new Animal (pet.getNombre()...)
//}
//return aux;

//Animal nuevo = null;
//clonar(nuevo);
//if(pet!=null){
//}
//return aux;