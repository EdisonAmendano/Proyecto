/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Categoria;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Edison
 */
public class ControladorCategoria {
    private Set<Categoria> lista;
    private int codigo;

    public ControladorCategoria() {
        lista = new HashSet<>();
        codigo = 0;
    }
    
    public int getCodigo(){
        return codigo;
    }

    public Set<Categoria> getLista() {
        return lista;
    }
    
    //Crea el objeto y añade a la lista 
    public void create(Categoria objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    // Leer el objeto tipo Ave
    public Categoria read(int codigo) {
        for (Categoria pez : lista) {
            if (pez.getCodigo() == codigo) {
                return pez;
            }
        }
        return null;
    }
    // Modificacion del objeto tipo Ave
    public void update(Categoria objeto) {
        for (Categoria ave : lista) {
           
            if(ave.equals(objeto)){
                lista.remove(ave);
                lista.add(objeto);
                break;
            }
        }
    }
    // Eliminacion del objeto tipo Ave
    public void delet(int codigo) {
        for (Categoria ave : lista) {
            System.out.println(codigo);
            if(ave.getCodigo()== codigo){
                lista.remove(ave);
                break;
            }
        }
    }
    // Listar los objetos tipo Ave
    public void listar (){
        for (Categoria ave : lista) {
            System.out.println(ave);
        }
    }
    
}
