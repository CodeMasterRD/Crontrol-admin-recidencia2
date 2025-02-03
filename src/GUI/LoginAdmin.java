/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import control_servidor_admin.LoginRegistrar;
import javax.swing.table.DefaultTableModel;

public class LoginAdmin extends javax.swing.JFrame {

    public LoginAdmin() {
        initComponents();
    }

    VerEstudiantes verEstudiantes = new VerEstudiantes(); 

    public javax.swing.JTextField getUsuarioSesion() {
        return UsuarioSesion;
    }

    public javax.swing.JPasswordField getContraseñaSesion() {
        return ContraseñaSesion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        UsuarioSesion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ContraseñaSesion = new javax.swing.JPasswordField();
        Entrarbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background1.setBackground(new java.awt.Color(255, 255, 255));
        background1.setForeground(new java.awt.Color(204, 204, 204));
        background1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background.jpg"))); // NOI18N
        background1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 450, 650));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("USUARIO");
        background1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 90, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("INICIAR SESION ");
        background1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 300, 40));

        UsuarioSesion.setBackground(new java.awt.Color(255, 255, 255));
        UsuarioSesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UsuarioSesion.setBorder(null);
        UsuarioSesion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsuarioSesionFocusGained(evt);
            }
        });
        UsuarioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UsuarioSesionMousePressed(evt);
            }
        });
        UsuarioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioSesionActionPerformed(evt);
            }
        });
        background1.add(UsuarioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 400, 30));
        background1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 400, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CONTRASEÑA");
        background1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));
        background1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 400, 10));

        ContraseñaSesion.setBackground(new java.awt.Color(255, 255, 255));
        ContraseñaSesion.setBorder(null);
        ContraseñaSesion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ContraseñaSesionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ContraseñaSesionFocusLost(evt);
            }
        });
        ContraseñaSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaSesionActionPerformed(evt);
            }
        });
        background1.add(ContraseñaSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 400, 30));

        Entrarbtn.setBackground(new java.awt.Color(29, 134, 192));
        Entrarbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Entrarbtn.setForeground(new java.awt.Color(255, 255, 255));
        Entrarbtn.setText("Entrar");
        Entrarbtn.setBorder(null);
        Entrarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarbtnActionPerformed(evt);
            }
        });
        background1.add(Entrarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 170, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1250, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioSesionActionPerformed
        UsuarioSesion.setText("");
    }//GEN-LAST:event_UsuarioSesionActionPerformed

    private void EntrarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarbtnActionPerformed
        String usuario = UsuarioSesion.getText();
        String contraseña = ContraseñaSesion.getText();
        
         LoginRegistrar logincontroller = new LoginRegistrar(this); 
//        
//        VerEstudiantes verEstudiantes = new VerEstudiantes();
//        verEstudiantes.setVisible(true);
//        verEstudiantes.setLocationRelativeTo(null);

        logincontroller.IniciarSesion(usuario, contraseña);
       
    }//GEN-LAST:event_EntrarbtnActionPerformed

    private void UsuarioSesionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsuarioSesionFocusGained
        
    }//GEN-LAST:event_UsuarioSesionFocusGained

    private void ContraseñaSesionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContraseñaSesionFocusGained
    }//GEN-LAST:event_ContraseñaSesionFocusGained

    private void ContraseñaSesionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContraseñaSesionFocusLost
    }//GEN-LAST:event_ContraseñaSesionFocusLost

    private void UsuarioSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioSesionMousePressed

    }//GEN-LAST:event_UsuarioSesionMousePressed

    private void ContraseñaSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaSesionActionPerformed
    }//GEN-LAST:event_ContraseñaSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ContraseñaSesion;
    private javax.swing.JButton Entrarbtn;
    private javax.swing.JTextField UsuarioSesion;
    private javax.swing.JPanel background1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
