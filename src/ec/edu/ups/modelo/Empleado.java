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
public class Empleado extends Persona{
    
    private String puesto;
    private double salario;

    public Empleado() {
    }

    public Empleado(String puesto, double salario) {
        this.puesto = puesto;
        this.salario = salario;
    }

    public Empleado(String puesto, double salario, int codigo, String cedula, String nombre, String direccion, String telefono) {
        super(codigo, cedula, nombre, direccion, telefono);
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "puesto=" + puesto + ", salario=" + salario + '}';
    }
    
}
