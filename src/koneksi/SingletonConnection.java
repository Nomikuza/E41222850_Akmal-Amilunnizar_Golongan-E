package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
    private static SingletonConnection instance = null;
    private Connection connection = null;
    
    private SingletonConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/elibraryfix", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static SingletonConnection getInstance() {
        if (instance == null) {
            instance = new SingletonConnection();
        }
        return instance;
    }
    
    public Connection openConnection() {
        try {
            if (connection.isClosed()) {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/elibraryfix", "root", "");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}