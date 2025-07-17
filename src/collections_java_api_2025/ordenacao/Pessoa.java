package collections_java_api_2025.ordenacao;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
	}

	@Override
	public int compareTo(Pessoa o) {
		if(this.idade != o.idade) {
			return Integer.compare(this.idade, o.idade);
		}
		return 0;
	}

}
