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
	public void remover(int cpf) {
		Usuario u = buscaPorCpf(cpf);
		if (u != null){		
			Connection connection = new ConnectionFactory().getConnection();
			
			try {
				PreparedStatement stmt = connection.prepareStatement("delete from usuario where cpf=?");
				stmt.setInt(1, cpf);
				stmt.execute();
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
	}

	@Override
	public List<Usuario> retornaTodos() {
		Connection connection = new ConnectionFactory().getConnection();
		
		List<Usuario> lista = new ArrayList<Usuario>();
		try{
			PreparedStatement stmt = connection.prepareStatement("select * from usuario");
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()){
				Usuario ret = new Usuario();
				ret.setCpf(rs.getInt("cpf"));
				ret.setDatanasc(rs.getString("datanasc"));
				ret.setProfissao(rs.getString("profissao"));
				ret.setEndereco(rs.getString("endereco"));
				ret.setSexo(rs.getString("sexo"));
				ret.setNome(rs.getString("nome"));
				lista.add(ret);
			}
			rs.close();
			stmt.close();
			connection.close();
			return lista;
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Usuario buscaPorCpf(int cpf) {
		Connection connection = new ConnectionFactory().getConnection();
		
		try {
			PreparedStatement stmt = connection.prepareStatement("select * from usuario where usuario.cpf=?");
			stmt.setInt(1, cpf);
			ResultSet rs = stmt.executeQuery();
			Usuario ret = new Usuario();
			while (rs.next()){
				ret.setCpf(rs.getInt("cpf"));
				ret.setDatanasc(rs.getString("datanasc"));
				ret.setProfissao(rs.getString("profissao"));
				ret.setEndereco(rs.getString("endereco"));
				ret.setSexo(rs.getString("sexo"));
				ret.setNome(rs.getString("nome"));
			}
			stmt.close();
			connection.close();
			return ret;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
