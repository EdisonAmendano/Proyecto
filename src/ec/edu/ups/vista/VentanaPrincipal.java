/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;

/**
 *
 * @author Edison
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private VentanaCrearCliente vcc; 
    private ControladorCliente controladorCliente;
    
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuPersona = new javax.swing.JMenu();
        menuCliente = new javax.swing.JMenu();
        btnCrearCliente = new javax.swing.JMenuItem();
        btnBuscarCliente = new javax.swing.JMenuItem();
        btnModificarCliente = new javax.swing.JMenuItem();
        btnEliminarCliente = new javax.swing.JMenuItem();
        btnListarCliente = new javax.swing.JMenuItem();
        menuEmpleado = new javax.swing.JMenu();
        btnCrearEmpleado = new javax.swing.JMenuItem();
        btnBuscarEmpleado = new javax.swing.JMenuItem();
        btnModificarEmpleado = new javax.swing.JMenuItem();
        btnEliminarEmpleado = new javax.swing.JMenuItem();
        btnListarEmpleado = new javax.swing.JMenuItem();
        menuProducto = new javax.swing.JMenu();
        btnCrearProducto = new javax.swing.JMenuItem();
        btnBuscarProducto = new javax.swing.JMenuItem();
        btnModificarProducto = new javax.swing.JMenuItem();
        btnEliminarProducto = new javax.swing.JMenuItem();
        btnListarProducto = new javax.swing.JMenuItem();
        menuCategotia = new javax.swing.JMenu();
        menuIdioma = new javax.swing.JMenu();
        btnEspañol = new javax.swing.JMenuItem();
        btnIngles = new javax.swing.JMenuItem();
        menuFactura = new javax.swing.JMenu();
        btnCrearFactura = new javax.swing.JMenuItem();
        btnEliminarFactura = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("jMenu4");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPersona.setText("Persona");

        menuCliente.setText("Cliente");

        btnCrearCliente.setText("Crear");
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClienteActionPerformed(evt);
            }
        });
        menuCliente.add(btnCrearCliente);

        btnBuscarCliente.setText("Buscar");
        menuCliente.add(btnBuscarCliente);

        btnModificarCliente.setText("Modificar");
        menuCliente.add(btnModificarCliente);

        btnEliminarCliente.setText("Eliminar");
        menuCliente.add(btnEliminarCliente);

        btnListarCliente.setText("Listar");
        menuCliente.add(btnListarCliente);

        menuPersona.add(menuCliente);

        menuEmpleado.setText("Empleado");

        btnCrearEmpleado.setText("Crear");
        menuEmpleado.add(btnCrearEmpleado);

        btnBuscarEmpleado.setText("Buscar");
        menuEmpleado.add(btnBuscarEmpleado);

        btnModificarEmpleado.setText("Modificar");
        menuEmpleado.add(btnModificarEmpleado);

        btnEliminarEmpleado.setText("Eliminar");
        menuEmpleado.add(btnEliminarEmpleado);

        btnListarEmpleado.setText("Listar");
        menuEmpleado.add(btnListarEmpleado);

        menuPersona.add(menuEmpleado);

        menuBar.add(menuPersona);

        menuProducto.setText("Producto");

        btnCrearProducto.setText("Crear");
        menuProducto.add(btnCrearProducto);

        btnBuscarProducto.setText("Buscar");
        menuProducto.add(btnBuscarProducto);

        btnModificarProducto.setText("Modificar");
        menuProducto.add(btnModificarProducto);

        btnEliminarProducto.setText("Eliminar");
        menuProducto.add(btnEliminarProducto);

        btnListarProducto.setText("Listar");
        menuProducto.add(btnListarProducto);

        menuBar.add(menuProducto);

        menuCategotia.setText("Categoria");
        menuBar.add(menuCategotia);

        menuIdioma.setText("Idioma");

        btnEspañol.setText("Español");
        menuIdioma.add(btnEspañol);

        btnIngles.setText("Ingles");
        menuIdioma.add(btnIngles);

        menuBar.add(menuIdioma);

        menuFactura.setText("Factura");

        btnCrearFactura.setText("Crear");
        menuFactura.add(btnCrearFactura);

        btnEliminarFactura.setText("Eliminar");
        menuFactura.add(btnEliminarFactura);

        menuBar.add(menuFactura);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
       
    }//GEN-LAST:event_btnCrearClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnBuscarCliente;
    private javax.swing.JMenuItem btnBuscarEmpleado;
    private javax.swing.JMenuItem btnBuscarProducto;
    private javax.swing.JMenuItem btnCrearCliente;
    private javax.swing.JMenuItem btnCrearEmpleado;
    private javax.swing.JMenuItem btnCrearFactura;
    private javax.swing.JMenuItem btnCrearProducto;
    private javax.swing.JMenuItem btnEliminarCliente;
    private javax.swing.JMenuItem btnEliminarEmpleado;
    private javax.swing.JMenuItem btnEliminarFactura;
    private javax.swing.JMenuItem btnEliminarProducto;
    private javax.swing.JMenuItem btnEspañol;
    private javax.swing.JMenuItem btnIngles;
    private javax.swing.JMenuItem btnListarCliente;
    private javax.swing.JMenuItem btnListarEmpleado;
    private javax.swing.JMenuItem btnListarProducto;
    private javax.swing.JMenuItem btnModificarCliente;
    private javax.swing.JMenuItem btnModificarEmpleado;
    private javax.swing.JMenuItem btnModificarProducto;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCategotia;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuEmpleado;
    private javax.swing.JMenu menuFactura;
    private javax.swing.JMenu menuIdioma;
    private javax.swing.JMenu menuPersona;
    private javax.swing.JMenu menuProducto;
    // End of variables declaration//GEN-END:variables

}
