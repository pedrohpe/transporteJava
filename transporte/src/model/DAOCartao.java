package model;

import java.util.List;

import entities.Cartao;

public interface DAOCartao {
	public void add (Cartao cartao);
	
	public void remover(String nome);
	
	public List<Cartao> retornaTodos();
}
