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
    public VentanaEliminarFactura(ControladorFactura controladorFactura) {
        initComponents();
        this.controladorFactura = controladorFactura;
        formato = new SimpleDateFormat("dd/MM/yyyy");
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
        jLCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLEmpleado = new javax.swing.JLabel();
        jLIDEmpleado = new javax.swing.JLabel();
        txtIDEmpleado = new javax.swing.JTextField();
        jLNombre = new javax.swing.JLabel();
        txtNombreE = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        JLNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtSubTotal = new javax.swing.JTextField();
        txtIVA = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLSubTotal = new javax.swing.JLabel();
        jLIVA = new javax.swing.JLabel();
        jLTotal = new javax.swing.JLabel();
        btnAnular = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        JLAnulado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLFecha = new javax.swing.JLabel();

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

        jLCodigo.setText("Codigo");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre de la Empresa");

        jLabel2.setText("Direccion de la empresa");

        jLabel3.setText("Telefono de la empresa");

        jLabel4.setText("Ruc de la empresa");

        jLEmpleado.setText("Empleado:");

        jLIDEmpleado.setText("ID Empleado");

        txtIDEmpleado.setEditable(false);

        jLNombre.setText("Nombre");

        txtNombreE.setEditable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jLID.setText("ID");

        txtID.setEditable(false);

        JLNombre.setText("Nombre");

        txtNombre.setEditable(false);

        jLDireccion.setText("Direccion");

        txtDireccion.setEditable(false);

        jLTelefono.setText("Telefono");

        txtTelefono.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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

        txtSubTotal.setEditable(false);

        txtIVA.setEditable(false);

        txtTotal.setEditable(false);

        jLSubTotal.setText("Sub. Total");

        jLIVA.setText("IVA");

        jLTotal.setText("Total");

        btnAnular.setText("Anular");
        btnAnular.setEnabled(false);
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        JLAnulado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));

        jLFecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFecha.setText("Fecha");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLFecha)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLFecha)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLIDEmpleado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIDEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLEmpleado)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(JLAnulado, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLIVA, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLSubTotal, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSubTotal)
                                    .addComponent(txtIVA)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btnAnular)
                .addGap(115, 115, 115)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIDEmpleado)
                    .addComponent(txtIDEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombre)
                    .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLSubTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLIVA)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(JLAnulado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnular)
                    .addComponent(btnCancelar)))
        );

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLAnulado;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLEmpleado;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLIDEmpleado;
    private javax.swing.JLabel jLIVA;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLSubTotal;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDEmpleado;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}
