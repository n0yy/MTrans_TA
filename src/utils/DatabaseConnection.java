package utils;

import java.sql.*;

public class DatabaseConnection {
    
    private static final String URL = "jdbc:mysql://localhost:3306/mtrans";
    private static final String user = "root";
    private static final String password = "";
    
    public static Connection getConnection() throws SQLException {
          return (Connection) DriverManager.getConnection(URL, user, password);
    }

    
    
}
