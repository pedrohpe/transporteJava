package entities;

public class Cartao {
	private int id;
	private int usuario;
	private float saldo;
	private String dataCadastro;
	private String dataVencimento;
	
	public Cartao(int id, int usuario, float saldo, String data_cadastro, String data) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.saldo = saldo;
		this.dataCadastro = data_cadastro;
		this.dataVencimento = data;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUsuario() {
		return usuario;
	}
	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public String getData_cadastro() {
		return dataCadastro;
	}
	public void setData_cadastro(String data_cadastro) {
		this.dataCadastro = data_cadastro;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String data) {
		this.dataVencimento = data;
	}
	
	
}
