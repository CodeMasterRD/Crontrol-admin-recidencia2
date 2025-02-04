package Percistencia;

import java.sql.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DBConexion {

    private static Connection conexion = null;

    public static Connection getConexion() throws FileNotFoundException, SQLException {

        if (conexion != null && !conexion.isClosed()) {
            return conexion;
        } else {
            try {
                String directorioActual = System.getProperty("user.dir");
                String rutaArchivo = directorioActual + File.separator + "\\src\\Percistencia\\configuracion.txt";
                
                File archivo = new File(rutaArchivo);
                FileReader lector = new FileReader(archivo);
                String url;
                String user;
                String pass;
                try (BufferedReader buffer = new BufferedReader(lector)) {
                    url = buffer.readLine();
                    user = buffer.readLine();
                    pass = buffer.readLine();
                }
                conexion = DriverManager.getConnection(url, user, pass);
                System.out.println("Conexion exitosa");

                return conexion;
            } catch (IOException e) {
                System.out.println("ERROR DE CONEXION: " + e.getMessage());
                return null;
            }
        }
    }
}
