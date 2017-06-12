package model;

import java.util.List;

import entities.Parada;
import entities.TipoVeiculo;

public interface DAOParada {
	public void add (Parada parada, TipoVeiculo tipo);
	
	public void remover(String nome);
	
	public List<Parada> retornaTodos();
}
