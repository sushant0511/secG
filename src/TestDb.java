import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDb {

	public static void main(String[] args) {

		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/secgtsep", "root", "root");
		Statement  statement=connection.createStatement();
		ResultSet set=statement.executeQuery("select * from result");
		while(set.next())
		{
			System.out.println(set.getInt(1)+" "+set.getInt(2)+"   "+set.getInt(3));
		}
		
		
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
