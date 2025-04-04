/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VentanasEmegentes;

import javax.swing.JTextField;
import DAO.BotellonesDAO;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class IngresarBotellonesConfirmar extends javax.swing.JFrame {


   
    public IngresarBotellonesConfirmar() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotelloneIngresadosbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BotelloneIngresadosTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotelloneIngresadosbtn.setText("Confirmar");
        BotelloneIngresadosbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotelloneIngresadosbtnActionPerformed(evt);
            }
        });
        jPanel1.add(BotelloneIngresadosbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Botellones a ingresar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        BotelloneIngresadosTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotelloneIngresadosTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(BotelloneIngresadosTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotelloneIngresadosbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotelloneIngresadosbtnActionPerformed
        String texto = BotelloneIngresadosTextField.getText(); // Obtener el texto ingresado
        int numeroBotellones = Integer.parseInt(texto); 
        BotellonesDAO llenarBotellonesDAO = new BotellonesDAO();
        try {
            llenarBotellonesDAO.llenarBotellones(numeroBotellones);
            this.dispose();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IngresarBotellonesConfirmar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotelloneIngresadosbtnActionPerformed

    private void BotelloneIngresadosTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotelloneIngresadosTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotelloneIngresadosTextFieldActionPerformed

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField BotelloneIngresadosTextField;
    private javax.swing.JButton BotelloneIngresadosbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
