package edu.svit.sf04java.util;

//provides meta information about the database like ur1, username,password,Driver class
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseUtil {
	
	private static final String DRIVER_PATH="com.mysql.cj.jdbc.Driver.class";
	private static final String DB_URL="jdbc:mysql://localhost:3306/?user=root";
	private static final String USER_NAME="roor";
	private static final String PASSWORD="@1958";
	private static final String USERNAME = null;
	private static final String DATABASE_URL = null;





	
	public DatabaseUtil() {
		try {
		Class.forName(DRIVER_PATH); //to load and register the driver
		}catch(Exception e) {
			System.out.println("The driver is not loaded : "+e.getMessage());
			throw new RuntimeException("something went wrong"+e);
			
		}
	}
	//user defined method
	public Connection getConnection() throws SQLException {
		//getConnection is a predefined method
		return DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
	}
}
