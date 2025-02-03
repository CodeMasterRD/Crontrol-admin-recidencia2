
package GUI;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import Controlador.EstudianteControlador;
import Controlador.EntradaSalidaControlador;
import Controlador.BotellonesControlador;
import Controlador.CocinaControlador;
import DAO.EstudiantesDAO;


public class RetirarEstudiante extends javax.swing.JFrame {

    

    EstudianteControlador estudianteControlador = new EstudianteControlador();
    EntradaSalidaControlador entradaSalidaControlador = new EntradaSalidaControlador();
    BotellonesControlador botellonesControlador = new BotellonesControlador();
    CocinaControlador cocinaControlador = new CocinaControlador();
    EstudiantesDAO estudiantesDAO = new EstudiantesDAO();
    
    VerEstudiantes verEstudiantes = new VerEstudiantes();
    private Timer timer;
    private String lastQuery = ""; 
    
    //Modelo modelo = new Modelo();

    
    public RetirarEstudiante() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEstudiantesRetirar = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        RegistrarEstudianteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        VerEstudianteBtn = new javax.swing.JButton();
        HistorialCocinaBnt = new javax.swing.JButton();
        HistorialEntradaSalida = new javax.swing.JButton();
        InformeDeActividadBtn = new javax.swing.JButton();
        NotificacionesBotellonesbtn = new javax.swing.JButton();
        HistorialBotellonesbtn = new javax.swing.JButton();
        RetirarEstudiantesbtn = new javax.swing.JButton();
        EditarEstudiantebtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        Retirarbtn = new javax.swing.JButton();
        BuscarMatriculaRetirar = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));

        TablaEstudiantesRetirar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TablaEstudiantesRetirar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nombre Completo", "Numero", "Estado", "Modulo", "Habitacion", "Genero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaEstudiantesRetirar.setToolTipText("Listado de contactos");
        TablaEstudiantesRetirar.setRowHeight(30);
        TablaEstudiantesRetirar.getTableHeader().setResizingAllowed(false);
        TablaEstudiantesRetirar.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaEstudiantesRetirar);
        if (TablaEstudiantesRetirar.getColumnModel().getColumnCount() > 0) {
            TablaEstudiantesRetirar.getColumnModel().getColumn(0).setResizable(false);
            TablaEstudiantesRetirar.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablaEstudiantesRetirar.getColumnModel().getColumn(1).setResizable(false);
            TablaEstudiantesRetirar.getColumnModel().getColumn(1).setPreferredWidth(150);
            TablaEstudiantesRetirar.getColumnModel().getColumn(2).setResizable(false);
            TablaEstudiantesRetirar.getColumnModel().getColumn(3).setResizable(false);
            TablaEstudiantesRetirar.getColumnModel().getColumn(4).setResizable(false);
            TablaEstudiantesRetirar.getColumnModel().getColumn(4).setPreferredWidth(42);
            TablaEstudiantesRetirar.getColumnModel().getColumn(5).setPreferredWidth(42);
            TablaEstudiantesRetirar.getColumnModel().getColumn(6).setPreferredWidth(42);
        }

        jPanel2.setBackground(new java.awt.Color(0, 55, 133));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
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

        HistorialEntradaSalida.setBackground(new java.awt.Color(20, 101, 187));
        HistorialEntradaSalida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HistorialEntradaSalida.setForeground(new java.awt.Color(255, 255, 255));
        HistorialEntradaSalida.setText("Historial Entrada/salida");
        HistorialEntradaSalida.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        HistorialEntradaSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HistorialEntradaSalidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HistorialEntradaSalidaMouseExited(evt);
            }
        });
        HistorialEntradaSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialEntradaSalidaActionPerformed(evt);
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

        RetirarEstudiantesbtn.setBackground(new java.awt.Color(51, 153, 255));
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

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegistrarEstudianteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(VerEstudianteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HistorialCocinaBnt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HistorialEntradaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(InformeDeActividadBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HistorialBotellonesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NotificacionesBotellonesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
            .addComponent(RetirarEstudiantesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(EditarEstudiantebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(74, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VerEstudianteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(RegistrarEstudianteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(HistorialCocinaBnt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(HistorialEntradaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(47, 47, 47))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(577, Short.MAX_VALUE)))
        );

        Retirarbtn.setBackground(new java.awt.Color(30, 30, 30));
        Retirarbtn.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        Retirarbtn.setForeground(new java.awt.Color(255, 255, 255));
        Retirarbtn.setText("Retirar");
        Retirarbtn.setBorder(null);
        Retirarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarbtnActionPerformed(evt);
            }
        });

        BuscarMatriculaRetirar.setBackground(new java.awt.Color(30, 30, 30));
        BuscarMatriculaRetirar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BuscarMatriculaRetirar.setForeground(new java.awt.Color(255, 255, 255));
        BuscarMatriculaRetirar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(30, 30, 30)));
        BuscarMatriculaRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarMatriculaRetirarActionPerformed(evt);
            }
        });
        BuscarMatriculaRetirar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarMatriculaRetirarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarMatriculaRetirarKeyTyped(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BuscarMatricula(Completa)");

        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BuscarMatriculaRetirar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))
                        .addGap(615, 615, 615))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Retirarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(344, 344, 344))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(377, 377, 377))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarMatriculaRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(Retirarbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        this.dispose(); //quitar la ventana
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
        
        Cocina.setVisible(true);
        this.dispose();
        Cocina.setLocationRelativeTo(null);
    }//GEN-LAST:event_HistorialCocinaBntActionPerformed

    private void HistorialEntradaSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialEntradaSalidaActionPerformed
        HistorialEntradaSalida historialEntradaSalida = new HistorialEntradaSalida();
        
        DefaultTableModel modelo = (DefaultTableModel) historialEntradaSalida.TablaHitorialEntradaSalida.getModel(); 
        entradaSalidaControlador.HistorialEntradaSalida(modelo);
        
        historialEntradaSalida.setVisible(true);
        this.dispose();
        historialEntradaSalida.setLocationRelativeTo(null);
    }//GEN-LAST:event_HistorialEntradaSalidaActionPerformed

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
        

        DefaultTableModel modelo = (DefaultTableModel) TablaEstudiantesRetirar.getModel();
        estudianteControlador.MostrarEstudiante(modelo);
    }//GEN-LAST:event_RetirarEstudiantesbtnActionPerformed

    private void BuscarMatriculaRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarMatriculaRetirarActionPerformed
        String texto = getBuscarMatriculaText();
        System.out.println("Texto ingresado en BuscarMatriculaField: " + texto);

    }//GEN-LAST:event_BuscarMatriculaRetirarActionPerformed
    
    public String getBuscarMatriculaText() {
          return BuscarMatriculaRetirar.getText();
      }


    private void BuscarMatriculaRetirarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarMatriculaRetirarKeyReleased

    String matricula = BuscarMatriculaRetirar.getText().trim();  // Obtener la matrícula
    // cancelar cualquier temporizador anterior
    if (timer != null) {
        timer.stop();
    }
    // si la búsqueda es significativa (no vacía)
    if (!matricula.isEmpty()) {
        // crear un nuevo temporizador que espera 400 ms antes de ejecutar la búsqueda
        timer = new Timer(400, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // solo ejecutamos la búsqueda si la consulta es diferente de la última
                if (!matricula.equals(lastQuery)) {
                    DefaultTableModel modelo = (DefaultTableModel) TablaEstudiantesRetirar.getModel();
                    try {
                        estudianteControlador.BuscarEstudiante(modelo, matricula); 
                        lastQuery = matricula;
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(VerEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        timer.setRepeats(false);
        timer.start();
    } else {
        // si el campo está vacío, mostrar todos los estudiantes
        DefaultTableModel modelo = (DefaultTableModel) TablaEstudiantesRetirar.getModel();
        try {
            estudianteControlador.BuscarEstudiante(modelo, matricula); // Método para mostrar todos los datos
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VerEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    }//GEN-LAST:event_BuscarMatriculaRetirarKeyReleased

    private void BuscarMatriculaRetirarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarMatriculaRetirarKeyTyped
        if(BuscarMatriculaRetirar.getText().length() >=8){
            evt.consume();
        }

        char key = evt.getKeyChar();
        if(!Character.isDigit(key)) {
            evt.consume();

        }

    }//GEN-LAST:event_BuscarMatriculaRetirarKeyTyped
        
      public String getBuscarMatriculaTextRetirar() {
        return BuscarMatriculaRetirar.getText();
    }
      
      
    private void RetirarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarbtnActionPerformed
     String matriculaStr = getBuscarMatriculaText(); 

    if (!matriculaStr.isEmpty()) {
        try {
            int matricula = Integer.parseInt(matriculaStr);

            estudiantesDAO.RetirarMatricula(matricula);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una matrícula válida.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (FileNotFoundException ex) {
             Logger.getLogger(RetirarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
         }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese una matrícula.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_RetirarbtnActionPerformed

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

    private void RetirarEstudiantesbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetirarEstudiantesbtnMouseEntered
        RetirarEstudiantesbtn.setBackground(new Color(0,55,133));

    }//GEN-LAST:event_RetirarEstudiantesbtnMouseEntered

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
        HistorialCocinaBnt.setBackground(new Color(20,101,187));
    }//GEN-LAST:event_HistorialCocinaBntMouseExited

    private void HistorialEntradaSalidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialEntradaSalidaMouseEntered
        HistorialEntradaSalida.setBackground(new Color(0,55,133));
    }//GEN-LAST:event_HistorialEntradaSalidaMouseEntered

    private void HistorialEntradaSalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialEntradaSalidaMouseExited
        HistorialEntradaSalida.setBackground(new Color(20,101,187));
    }//GEN-LAST:event_HistorialEntradaSalidaMouseExited

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

    private void RetirarEstudiantesbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetirarEstudiantesbtnMouseExited
        RetirarEstudiantesbtn.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_RetirarEstudiantesbtnMouseExited

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField BuscarMatriculaRetirar;
    private javax.swing.JButton EditarEstudiantebtn;
    private javax.swing.JButton HistorialBotellonesbtn;
    private javax.swing.JButton HistorialCocinaBnt;
    private javax.swing.JButton HistorialEntradaSalida;
    private javax.swing.JButton InformeDeActividadBtn;
    private javax.swing.JButton NotificacionesBotellonesbtn;
    private javax.swing.JButton RegistrarEstudianteBtn;
    private javax.swing.JButton RetirarEstudiantesbtn;
    private javax.swing.JButton Retirarbtn;
    public javax.swing.JTable TablaEstudiantesRetirar;
    private javax.swing.JButton VerEstudianteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
