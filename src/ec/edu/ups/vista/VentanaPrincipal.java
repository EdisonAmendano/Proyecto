/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCategoria;
import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorEmpleado;
import ec.edu.ups.controlador.ControladorFactura;
import ec.edu.ups.controlador.ControladorProducto;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Edison/fccvmhvhjv
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private VentanaBuscarCategoria vtnbcat;
    private VentanaCrearCliente vtncc;
    private VentanaListarCliente vtnlc;
    private VentanaEliminarCliente vtnec;
    private VentanaModificarClienta vtnmc;
    private VentanaBuscarCliente vtnbc;
    private VentanaCrearCategoria vtnccat;
    private VentanaCrearEmpleado vtnce;
    private VentanaBuscarEmpleado vtnbe;
    private VentanaEliminarEmpleado vtnee;
    private VentanaModificarEmpleado vtnme;
    private VentanaListarEmpleado vtnle;
    private VentanaCrearProducto vtncp;
    private VentanaBuscarProducto vtnbp;
    private VentanaModificarProducto vtnmp;
    private VentanaEliminarProducto vtnep;
    private VentanaListarProducto vtnlp;
    private ventanaCrearFactura vtncf;
    private VentanaEliminarFactura vtnef;
    private VentanaListarCategoria vtnlcat;
    private VentanaModificarCategoria vtnmcat;
    private VentanaEliminarCategoria vtnecat;
    private ControladorCliente controladorCliente;
    private ControladorCategoria controladorCategoria;
    private ControladorEmpleado controladorEmpleado;
    private ControladorFactura controladorFactura;
    private ControladorProducto controladorProducto;
    private VentanaListarFactura ventanaListarF;
    private Locale localizacion;
    private ResourceBundle mensajes;

    public VentanaPrincipal() {
        initComponents();
        controladorCategoria = new ControladorCategoria();
        controladorCliente = new ControladorCliente();
        controladorEmpleado = new ControladorEmpleado();
        controladorFactura = new ControladorFactura();
        controladorProducto = new ControladorProducto();
        localizacion = new Locale("es", "EC");
        Locale.setDefault(localizacion);
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", Locale.getDefault());
    }

    public void cambiarIdioma() {
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", Locale.getDefault());
        menuProducto.setText(mensajes.getString("menu.producto"));
        menuFactura.setText(mensajes.getString("menu.factura"));
        menuIdioma.setText(mensajes.getString("menu.idioma"));
        menuCategoria.setText(mensajes.getString("menu.categoria"));
        menuCliente.setText(mensajes.getString("menu.Item.cliente"));
        menuEmpleado.setText(mensajes.getString("menu.Item.empleado"));

        btnIngresarCategoria.setText(mensajes.getString("menu.item.crear"));
        btnCrearProducto.setText(mensajes.getString("menu.item.crear"));
        btnCrearCliente.setText(mensajes.getString("menu.item.crear"));
        btnCrearEmpleado.setText(mensajes.getString("menu.item.crear"));
        btnCrearFactura.setText(mensajes.getString("menu.item.crear"));

        btnBuscarCategoria.setText(mensajes.getString("menu.item.buscar"));
        btnBuscarProducto.setText(mensajes.getString("menu.item.buscar"));
        btnBuscarCliente.setText(mensajes.getString("menu.item.buscar"));
        btnBuscarEmpleado.setText(mensajes.getString("menu.item.buscar"));

        btnModificarCategoria.setText(mensajes.getString("menu.item.actualizar"));
        btnModificarProducto.setText(mensajes.getString("menu.item.actualizar"));
        btnModificarCliente.setText(mensajes.getString("menu.item.actualizar"));
        btnModificarEmpleado.setText(mensajes.getString("menu.item.actualizar"));

        btnEliminarCategoria.setText(mensajes.getString("menu.item.eliminar"));
        btnEliminarProducto.setText(mensajes.getString("menu.item.eliminar"));
        btnEliminarCliente.setText(mensajes.getString("menu.item.eliminar"));
        btnEliminarEmpleado.setText(mensajes.getString("menu.item.eliminar"));

        btnListarCategoria.setText(mensajes.getString("menu.item.listar"));
        btnListarProducto.setText(mensajes.getString("menu.item.listar"));
        btnListarEmpleado.setText(mensajes.getString("menu.item.listar"));
        btnListarCliente.setText(mensajes.getString("menu.item.listar"));
        menuFacturaL.setText(mensajes.getString("menu.item.listar"));

        btnEliminarFactura.setText(mensajes.getString("menu.item.anular"));
        btnEspañol.setText(mensajes.getString("menu.item.espanol"));
        btnIngles.setText(mensajes.getString("menu.item.ingles"));

        if (vtncc != null) {
            vtncc.cambiarIdioma(mensajes);
        }
        if (vtnccat != null) {
            vtnccat.cambiarIdioma(mensajes);
        }
        if (vtnbcat != null) {
            vtnbcat.cambiarIdioma(mensajes);
        }
        if (vtnlc != null) {
            vtnlc.cambiarIdioma(mensajes);
        }
        if (vtnmcat != null) {
            vtnmcat.cambiarIdioma(mensajes);
        }
        if (vtnlcat != null) {
            vtnlcat.cambiarIdioma(mensajes);
        }
        if (vtnecat != null) {
            vtnecat.cambiarIdioma(mensajes);
        }
        if (vtncp != null) {
            vtncp.cambiarIdioma(mensajes);
        }
        if (vtnbp != null) {
            vtnbp.cambiarIdioma(mensajes);
        }
        if (vtnmp != null) {
            vtnmp.cambiarIdioma(mensajes);
        }
        if (vtnep != null) {
            vtnep.cambiarIdioma(mensajes);
        }
        if (vtnlp != null) {
            vtnlp.cambiarIdioma(mensajes);
        }
        if (vtnce != null) {
            vtnce.cambiarIdioma(mensajes);
        }
        if (vtnbe != null) {
            vtnbe.cambiarIdioma(mensajes);
        }
        if (vtnme != null) {
            vtnme.cambiarIdioma(mensajes);
        }
        if (vtnee != null) {
            vtnee.cambiarIdioma(mensajes);
        }
        if (vtnle != null) {
            vtnle.cambiarIdioma(mensajes);
        }
        if (vtnbc != null) {
            vtnbc.cambiarIdioma(mensajes);
        }
        if (vtnmc != null) {
            vtnmc.cambiarIdioma(mensajes);
        }
        if (vtnec != null) {
            vtnec.cambiarIdioma(mensajes);
        }
        if (vtnef != null) {
            vtnef.cambiarIdioma(mensajes);
        }
        if (vtncf != null) {
            vtncf.cambiarIdioma(mensajes);
        }
        if (ventanaListarF != null) {
            ventanaListarF.cambiarIdioma(mensajes);
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
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuCategoria = new javax.swing.JMenu();
        btnIngresarCategoria = new javax.swing.JMenuItem();
        btnBuscarCategoria = new javax.swing.JMenuItem();
        btnModificarCategoria = new javax.swing.JMenuItem();
        btnListarCategoria = new javax.swing.JMenuItem();
        btnEliminarCategoria = new javax.swing.JMenuItem();
        menuProducto = new javax.swing.JMenu();
        btnCrearProducto = new javax.swing.JMenuItem();
        btnBuscarProducto = new javax.swing.JMenuItem();
        btnModificarProducto = new javax.swing.JMenuItem();
        btnEliminarProducto = new javax.swing.JMenuItem();
        btnListarProducto = new javax.swing.JMenuItem();
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
        menuFactura = new javax.swing.JMenu();
        btnCrearFactura = new javax.swing.JMenuItem();
        btnEliminarFactura = new javax.swing.JMenuItem();
        menuFacturaL = new javax.swing.JMenuItem();
        menuIdioma = new javax.swing.JMenu();
        btnEspañol = new javax.swing.JMenuItem();
        btnIngles = new javax.swing.JMenuItem();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/Imagenes/taller2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 480);

        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 643, 803));

        menuCategoria.setText("Categoria");

        btnIngresarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CALCULAR.png"))); // NOI18N
        btnIngresarCategoria.setText("Ingresar");
        btnIngresarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarCategoriaActionPerformed(evt);
            }
        });
        menuCategoria.add(btnIngresarCategoria);

        btnBuscarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnBuscarCategoria.setText("Buscar");
        btnBuscarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCategoriaActionPerformed(evt);
            }
        });
        menuCategoria.add(btnBuscarCategoria);

        btnModificarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnModificarCategoria.setText("Modificar");
        btnModificarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCategoriaActionPerformed(evt);
            }
        });
        menuCategoria.add(btnModificarCategoria);

        btnListarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista.png"))); // NOI18N
        btnListarCategoria.setText("Listar");
        btnListarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarCategoriaActionPerformed(evt);
            }
        });
        menuCategoria.add(btnListarCategoria);

        btnEliminarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminarCategoria.setText("Eliminar");
        btnEliminarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCategoriaActionPerformed(evt);
            }
        });
        menuCategoria.add(btnEliminarCategoria);

        menuBar.add(menuCategoria);

        menuProducto.setText("Producto");

        btnCrearProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crear.png"))); // NOI18N
        btnCrearProducto.setText("Crear");
        btnCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProductoActionPerformed(evt);
            }
        });
        menuProducto.add(btnCrearProducto);

        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });
        menuProducto.add(btnBuscarProducto);

        btnModificarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnModificarProducto.setText("Modificar");
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });
        menuProducto.add(btnModificarProducto);

        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminarProducto.setText("Eliminar");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        menuProducto.add(btnEliminarProducto);

        btnListarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista.png"))); // NOI18N
        btnListarProducto.setText("Listar");
        btnListarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProductoActionPerformed(evt);
            }
        });
        menuProducto.add(btnListarProducto);

        menuBar.add(menuProducto);

        menuPersona.setText("Persona");

        menuCliente.setText("Cliente");

        btnCrearCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crear.png"))); // NOI18N
        btnCrearCliente.setText("Crear");
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClienteActionPerformed(evt);
            }
        });
        menuCliente.add(btnCrearCliente);

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(btnBuscarCliente);

        btnModificarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnModificarCliente.setText("Modificar");
        btnModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(btnModificarCliente);

        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(btnEliminarCliente);

        btnListarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista.png"))); // NOI18N
        btnListarCliente.setText("Listar");
        btnListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(btnListarCliente);

        menuPersona.add(menuCliente);

        menuEmpleado.setText("Empleado");

        btnCrearEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crear.png"))); // NOI18N
        btnCrearEmpleado.setText("Crear");
        btnCrearEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(btnCrearEmpleado);

        btnBuscarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnBuscarEmpleado.setText("Buscar");
        btnBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(btnBuscarEmpleado);

        btnModificarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnModificarEmpleado.setText("Modificar");
        btnModificarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(btnModificarEmpleado);

        btnEliminarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminarEmpleado.setText("Eliminar");
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(btnEliminarEmpleado);

        btnListarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista.png"))); // NOI18N
        btnListarEmpleado.setText("Listar");
        btnListarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(btnListarEmpleado);

        menuPersona.add(menuEmpleado);

        menuBar.add(menuPersona);

        menuFactura.setText("Factura");

        btnCrearFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crear.png"))); // NOI18N
        btnCrearFactura.setText("Crear");
        btnCrearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearFacturaActionPerformed(evt);
            }
        });
        menuFactura.add(btnCrearFactura);

        btnEliminarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminarFactura.setText("Eliminar");
        btnEliminarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFacturaActionPerformed(evt);
            }
        });
        menuFactura.add(btnEliminarFactura);

        menuFacturaL.setText("Listar");
        menuFacturaL.setToolTipText("");
        menuFacturaL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFacturaLActionPerformed(evt);
            }
        });
        menuFactura.add(menuFacturaL);

        menuBar.add(menuFactura);

        menuIdioma.setText("Idioma");

        btnEspañol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/idioma.png"))); // NOI18N
        btnEspañol.setText("Español");
        btnEspañol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspañolActionPerformed(evt);
            }
        });
        menuIdioma.add(btnEspañol);

        btnIngles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/idioma.png"))); // NOI18N
        btnIngles.setText("Ingles");
        btnIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInglesActionPerformed(evt);
            }
        });
        menuIdioma.add(btnIngles);

        menuBar.add(menuIdioma);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
        if (vtncc == null || !vtncc.isVisible()) {
            vtncc = new VentanaCrearCliente(controladorCliente);
            vtncc.cambiarIdioma(mensajes);
            vtncc.setVisible(true);
            desktopPane.add(vtncc);
        }
    }//GEN-LAST:event_btnCrearClienteActionPerformed

    private void btnIngresarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarCategoriaActionPerformed
        if (vtnccat == null || !vtnccat.isVisible()) {
            vtnccat = new VentanaCrearCategoria(controladorCategoria);
            vtnccat.cambiarIdioma(mensajes);
            vtnccat.setVisible(true);
            desktopPane.add(vtnccat);
        }
    }//GEN-LAST:event_btnIngresarCategoriaActionPerformed

    private void btnBuscarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCategoriaActionPerformed
        if (vtnbcat == null || !vtnbcat.isVisible()) {
            vtnbcat = new VentanaBuscarCategoria(controladorCategoria);
            vtnbcat.cambiarIdioma(mensajes);
            vtnbcat.setVisible(true);
            desktopPane.add(vtnbcat);
        }
    }//GEN-LAST:event_btnBuscarCategoriaActionPerformed

    private void btnModificarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCategoriaActionPerformed
        if (vtnmcat == null || !vtnmcat.isVisible()) {
            vtnmcat = new VentanaModificarCategoria(controladorCategoria);
            vtnmcat.cambiarIdioma(mensajes);
            vtnmcat.setVisible(true);
            desktopPane.add(vtnmcat);
        }
    }//GEN-LAST:event_btnModificarCategoriaActionPerformed

    private void btnListarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCategoriaActionPerformed
        if (vtnlcat == null || !vtnlcat.isVisible()) {
            vtnlcat = new VentanaListarCategoria(controladorCategoria);
            vtnlcat.cambiarIdioma(mensajes);
            vtnlcat.setVisible(true);
            desktopPane.add(vtnlcat);
        }
    }//GEN-LAST:event_btnListarCategoriaActionPerformed

    private void btnEliminarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCategoriaActionPerformed
        if (vtnecat == null || !vtnecat.isVisible()) {
            vtnecat = new VentanaEliminarCategoria(controladorCategoria);
            vtnecat.cambiarIdioma(mensajes);
            vtnecat.setVisible(true);
            desktopPane.add(vtnecat);
        }
    }//GEN-LAST:event_btnEliminarCategoriaActionPerformed

    private void btnCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProductoActionPerformed
        if (vtncp == null || !vtncp.isVisible()) {
            vtncp = new VentanaCrearProducto(controladorProducto, controladorCategoria);
            vtncp.cambiarIdioma(mensajes);
            vtncp.setVisible(true);
            desktopPane.add(vtncp);
        }
    }//GEN-LAST:event_btnCrearProductoActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        if (vtnbp == null || !vtnbp.isVisible()) {
            vtnbp = new VentanaBuscarProducto(controladorProducto);
            vtnbp.cambiarIdioma(mensajes);
            vtnbp.setVisible(true);
            desktopPane.add(vtnbp);
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
        if (vtnmp == null || !vtnmp.isVisible()) {
            vtnmp = new VentanaModificarProducto(controladorProducto, controladorCategoria);
            vtnmp.cambiarIdioma(mensajes);
            vtnmp.setVisible(true);
            desktopPane.add(vtnmp);
        }
    }//GEN-LAST:event_btnModificarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        if (vtnep == null || !vtnep.isVisible()) {
            vtnep = new VentanaEliminarProducto(controladorProducto);
            vtnep.cambiarIdioma(mensajes);
            vtnep.setVisible(true);
            desktopPane.add(vtnep);
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnListarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProductoActionPerformed
        if (vtnlp == null || !vtnlp.isVisible()) {
            vtnlp = new VentanaListarProducto(controladorProducto);
            vtnlp.cambiarIdioma(mensajes);
            vtnlp.setVisible(true);
            desktopPane.add(vtnlp);
        }
    }//GEN-LAST:event_btnListarProductoActionPerformed

    private void btnCrearEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEmpleadoActionPerformed
        if (vtnce == null || !vtnce.isVisible()) {
            vtnce = new VentanaCrearEmpleado(controladorEmpleado);
            vtnce.cambiarIdioma(mensajes);
            vtnce.setVisible(true);
            desktopPane.add(vtnce);
        }
    }//GEN-LAST:event_btnCrearEmpleadoActionPerformed

    private void btnBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoActionPerformed
        if (vtnbe == null || !vtnbe.isVisible()) {
            vtnbe = new VentanaBuscarEmpleado(controladorEmpleado);
            vtnbe.cambiarIdioma(mensajes);
            vtnbe.setVisible(true);
            desktopPane.add(vtnbe);
        }
    }//GEN-LAST:event_btnBuscarEmpleadoActionPerformed

    private void btnModificarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEmpleadoActionPerformed
        if (vtnme == null || !vtnme.isVisible()) {
            vtnme = new VentanaModificarEmpleado(controladorEmpleado);
            vtnme.cambiarIdioma(mensajes);
            vtnme.setVisible(true);
            desktopPane.add(vtnme);
        }
    }//GEN-LAST:event_btnModificarEmpleadoActionPerformed

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        if (vtnee == null || !vtnee.isVisible()) {
            vtnee = new VentanaEliminarEmpleado(controladorEmpleado);
            vtnee.cambiarIdioma(mensajes);
            vtnee.setVisible(true);
            desktopPane.add(vtnee);
        }
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    private void btnListarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarEmpleadoActionPerformed
        if (vtnle == null || !vtnle.isVisible()) {
            vtnle = new VentanaListarEmpleado(controladorEmpleado);
            vtnle.cambiarIdioma(mensajes);
            vtnle.setVisible(true);
            desktopPane.add(vtnle);
        }
    }//GEN-LAST:event_btnListarEmpleadoActionPerformed

    private void btnCrearFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFacturaActionPerformed
        if (vtncf == null || !vtncf.isVisible()) {
            vtncf = new ventanaCrearFactura(controladorEmpleado, controladorCliente, controladorFactura, controladorProducto);
            vtncf.cambiarIdioma(mensajes);
            vtncf.setVisible(true);
            desktopPane.add(vtncf);
        }
    }//GEN-LAST:event_btnCrearFacturaActionPerformed

    private void btnEliminarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFacturaActionPerformed
        if (vtnef == null || !vtnef.isVisible()) {
            vtnef = new VentanaEliminarFactura(controladorFactura);
            vtnef.cambiarIdioma(mensajes);
            vtnef.setVisible(true);
            desktopPane.add(vtnef);
        }
    }//GEN-LAST:event_btnEliminarFacturaActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        if (vtnbc == null || !vtnbc.isVisible()) {
            vtnbc = new VentanaBuscarCliente(controladorCliente);
            vtnbc.cambiarIdioma(mensajes);
            vtnbc.setVisible(true);
            desktopPane.add(vtnbc);
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienteActionPerformed
        if (vtnmc == null || !vtnmc.isVisible()) {
            vtnmc = new VentanaModificarClienta(controladorCliente);
            vtnmc.cambiarIdioma(mensajes);
            vtnmc.setVisible(true);
            desktopPane.add(vtnmc);
        }
    }//GEN-LAST:event_btnModificarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        if (vtnec == null || !vtnec.isVisible()) {
            vtnec = new VentanaEliminarCliente(controladorCliente);
            vtnec.cambiarIdioma(mensajes);
            vtnec.setVisible(true);
            desktopPane.add(vtnec);
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarClienteActionPerformed
        if (vtnlc == null || !vtnlc.isVisible()) {
            vtnlc = new VentanaListarCliente(controladorCliente);
            vtnlc.cambiarIdioma(mensajes);
            vtnlc.setVisible(true);
            desktopPane.add(vtnlc);
        }
    }//GEN-LAST:event_btnListarClienteActionPerformed

    private void menuFacturaLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFacturaLActionPerformed

        if (ventanaListarF == null || !ventanaListarF.isVisible()) {
            ventanaListarF = new VentanaListarFactura(controladorFactura);
            ventanaListarF.cambiarIdioma(mensajes);
            ventanaListarF.setVisible(true);
            desktopPane.add(ventanaListarF);
        }
    }//GEN-LAST:event_menuFacturaLActionPerformed
    private void btnEspañolActionPerformed(java.awt.event.ActionEvent evt) {
        localizacion = new Locale("es", "EC");
        Locale.setDefault(localizacion);
        System.out.println("1");
        cambiarIdioma();
    }

    private void btnInglesActionPerformed(java.awt.event.ActionEvent evt) {
        localizacion = new Locale("en", "US");
        Locale.setDefault(localizacion);
        System.out.println("2");
        cambiarIdioma();
    }

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
    private javax.swing.JMenuItem btnBuscarCategoria;
    private javax.swing.JMenuItem btnBuscarCliente;
    private javax.swing.JMenuItem btnBuscarEmpleado;
    private javax.swing.JMenuItem btnBuscarProducto;
    private javax.swing.JMenuItem btnCrearCliente;
    private javax.swing.JMenuItem btnCrearEmpleado;
    private javax.swing.JMenuItem btnCrearFactura;
    private javax.swing.JMenuItem btnCrearProducto;
    private javax.swing.JMenuItem btnEliminarCategoria;
    private javax.swing.JMenuItem btnEliminarCliente;
    private javax.swing.JMenuItem btnEliminarEmpleado;
    private javax.swing.JMenuItem btnEliminarFactura;
    private javax.swing.JMenuItem btnEliminarProducto;
    private javax.swing.JMenuItem btnEspañol;
    private javax.swing.JMenuItem btnIngles;
    private javax.swing.JMenuItem btnIngresarCategoria;
    private javax.swing.JMenuItem btnListarCategoria;
    private javax.swing.JMenuItem btnListarCliente;
    private javax.swing.JMenuItem btnListarEmpleado;
    private javax.swing.JMenuItem btnListarProducto;
    private javax.swing.JMenuItem btnModificarCategoria;
    private javax.swing.JMenuItem btnModificarCliente;
    private javax.swing.JMenuItem btnModificarEmpleado;
    private javax.swing.JMenuItem btnModificarProducto;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JMenu menuCategoria;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuEmpleado;
    private javax.swing.JMenu menuFactura;
    private javax.swing.JMenuItem menuFacturaL;
    private javax.swing.JMenu menuIdioma;
    private javax.swing.JMenu menuPersona;
    private javax.swing.JMenu menuProducto;
    // End of variables declaration//GEN-END:variables

}
