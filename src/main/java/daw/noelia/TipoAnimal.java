/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw.noelia;

/**
 *
 * @author noelia
 */
public enum TipoAnimal {
    
    GATO(1,"Gato"),
    PERRO(2, "Perro"),
    LAGARTO(3, "Lagarto"),
    COBAYA(4, "Cobaya"),
    PERIQUITO(5, "Periquito");
    
    private int codigoTipo;
    private String tipo;

    private TipoAnimal(int codigoTipo, String tipo) {
        this.codigoTipo = codigoTipo;
        this.tipo = tipo;
    }

    public int getCodigoTipo() {
        return codigoTipo;
    }

    public String getTipo() {
        return tipo;
    }
    
    
    
    
}
