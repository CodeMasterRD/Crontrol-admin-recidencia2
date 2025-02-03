/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control_servidor_admin;
import Percistencia.DBConexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class EstadisticaEstado {
    public int n1;
    public int n2;
    public int n3;
    
    public EstadisticaEstado(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    
    DBConexion con1 = new DBConexion();
    Connection conet;
    Statement st;
    ResultSet rs;

    
    /**
     * Creates new form InformeDeActividad
     */
    
      public void ConsultarEstadoEstudiante() {
        String sql = "SELECT Estado_estudiante, COUNT(*) AS Cantidad FROM Estudiantes GROUP BY Estado_estudiante";

        try {
            conet = con1.getConexion();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            //iniciamos en 0
            n1 = 0;
            n2 = 0;
            n3 = 0;

            while (rs.next()) {
                String estado = rs.getString("Estado_estudiante");
                int cantidad = rs.getInt("Cantidad");
                    //damos valores dependiendo el dato
                if (estado.equals("Dentro")) {
                    n1 = cantidad;
                } else if (estado.equals("Fuera")) {
                    n2 = cantidad;
                } else if (estado.equals("En cocina")) {
                    n3 = cantidad;
                }
            }
                mostrarResultadosEnConsola();

        } catch (Exception e) { //captar error
            e.printStackTrace(); 
        }
    } 
      
      public void mostrarResultadosEnConsola() {
            System.out.println("Estudiantes Dentro: " + n1);
            System.out.println("Estudiantes Fuera: " + n2);
            System.out.println("Estudiantes En Cocina: " + n3);
    }
}


