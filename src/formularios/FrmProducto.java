/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import javax.swing.JOptionPane;
import sesion2508.Producto;

/**
 *
 * @author labc205
 */
public class FrmProducto extends javax.swing.JFrame {
    private static int max = 3;
    Producto productos[] = new Producto[10];
    int i = 0;

    /**
     * Creates new form FrmProducto
     */
    public FrmProducto() {
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

        jLblId = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelExistencia = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jTfId = new javax.swing.JTextField();
        jTfNombre = new javax.swing.JTextField();
        jTfPrecio = new javax.swing.JTextField();
        jTfExistencia = new javax.swing.JTextField();
        jBtnGuardar = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTaRegistros = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");

        jLblId.setText("ID:");

        jLabelNombre.setText("Nombre:");

        jLabelExistencia.setText("Existencia:");

        jLabelPrecio.setText("Precio:");

        jTfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfIdActionPerformed(evt);
            }
        });

        jTfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfNombreActionPerformed(evt);
            }
        });

        jBtnGuardar.setText("Guardar");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        jBtnLimpiar.setText("Limpiar");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        jTaRegistros.setColumns(20);
        jTaRegistros.setRows(5);
        jScrollPane1.setViewportView(jTaRegistros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelExistencia)
                            .addComponent(jLblId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPrecio, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTfPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jTfId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTfNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTfExistencia)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jBtnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnGuardar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblId)
                    .addComponent(jTfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecio)
                    .addComponent(jTfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelExistencia)
                    .addComponent(jTfExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnLimpiar)
                    .addComponent(jBtnGuardar))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfIdActionPerformed

    private void jTfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfNombreActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void limpiar(){
    jTfId.setText("");
        jTfNombre.setText("");
        jTfPrecio.setText("");
        jTfExistencia.setText("");
        jTfId.requestFocus();
    }
    
    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(jTfId.getText());
        String nombre = jTfNombre.getText();
        double precio = Double.parseDouble(jTfPrecio.getText());
        int exist = Integer.parseInt(jTfExistencia.getText());
        
        if (i<max){
            Producto prod = new Producto (id,nombre,precio,exist);
            productos[i]=prod;
            i++;
            limpiar();
             JOptionPane.showMessageDialog(this,"Producto Guardado","Guardar",JOptionPane.INFORMATION_MESSAGE);
             mostrarRegistros();
        }
        else{
        JOptionPane.showMessageDialog(this,"No se puede agregar más productos","Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void mostrarRegistros(){
    
        String reg = "";
        for (int c = 0;c<i;c++){
        
            reg+=productos[c].toString();
        }
        jTaRegistros.setText(reg);
    }
    
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
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JLabel jLabelExistencia;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLblId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTaRegistros;
    private javax.swing.JTextField jTfExistencia;
    private javax.swing.JTextField jTfId;
    private javax.swing.JTextField jTfNombre;
    private javax.swing.JTextField jTfPrecio;
    // End of variables declaration//GEN-END:variables
}
