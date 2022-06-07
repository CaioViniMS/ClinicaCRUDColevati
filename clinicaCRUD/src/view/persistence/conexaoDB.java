package view.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoDB {
	private static final String JDBC_URL = "jdbc:mariadb://localhost:3306/clinica";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "C@io16071999";
    private Connection conn = null;
    public Connection getConnection() throws ClassNotFoundException, SQLException
	{
		 try 
	        {
	            Class.forName("org.mariadb.jdbc.Driver");
	            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
		return conn;
	}
}
