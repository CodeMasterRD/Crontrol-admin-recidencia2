
package Controlador;


import Percistencia.DBConexion;
import com.mysql.cj.jdbc.CallableStatement;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erick Tejada
 */
public class EstudianteControlador {
    
    private static final DBConexion con1 = new DBConexion();  // Hacer con1 estática
    private static Connection conet;
   // DefaultTableModel modelo;
    private static Statement st;
    private static ResultSet rs;
    // int idc;
   // private static VerEstudiantes vista;
   // private RetirarEstudiante vista1;
    
    
    
        public void VerTodosEstudiantes(DefaultTableModel modelo) {
        
        String sql = "call ObtenerEstudiantesActivos();";

    try {
        conet = DBConexion.getConexion();
        st = conet.createStatement();
        rs = st.executeQuery(sql);
        
        modelo.setRowCount(0);
        
        Object[] Botellones = new Object[6];  
        
        while (rs.next()) {
            Botellones[0] = rs.getInt("Matricula"); 
            Botellones[1] = rs.getString("Nombre Completo");
            Botellones[2] = rs.getString("Telefono");
            Botellones[3] = rs.getString("Estado");
            Botellones[4] = rs.getBoolean("Modulo");
            Botellones[5] = rs.getBoolean("Habitacion");
            Botellones[7] = rs.getBoolean("Genero del Modulo");

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
    
   
    
    
        public void MostrarEstudiante(DefaultTableModel modelo) {
        
        String sql = "call ObtenerEstudiantesActivos();";

        try {
            conet = DBConexion.getConexion();
            st = conet.createStatement();
            rs = st.executeQuery(sql);

            modelo.setRowCount(0);

            Object[] Estudiantes = new Object[7];

            while (rs.next()) {
                Estudiantes[0] = rs.getInt("Matricula");
                Estudiantes[1] = rs.getString("Nombre Completo"); 
                Estudiantes[2] = rs.getString("Telefono"); 
                Estudiantes[3] = rs.getString("Estado");
                Estudiantes[4] = rs.getInt("Modulo"); 
                Estudiantes[5] = rs.getString("Habitacion");
                Estudiantes[6] = rs.getString("Genero del Modulo");

                modelo.addRow(Estudiantes);
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
        
        
        public void MostrarEstudianteEditar(DefaultTableModel modelo) {
        
        String sql = "call obtenerEstudianteActualizar();";

        try {
            conet = DBConexion.getConexion();
            st = conet.createStatement();
            rs = st.executeQuery(sql);

            modelo.setRowCount(0);

            Object[] Estudiantes = new Object[6];

            while (rs.next()) {
                Estudiantes[0] = rs.getInt("Matricula");
                Estudiantes[1] = rs.getString("Nombre"); 
                Estudiantes[2] = rs.getString("Apellido"); 
                Estudiantes[3] = rs.getString("Telefono");
                Estudiantes[4] = rs.getString("Modulo"); 
                Estudiantes[5] = rs.getString("Habitacion");

                modelo.addRow(Estudiantes);
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
        

        
        public static void BuscarEstudiante(DefaultTableModel modelo, String matricula) throws FileNotFoundException {
        // Define la consulta SQL para llamar al procedimiento almacenado
        String sql = "CALL buscarEstudiantesByMatricula(?);";  // Usamos parámetros en lugar de concatenar directamente

        // Manejo de la conexión y consulta
        try (Connection conet = con1.getConexion(); // Asumiendo que con1.getConexion() retorna una conexión válida
             PreparedStatement ps = conet.prepareStatement(sql)) {

            // Establecer el valor del parámetro
            ps.setString(1, matricula);  // Asignamos la matrícula al parámetro del procedimiento

            // Ejecutar la consulta
            rs = ps.executeQuery();

            // Limpiar el modelo antes de llenarlo
            modelo.setRowCount(0);

            // Definir un arreglo de objetos para cada fila
            Object[] Estudiantes = new Object[7];

            // Iterar sobre los resultados y agregar cada fila al modelo de la tabla
            while (rs.next()) {
                Estudiantes[0] = rs.getInt("Matricula");
                Estudiantes[1] = rs.getString("Nombre Completo");
                Estudiantes[2] = rs.getString("Telefono");
                Estudiantes[3] = rs.getString("Estado");
                Estudiantes[4] = rs.getInt("Modulo");
                Estudiantes[5] = rs.getString("Habitacion");
                Estudiantes[6] = rs.getString("Genero del Modulo");

                modelo.addRow(Estudiantes);
            }
        } catch (SQLException e) {
            System.err.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }
        
        
        
         public static void BuscarEstudianteEditar(DefaultTableModel modelo, String matricula) throws FileNotFoundException {
        // Define la consulta SQL para llamar al procedimiento almacenado
        String sql = "call obtenerEstudianteActualizarnro2(?);;";

        // Manejo de la conexión y consulta
        try (Connection conet = con1.getConexion(); 
             PreparedStatement ps = conet.prepareStatement(sql)) {

            ps.setString(1, matricula); 

            rs = ps.executeQuery();

            modelo.setRowCount(0);

            Object[] Estudiantes = new Object[6];

            while (rs.next()) {
                Estudiantes[0] = rs.getInt("Matricula");
                Estudiantes[1] = rs.getString("Nombre");
                Estudiantes[2] = rs.getString("Apellido");
                Estudiantes[3] = rs.getString("Telefono");
                Estudiantes[4] = rs.getString("Modulo");
                Estudiantes[5] = rs.getString("Habitacion");

                modelo.addRow(Estudiantes);
            }
        } catch (SQLException e) {
            System.err.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }
    
    public boolean GuardarEstudiante(String matricula, String nombres, String apellidos, String numero, String modulo, String habitacion) {
        try {
            if (matricula.equals("") || nombres.equals("") || apellidos.equals("") || numero.equals("") || habitacion.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan Datos");

            } else {
                String sql = "CALL InsertarEstudiante('"+ matricula +"', '"+ nombres +"', '"+ apellidos +"', '"+ numero +"', '"+ modulo +"', '"+ habitacion +"')";

                conet = con1.getConexion();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Estudiante Agregado");
                System.out.println(matricula + nombres + apellidos + numero + habitacion + modulo);
            }

            boolean guardadoExitosamente = false; 
        } catch (SQLException ex) {
            int errorCode = ex.getErrorCode();
            if (errorCode == 1062) {
                JOptionPane.showMessageDialog(null, "El estudiante con esta matrícula ya existe.");
            } else {
                JOptionPane.showMessageDialog(null, "Error SQL (Código " + errorCode + "): " + ex.getMessage());
            }
        }   catch (FileNotFoundException ex) {
            }
        return false; 
}
        
        
        
        public void actualizarEstudiante(
        int matricula, 
        String nombres, 
        String apellidos, 
        String telefono, 
        String modulo, 
        String habitacion
    ) throws FileNotFoundException {
    String sql = "{CALL ActualizarEstudiante(?, ?, ?, ?, ?, ?, ?)}";
    Connection con = null;
    CallableStatement cs = null;

    try {

        con = con1.getConexion();
        cs = (CallableStatement) con.prepareCall(sql);

        cs.setInt(1, matricula);
        cs.setInt(2, matricula);
        cs.setString(3, nombres);
        cs.setString(4, apellidos);
        cs.setString(5, telefono);
        cs.setString(6, modulo);
        cs.setString(7, habitacion);

        // ejecutar el procedimiento almacenado.
        cs.execute();
        System.out.println("Estudiante actualizado exitosamente.");
        JOptionPane.showMessageDialog(null, "Estudiante actualizado exitosamente.");


        
    } catch (SQLException e) {
        System.err.println("Error al actualizar el estudiante: " + e.getMessage());
    } finally {
        try {
            if (cs != null) cs.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            System.err.println("Error al cerrar los recursos: " + e.getMessage());
        }
    }
}
        
        
        
        
        
        
        
        
}
