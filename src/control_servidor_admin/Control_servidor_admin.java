package control_servidor_admin;

import GUI.EditarEstudiante;
import java.sql.SQLException;
import Percistencia.DBConexion;
import java.io.FileNotFoundException;
import GUI.LoginAdmin;  // Esta importación debe ir aquí

public class Control_servidor_admin {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            LoginAdmin login = new LoginAdmin();
            DBConexion.getConexion();
            
            login.setVisible(true);
            login.setLocationRelativeTo(null);
        } catch (SQLException e) {
            System.out.println("Error SQL: " + e.getMessage());
        }
    }
}
