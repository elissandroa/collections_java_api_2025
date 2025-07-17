package collections_java_api_2025.list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	private List<Tarefa> tarefas;
	
	public ListaTarefa() {
		this.tarefas = new ArrayList<>();
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}
	
	public void addTarefa(String tarefa) {
		tarefas.add(new Tarefa(tarefa));
	}
	
	public void removeTarefa(String tarefa) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		
		for(Tarefa t: tarefas) {
			if(t.getDescricao().equalsIgnoreCase(tarefa)) {
				tarefasParaRemover.add(t);
			}
		}
		
		tarefas.removeAll(tarefasParaRemover);
	}
	
	public void findTarefa(String tarefa) {
		for(Tarefa t : tarefas) {
			if (t.getDescricao().equalsIgnoreCase(tarefa)) {
				System.out.println("Tarefa encontrada: " + t.getDescricao());
				return;
			} 
		}
		System.out.println("Tarefa não encontrada!");
	}
	
	public int obterTotalTarefas() {
		return tarefas.size();
	}
	
	public void imprimirListaDeTarefas() {
		for (Tarefa tarefa : tarefas) {
			System.out.println(tarefa.getDescricao());
		}
	}

}
