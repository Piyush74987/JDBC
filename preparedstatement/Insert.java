package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
	private static final String url="jdbc:mysql://localhost:3307/test";
	private static final String username="root";
	private static final String pass="root";
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,pass);
			System.out.println("connection done ");	
			PreparedStatement ps=con.prepareStatement(" Insert into name (id,name) values(?,?)");
			ps.setString(2,"sauarbhi");
			ps.setInt(1,2);
			int rf=ps.executeUpdate();
			if(rf>0){
				System.out.println("insert done ");	
			}
			else{
				System.out.println("insert not  done ");	
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
	}

}

//output
//connection done 
//insert done 
