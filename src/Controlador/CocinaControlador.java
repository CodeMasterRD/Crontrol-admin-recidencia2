
package Controlador;

import Percistencia.DBConexion;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erick Tejada
 */
public class CocinaControlador {
    
    
    
    private static final DBConexion con1 = new DBConexion();  // Hacer con1 estática
    private static Connection conet;
    private static Statement st;
    private static ResultSet rs;
    
    
    
    
    
        public void HistorialUsoCocina(DefaultTableModel modelo) {
        
        String sql = "call MostrarTodosEstudiantes();";

    try {
        //conexion a base de datos
        conet = DBConexion.getConexion();
        st = conet.createStatement();
        rs = st.executeQuery(sql);
        
        modelo.setRowCount(0);
        
        Object[] Botellones = new Object[5];  
        
        while (rs.next()) {
            Botellones[0] = rs.getInt("Matricula"); 
            Botellones[1] = rs.getString("Nombre");
            Botellones[2] = rs.getString("Entrada");
            Botellones[3] = rs.getString("Salida");
            Botellones[4] = rs.getString("Estado_uso");
            //agregamos datos a la tabla
            modelo.addRow(Botellones);
        }
        //mostrar error
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
