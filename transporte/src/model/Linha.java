package model;

import java.util.List;

public class Linha {
	private int id;
	private int numParadas;
	private int passageirosAtendidos;
	private int qtdVeiculos;
	private float preco;
	private String cor;
	private TipoVeiculo tipo;
	private List<Parada> paradas;
	
	public Linha(int id, int numParadas, int passageirosAtendidos, int qtdVeiculos, float preco, String cor,
			TipoVeiculo tipo) {
		super();
		this.id = id;
		this.numParadas = numParadas;
		this.passageirosAtendidos = passageirosAtendidos;
		this.qtdVeiculos = qtdVeiculos;
		this.preco = preco;
		this.cor = cor;
		this.tipo = tipo;
		if (tipo == TipoVeiculo.ONIBUS){
			this.cor = "Null";
		}
	}
	
	public void addParada (Parada parada){
		paradas.add(parada);
	}

	public void removeParada (Parada parada){
		paradas.remove(parada);
	}
	
	int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumParadas() {
		return numParadas;
	}
	public void setNumParadas(int numParadas) {
		this.numParadas = numParadas;
	}
	public int getPassageirosAtendidos() {
		return passageirosAtendidos;
	}
	public void setPassageirosAtendidos(int passageirosAtendidos) {
		this.passageirosAtendidos = passageirosAtendidos;
	}
	public int getQtdVeiculos() {
		return qtdVeiculos;
	}
	public void setQtdVeiculos(int qtdVeiculos) {
		this.qtdVeiculos = qtdVeiculos;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public TipoVeiculo getTipo() {
		return tipo;
	}
	public void setTipo(TipoVeiculo tipo) {
		this.tipo = tipo;
	}
	public List<Parada> getParadas() {
		return paradas;
	}
	public void setParadas(List<Parada> paradas) {
		this.paradas = paradas;
	}
	
}
