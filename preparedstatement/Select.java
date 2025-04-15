package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {
	private static final String url="jdbc:mysql://localhost:3307/test";
	private static final String username="root";
	private static final String pass="root";
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,pass);
			System.out.println("connection done ");	
			PreparedStatement ps=con.prepareStatement("select * from name");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				int id=rs.getInt(1);
				String name=rs.getString(2);
				System.out.println("id= "+id+" name= "+name);
			}
		}
			catch(Exception e){
				System.out.println(e);
			}
		}
}
//output
//connection done 
//id= 1 name= piyush
//id= 3 name= vedant
//id= 2 name= sauarbhi
//id= 4 name= sanjay
//id= 5 name= kavita

