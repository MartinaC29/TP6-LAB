package TP6_LAB.Ventanas;

import TP6_LAB.entidades.Producto;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListadoPrecio extends javax.swing.JInternalFrame {
   
    //Atributos y colecciones
    private TreeSet<Producto> productos;
    private DefaultTableModel modelo; 
    private boolean numInvalido1,numInvalido2;
    
    //Constructor 
    public ListadoPrecio(TreeSet<Producto> productos) {
        initComponents();
        this.modelo = (DefaultTableModel) jtTabla.getModel();
        this.productos = productos;
        jlNumInvalido.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfPrecio1 = new javax.swing.JTextField();
        jtfPrecio2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jlNumInvalido = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado por Precio");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setText("Entre:");

        jtfPrecio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPrecio1KeyReleased(evt);
            }
        });

        jtfPrecio2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPrecio2KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("y");

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jtTabla);

        jlNumInvalido.setForeground(new java.awt.Color(255, 51, 51));
        jlNumInvalido.setText("Nro. invalido");

        jLabel4.setText("Min:");

        jLabel5.setText("Max:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlNumInvalido))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jlNumInvalido)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarTabla(){
        
        borrarFilas(); 
        
        Double precioMin= 0.0;
        Double precioMax = 9999999.0; 

        if (!jtfPrecio1.getText().isEmpty() ) {
            if (validarDouble(jtfPrecio1.getText())) {
                precioMin = Double.parseDouble(jtfPrecio1.getText());
                numInvalido1 = false;
            }else{
                jlNumInvalido.setVisible(true);
                numInvalido1 = true;
            }    
        }

        if (!jtfPrecio2.getText().isEmpty() ) {
            if (validarDouble(jtfPrecio2.getText())) {
                precioMax = Double.parseDouble(jtfPrecio2.getText());
                numInvalido2 = false;
            }else{
                jlNumInvalido.setVisible(true);
                numInvalido2 = true;
            }
        }
        
        if (!numInvalido1 && !numInvalido2) {
            jlNumInvalido.setVisible(false);
        }
        
        if (!numInvalido1 && !numInvalido2) {
            for (Producto prod : productos) {
                
                if (precioMin <= prod.getPrecio() && precioMax == 9999999.0) {  //Si el usuario rellenó el campo de precio mínimo
                    
                    modelo.addRow(new Object []{prod.getCodigo(), prod.getDescripcion(), prod.getPrecio(), prod.getStock()});
                    
                }else{
                    
                    if (precioMin == 0 && precioMax >= prod.getPrecio()) {  //Si el usuario rellenó el campo de precio máximo
                        
                        modelo.addRow(new Object []{prod.getCodigo(), prod.getDescripcion(), prod.getPrecio(), prod.getStock()});
                        
                    }else{
                        
                        if (precioMin <= prod.getPrecio() && precioMax >= prod.getPrecio()) {  //Si el usuario rellenó los 2 campos
                            
                            modelo.addRow(new Object []{prod.getCodigo(), prod.getDescripcion(), prod.getPrecio(), prod.getStock()});
                            
                        }
                    }
                }
            }
        }   
    }
    
    private void borrarFilas(){
         int filas=modelo.getRowCount()-1;
         for(int f=filas;f >= 0;f--){
             modelo.removeRow(f);
         }
     }
    
    private boolean validarDouble(String s){
        Pattern p = Pattern.compile("^[-+]?[0-9]*\\.?[0-9]+$");
        Matcher m = p.matcher(s);
        return m.matches();
    }
    
    //métodos key release 
    private void jtfPrecio1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPrecio1KeyReleased
       
        
        llenarTabla(); 
    }//GEN-LAST:event_jtfPrecio1KeyReleased

    private void jtfPrecio2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPrecio2KeyReleased
       
        llenarTabla(); 
    }//GEN-LAST:event_jtfPrecio2KeyReleased

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlNumInvalido;
    private javax.swing.JTable jtTabla;
    private javax.swing.JTextField jtfPrecio1;
    private javax.swing.JTextField jtfPrecio2;
    // End of variables declaration//GEN-END:variables
}
