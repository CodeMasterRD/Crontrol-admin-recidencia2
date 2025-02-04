
package Controlador;

import GUI.RetirarEstudiante;
import GUI.VerEstudiantes;
import Percistencia.DBConexion;
import com.mysql.cj.jdbc.CallableStatement;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BotellonesControlador {
    
    
    
    private static final DBConexion con1 = new DBConexion();
    private static Connection conet;
    private static Statement st;
    private static ResultSet rs;
    
    public void ejecutarDepositarBotellon(String matricula) {
        String procedimiento = "{call confirmacionDepositoBotellon(?)};"; 

        // confirmación antes de ejecutar la operación
        int respuesta = JOptionPane.showConfirmDialog(null, 
            "¿Estás seguro de que deseas registrar el depósito del botellón para la matrícula: " + matricula + "?", 
            "Confirmar operación", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE);

        if (respuesta == JOptionPane.YES_OPTION) { //validando la ventana emergente
            try {
                Connection conexion = DBConexion.getConexion();

                if (conexion != null) {
                    try (CallableStatement stmt = (CallableStatement) conexion.prepareCall(procedimiento)) {
                        stmt.setString(1, matricula);

                        stmt.execute();

                        JOptionPane.showMessageDialog(null, "Depósito registrado con éxito para matrícula: " + matricula);
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error al ejecutar el procedimiento almacenado: " + ex.getMessage());
                    }
                } else {
                    // mensaje si no se pudo obtener la conexión
                    JOptionPane.showMessageDialog(null, "Error: No se pudo obtener la conexión a la base de datos.");
                }
            } catch (SQLException | FileNotFoundException ex) {
                // mensaje en caso de error al obtener la conexión
                JOptionPane.showMessageDialog(null, "Error al obtener la conexión: " + ex.getMessage());
            }
        } else {
            // mensaje si el usuario cancela la operación
            JOptionPane.showMessageDialog(null, "Operación cancelada.");
        }
}

        
    
    public void historialBotellones(DefaultTableModel modelo) {
        
        String sql = "call historialBotellones();";

    try {
        //conexion a base de datps
        conet = DBConexion.getConexion();
        st = conet.createStatement();
        rs = st.executeQuery(sql);
        
        modelo.setRowCount(0);
        
        Object[] Botellones = new Object[7];  
        
        while (rs.next()) {
            Botellones[0] = rs.getInt("Matricula"); 
            Botellones[1] = rs.getString("Nombre Completo");
            Botellones[2] = rs.getString("Modulo");
            Botellones[3] = rs.getString("Habitacion");
            Botellones[4] = rs.getString("Fecha de entrega");
            Botellones[5] = rs.getString("Fecha de deposito");
            Botellones[6] = rs.getString("estado");

            modelo.addRow(Botellones); // agg tados a la tabla
        }
    } catch (SQLException e) {
        System.err.println("Error al ejecutar la consulta: " + e.getMessage());
    } catch (FileNotFoundException e) {
        System.err.println("Error general: " + e.getMessage());
    } finally {
        try {
            //si el objeto ResultSet (rs) no es nulo antes de intentar cerrarlo
            if (rs != null) rs.close();
            if (conet != null) conet.close();// Cierra la conexión a la base de datos
        } catch (SQLException e) {
            // Captura y muestra cualquier error que ocurra al intentar cerrar los recursos
            System.err.println("Error al cerrar los recursos: " + e.getMessage());
        }
    }
    }
    
    
    public void NotificaionesBotellones(DefaultTableModel modelo) {
        
        String sql = "call notificacionBotellones();";

    try {
        conet = DBConexion.getConexion();
        st = conet.createStatement();
        rs = st.executeQuery(sql);
        
        modelo.setRowCount(0);
        
        Object[] Botellones = new Object[5];  
        
        while (rs.next()) {
            Botellones[0] = rs.getInt("Matricula"); 
            Botellones[1] = rs.getString("Nombre Completo");
            Botellones[2] = rs.getString("Tipo Notificacion");
            Botellones[3] = rs.getString("Fecha de la solicitud");
            Botellones[4] = rs.getString("Estado");

            modelo.addRow(Botellones);
        }
    } catch (SQLException e) {
        System.err.println("Error al ejecutar la consulta: " + e.getMessage());
    } catch (FileNotFoundException e) {
        System.err.println("Error general: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (st != null) st.close();
            if (conet != null) conet.close();
        } catch (SQLException e) {
            System.err.println("Error al cerrar los recursos: " + e.getMessage());
        }
    }
    }
    
    
    

    
    
    
    
    
    
    
    
    
    
}
