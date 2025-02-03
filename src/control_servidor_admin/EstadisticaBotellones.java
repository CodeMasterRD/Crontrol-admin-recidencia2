
package control_servidor_admin;

import Percistencia.DBConexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EstadisticaBotellones {
    public int n1;
    public int n2;
    public int n3;
    
    public EstadisticaBotellones(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    DBConexion con1 = new DBConexion();
    Connection conet;
    Statement st;
    ResultSet rs;

   
      public void ConsultarEstadoEstudiante() {
        String sql = "SELECT Estado, SUM(Cantidad) AS Cantidad_Total FROM InventarioBotellones GROUP BY Estado";

        try {
            conet = con1.getConexion();
            st = conet.createStatement();
            rs = st.executeQuery(sql);

            n1 = 0;
            n2 = 0;
            n3 = 0;

            while (rs.next()) {
                String estado = rs.getString("Estado");
                int cantidad = rs.getInt("Cantidad_Total");

                // asignar valores segun su estado
                if (estado.equals("lleno")) {
                    n1 = cantidad;
                } else if (estado.equals("vacio")) {
                    n2 = cantidad;
                } else if (estado.equals("en uso")) {
                    n3 = cantidad;
                }
            }
                //mostrando en sonsola
                mostrarResultadosEnConsola();

        } catch (Exception e) {
            e.printStackTrace(); // mostrar error si entra
        }
    } 
      
      public void mostrarResultadosEnConsola() {
            System.out.println("Botellones llenos: " + n1);
            System.out.println("Botellones vacios: " + n2);
            System.out.println("Botellones en uso: " + n3);
    }
}
