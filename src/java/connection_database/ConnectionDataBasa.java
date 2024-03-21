package connection_database;

import java.sql.DriverManager;
import java.sql.*;

public class ConnectionDataBasa {
    private final String server = "jdbc:mysql://65.99.252.56:3306/nessuste_CalidadExamen";
    private final String user = "nessuste_root";
    private final String pass = "RootExamen6to";
    public static Connection conection;

    public ConnectionDataBasa() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conection = DriverManager.getConnection(server, user, pass);
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("No conectado");
        }
    }
}