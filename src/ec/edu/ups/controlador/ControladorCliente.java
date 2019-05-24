/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Cliente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Edison
 */
public class ControladorCliente {
    private Set<Cliente> lista;
    private int codigo;
    // Constructor
    public ControladorCliente() {
        lista = new HashSet<>();
        codigo = 0;
    }
    // Creacion del objeto tipo Ave
    public void create(Cliente objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    // Leer el objeto tipo Ave
    public Cliente read(int codigo) {
        for (Cliente pez : lista) {
            if (pez.getCodigo() == codigo) {
                return pez;
            }
        }
        return null;
    }
    // Modificacion del objeto tipo Ave
    public void update(Cliente objeto) {
        for (Cliente ave : lista) {
           
            if(ave.equals(objeto)){
                lista.remove(ave);
                lista.add(objeto);
                break;
            }
        }
    }
    // Eliminacion del objeto tipo Ave
    public void delet(int codigo) {
        for (Cliente ave : lista) {
            if(ave.getCodigo()== codigo){
                lista.remove(ave);
                break;
            }
        }
    }
    // Listar los objetos tipo Ave
    public void listar (){
        for (Cliente ave : lista) {
            System.out.println(ave);
        }
    }
    
    public int getCodigo(){
        return codigo;
    }

    public Set<Cliente> getLista() {
        return lista;
    }

    
}
