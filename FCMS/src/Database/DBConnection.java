package Database;

import java.sql.*;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DBConnection {
	
	/***************************************************
     *  G E T     U S E R     C O N N E C T I O N
     ***************************************************/

    private static Connection conn = null;
	
    public static Connection getUserConnection(JTextField userNameField, JPasswordField pwdField ) throws SQLException {
    	String password = new String(pwdField.getPassword());
    	Connection connection = DriverManager.getConnection(
                "jdbc:mysql://193.196.143.168/dk3s_22alsa1mst",
                userNameField.getText(), password
        );
    	DBConnection.conn = connection;
        return connection;
    }
    
    public static Connection getConnection()
    {
        	return DBConnection.conn;
    }
}
