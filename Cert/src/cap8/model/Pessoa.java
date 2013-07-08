package cap8.model;

public class Pessoa {

	public Pessoa() {
		this.nome = "aaa";
	}
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome;
	}
}
