/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Edison
 */
public class Cliente extends Persona{

    public Cliente() {
    }

    public Cliente(int codigo, String cedula, String nombre, String direccion, String telefono) {
        super(codigo, cedula, nombre, direccion, telefono);
    }
    
}
