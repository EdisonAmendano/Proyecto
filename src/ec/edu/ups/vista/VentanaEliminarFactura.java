/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorFactura;
import ec.edu.ups.modelo.Factura;
import ec.edu.ups.modelo.FacturaDetalle;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edison
 */
public class VentanaEliminarFactura extends javax.swing.JInternalFrame {

    private ControladorFactura controladorFactura;
    private DefaultTableModel model;
    private int codigo;
    private SimpleDateFormat formato;
    private Locale localizacion;
    private ResourceBundle mensajes;
    public VentanaEliminarFactura(ControladorFactura controladorFactura) {
        initComponents();
        this.controladorFactura = controladorFactura;
        formato = new SimpleDateFormat("dd/MM/yyyy");
    }
     public void cambiarIdioma(ResourceBundle mensajes){
        
        //Jlabel
        lblCodigo.setText(mensajes.getString("cliente.codigo"));
        lblNombre.setText(mensajes.getString("cliente.nombre"));
        lblNombreE.setText(mensajes.getString("cliente.nombre")); 
        lblCedula.setText(mensajes.getString("cliente.Cedula"));
        lblDireccion.setText(mensajes.getString("cliente.direccion"));
        lblTelefono.setText(mensajes.getString("cliente.telefono"));
        lblEmpleadoC.setText(mensajes.getString("empleado.cedula")); 
        lblSubTotal.setText(mensajes.getString("factura.subtotal"));
        lblIva.setText(mensajes.getString("factura.iva"));
        lblTotal.setText(mensajes.getString("factura.total"));
        
        //Botones
        btnBuscar.setText(mensajes.getString("btn.buscar"));
        btnCancelar.setText(mensajes.getString("btn.cancelar"));
        btnAnular.setText(mensajes.getString("menu.item.anular"));
        
        //table
        Object [] columnas = {mensajes.getString("cliente.codigo"), mensajes.getString("cliente.nombre"), mensajes.getString("factura.cantidad"), mensajes.getString("factura.descripcion"), mensajes.getString("producto.precio"), mensajes.getString("factura.total")};
        
        DefaultTableModel mod = (DefaultTableModel) table.getModel();
        mod.setColumnIdentifiers(columnas);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblEmpleadoC = new javax.swing.JLabel();
        jLIDEmpleado = new javax.swing.JLabel();
        txtIDEmpleado = new javax.swing.JTextField();
        lblNombreE = new javax.swing.JLabel();
        txtNombreE = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtSubTotal = new javax.swing.JTextField();
        txtIVA = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        lblSubTotal = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnAnular = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        JLAnulado = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblCedula1 = new javax.swing.JLabel();
        txtID1 = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        lblDireccion1 = new javax.swing.JLabel();
        txtDireccion1 = new javax.swing.JTextField();
        lblTelefono1 = new javax.swing.JLabel();
        txtTelefono1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLFecha = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 0));
        lblCodigo.setText("Código");
        getContentPane().add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 70, -1));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 70, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 90, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Nombre de la Empresa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 160, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Direccion de la empresa");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Telefono de la empresa");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 170, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Ruc de la empresa");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, -1));

        lblEmpleadoC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmpleadoC.setForeground(new java.awt.Color(255, 255, 0));
        lblEmpleadoC.setText("Empleado:");
        getContentPane().add(lblEmpleadoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, -1));

        jLIDEmpleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLIDEmpleado.setForeground(new java.awt.Color(255, 255, 0));
        jLIDEmpleado.setText("ID Empleado");
        getContentPane().add(jLIDEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, -1));

        txtIDEmpleado.setEditable(false);
        txtIDEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtIDEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 90, -1));

        lblNombreE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombreE.setForeground(new java.awt.Color(255, 255, 0));
        lblNombreE.setText("Nombre");
        getContentPane().add(lblNombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 60, -1));

        txtNombreE.setEditable(false);
        getContentPane().add(txtNombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 170, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        lblCedula.setText("ID");

        txtID.setEditable(false);

        lblNombre.setText("Nombre");

        txtNombre.setEditable(false);

        lblDireccion.setText("Direccion");

        txtDireccion.setEditable(false);

        lblTelefono.setText("Telefono");

        txtTelefono.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 530, 0));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cant.", "Descripcion", "Precio", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 480, 120));

        txtSubTotal.setEditable(false);
        getContentPane().add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 120, 20));

        txtIVA.setEditable(false);
        getContentPane().add(txtIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 120, 20));

        txtTotal.setEditable(false);
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 120, -1));

        lblSubTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSubTotal.setForeground(new java.awt.Color(255, 255, 0));
        lblSubTotal.setText("Sub. Total");
        getContentPane().add(lblSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 70, 20));

        lblIva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIva.setForeground(new java.awt.Color(255, 255, 0));
        lblIva.setText("IVA");
        getContentPane().add(lblIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 50, 20));

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 0));
        lblTotal.setText("Total");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 60, 20));

        btnAnular.setText("Anular");
        btnAnular.setEnabled(false);
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 120, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 130, -1));

        JLAnulado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(JLAnulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 760, 280, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        lblCedula1.setText("ID");

        txtID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID1ActionPerformed(evt);
            }
        });

        lblNombre1.setText("Nombre");

        txtNombre1.setEditable(false);
        txtNombre1.setBackground(new java.awt.Color(255, 255, 255));

        lblDireccion1.setText("Direccion");

        txtDireccion1.setEditable(false);
        txtDireccion1.setBackground(new java.awt.Color(255, 255, 255));

        lblTelefono1.setText("Telefono");

        txtTelefono1.setEditable(false);
        txtTelefono1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblCedula1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNombre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblDireccion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTelefono1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula1)
                    .addComponent(txtID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre1)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion1)
                    .addComponent(txtDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono1)
                    .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 480, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLFecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFecha.setText("Fecha");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLFecha)
                .addGap(0, 69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLFecha)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/Imagenes/taller2.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 480, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Factura factura = controladorFactura.read(Integer.parseInt(txtCodigo.getText()));
        if(factura != null){
            model = (DefaultTableModel) table.getModel();
            model.setColumnCount(5);
            model.setRowCount(0);
            codigo = Integer.parseInt(txtCodigo.getText());
            txtIDEmpleado.setText(factura.getEmpleado().getCedula());
            txtNombreE.setText(factura.getEmpleado().getNombre());
            txtID.setText(factura.getCliente().getCedula());
            txtNombre.setText(factura.getCliente().getNombre());
            txtDireccion.setText(factura.getCliente().getDireccion());
            txtTelefono.setText(factura.getCliente().getTelefono());
            txtSubTotal.setText(String.valueOf(factura.getSubTotal()));
            txtIVA.setText(String.valueOf(factura.getIva()));
            txtTotal.setText(String.valueOf(factura.getTotal()));
            jLFecha.setText(formato.format(factura.getFecha()));
            Set<FacturaDetalle> lista = factura.getLista();
            for (FacturaDetalle facturaDetalle : lista) {
                Object[] datos = {facturaDetalle.getCodigo(), facturaDetalle.getCantidad(), facturaDetalle.getProducto().getNombre(), facturaDetalle.getPrecio(), facturaDetalle.getSubtotal()};
                model.addRow(datos);
            }
            if(factura.getEstado().equals("Anulado")){
                JLAnulado.setText("Anulado");
            }else{
                btnAnular.setEnabled(true);
            }
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        Factura factura = controladorFactura.read(codigo);
        factura.setEstado("Anulado");
        btnAnular.setEnabled(false);
        JOptionPane.showMessageDialog(this, "La factura fue anulada", "Anulacion de factura", JOptionPane.OK_OPTION);
        txtID.setText("");
        txtIDEmpleado.setText("");
        txtNombreE.setText("");
        txtDireccion.setText("");
        txtIVA.setText("");
        txtNombre.setText("");
        txtSubTotal.setText("");
        txtTotal.setText("");
        txtTelefono.setText("");
        model.setColumnCount(5);
        model.setRowCount(0);
    }//GEN-LAST:event_btnAnularActionPerformed

    private void txtID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID1ActionPerformed
       
    }//GEN-LAST:event_txtID1ActionPerformed

    private void txtIDEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLAnulado;
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLIDEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCedula1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDireccion1;
    private javax.swing.JLabel lblEmpleadoC;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombreE;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefono1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccion1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtID1;
    private javax.swing.JTextField txtIDEmpleado;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}
