package collections_java_api_2025.ordenacao;

import java.util.Objects;

public class Produto {

	private Double codigo;
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(double codigo, String nome, double preco, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		return "[codigo="+ String.format("%.0f", codigo) + " nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
	
}
