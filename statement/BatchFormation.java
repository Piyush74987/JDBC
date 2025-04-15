package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Scanner;

public class BatchFormation {
	private static final String url="jdbc:mysql://localhost:3307/test";
	private static final String username="root";
	private static final String pass="root";
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,pass);
			System.out.println("connection done ");
			Statement st=con.createStatement();
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter number of records");
			int i=sc.nextInt();
			while(i!=0){
				System.out.println("Enter the id");
				int id=sc.nextInt();
				System.out.println("Enter the name");
				String name=sc.next();
				st.addBatch("Insert into name (id,name) values(" + id + ", '" + name + "')");
				i--;
				}
				int [] arr=st.executeBatch();
				System.out.println("done");
				System.out.println(Arrays.toString(arr));
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
