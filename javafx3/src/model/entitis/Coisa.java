package model.entitis;

public class Coisa {
	
	public Coisa() {}
	
	public Coisa(String nome, int id) {
		this.id = id;
		this.nome = nome;
	}
	
	private int		id;
	private String	nome;
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

	@Override
	public String toString() {
		return "Coisa [id=" + id + ", nome=" + nome + "]";
	}

}