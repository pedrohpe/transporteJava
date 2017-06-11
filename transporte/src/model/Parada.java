package model;

public class Parada {
	private int id;
	private String nome;
	private int cidade;
	private boolean possuiIntegracao;
	private boolean possuiIluminacao;
	private TipoVeiculo tipo;
	public Parada(int id, String nome, int cidade, boolean possuiIntegracao, boolean possuiIluminacao,
			TipoVeiculo tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
		this.possuiIntegracao = possuiIntegracao;
		this.possuiIluminacao = possuiIluminacao;
		this.tipo = tipo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCidade() {
		return cidade;
	}
	public void setCidade(int cidade) {
		this.cidade = cidade;
	}
	public boolean isPossuiIntegracao() {
		return possuiIntegracao;
	}
	public void setPossuiIntegracao(boolean possuiIntegracao) {
		this.possuiIntegracao = possuiIntegracao;
	}
	public boolean isPossuiIluminacao() {
		return possuiIluminacao;
	}
	public void setPossuiIluminacao(boolean possuiIluminacao) {
		this.possuiIluminacao = possuiIluminacao;
	}
	public TipoVeiculo getTipo() {
		return tipo;
	}
	public void setTipo(TipoVeiculo tipo) {
		this.tipo = tipo;
	}
	
	
}
