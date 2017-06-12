package entities;

public class Cidade {
	private int id;
	private String nome;
	private int qtdHabitantes;
	private float area;
	private int qtdEstacoes;
	public Cidade(int id, String nome, int qtdHabitantes, float area, int qtdEstacoes) {
		super();
		this.id = id;
		this.nome = nome;
		this.qtdHabitantes = qtdHabitantes;
		this.area = area;
		this.qtdEstacoes = qtdEstacoes;
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
	public int getQtdHabitantes() {
		return qtdHabitantes;
	}
	public void setQtdHabitantes(int qtdHabitantes) {
		this.qtdHabitantes = qtdHabitantes;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public int getQtdEstacoes() {
		return qtdEstacoes;
	}
	public void setQtdEstacoes(int qtdEstacoes) {
		this.qtdEstacoes = qtdEstacoes;
	}
	
	
}
