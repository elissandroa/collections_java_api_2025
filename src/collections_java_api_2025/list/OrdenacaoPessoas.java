package collections_java_api_2025.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import collections_java_api_2025.ordenacao.ComparatorPorAltura;
import collections_java_api_2025.ordenacao.Pessoa;

public class OrdenacaoPessoas {

	private List<Pessoa> pessoas;
	
	public OrdenacaoPessoas() {
		pessoas = new ArrayList<>();
	}
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public void addPessoa(Pessoa pessoa) {
		pessoas.add(new Pessoa(pessoa.getNome(), pessoa.getIdade(), pessoa.getAltura()));
	}
	
	public void imprimeListaPessoas() {
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public void imprimeListaPessoasOrdenadasPorIdade() {
		List<Pessoa> pessoasOrdenadas = ordenarPorIdade();
		for (Pessoa pessoa : pessoasOrdenadas) {
			System.out.println(pessoa);
		}
	}
	
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	
	public void imprimeListaPessoasOrdenadasPorAltura() {
		List<Pessoa> pessoasOrdenadas = ordenarPorAltura();
		for (Pessoa pessoa : pessoasOrdenadas) {
			System.out.println(pessoa);
		}
	}
}
