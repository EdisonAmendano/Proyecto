/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Producto;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Edisonjhkl
 */
public class ControladorProducto {
    private Set<Producto> lista;
    private int codigo;

    public ControladorProducto() {
        lista = new HashSet<>();
        codigo = 0;
    }

    public void setLista(Set<Producto> lista) {
        this.lista = lista;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void create(Producto objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    // Leer el objeto tipo Ave
    public Producto read(int codigo) {
        for (Producto pez : lista) {
            if (pez.getCodigo() == codigo) {
                return pez;
            }
        }
        return null;
    }
    // Modificacion del objeto tipo Ave
    public void update(Producto objeto) {
        for (Producto ave : lista) {
           
            if(ave.equals(objeto)){
                lista.remove(ave);
                lista.add(objeto);
                break;
            }
        }
    }
    // Eliminacion del objeto tipo Ave
    public void delet(int codigo) {
        for (Producto ave : lista) {
            System.out.println(codigo);
            if(ave.getCodigo()== codigo){
                lista.remove(ave);
                break;
            }
        }
    }
    // Listar los objetos tipo Ave
    public void listar (){
        for (Producto ave : lista) {
            System.out.println(ave);
        }
    }
    
    public int getCodigo(){
        return codigo;
    }

    public Set<Producto> getLista() {
        return lista;
    }
    
    
}
