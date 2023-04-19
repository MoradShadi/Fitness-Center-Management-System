package Database;

import java.sql.*;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DBConnection {
	
	/***************************************************
     *  G E T     U S E R     C O N N E C T I O N
     ***************************************************/

    public static Connection getUserConnection(JTextField userNameField, JPasswordField pwdField ) throws SQLException {
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://193.196.143.168/koch_universitydb",
                userNameField.toString(), pwdField.toString()
        );
        return conn;
    }
}
