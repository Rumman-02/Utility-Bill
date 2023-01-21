/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author USER
 */
public class ConnectionProvider {
    public static Connection getCan(){
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","123456");
            return con;
        } 
        catch (Exception e) {
            return null;
        
        }
    }    
}
