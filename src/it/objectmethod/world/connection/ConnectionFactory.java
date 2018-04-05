package it.objectmethod.world.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	

	static final String driver_db = "com.mysql.jdbc.Driver";
	static final String URL_db = "jdbc:mysql://localhost/world";
	static final String user = "root";
	static final String pass = "toor";

	public static Connection getConnection() {

		Connection conn = null;

		try {

			Class.forName(driver_db);
			conn = DriverManager.getConnection(URL_db, user, pass);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}

}
