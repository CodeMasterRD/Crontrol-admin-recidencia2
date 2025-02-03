/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import GUI.RetirarEstudiante;
import GUI.VerEstudiantes;
import Percistencia.DBConexion;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controlador.EstudianteControlador;
import com.mysql.cj.jdbc.CallableStatement;







public class EstudiantesDAO {
    
    
    
    private static DBConexion con1 = new DBConexion();
    private static Connection conet;
    DefaultTableModel modelo;
    private static Statement st;
    private static ResultSet rs;
    int idc;
    private static VerEstudiantes vista;
    private RetirarEstudiante vista1;
    EstudianteControlador estudianteControlador = new EstudianteControlador();
    
    
        public void RetirarMatricula(int matricula) throws FileNotFoundException {
        String sql = "CALL EliminarEstudiante(?);";

        try (Connection conet = con1.getConexion();
             PreparedStatement ps = conet.prepareStatement(sql)) {

            // establecer el parámetro del procedimiento
            ps.setInt(1, matricula);

            // ejecutar el procedimiento almacenado
            ps.executeUpdate();

            // mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(null, "Estudiante retirado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            
            RetirarEstudiante retirarEstudiante = new RetirarEstudiante();
            retirarEstudiante.BuscarMatriculaRetirar.setText("");
            
            System.out.println(retirarEstudiante.BuscarMatriculaRetirar.getText());
            
            DefaultTableModel modelo = (DefaultTableModel) retirarEstudiante.TablaEstudiantesRetirar.getModel();
            estudianteControlador.MostrarEstudiante(modelo);
            
        } catch (SQLException e) {
            System.err.println("Error al ejecutar el procedimiento: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al retirar el estudiante.", "Error", JOptionPane.ERROR_MESSAGE);
        }
}
        
        
    public void ejecutarInsertarAsignacionBotellon(String matricula) {
    String procedimiento = "{CALL InsertarAsignacionBotellon(?)}"; // Procedimiento almacenado

    int respuesta = JOptionPane.showConfirmDialog(null, 
        "¿Estás seguro de que deseas asignar el botellón para la matrícula: " + matricula + "?", 
        "Confirmar operación", //ventana de conformacion 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE);

    if (respuesta == JOptionPane.YES_OPTION) {
        try {
            Connection conexion = DBConexion.getConexion(); //conexion a la base de datos

            if (conexion != null) {
                try (CallableStatement stmt = (CallableStatement) conexion.prepareCall(procedimiento)) {
                    stmt.setString(1, matricula);

                    stmt.execute();

                    JOptionPane.showMessageDialog(null, "Procedimiento ejecutado con éxito para matrícula: " + matricula);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al ejecutar el procedimiento almacenado: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error: No se pudo obtener la conexión a la base de datos.");
            }
        } catch (SQLException | FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la conexión: " + ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Operación cancelada.");
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
