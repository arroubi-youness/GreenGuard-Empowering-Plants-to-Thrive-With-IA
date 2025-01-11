package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

    public static final String url = "jdbc:mysql://localhost:3306/care_plant_assistant";
    public static final String username = "root";
    public static final String password = "12345678";


    public static Connection getConnection(){
        try {
             return DriverManager.getConnection(url, username, password);
        }catch (SQLException e) {
            System.err.println("Failed to get the connection: " + e.getMessage());
             throw new RuntimeException("Unable to connect to the database. Critical error.", e);
        }
    }
}