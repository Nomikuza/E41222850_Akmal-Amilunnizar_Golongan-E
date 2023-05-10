/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Legion
 */
public class config {
        private static Connection conn;
        
        public static Connection connectDB()throws SQLException{            
                String url="jdbc:mysql://localhost:3306/elibraryfix"; //url database
                String user="root"; //user database
                String pass=""; //password database            
            try {
                conn = (Connection) DriverManager.getConnection(url, user, pass);
                return conn;                       
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        return null;
  }// read database from mysql
        public static ResultSet read(String sql) throws SQLException{
            ResultSet rs = null;
            try {
                conn = (Connection) connectDB();
                Statement st = conn.createStatement();
                rs = st.executeQuery(sql);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }            
            
            return rs;
        }
        public static void closeDB() throws SQLException{
            try {
                conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
            
        }
}
    
