package collections_java_api_2025.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {

	private Map<String, String> contatos;
	
	public AgendaContato() {
		this.contatos = new HashMap<>();
	}
	
	public void exibirContatos() {
		if (contatos.isEmpty()) {
			System.out.println("A agenda está vazia.");
		} else {
			System.out.println("Contatos na agenda:");
			for (Map.Entry<String, String> entry : contatos.entrySet()) {
				System.out.println("Nome: " + entry.getKey() + ", Telefone: " + entry.getValue());
			}
		}
	}
	
	public void adicionarContato(String nome, String telefone) {
		if (contatos.containsKey(nome)) {
			System.out.println("Contato já existe: " + nome);
			return;
		}
		contatos.put(nome, telefone);
	}
	
	public String buscarContato(String nome) {
		if (!contatos.containsKey(nome)) {
			System.out.println("Contato não encontrado: " + nome);
			return null;
		}
		return contatos.get(nome);
	}
	
	public void removerContato(String nome) {
		if (!contatos.containsKey(nome)) {
			System.out.println("Contato não encontrado: " + nome);
			return;
		}
		contatos.remove(nome);
	}
}
