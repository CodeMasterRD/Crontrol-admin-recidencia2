
package Model.Notificaciones;

import Model.ConexionDB;
import Model.EstudianteModel.EstudianteModel;
import com.mysql.cj.jdbc.CallableStatement;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
public class NotificacionesDOU {
    
    
    
    // METODO PARA OTENER EL ESTADO DE LA NOTIFICACIONE
    public static void getEstadoNotificacio() throws FileNotFoundException{
        System.out.println("obteniendo estado notificacion.. ");
        String PSQL_GET_ESTADO = "{CALL obtenerEstadoNotificacion(?)}";
        try(Connection conexion = ConexionDB.getConexion();
                CallableStatement statement = (CallableStatement) conexion.prepareCall(PSQL_GET_ESTADO)){
            
          
             
            // Establecer el valor del parámetro de entrada
            int mat =  EstudianteModel.getMatricula();
            
            statement.setInt(1, mat);
            

            // Procesar los resultados
            try ( // Ejecutar el procedimiento
                    ResultSet resultSet = statement.executeQuery()) {
                // Procesar los resultados
                while (resultSet.next()) {
                    String estadoActual = resultSet.getString("Estado_notificacion");
                    String tipo = resultSet.getString("Tipo_notificacion");
                    
                    NotificacionModel.setEstado_notificaciones(estadoActual);
                    System.out.println("Estado Notificacion " +  estadoActual);
                    
                    NotificacionModel.setTipo_noteficacion(tipo);
                    System.out.println("Tipo Notificacion " +  tipo);
                    
                }
                // Cerrar recursos
            }
            statement.close();
            
        } catch (SQLException e) {
            if ("45000".equals(e.getMessage())) {
                System.out.println(e.getMessage());
            } else {
                System.out.println("Algo saliomal " + e.getMessage());
            }
           
        
        }
        
    }

}
