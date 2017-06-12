package entities;

public class Usuario {
	private int cpf;
	private String datanasc;
	private String profissao;
	private String endereco;
	private String sexo;
	private String nome;
	
	public Usuario(int cpf, String datanasc, String profissao, String endereco, String sexo, String nome) {
		super();
		this.cpf = cpf;
		this.datanasc = datanasc;
		this.profissao = profissao;
		this.endereco = endereco;
		this.sexo = sexo;
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
