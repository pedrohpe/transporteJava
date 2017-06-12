package model;

import java.util.List;

import entities.Empresa;

public interface DAOEmpresa {
	public void add (Empresa empresa);
	
	public int getCNPJ (String nome);
	
	public void remover(String nome);
	
	public List<Empresa> retornaTodos();
}
