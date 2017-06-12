package model;

import java.util.List;

import entities.TipoVeiculo;
import entities.Veiculo;

public interface DAOVeiculo {
	public void add (Veiculo veiculo, TipoVeiculo tipo);
	
	public void remover(int id);
	
	public List<Veiculo> retornaTodos();
}
