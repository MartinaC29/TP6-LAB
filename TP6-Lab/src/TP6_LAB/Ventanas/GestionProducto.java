/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package TP6_LAB.Ventanas;

import TP6_LAB.entidades.Producto;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class GestionProducto extends javax.swing.JInternalFrame {
    private TreeSet<Producto> productos;
    private boolean codigoInvalido,precioInvalido,stockInvalido;
    /**
     * Creates new form GestionProducto
     */
    public GestionProducto(TreeSet<Producto> productos) {
        initComponents();
        this.productos=productos;
        jlCodigoInvalido.setVisible(false);
        jlPrecioInvalido.setVisible(false);
        jlStockInvalido.setVisible(false);
        jbEliminar.setEnabled(false);
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlStockInvalido = new javax.swing.JLabel();
        jtStock = new javax.swing.JTextField();
        jtDescripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcRubro = new javax.swing.JComboBox<>();
        jlPrecioInvalido = new javax.swing.JLabel();
        jlCodigoInvalido = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Gestión de productos");

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jLabel2.setText("Código:");

        jLabel5.setText("Rubro:");

        jlStockInvalido.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jlStockInvalido.setForeground(new java.awt.Color(255, 0, 0));
        jlStockInvalido.setText("Campo invalido: Ingrese un nro");

        jtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtStockKeyReleased(evt);
            }
        });

        jtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDescripcionKeyReleased(evt);
            }
        });

        jLabel6.setText("Stock:");

        jcRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Perfumeria", "Limpieza" }));

        jlPrecioInvalido.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jlPrecioInvalido.setForeground(new java.awt.Color(255, 0, 0));
        jlPrecioInvalido.setText("Campo invalido: Ingrese un nro");

        jlCodigoInvalido.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jlCodigoInvalido.setForeground(new java.awt.Color(255, 0, 0));
        jlCodigoInvalido.setText("Campo invalido: Ingrese un nro");

        jtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioActionPerformed(evt);
            }
        });
        jtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPrecioKeyReleased(evt);
            }
        });

        jtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCodigoActionPerformed(evt);
            }
        });
        jtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtCodigoKeyReleased(evt);
            }
        });

        jLabel4.setText("Precio:");

        jLabel3.setText("Descripción:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlStockInvalido)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCodigoInvalido)
                    .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPrecioInvalido)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jlCodigoInvalido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPrecioInvalido, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlStockInvalido, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbEliminar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBuscar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jbBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int codigo = 0,stock = 0;
        Double precio = 0.0;
        
        String rubro = jcRubro.getSelectedItem().toString();
        String descripcion = jtDescripcion.getText();
        // Validacion codigo
        if (validarEntero(jtCodigo.getText())) {
            codigo = Integer.parseInt(jtCodigo.getText());
            codigoInvalido = false;
        }else{
            jlCodigoInvalido.setVisible(true);
            codigoInvalido = true;
        }
        // Validacion stock
        if (validarEntero(jtStock.getText())) {
            stock = Integer.parseInt(jtStock.getText());
            stockInvalido = false;
        }else{
            jlStockInvalido.setVisible(true);
            stockInvalido = true;
        }
        // Validacion precio 
        if (validarDouble(jtPrecio.getText())) {
            precio = Double.valueOf(jtPrecio.getText());
            precioInvalido = false;
        }else{
            jlPrecioInvalido.setVisible(true);
            precioInvalido = true;
        }
        // Si todos los campos estan correctos
        if (!codigoInvalido && !stockInvalido && !precioInvalido) {
            Producto prod = new Producto(codigo,descripcion,precio,rubro,stock);
            productos.add(prod);
            limpiarCampos();
        }
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCodigoActionPerformed

    private void jtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecioActionPerformed

    private void jtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCodigoKeyReleased
        jlCodigoInvalido.setVisible(false);
        jbEliminar.setEnabled(false);
    }//GEN-LAST:event_jtCodigoKeyReleased

    private void jtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioKeyReleased
        jlPrecioInvalido.setVisible(false);
        jbEliminar.setEnabled(false);
    }//GEN-LAST:event_jtPrecioKeyReleased

    private void jtStockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtStockKeyReleased
        jlStockInvalido.setVisible(false);
        jbEliminar.setEnabled(false);
    }//GEN-LAST:event_jtStockKeyReleased

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        if (validarEntero(jtCodigo.getText())) {
            int codigo = Integer.parseInt(jtCodigo.getText());
            boolean encontrado = false;
            for(Producto p: productos){
                if (codigo == p.getCodigo()) {
                    jtDescripcion.setText(p.getDescripcion());
                    jtPrecio.setText(p.getPrecio() + "");
                    jtStock.setText(p.getStock() + "");
                    encontrado = true;
                    jbEliminar.setEnabled(true);
                }
            }
            if (!encontrado) {
                limpiarCampos();
                JOptionPane.showMessageDialog(this,"No se ha encontrado el producto");
            }
        }else{
            jlCodigoInvalido.setVisible(true);
        }  
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDescripcionKeyReleased
        jbEliminar.setEnabled(false);
    }//GEN-LAST:event_jtDescripcionKeyReleased

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int codigo = Integer.parseInt(jtCodigo.getText());
            jbEliminar.setEnabled(true);
            for(Producto p:productos){
                if (codigo == p.getCodigo()) {
                    productos.remove(p);
                    limpiarCampos();
                    JOptionPane.showMessageDialog(this, "Se ha eliminado correctamente");
                }
            }
    }//GEN-LAST:event_jbEliminarActionPerformed
    
    private boolean validarEntero(String s){
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m = p.matcher(s);
        return m.matches();
    }
    
    private boolean validarDouble(String s){
        Pattern p = Pattern.compile("^[-+]?[0-9]*\\.?[0-9]+$");
        Matcher m = p.matcher(s);
        return m.matches();
    }
    
    public void limpiarCampos(){
        jtCodigo.setText("");
        jtDescripcion.setText("");
        jtPrecio.setText("");
        jtStock.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<String> jcRubro;
    private javax.swing.JLabel jlCodigoInvalido;
    private javax.swing.JLabel jlPrecioInvalido;
    private javax.swing.JLabel jlStockInvalido;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables
}

