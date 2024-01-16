package devmaster.edu.vn.servlet;

import java.sql.*;

public class ConnectionUtils {
	public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
		String hostName = "localhost";
	       String dbName = "usermanager";
	       String userName = "root";
	       String password = "";
	       String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
	       Connection conn = DriverManager.getConnection(connectionURL, userName, password);
	       return conn;
	}

}
