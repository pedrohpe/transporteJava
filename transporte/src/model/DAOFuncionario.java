package model;

import java.util.List;

import entities.Funcionario;
import entities.TipoFunc;

public interface DAOFuncionario {
	public void add (Funcionario func, TipoFunc tipo);
	
	public void remover(String nome);
	
	public List<Funcionario> retornaTodos();
}
