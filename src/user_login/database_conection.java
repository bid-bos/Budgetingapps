package user_login;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author Asus
 */
public class database_conection {
    private static final String URL = "jdbc:mysql://localhost:3306/budgeting_app2"; 
    private static final String USERNAME = "root"; // Ganti 'root' dengan username MySQL kamu
    private static final String PASSWORD = ""; // Ganti 'password' dengan password MySQL kamu

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
