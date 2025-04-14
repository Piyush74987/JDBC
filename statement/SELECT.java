package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class SELECT {
	private static final String url="jdbc:mysql://localhost:3307/test";
	private static final String username="root";
	private static final String pass="root";
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,pass);
			System.out.println("connection done ");	
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from name");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}		
		}
		catch(Exception e)
		{
			System.out.println(e);
	    }

	}

}

//output
//connection done 
//1 piyush

