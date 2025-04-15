package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UserInsert {
	private static final String url="jdbc:mysql://localhost:3307/test";
	private static final String username="root";
	private static final String pass="root";
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,pass);
			System.out.println("connection done ");	
			PreparedStatement ps=con.prepareStatement(" Insert into name (id,name) values(?,?)");
			Scanner sc=new Scanner(System.in);
			System.out.println("how many lines do u want to insert");
			int n=sc.nextInt();
			int rf=0;
			for(int i=0;i<n;i++){
				System.out.println("Enter the id");
				int id=sc.nextInt();
				System.out.println("Enter the name");
				String name=sc.next();
				ps.setString(2,name);
				ps.setInt(1,id);
				rf=ps.executeUpdate();
			}
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
