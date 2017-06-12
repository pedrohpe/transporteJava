package model;

import java.util.List;

import entities.Cidade;


public interface DAOCidade {

	public void add (Cidade cidade);
	
	public void remover(String nome);
	
	public List<Cidade> retornaTodos();
}
