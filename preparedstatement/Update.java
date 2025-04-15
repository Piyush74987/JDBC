package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
	private static final String url="jdbc:mysql://localhost:3307/test";
	private static final String username="root";
	private static final String pass="root";
    public static void main(String args[]){
    	try{
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con=DriverManager.getConnection(url,username,pass);
    		PreparedStatement ps=con.prepareStatement("update name set name='sauarbh' where id=?");
    		ps.setInt(1,2);
    		int rf=ps.executeUpdate();
    		System.out.println("rowsaffected "+rf);
    	}
    	catch(Exception e){
    		System.out.println(e);
    	}
	
}

}
