package fi.masa.harjoittelua.henkilorekisteri;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Connection;

import fi.masa.harjoittelua.KonsoliLukija;

public class MysqlConnect {
    private static final String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/personinfo";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "masse";
    private static final String MAX_POOL = "250";

    private Connection connection;
    private Properties properties;

    private Properties getProperties() {
        if (properties == null) {
            properties = new Properties();
            properties.setProperty("user", USERNAME);
            properties.setProperty("password", PASSWORD);
            properties.setProperty("MaxPooledStatements", MAX_POOL);
        }
        return properties;
    }

    public Connection connect() {
        if (connection == null) {
            try {
                Class.forName(DATABASE_DRIVER);
                connection = (Connection) DriverManager.getConnection(DATABASE_URL, getProperties());
                System.out.println("Connected...");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        return connection;
    }

    public void disconnect() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
                System.out.println("disconnected");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
        
}
