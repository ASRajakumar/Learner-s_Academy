package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	
	public static Connection GetConnection() {
		
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnac","root","Host");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return con;
		

}
}
