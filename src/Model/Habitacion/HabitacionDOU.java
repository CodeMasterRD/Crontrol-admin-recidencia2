
package Model.Habitacion;

import Model.ConexionDB;
import Model.EstudianteModel.EstudianteModel;
import com.mysql.cj.jdbc.CallableStatement;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class HabitacionDOU {
    
    
    // metodo que obtiene el estado, de que si hay botellon en la Habitacion
     public static void getEstadoBotellonHabitacion() throws FileNotFoundException{
        System.out.println("obteniendo estado del botellon en la habotacion ");
        String PSQL_GET_ESTADO = "{CALL obtenerEstadoBotellonPorMatricula(?)}";
        try(Connection conexion = ConexionDB.getConexion();
                CallableStatement statement = (CallableStatement) conexion.prepareCall(PSQL_GET_ESTADO)){
            
          
             
            // Establecer el valor del parámetro de entrada
            int mat =  EstudianteModel.getMatricula();
           // System.out.println("Mat para el estado notificacion");
            // System.out.println(mat);
            statement.setInt(1, mat);
            

            // Procesar los resultados
            try ( // Ejecutar el procedimiento
                    ResultSet resultSet = statement.executeQuery()) {
                // Procesar los resultados
                while (resultSet.next()) {
                    String estadoActual = resultSet.getString("Estado_Botellon");
                    
                    System.out.println("estado del botellon en el metodo: " + estadoActual);
                    // setea el estado del botellon
                    HabitacionModel.setEstado_botellon_h(estadoActual);
                    
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
