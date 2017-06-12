package model;

import java.util.List;

import entities.Usuario;

public interface DAOUsuario {
	public boolean add (Usuario usuario);
	
	public void remover(int cpf);
	
	public Usuario buscaPorCpf(int cpf);
	
	public List<Usuario> retornaTodos();
}
