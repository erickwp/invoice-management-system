/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invoicemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author erickwp
 */
public class DBConn {
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Connection conn = null;
        
        String url ="jdbc:mysql://localhost:8889/pbo_invoice";
        String user="root";
        String pass="root";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
            
        conn = DriverManager.getConnection(url,user,pass);
        
        return conn;
    }
    
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Connection c = DBConn.getConnection();
            System.out.println(String.format("Connected to database %s " + "successfully.", c.getCatalog()));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
