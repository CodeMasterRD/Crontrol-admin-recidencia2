/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.table.DefaultTableModel;
import Controlador.EstudianteControlador;
import Controlador.EntradaSalidaControlador;
import Controlador.BotellonesControlador;
import Controlador.CocinaControlador;


/**
 *
 * @author Erick Tejada
 */
public class HistorialCocina extends javax.swing.JFrame {

    /**
     * Creates new form HistorialCocina
     */
    public HistorialCocina() {
        initComponents();
    }
    EstudianteControlador estudianteControlador = new EstudianteControlador();
    EntradaSalidaControlador entradaSalidaControlador = new EntradaSalidaControlador();
    BotellonesControlador botellonesControlador = new BotellonesControlador();
    CocinaControlador cocinaControlador = new CocinaControlador();





    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HistorialCocinaTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        RegistrarEstudianteBtn = new javax.swing.JButton();
        VerEstudianteBtn = new javax.swing.JButton();
        HistorialCocinaBnt = new javax.swing.JButton();
        HistorialCocinaBnt1 = new javax.swing.JButton();
        InformeDeActividadBtn = new javax.swing.JButton();
        NotificacionesBotellonesbtn = new javax.swing.JButton();
        HistorialBotellonesbtn = new javax.swing.JButton();
        RetirarEstudiantesbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        EditarEstudiantebtn = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));

        HistorialCocinaTable.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        HistorialCocinaTable.setForeground(new java.awt.Color(0, 0, 0));
        HistorialCocinaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Estudiante", "Fecha/Hora Entrada", "Fecha/Hora Salida", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        HistorialCocinaTable.setRowHeight(30);
        jScrollPane1.setViewportView(HistorialCocinaTable);
        if (HistorialCocinaTable.getColumnModel().getColumnCount() > 0) {
            HistorialCocinaTable.getColumnModel().getColumn(0).setResizable(false);
            HistorialCocinaTable.getColumnModel().getColumn(0).setPreferredWidth(15);
            HistorialCocinaTable.getColumnModel().getColumn(1).setResizable(false);
            HistorialCocinaTable.getColumnModel().getColumn(1).setPreferredWidth(75);
            HistorialCocinaTable.getColumnModel().getColumn(2).setResizable(false);
            HistorialCocinaTable.getColumnModel().getColumn(3).setResizable(false);
            HistorialCocinaTable.getColumnModel().getColumn(4).setResizable(false);
            HistorialCocinaTable.getColumnModel().getColumn(4).setPreferredWidth(10);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 55, 133));
        jPanel2.setPreferredSize(new java.awt.Dimension(332, 611));

        RegistrarEstudianteBtn.setBackground(new java.awt.Color(20, 101, 187));
        RegistrarEstudianteBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RegistrarEstudianteBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarEstudianteBtn.setText("Registrar Estudiante");
        RegistrarEstudianteBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        RegistrarEstudianteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistrarEstudianteBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistrarEstudianteBtnMouseExited(evt);
            }
        });
        RegistrarEstudianteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarEstudianteBtnActionPerformed(evt);
            }
        });

        VerEstudianteBtn.setBackground(new java.awt.Color(20, 101, 187));
        VerEstudianteBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        VerEstudianteBtn.setForeground(new java.awt.Color(255, 255, 255));
        VerEstudianteBtn.setText("Ver Estudiante");
        VerEstudianteBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        VerEstudianteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VerEstudianteBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VerEstudianteBtnMouseExited(evt);
            }
        });
        VerEstudianteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEstudianteBtnActionPerformed(evt);
            }
        });

        HistorialCocinaBnt.setBackground(new java.awt.Color(51, 153, 255));
        HistorialCocinaBnt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HistorialCocinaBnt.setForeground(new java.awt.Color(255, 255, 255));
        HistorialCocinaBnt.setText("Historial Cocina");
        HistorialCocinaBnt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        HistorialCocinaBnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HistorialCocinaBntMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HistorialCocinaBntMouseExited(evt);
            }
        });
        HistorialCocinaBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialCocinaBntActionPerformed(evt);
            }
        });

        HistorialCocinaBnt1.setBackground(new java.awt.Color(20, 101, 187));
        HistorialCocinaBnt1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HistorialCocinaBnt1.setForeground(new java.awt.Color(255, 255, 255));
        HistorialCocinaBnt1.setText("Historial Entrada/salida");
        HistorialCocinaBnt1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        HistorialCocinaBnt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HistorialCocinaBnt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HistorialCocinaBnt1MouseExited(evt);
            }
        });
        HistorialCocinaBnt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialCocinaBnt1ActionPerformed(evt);
            }
        });

        InformeDeActividadBtn.setBackground(new java.awt.Color(20, 101, 187));
        InformeDeActividadBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        InformeDeActividadBtn.setForeground(new java.awt.Color(255, 255, 255));
        InformeDeActividadBtn.setText("Informe De Actividad");
        InformeDeActividadBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        InformeDeActividadBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InformeDeActividadBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InformeDeActividadBtnMouseExited(evt);
            }
        });
        InformeDeActividadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformeDeActividadBtnActionPerformed(evt);
            }
        });

        NotificacionesBotellonesbtn.setBackground(new java.awt.Color(20, 101, 187));
        NotificacionesBotellonesbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NotificacionesBotellonesbtn.setForeground(new java.awt.Color(255, 255, 255));
        NotificacionesBotellonesbtn.setText("Notificaciones Botellones");
        NotificacionesBotellonesbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        NotificacionesBotellonesbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NotificacionesBotellonesbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NotificacionesBotellonesbtnMouseExited(evt);
            }
        });
        NotificacionesBotellonesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotificacionesBotellonesbtnActionPerformed(evt);
            }
        });

        HistorialBotellonesbtn.setBackground(new java.awt.Color(20, 101, 187));
        HistorialBotellonesbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HistorialBotellonesbtn.setForeground(new java.awt.Color(255, 255, 255));
        HistorialBotellonesbtn.setText("Historial Botellones");
        HistorialBotellonesbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        HistorialBotellonesbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HistorialBotellonesbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HistorialBotellonesbtnMouseExited(evt);
            }
        });
        HistorialBotellonesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialBotellonesbtnActionPerformed(evt);
            }
        });

        RetirarEstudiantesbtn.setBackground(new java.awt.Color(20, 101, 187));
        RetirarEstudiantesbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RetirarEstudiantesbtn.setForeground(new java.awt.Color(255, 255, 255));
        RetirarEstudiantesbtn.setText("Retirar Estudiantes");
        RetirarEstudiantesbtn.setBorder(null);
        RetirarEstudiantesbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RetirarEstudiantesbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RetirarEstudiantesbtnMouseExited(evt);
            }
        });
        RetirarEstudiantesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarEstudiantesbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ControlAdmin");

        EditarEstudiantebtn.setBackground(new java.awt.Color(20, 101, 187));
        EditarEstudiantebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EditarEstudiantebtn.setForeground(new java.awt.Color(255, 255, 255));
        EditarEstudiantebtn.setText("Editar Estudiante");
        EditarEstudiantebtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        EditarEstudiantebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EditarEstudiantebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EditarEstudiantebtnMouseExited(evt);
            }
        });
        EditarEstudiantebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarEstudiantebtnActionPerformed(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegistrarEstudianteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(VerEstudianteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HistorialCocinaBnt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HistorialCocinaBnt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(InformeDeActividadBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HistorialBotellonesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NotificacionesBotellonesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
            .addComponent(RetirarEstudiantesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(EditarEstudiantebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(58, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(VerEstudianteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(RegistrarEstudianteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(HistorialCocinaBnt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(HistorialCocinaBnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(InformeDeActividadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(HistorialBotellonesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(NotificacionesBotellonesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(EditarEstudiantebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(RetirarEstudiantesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(576, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarEstudianteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarEstudianteBtnActionPerformed
        RegistrarEstudiante registrarEstudiante = new RegistrarEstudiante();
        registrarEstudiante.setVisible(true);
        this.dispose();
        registrarEstudiante.setLocationRelativeTo(null);
    }//GEN-LAST:event_RegistrarEstudianteBtnActionPerformed

    private void VerEstudianteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEstudianteBtnActionPerformed

        VerEstudiantes verEstudiantes = new VerEstudiantes();
        verEstudiantes.setVisible(true);
        this.dispose();
        verEstudiantes.setLocationRelativeTo(null);
        
        DefaultTableModel modelo = (DefaultTableModel) verEstudiantes.TablaEstudiantes.getModel();
        estudianteControlador.MostrarEstudiante(modelo);
                             
        

    }//GEN-LAST:event_VerEstudianteBtnActionPerformed

    private void HistorialCocinaBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialCocinaBntActionPerformed
        HistorialCocina Cocina = new HistorialCocina();
        DefaultTableModel modelo = (DefaultTableModel) Cocina.HistorialCocinaTable.getModel(); 
        cocinaControlador.HistorialUsoCocina(modelo);

    }//GEN-LAST:event_HistorialCocinaBntActionPerformed

    private void HistorialCocinaBnt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialCocinaBnt1ActionPerformed
        HistorialEntradaSalida historialEntradaSalida = new HistorialEntradaSalida();
        
        DefaultTableModel modelo = (DefaultTableModel) historialEntradaSalida.TablaHitorialEntradaSalida.getModel(); 
        entradaSalidaControlador.HistorialEntradaSalida(modelo);
        
        historialEntradaSalida.setVisible(true);
        this.dispose();
        historialEntradaSalida.setLocationRelativeTo(null);
    }//GEN-LAST:event_HistorialCocinaBnt1ActionPerformed

    private void InformeDeActividadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformeDeActividadBtnActionPerformed
        InformeDeActividad informe = new InformeDeActividad();
        informe.setVisible(true);
        this.dispose();
        informe.setLocationRelativeTo(null);

    }//GEN-LAST:event_InformeDeActividadBtnActionPerformed

    private void NotificacionesBotellonesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotificacionesBotellonesbtnActionPerformed
        NotificacionesBotellones notificacionesBotellones = new NotificacionesBotellones();

        DefaultTableModel modelo = (DefaultTableModel) notificacionesBotellones.NotificacionesBotetellonesTabla.getModel(); 
        botellonesControlador.NotificaionesBotellones(modelo);
        
        notificacionesBotellones.setVisible(true);
        this.dispose();
        notificacionesBotellones.setLocationRelativeTo(null);
    }//GEN-LAST:event_NotificacionesBotellonesbtnActionPerformed

    private void HistorialBotellonesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialBotellonesbtnActionPerformed
        HistorialBotellones notificacionesBotellones = new HistorialBotellones();
        notificacionesBotellones.setVisible(true);
        this.dispose();        
        notificacionesBotellones.setLocationRelativeTo(null);
        
        DefaultTableModel modelo = (DefaultTableModel) notificacionesBotellones.HistorialBotetellonesTabla.getModel(); 
        botellonesControlador.historialBotellones(modelo);
    }//GEN-LAST:event_HistorialBotellonesbtnActionPerformed

    private void RetirarEstudiantesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarEstudiantesbtnActionPerformed
        RetirarEstudiante retirar = new RetirarEstudiante();
        retirar.setVisible(true);
        this.dispose();
        retirar.setLocationRelativeTo(null);

        DefaultTableModel modelo = (DefaultTableModel) retirar.TablaEstudiantesRetirar.getModel(); 
        estudianteControlador.VerTodosEstudiantes(modelo);
    }//GEN-LAST:event_RetirarEstudiantesbtnActionPerformed

    private void EditarEstudiantebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarEstudiantebtnMouseEntered
        EditarEstudiantebtn.setBackground(new Color(0,55,133));
    }//GEN-LAST:event_EditarEstudiantebtnMouseEntered

    private void EditarEstudiantebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarEstudiantebtnMouseExited
        EditarEstudiantebtn.setBackground(new Color(20,101,187));
    }//GEN-LAST:event_EditarEstudiantebtnMouseExited

    private void EditarEstudiantebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarEstudiantebtnActionPerformed
        EditarEstudiante editarEstudiante = new EditarEstudiante();
        editarEstudiante.setVisible(true);
        this.dispose();

        editarEstudiante.setLocationRelativeTo(null);
    
        DefaultTableModel modelo = (DefaultTableModel) editarEstudiante.TablaEstudiantesEditar.getModel();
        estudianteControlador.MostrarEstudianteEditar(modelo);
    }//GEN-LAST:event_EditarEstudiantebtnActionPerformed

    private void VerEstudianteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerEstudianteBtnMouseEntered
        VerEstudianteBtn.setBackground(new Color(0,55,133));
    }//GEN-LAST:event_VerEstudianteBtnMouseEntered

    private void VerEstudianteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerEstudianteBtnMouseExited
        VerEstudianteBtn.setBackground(new Color(20,101,187));
    }//GEN-LAST:event_VerEstudianteBtnMouseExited

    private void RegistrarEstudianteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarEstudianteBtnMouseEntered
        RegistrarEstudianteBtn.setBackground(new Color(0,55,133));
    }//GEN-LAST:event_RegistrarEstudianteBtnMouseEntered

    private void RegistrarEstudianteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarEstudianteBtnMouseExited
        RegistrarEstudianteBtn.setBackground(new Color(20,101,187));
    }//GEN-LAST:event_RegistrarEstudianteBtnMouseExited

    private void HistorialCocinaBntMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialCocinaBntMouseEntered
        HistorialCocinaBnt.setBackground(new Color(0,55,133));
    }//GEN-LAST:event_HistorialCocinaBntMouseEntered

    private void HistorialCocinaBntMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialCocinaBntMouseExited
        HistorialCocinaBnt.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_HistorialCocinaBntMouseExited

    private void HistorialCocinaBnt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialCocinaBnt1MouseEntered
        HistorialCocinaBnt1.setBackground(new Color(0,55,133));
    }//GEN-LAST:event_HistorialCocinaBnt1MouseEntered

    private void HistorialCocinaBnt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialCocinaBnt1MouseExited
        HistorialCocinaBnt1.setBackground(new Color(20,101,187));
    }//GEN-LAST:event_HistorialCocinaBnt1MouseExited

    private void InformeDeActividadBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformeDeActividadBtnMouseEntered
        InformeDeActividadBtn.setBackground(new Color(0,55,133));
    }//GEN-LAST:event_InformeDeActividadBtnMouseEntered

    private void InformeDeActividadBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformeDeActividadBtnMouseExited
        InformeDeActividadBtn.setBackground(new Color(20,101,187));
    }//GEN-LAST:event_InformeDeActividadBtnMouseExited

    private void HistorialBotellonesbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialBotellonesbtnMouseEntered
        HistorialBotellonesbtn.setBackground(new Color(0,55,133));
    }//GEN-LAST:event_HistorialBotellonesbtnMouseEntered

    private void HistorialBotellonesbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialBotellonesbtnMouseExited
        HistorialBotellonesbtn.setBackground(new Color(20,101,187));
    }//GEN-LAST:event_HistorialBotellonesbtnMouseExited

    private void NotificacionesBotellonesbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotificacionesBotellonesbtnMouseEntered
        NotificacionesBotellonesbtn.setBackground(new Color(0,55,133));
    }//GEN-LAST:event_NotificacionesBotellonesbtnMouseEntered

    private void NotificacionesBotellonesbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotificacionesBotellonesbtnMouseExited
        NotificacionesBotellonesbtn.setBackground(new Color(20,101,187));
    }//GEN-LAST:event_NotificacionesBotellonesbtnMouseExited

    private void RetirarEstudiantesbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetirarEstudiantesbtnMouseEntered
        RetirarEstudiantesbtn.setBackground(new Color(0,55,133));
    }//GEN-LAST:event_RetirarEstudiantesbtnMouseEntered

    private void RetirarEstudiantesbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetirarEstudiantesbtnMouseExited
        RetirarEstudiantesbtn.setBackground(new Color(20,101,187));
    }//GEN-LAST:event_RetirarEstudiantesbtnMouseExited

   public DefaultTableModel getModel() {
    return (DefaultTableModel) HistorialCocinaTable.getModel();

   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditarEstudiantebtn;
    private javax.swing.JButton HistorialBotellonesbtn;
    private javax.swing.JButton HistorialCocinaBnt;
    private javax.swing.JButton HistorialCocinaBnt1;
    public javax.swing.JTable HistorialCocinaTable;
    private javax.swing.JButton InformeDeActividadBtn;
    private javax.swing.JButton NotificacionesBotellonesbtn;
    private javax.swing.JButton RegistrarEstudianteBtn;
    private javax.swing.JButton RetirarEstudiantesbtn;
    private javax.swing.JButton VerEstudianteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
