/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Factura;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Edison
 */
public class ControladorFactura {
    Set<Factura> lista;
    private int codigo;

    public ControladorFactura() {
        lista = new HashSet<>();
        codigo = 0;
    }
    
    public void create(Factura objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    // Leer el objeto tipo Ave
    public Factura read(int codigo) {
        for (Factura pez : lista) {
            if (pez.getCodigo() == codigo) {
                return pez;
            }
        }
        return null;
    }
    // Modificacion del objeto tipo Ave
    public void update(Factura objeto) {
        for (Factura ave : lista) {
           
            if(ave.equals(objeto)){
                lista.remove(ave);
                lista.add(objeto);
                break;
            }
        }
    }
    // Eliminacion del objeto tipo Ave
    public void delet(int codigo) {
        for (Factura ave : lista) {
            System.out.println(codigo);
            if(ave.getCodigo()== codigo){
                lista.remove(ave);
                break;
            }
        }
    }
    // Listar los objetos tipo Ave
    public void listar (){
        for (Factura ave : lista) {
            System.out.println(ave);
        }
    }
    
    public int getCodigo(){
        return codigo;
    }

    public Set<Factura> getLista() {
        return lista;
    }
       
}
