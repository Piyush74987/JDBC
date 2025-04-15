package jdbc;
import java.sql.*;

public class Trail {
	private static final String url="jdbc:mysql://localhost:3307/test";
	private static final String username="root";
	private static final String pass="root";
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try 
		{
			Connection con=DriverManager.getConnection(url,username,pass);
			System.out.println("connection done ");	
		}
		catch(Exception e)
		{
			System.out.println(e);
	    }

	}
}