package model;

public class Empresa {
	private int cnpj;
	private String nome;
	private String endereco;
	private int tel;
	private int qtdEmpregados;
	
	
	public Empresa(int cnpj, String nome, String endereco, int tel, int qtdEmpregados) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereco = endereco;
		this.tel = tel;
		this.qtdEmpregados = qtdEmpregados;
	}
	
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public int getQtdEmpregados() {
		return qtdEmpregados;
	}
	public void setQtdEmpregados(int qtdEmpregados) {
		this.qtdEmpregados = qtdEmpregados;
	}
	
}
