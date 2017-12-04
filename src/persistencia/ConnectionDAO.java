package persistencia;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDAO {
public ConnectionDAO() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		System.out.println("Erro ao selecionar o driver: " + e.getMessage());
		
	}
}
protected Connection getConnection() throws SQLException {
	String url = "jdbc:mysql://localhost/aula10";
	Connection conn = DriverManager.getConnection(url , "root" , "");
	return conn;
}
}
