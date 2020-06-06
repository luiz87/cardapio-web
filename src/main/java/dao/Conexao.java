package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	public static Connection getConectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10345847", "sql10345847", "zZ67Vva3n3");
			return con;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		
	}
	
}
