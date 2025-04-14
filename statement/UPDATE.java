package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UPDATE {
	private static final String url="jdbc:mysql://localhost:3307/test";
	private static final String username="root";
	private static final String pass="root";
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,pass);
			System.out.println("connection done ");	
			Statement st=con.createStatement();
			int rf=st.executeUpdate("update name set name='sauarbh' where id=2");
			if(rf>0){
				System.out.println("update done ");	
			}
			else{
				System.out.println("update not  done ");	
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
		
	}
		

}

//output
//connection done 
//update done 

