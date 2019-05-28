/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorEmpleado;
import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Producto;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edison
 */
public class VentanaListarProducto extends javax.swing.JInternalFrame {
    private ControladorProducto controladorProducto;

    /**
     * Creates new form VentanaListarProducto
     */
    public VentanaListarProducto(ControladorProducto controladorProducto) {
        initComponents();
        this.controladorProducto=controladorProducto;
    }

    VentanaListarProducto(ControladorEmpleado controladorEmpleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void llenarDatos(){
        DefaultTableModel modleo = (DefaultTableModel) table.getModel();
        Set<Producto> lista = controladorProducto.getLista();
        for (Producto prod : lista) {
            // Object[] datos = new Object[5]; //forma 1
            Object[] datos = {prod.getCodigo(), // forma 2 
                
                prod.getNombre(),
                prod.getCategoria(),
                prod.getPrecio(),
                prod.getStock() };
            modleo.addRow(datos);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setClosable(true);
        setTitle("Ventana Lista Producto");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Categoria", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
