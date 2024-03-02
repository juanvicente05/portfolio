package main.java;

import java.sql.*;


public class DBConnection {
        
        static final String DB_URL = "jdbc:mysql://localhost/demodb";
        static final String USER = "root";
        static final String PASS = "";
        public static Connection connectDB() {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = null;
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                return conn;
            }catch(Exception ex) {
                System.out.println("There were error while connection db.");
                return null;
            }
        }

    static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
