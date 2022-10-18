package eteczl.adda;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Connection instanciaDeConexaoValida = conect.getInstance();
       System.out.println(instanciaDeConexaoValida);
    
    
    try {
    	
		Statement stmt = instanciaDeConexaoValida.createStatement();
    	ResultSet rs = stmt.executeQuery("select * from nomes");
    	
    	while(rs.next()) {
    		String n = rs.getString("nome");
    		System.out.println(n);
    	}
    	
    } catch (SQLException e ) {
    	e.printStackTrace();
    }
    
    Connection segundCon = conect.getInstance();
    System.out.println(segundCon);
   }
}