package model;

public class Veiculo {
	private int id;
	private String dataInicOperacao;
	private int qtdPassageiros;
	private String dataUltimaRevisao;
	private int empresa;
	private int linha;
	private TipoVeiculo tipo;
	public Veiculo(int id, String dataInicOperacao, int qtdPassageiros, String dataUltimaRevisao, int empresa,
			int linha, TipoVeiculo tipo) {
		super();
		this.id = id;
		this.dataInicOperacao = dataInicOperacao;
		this.qtdPassageiros = qtdPassageiros;
		this.dataUltimaRevisao = dataUltimaRevisao;
		this.empresa = empresa;
		this.linha = linha;
		this.tipo = tipo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDataInicOperacao() {
		return dataInicOperacao;
	}
	public void setDataInicOperacao(String dataInicOperacao) {
		this.dataInicOperacao = dataInicOperacao;
	}
	public int getQtdPassageiros() {
		return qtdPassageiros;
	}
	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}
	public String getDataUltimaRevisao() {
		return dataUltimaRevisao;
	}
	public void setDataUltimaRevisao(String dataUltimaRevisao) {
		this.dataUltimaRevisao = dataUltimaRevisao;
	}
	public int getEmpresa() {
		return empresa;
	}
	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public TipoVeiculo getTipo() {
		return tipo;
	}
	public void setTipo(TipoVeiculo tipo) {
		this.tipo = tipo;
	}
	
	
}
