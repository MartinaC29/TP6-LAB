/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TP6_LAB.Ventanas;

import TP6_LAB.entidades.Producto;
import java.util.TreeSet;

/**
 *
 * @author pablo
 */
public class Menu extends javax.swing.JFrame {
    private TreeSet<Producto> productos = new TreeSet<>();
    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jMenu1 = new javax.swing.JMenu();
        jdEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jmProductos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmRubro = new javax.swing.JMenuItem();
        jmNombre = new javax.swing.JMenuItem();
        jmPrecio = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdEscritorioLayout = new javax.swing.GroupLayout(jdEscritorio);
        jdEscritorio.setLayout(jdEscritorioLayout);
        jdEscritorioLayout.setHorizontalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jdEscritorioLayout.setVerticalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu2.setText("Administración");

        jmProductos.setText("Productos");
        jmProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProductosActionPerformed(evt);
            }
        });
        jMenu2.add(jmProductos);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas");

        jmRubro.setText("Por Rubro");
        jmRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRubroActionPerformed(evt);
            }
        });
        jMenu3.add(jmRubro);

        jmNombre.setText("Por Nombre");
        jmNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNombreActionPerformed(evt);
            }
        });
        jMenu3.add(jmNombre);

        jmPrecio.setText("Por Precio");
        jmPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPrecioActionPerformed(evt);
            }
        });
        jMenu3.add(jmPrecio);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProductosActionPerformed
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        GestionProducto gp = new GestionProducto(productos);
        gp.setVisible(true);
        jdEscritorio.add(gp);
    }//GEN-LAST:event_jmProductosActionPerformed

    private void jmRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRubroActionPerformed
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        ListadoRubro lr = new ListadoRubro(productos);
        lr.setVisible(true);
        jdEscritorio.add(lr);
    }//GEN-LAST:event_jmRubroActionPerformed

    private void jmNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNombreActionPerformed
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        ListadoNombre ln = new ListadoNombre(productos);
        ln.setVisible(true);
        jdEscritorio.add(ln);
    }//GEN-LAST:event_jmNombreActionPerformed

    private void jmPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPrecioActionPerformed
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        ListadoPrecio lp = new ListadoPrecio(productos);
        lp.setVisible(true);
        jdEscritorio.add(lp);
    }//GEN-LAST:event_jmPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdEscritorio;
    private javax.swing.JMenuItem jmNombre;
    private javax.swing.JMenuItem jmPrecio;
    private javax.swing.JMenuItem jmProductos;
    private javax.swing.JMenuItem jmRubro;
    // End of variables declaration//GEN-END:variables
}
