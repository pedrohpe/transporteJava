package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Usuario;
import model.ConnectionFactory;

public class DAOUsuarioSQL implements DAOUsuario {

	@Override
	public boolean add(Usuario usuario) {
		// TODO Auto-generated method stub
		Connection connection = new ConnectionFactory().getConnection();
		
		try {
			String sqluser = "insert into usuario (cpf,datanasc,profissao,endereco,sexo,nome) values (?,?,?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(sqluser);
			stmt.setInt(1, usuario.getCpf());
			stmt.setString(2, usuario.getDatanasc());
			stmt.setString(3, usuario.getProfissao());
			stmt.setString(4, usuario.getEndereco());
			stmt.setString(5, usuario.getSexo());
			stmt.setString(6, usuario.getNome());
			stmt.execute();
			stmt.close();
			connection.close();
			return true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public int getCPF(String nome) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void remover(String nome) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Usuario> retornaTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
