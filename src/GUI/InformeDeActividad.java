/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import DAO.BotellonesDAO;
import Percistencia.DBConexion;
import control_servidor_admin.EstadisticaBotellones;
import java.awt.BorderLayout;
import java.awt.Dimension;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import control_servidor_admin.EstadisticaEstado;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import VentanasEmegentes.IngresarBotellonesConfirmar;
import Controlador.EstudianteControlador;
import Controlador.EntradaSalidaControlador;
import Controlador.BotellonesControlador;
import Controlador.CocinaControlador;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;



/**
 *
 * @author Erick Tejada
 */
public class InformeDeActividad extends javax.swing.JFrame {
    
       
    public InformeDeActividad() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    VerEstudiantes verEstudiantes = new VerEstudiantes(); 
    EstudianteControlador estudianteControlador = new EstudianteControlador();
    EntradaSalidaControlador entradaSalidaControlador = new EntradaSalidaControlador();
    BotellonesControlador botellonesControlador = new BotellonesControlador();
    CocinaControlador cocinaControlador = new CocinaControlador();


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        RegistrarEstudianteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        VerEstudianteBtn = new javax.swing.JButton();
        HistorialCocinaBnt = new javax.swing.JButton();
        HistorialCocinaBnt1 = new javax.swing.JButton();
        InformeDeActividadBtn = new javax.swing.JButton();
        NotificacionesBotellonesbtn = new javax.swing.JButton();
        HistorialBotellonesbtn = new javax.swing.JButton();
        RetirarEstudiantesbtn = new javax.swing.JButton();
        EditarEstudiantebtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        GraficoInformePastelEstudiante = new javax.swing.JPanel();
        GraficoInformePastelBotellones = new javax.swing.JPanel();
        GenerarTablabtn = new javax.swing.JButton();
        IngresarBotellonesbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));

        jPanel2.setBackground(new java.awt.Color(0, 55, 133));
        jPanel2.setPreferredSize(new java.awt.Dimension(332, 607));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ControlAdmin");

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

        HistorialCocinaBnt.setBackground(new java.awt.Color(20, 101, 187));
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

        InformeDeActividadBtn.setBackground(new java.awt.Color(51, 153, 255));
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

        EditarEstudiantebtn.setBackground(new java.awt.Color(20, 101, 187));
        EditarEstudiantebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EditarEstudiantebtn.setForeground(new java.awt.Color(255, 255, 255));
        EditarEstudiantebtn.setText("Editar Estudiante");
        EditarEstudiantebtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        EditarEstudiantebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditarEstudiantebtnMouseClicked(evt);
            }
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

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(30, 30, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 898, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(VerEstudianteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HistorialCocinaBnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegistrarEstudianteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HistorialCocinaBnt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InformeDeActividadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NotificacionesBotellonesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarEstudiantebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HistorialBotellonesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RetirarEstudiantesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(374, 374, 374)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
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
                .addGap(0, 41, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(272, 272, 272)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(273, 273, 273)))
        );

        GraficoInformePastelEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        GraficoInformePastelEstudiante.setPreferredSize(new java.awt.Dimension(400, 350));

        javax.swing.GroupLayout GraficoInformePastelEstudianteLayout = new javax.swing.GroupLayout(GraficoInformePastelEstudiante);
        GraficoInformePastelEstudiante.setLayout(GraficoInformePastelEstudianteLayout);
        GraficoInformePastelEstudianteLayout.setHorizontalGroup(
            GraficoInformePastelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        GraficoInformePastelEstudianteLayout.setVerticalGroup(
            GraficoInformePastelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        GraficoInformePastelBotellones.setForeground(new java.awt.Color(255, 255, 255));
        GraficoInformePastelBotellones.setPreferredSize(new java.awt.Dimension(400, 350));

        javax.swing.GroupLayout GraficoInformePastelBotellonesLayout = new javax.swing.GroupLayout(GraficoInformePastelBotellones);
        GraficoInformePastelBotellones.setLayout(GraficoInformePastelBotellonesLayout);
        GraficoInformePastelBotellonesLayout.setHorizontalGroup(
            GraficoInformePastelBotellonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        GraficoInformePastelBotellonesLayout.setVerticalGroup(
            GraficoInformePastelBotellonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        GenerarTablabtn.setBackground(new java.awt.Color(30, 30, 30));
        GenerarTablabtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        GenerarTablabtn.setForeground(new java.awt.Color(255, 255, 255));
        GenerarTablabtn.setText("Generar Grafica");
        GenerarTablabtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        GenerarTablabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GenerarTablabtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GenerarTablabtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GenerarTablabtnMousePressed(evt);
            }
        });
        GenerarTablabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarTablabtnActionPerformed(evt);
            }
        });
        GenerarTablabtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GenerarTablabtnKeyPressed(evt);
            }
        });

        IngresarBotellonesbtn.setBackground(new java.awt.Color(30, 30, 30));
        IngresarBotellonesbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        IngresarBotellonesbtn.setForeground(new java.awt.Color(255, 255, 255));
        IngresarBotellonesbtn.setText("Ingresar Botellones");
        IngresarBotellonesbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        IngresarBotellonesbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IngresarBotellonesbtnMouseEntered(evt);
            }
        });
        IngresarBotellonesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarBotellonesbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(GraficoInformePastelEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(GraficoInformePastelBotellones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(IngresarBotellonesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(GenerarTablabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(347, 347, 347))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GraficoInformePastelEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GraficoInformePastelBotellones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GenerarTablabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(IngresarBotellonesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        
        DefaultTableModel modelo = (DefaultTableModel) verEstudiantes.TablaEstudiantes.getModel();
        estudianteControlador.MostrarEstudiante(modelo);
        
        
        VerEstudiantes verEstudiantes = new VerEstudiantes();
        verEstudiantes.setVisible(true);
        this.dispose();
        verEstudiantes.setLocationRelativeTo(null);
    }//GEN-LAST:event_VerEstudianteBtnActionPerformed

    private void HistorialCocinaBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialCocinaBntActionPerformed
        HistorialCocina Cocina = new HistorialCocina();
        DefaultTableModel modelo = (DefaultTableModel) Cocina.HistorialCocinaTable.getModel(); 
        cocinaControlador.HistorialUsoCocina(modelo);
        
        Cocina.setVisible(true);
        this.dispose();
        Cocina.setLocationRelativeTo(null);
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
        //DefaultTableModel modelo = (DefaultTableModel) HistorialBotetellonesTabla.getModel();
        //logica.historialBotellones(modelo);
    }//GEN-LAST:event_HistorialBotellonesbtnActionPerformed

    private void RetirarEstudiantesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarEstudiantesbtnActionPerformed
        RetirarEstudiante retirar = new RetirarEstudiante();
    retirar.setVisible(true);
    this.dispose();
    retirar.setLocationRelativeTo(null);
    
    DefaultTableModel modelo = (DefaultTableModel) retirar.TablaEstudiantesRetirar.getModel(); 
    estudianteControlador.VerTodosEstudiantes(modelo);
        // TODO add your handling code here:
    }//GEN-LAST:event_RetirarEstudiantesbtnActionPerformed

    private void GenerarTablabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarTablabtnActionPerformed
         EstadisticaEstado estadisticas = new EstadisticaEstado(0, 0, 0);

    estadisticas.ConsultarEstadoEstudiante();

    // crear el dataset para el gráfico de pastel
    DefaultPieDataset datos = new DefaultPieDataset();
    datos.setValue("Dentro", estadisticas.n1);
    datos.setValue("Fuera", estadisticas.n2);
    datos.setValue("En Cocina", estadisticas.n3);

    // Crear el gráfico de pastel usando el dataset
    JFreeChart grafico_pastel = ChartFactory.createPieChart(
        "Informe de Actividad Estudiantes", // Título del gráfico
        datos,                // dataset
        true,                   // incluir leyenda
        false,                   // incluir tooltips(pasael el mouse)
        false                   // no incluir URLs
    );

    // acceder al gráfico de pastel y personalizar la leyenda
    PiePlot plot = (PiePlot) grafico_pastel.getPlot();

    // crear una función para generar la leyenda personalizada con el número
    plot.setLegendLabelGenerator(new StandardPieSectionLabelGenerator("{0} = {1}"));

    // crear el panel con el gráfico de pastel
    ChartPanel panel = new ChartPanel(grafico_pastel);
    panel.setMouseWheelEnabled(true);
    panel.setPreferredSize(new Dimension(400, 350));

    // configurar el panel dentro del contenedor
    GraficoInformePastelEstudiante.setLayout(new BorderLayout());
    GraficoInformePastelEstudiante.add(panel, BorderLayout.NORTH);

    pack();
    repaint();
        
        
        

    EstadisticaBotellones estadisticaBotellones = new EstadisticaBotellones(0, 0, 0);
    estadisticaBotellones.ConsultarEstadoEstudiante();

    DefaultPieDataset botellones = new DefaultPieDataset();
    botellones.setValue("Llenos", estadisticaBotellones.n1);
    botellones.setValue("Vacios", estadisticaBotellones.n2);
    botellones.setValue("En uso", estadisticaBotellones.n3);

    JFreeChart grafico_pastel_botellones = ChartFactory.createPieChart(
        "Informe de Botellones",
        botellones,              
        true,                    
        false,                    
        false                    
    );

    PiePlot plotE = (PiePlot) grafico_pastel_botellones.getPlot();
    plotE.setLegendLabelGenerator(new StandardPieSectionLabelGenerator("{0} = {1}"));

    ChartPanel panel_Estudiante = new ChartPanel(grafico_pastel_botellones);
    panel_Estudiante.setMouseWheelEnabled(true);
    panel_Estudiante.setPreferredSize(new Dimension(400, 350));

    GraficoInformePastelBotellones.setLayout(new BorderLayout());
    GraficoInformePastelBotellones.add(panel_Estudiante, BorderLayout.NORTH);

    pack();
    repaint();
        
    }//GEN-LAST:event_GenerarTablabtnActionPerformed

    private void GenerarTablabtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GenerarTablabtnKeyPressed
    }//GEN-LAST:event_GenerarTablabtnKeyPressed

    private void GenerarTablabtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerarTablabtnMouseEntered
        GenerarTablabtn.setBackground(new Color(0,55,133));
    }//GEN-LAST:event_GenerarTablabtnMouseEntered

    private void GenerarTablabtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerarTablabtnMouseExited
        GenerarTablabtn.setBackground(new Color(30,30,30));
    }//GEN-LAST:event_GenerarTablabtnMouseExited

    private void GenerarTablabtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerarTablabtnMousePressed
        GenerarTablabtn.setBackground(new Color(30,30,30));
    }//GEN-LAST:event_GenerarTablabtnMousePressed

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
        estudianteControlador.MostrarEstudiante(modelo);
    }//GEN-LAST:event_EditarEstudiantebtnActionPerformed

    private void IngresarBotellonesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarBotellonesbtnActionPerformed
        IngresarBotellonesConfirmar ingresarBotellonesConfirmar = new IngresarBotellonesConfirmar();
        
        
        ingresarBotellonesConfirmar.setVisible(true);
        ingresarBotellonesConfirmar.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_IngresarBotellonesbtnActionPerformed

    private void IngresarBotellonesbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarBotellonesbtnMouseEntered
    }//GEN-LAST:event_IngresarBotellonesbtnMouseEntered

    private void VerEstudianteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerEstudianteBtnMouseEntered
        VerEstudianteBtn.setBackground(new Color(20,101,187));

    }//GEN-LAST:event_VerEstudianteBtnMouseEntered

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
        HistorialCocinaBnt.setBackground(new Color(20,101,187));
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
        HistorialBotellonesbtn.setBackground(new Color(20,101,187));
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

    private void VerEstudianteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerEstudianteBtnMouseExited
        VerEstudianteBtn.setBackground(new Color(20,101,187));
    }//GEN-LAST:event_VerEstudianteBtnMouseExited

    private void EditarEstudiantebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarEstudiantebtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EditarEstudiantebtnMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditarEstudiantebtn;
    private javax.swing.JButton GenerarTablabtn;
    private javax.swing.JPanel GraficoInformePastelBotellones;
    private javax.swing.JPanel GraficoInformePastelEstudiante;
    private javax.swing.JButton HistorialBotellonesbtn;
    private javax.swing.JButton HistorialCocinaBnt;
    private javax.swing.JButton HistorialCocinaBnt1;
    private javax.swing.JButton InformeDeActividadBtn;
    private javax.swing.JButton IngresarBotellonesbtn;
    private javax.swing.JButton NotificacionesBotellonesbtn;
    private javax.swing.JButton RegistrarEstudianteBtn;
    private javax.swing.JButton RetirarEstudiantesbtn;
    private javax.swing.JButton VerEstudianteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
