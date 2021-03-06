
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.Producto;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author Edison
 */
public class VentanaEliminarProducto extends javax.swing.JInternalFrame {

    private ControladorProducto controladorProducto;
    private Producto producto;
    private int codigo;
     private Locale localizacion;
    private ResourceBundle mensajes;

    /**
     * Creates new form VentanaEliminarProducto
     */
    public VentanaEliminarProducto(ControladorProducto controladorProducto) {
        initComponents();
        this.controladorProducto = controladorProducto;
    }

     public void cambiarIdioma(ResourceBundle mensajes){
        lblCodigo.setText(mensajes.getString("cliente.codigo"));
        lblNombre.setText(mensajes.getString("cliente.nombre"));
        lblPrecio.setText(mensajes.getString("producto.precio"));
        lblStock.setText(mensajes.getString("jlb.stock"));
        lblCategoria.setText(mensajes.getString("menu.categoria"));
       
        
        btnEliminar.setText(mensajes.getString("btn.eliminar"));
        btnBuscar.setText(mensajes.getString("btn.buscar"));
        btnCancelar.setText(mensajes.getString("btn.cancelar"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 60, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/Imagenes/BS.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 40, -1));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 255, 255));
        lblCodigo.setText("Código");
        getContentPane().add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtCategoria.setEditable(false);
        txtCategoria.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 140, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 255, 255));
        lblNombre.setText("Nombre");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 255, 255));
        lblPrecio.setText("Precio");
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        lblStock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStock.setForeground(new java.awt.Color(0, 255, 255));
        lblStock.setText("Stock");
        getContentPane().add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        lblCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(0, 255, 255));
        lblCategoria.setText("Categoria");
        getContentPane().add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        txtStock.setEditable(false);
        txtStock.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 140, -1));

        txtPrecio.setEditable(false);
        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 140, -1));

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 140, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/Imagenes/tallwe3 (2).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 335));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
        Producto prod = controladorProducto.read(codigo);
        if (prod != null) {
            this.codigo = Integer.parseInt(txtCodigo.getText());
            txtCodigo.setText(String.valueOf(prod.getCodigo()));
            txtNombre.setText(prod.getNombre());
            txtPrecio.setText(String.valueOf(prod.getPrecio()));
            txtStock.setText(String.valueOf(prod.getStock()));
            txtCategoria.setText(prod.getCategoria().getNombre());
            btnEliminar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "No existe es producto", "buscar Producto", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        controladorProducto.delet(this.codigo);
        JOptionPane.showMessageDialog(this, "Datos eliminados correctamente", "Ventana Eliminar Producto", JOptionPane.OK_OPTION);
        txtCodigo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        txtCategoria.setText("");
        btnEliminar.setEnabled(false);
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
