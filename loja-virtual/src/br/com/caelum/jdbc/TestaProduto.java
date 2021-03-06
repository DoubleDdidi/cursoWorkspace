package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.caelum.dao.ProdutosDAO;
import br.com.caelum.jdbc.modelo.Produto;

public class TestaProduto {
	public static void main(String[] args) throws SQLException {
		Produto mesa = new Produto("Mesa Azul", "Mesa com 4 p�s");

		try (Connection connection = new ConnectionPool().getConnection()) {
			ProdutosDAO dao = new ProdutosDAO(connection);
			dao.salva(mesa);

			List<Produto> produtos = dao.lista();
			for (Produto produto : produtos) {
				System.out.println("Existe o produto: " + produto);
			}
		}

	}
}
