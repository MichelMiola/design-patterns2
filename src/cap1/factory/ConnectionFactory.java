package cap1.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		
		String TipBanco = System.getenv("tipoBanco");
		Connection conexao = null;
		
		try {
			if(TipBanco.equalsIgnoreCase("mysql")){
				conexao = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/banco", "usuario", "senha");
			}else{
				conexao = DriverManager.getConnection(
						"jdbc:postgresql://host/database", "usuario", "senha");
			}
			

			return conexao;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
