
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUTHU
 */
public class Connectivity {   
    public static Connection openConnection() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","");
            return conn;
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
