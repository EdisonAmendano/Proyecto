/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCategoria;
import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.Categoria;
import ec.edu.ups.modelo.Producto;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Edison
 */
public class VentanaModificarProducto extends javax.swing.JInternalFrame {

    private ControladorProducto controladorProducto;
    private ControladorCategoria controladorCategoria;
    private Producto producto;
    private Set<Categoria> lista;
    private int codigo;
     private Locale localizacion;
    private ResourceBundle mensajes;

    /**
     * Creates new form VentanaModificarProducto
     */
    public VentanaModificarProducto(ControladorProducto controladorProducto, ControladorCategoria controladorCategoria) {
        initComponents();
        this.controladorProducto = controladorProducto;
        this.controladorCategoria = controladorCategoria;
    }
       public void cambiarIdioma(ResourceBundle mensajes){
        lblCodigo.setText(mensajes.getString("cliente.codigo"));
        lblNombre.setText(mensajes.getString("cliente.nombre"));
        lblPrecio.setText(mensajes.getString("producto.precio"));
        lblStock.setText(mensajes.getString("jlb.stock"));
        lblCategoria.setText(mensajes.getString("menu.categoria"));
       
        
        btnActualizar.setText(mensajes.getString("btn.actualizar"));
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
        lblCodigo = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        jCCategoria = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 70, -1));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 255, 255));
        lblCodigo.setText("Código");
        getContentPane().add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/Imagenes/BS.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 40, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 255, 255));
        lblNombre.setText("Nombre");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 255, 255));
        lblPrecio.setText("Precio");
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblStock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStock.setForeground(new java.awt.Color(0, 255, 255));
        lblStock.setText("Stock");
        getContentPane().add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        lblCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(0, 255, 255));
        lblCategoria.setText("Categoria");
        getContentPane().add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 100, -1));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 100, -1));
        getContentPane().add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 100, -1));

        getContentPane().add(jCCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 100, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        btnActualizar.setText("Guardar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/Imagenes/tallwe3 (2).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 299, 333));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
        Producto prod = controladorProducto.read(codigo);
        if (prod != null) {
            jCCategoria.removeAllItems();;
            txtCodigo.setText(String.valueOf(prod.getCodigo()));
            this.codigo = Integer.parseInt(txtCodigo.getText());
            txtNombre.setText(prod.getNombre());
            txtPrecio.setText(String.valueOf(prod.getPrecio()));
            txtStock.setText(String.valueOf(prod.getStock()));
            jCCategoria.addItem(prod.getCategoria().getNombre());
            lista = controladorCategoria.getLista();
            for (Categoria categoria : lista) {
                if (!categoria.getNombre().equals(prod.getCategoria().getNombre())) {
                    jCCategoria.addItem(categoria.getNombre());
                }
            }
            btnActualizar.setEnabled(true);
        } else {

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Producto producto = new Producto();
        producto.setCodigo(codigo);
        producto.setNombre(txtNombre.getText());
        producto.setPrecio(Double.parseDouble(txtPrecio.getText()));
        producto.setStock(Integer.parseInt(txtStock.getText()));
        for (Categoria categoria : lista) {
            if (categoria.getNombre() == jCCategoria.getSelectedItem()) {
                producto.setCategoria(categoria);
                break;
            }
        }
        controladorProducto.update(producto);
        JOptionPane.showMessageDialog(this, " Datos Actualizados", "Ventana Actualizar Producto", JOptionPane.OK_OPTION);

        txtCodigo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        btnActualizar.setEnabled(false);
        jCCategoria.removeAllItems();
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> jCCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
