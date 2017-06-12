package model;

import java.util.List;

import entities.TipoVeiculo;
import entities.Linha;

public interface DAOLinha {
	public void add (Linha linha, TipoVeiculo tipo);
	
	public void remover(int id);
	
	public List<Linha> retornaTodos();
}
