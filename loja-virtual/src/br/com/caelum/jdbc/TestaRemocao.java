package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
//        Connection connection = ConnectionPool.getConnection();
		Connection connection = new ConnectionPool().getConnection();

        String sql = "delete from Produto where id>3";
        Statement stmt = connection.createStatement();
                boolean resultado = stmt.execute(sql);
                int count = stmt.getUpdateCount();
                System.out.println(count + " linhas atualizadas");
                
                stmt.close();
                connection.close();
	}
	
}
