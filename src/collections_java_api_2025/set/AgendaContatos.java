package collections_java_api_2025.set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> contatos;
	
	public AgendaContatos() {
		this.contatos = new HashSet<>();
	}
	
	public Set<Contato> getContatos() {
		return contatos;
	}
	
	public void addContato(Contato contato) {
		if (contatos.add(contato)) {
			System.out.println("Contato adicionado: " + contato);
		} else {
			System.out.println("Contato já existe: " + contato);
		}
	}
	
	public void exibirContatos() {
		if (contatos.isEmpty()) {
			System.out.println("Nenhum contato cadastrado.");
		} else {
			System.out.println("Lista de Contatos:");
			for (Contato contato : contatos) {
				System.out.println(contato);
			}
		}
	}
	
	public void pesquisarPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<>();
		for (Contato contato : contatos) {
			if (contato.getNome().contains(nome)) {
				contatosPorNome.add(contato);
			}
		}
		if(contatosPorNome.isEmpty()) {
			System.out.println("Nenhum contato encontrado com o nome: " + nome);
		} else {
			System.out.println("Contatos encontrados com o nome '" + nome + "':");
			for (Contato contato : contatosPorNome) {
				System.out.println(contato);
			}
		}
	}
	
	public void atualizarNumeroContato(String nome, String novoTelefone) {
		boolean encontrado = false;
		for (Contato contato : contatos) {
			if (contato.getNome().contains(nome)) {
				contato.setTelefone(novoTelefone);
				System.out.println("Número de telefone atualizado para: " + novoTelefone);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Contato com o nome '" + nome + "' não encontrado.");
		}
	}
}
