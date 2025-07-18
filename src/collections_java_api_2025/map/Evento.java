package collections_java_api_2025.map;

import java.time.LocalDate;
import java.util.Objects;

public class Evento {

	private LocalDate data;
	private String nome;
	private String Atracao;

	public Evento(LocalDate data, String nome, String atracao) {
		this.data = data;
		this.nome = nome;
		Atracao = atracao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAtracao() {
		return Atracao;
	}

	public void setAtracao(String atracao) {
		Atracao = atracao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return Objects.equals(data, other.data);
	}

	@Override
	public String toString() {
		return "Evento [data=" + data + ", nome=" + nome + ", Atracao=" + Atracao + "]";
	}

}
