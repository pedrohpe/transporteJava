package model;

import java.util.List;

public interface DAOUsuario {
	public void add (Usuario usuario);
	
	public int getCPF (String nome);
	
	public void remover(String nome);
	
	public List<Usuario> retornaTodos();
}
