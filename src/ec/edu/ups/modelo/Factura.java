/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Edison
 */
public class Factura {
    private int codigo;
    private Date fecha;
    private Empleado empleado;
    private Cliente cliente;
    private double total;
    private double subTotal;
    private double iva;
    private String estado;
    private Set<FacturaDetalle> lista;

    public Factura() {
        lista = new HashSet<>();
    }

    public Factura(int codigo, Date fecha, Empleado empleado, Cliente cliente) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.empleado = empleado;
        this.cliente = cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public Set<FacturaDetalle> getLista() {
        return lista;
    }

    public void setLista(Set<FacturaDetalle> lista) {
        this.lista = lista;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void addFacturaDetalle(FacturaDetalle facturaDetalle){
        lista.add(facturaDetalle);
    }

    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + ", fecha=" + fecha + ", empleado=" + empleado + ", cliente=" + cliente + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Factura other = (Factura) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    
}
