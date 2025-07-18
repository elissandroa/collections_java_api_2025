package collections_java_api_2025.map;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate, Evento> eventos;

	public AgendaEventos() {
		this.eventos = new TreeMap<>();
	}

	public Map<LocalDate, Evento> getEventos() {
		return eventos;
	}

	public void adicionarEvento(Evento evento) {
		if (eventos.containsKey(evento.getData())) {
			System.out.println("Evento já existe na mesma data: " + evento);
			return;
		}
		if (evento.getData().isBefore(LocalDate.now())) {
			System.out.println("Não é possível agendar eventos no passado: " + evento);
			return;
		}
		eventos.put(evento.getData(), evento);
		System.out.println("Evento adicionado: " + evento);
	}

	public void exibirEventosOrdemCrescente() {
		if (eventos.isEmpty()) {
			System.out.println("Nenhum evento agendado.");
			return;
		}
		System.out.println("Eventos agendados (ordem crescente):");
		Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventos);
		for (Map.Entry<LocalDate, Evento> entry : eventosOrdenados.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

	public void obterProximoEvento() {
		LocalDate hoje = LocalDate.now();

		Evento proximoEvento = null;
		Map<LocalDate, Evento> eventosFuturos = new TreeMap<LocalDate, Evento>();	
		for (Map.Entry<LocalDate, Evento> entry : eventos.entrySet()) {
			if (entry.getKey().isAfter(hoje) || entry.getKey().isEqual(hoje)) {
				eventosFuturos.put(entry.getKey(), entry.getValue());
			}
		}
		if (eventosFuturos.isEmpty()) {
			System.out.println("Nenhum evento futuro agendado.");
			return;
		}
		System.out.println("Próximo evento agendado:");
		for (Map.Entry<LocalDate, Evento> entry : eventosFuturos.entrySet()) {
			proximoEvento = entry.getValue();
			System.out.println(proximoEvento);
			break; 
		}

	}
}
