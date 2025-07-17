package collections_java_api_2025.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	private Set<Convidado> convidados;
	
	public ConjuntoConvidados() {
		this.convidados = new HashSet<>();
	}
	
	public Set<Convidado> getConvidados() {
		return convidados;
	}
	
	public void addConvidado(Convidado convidado) {
		if (convidados.add(convidado)) {
			System.out.println("Convidado adicionado: " + convidado);
		} else {
			System.out.println("Convidado já existe: " + convidado);
		}
	}
	
	public void exibirConvidados() {
		if (convidados.isEmpty()) {
			System.out.println("Nenhum convidado cadastrado.");
		} else {
			System.out.println("Lista de Convidados:");
			for (Convidado convidado : convidados) {
				System.out.println(convidado);
			}
			System.out.println("Total de Convidados: " + contarConvidados());
		}
	}
	
	public void removerCandidatoPorNumeroConvite(int codigoConvite) {
		Convidado convidadoARemover = null;
		for (Convidado convidado : convidados) {
			if (convidado.getCodigoConvite() == codigoConvite) {
				convidadoARemover = convidado;
				break;
			}
		}
		
		if (convidadoARemover != null) {
			convidados.remove(convidadoARemover);
			System.out.println("Convidado removido: " + convidadoARemover);
		} else {
			System.out.println("Convidado com código " + codigoConvite + " não encontrado.");
		}
	}
	
	public int contarConvidados() {
		return convidados.size();
	}
}
