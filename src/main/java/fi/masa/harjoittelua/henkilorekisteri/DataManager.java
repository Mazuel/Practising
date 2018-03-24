package fi.masa.harjoittelua.henkilorekisteri;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import fi.masa.harjoittelua.KonsoliLukija;

public class DataManager {
    
    private KonsoliLukija reader = new KonsoliLukija();
    Connection conn;
    ResultSet rs = null;
    PreparedStatement prepareStatement = null;
    
    String url = "jdbc:mysql://localhost:3306/personinfo";
    String user = "root";
    String password = "masse";
    
    public void insertPerson() throws SQLException {
        String SQL = "INSERT INTO persons ("
                + "PersonID, "
                + "LastName, "
                + "FirstName, "
                + "Address, "
                + "Wage ) VALUES ("
                + "?, ?, ?, ?, ?)";
        
                        
//        System.out.println("First name: ");
//        String firstName = reader.read();
//        System.out.println("Last Name: ");
//        String lastName = reader.read();
//        System.out.println("Age: ");
//        int age = Integer.parseInt(reader.read());
//        System.out.println("Address: ");
//        String address = reader.read();
//        System.out.println("Wage: ");
//        int wage = Integer.parseInt(reader.read());
        
        try {
            conn = (Connection) DriverManager.getConnection(url, user, password);
            prepareStatement = (PreparedStatement) conn.prepareStatement(SQL);
            System.out.println("ID:");
            prepareStatement.setInt(1, Integer.parseInt(reader.read()));
            System.out.println("Last name: ");
            prepareStatement.setString(2, reader.read());
            System.out.println("First name: ");
            prepareStatement.setString(3, reader.read());
            System.out.println("Address: ");
            prepareStatement.setString(4, reader.read());
            System.out.println("Wage: ");
            prepareStatement.setInt(5, Integer.parseInt(reader.read()));
            
            
            prepareStatement.executeUpdate();
            prepareStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void retrieveAll() {
        
        try {
            conn = (Connection) DriverManager.getConnection(url, user, password);
            prepareStatement = (PreparedStatement) conn.prepareStatement("SELECT * FROM persons");
            rs = prepareStatement.executeQuery();    
           
            while (rs.next()) {
                
                System.out.print("Age: ");
                System.out.print(rs.getInt(1));
                System.out.print(" | Last name: ");
                System.out.print(rs.getString(2));
                System.out.print(" | First name: ");
                System.out.print(rs.getString(3));
                System.out.print(" | Address: ");
                System.out.print(rs.getString(4));
                System.out.print(" | Wage: ");
                System.out.println(rs.getInt(5));
            }
        } catch (SQLException ex) {
            
            Logger lgr = Logger.getLogger(DataManager.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        } finally {
            
            try {
                
                if (rs != null) {
                    rs.close();
                }
                
                if (prepareStatement != null) {
                    prepareStatement.close();
                }
                
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                
                Logger lgr = Logger.getLogger(DataManager.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
}

}