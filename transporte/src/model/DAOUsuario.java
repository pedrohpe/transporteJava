package model;

import java.util.List;

import entities.Usuario;

public interface DAOUsuario {
	public boolean add (Usuario usuario);
	
	public int getCPF (String nome);
	
	public void remover(String nome);
	
	public List<Usuario> retornaTodos();
}
