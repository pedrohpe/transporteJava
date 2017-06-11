package model;

public class Funcionario {
	private int CPF;
	private int onibus;
	private int salario;
	private String dataInicioServ;
	private String datanasc;
	private int empresa;
	private int metro;
	private TipoFunc tipo;
	
	public Funcionario(int cPF, int onibus, int salario, String dataInicioServ, String datanasc, int empresa, int metro,
			TipoFunc tipo) {
		super();
		CPF = cPF;
		this.onibus = onibus;
		this.salario = salario;
		this.dataInicioServ = dataInicioServ;
		this.datanasc = datanasc;
		this.empresa = empresa;
		this.metro = metro;
		this.tipo = tipo;
		if (tipo == TipoFunc.COBRADOR){
			this.metro = 0;
		}
	}
	
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public int getOnibus() {
		return onibus;
	}
	public void setOnibus(int onibus) {
		this.onibus = onibus;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public String getDataInicioServ() {
		return dataInicioServ;
	}
	public void setDataInicioServ(String dataInicioServ) {
		this.dataInicioServ = dataInicioServ;
	}
	public String getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}
	public int getEmpresa() {
		return empresa;
	}
	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}
	public int getMetro() {
		return metro;
	}
	public void setMetro(int metro) {
		this.metro = metro;
	}
	public TipoFunc getTipo() {
		return tipo;
	}
	public void setTipo(TipoFunc tipo) {
		this.tipo = tipo;
	}

	
	
}
