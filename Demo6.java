import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo6 {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_batch", "root",
					"1212");
			System.out.println("connection done" +connection);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
