package eteczl.adda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conect {

	private static String NomeBanco = "tst";
	private static String host = "localhost";
	private static String port = "3306";
	private static String usuario = "root";
	private static String senha = "";
	private static Connection conn;
	
	public static Connection getInstance() {
		
		String url = "jdbc:mysql://" + conect.host + ":" + conect.port + "/" + conect.NomeBanco;
		
		if(conect.conn != null) {
			return conect.conn;
		} else {
			
			try {
				
				conect.conn = DriverManager.getConnection(url, conect.usuario, conect.senha);
				return conect.conn;
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			return null;
			
			}
			
		}
		
	}
	

