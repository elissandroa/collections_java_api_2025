package collections_java_api_2025.list;

public class Main {

	public static void main(String[] args) {

		ListaTarefa lista = new ListaTarefa();

		System.out.println("Lista de Tarefas:");
		lista.addTarefa("Estudar Java");
		lista.addTarefa("Praticar Collections");
		lista.addTarefa("Criar um projeto");
		lista.addTarefa("Revisar conceitos");
		lista.addTarefa("Participar de um curso online");
		lista.addTarefa("Participar de um curso online");
		lista.addTarefa("Participar de um curso online");
		System.out.println("-----------------------------------------------------------------");
		lista.imprimirListaDeTarefas();
		System.out.println("Total de Tarefas: " + lista.obterTotalTarefas());
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Removendo a tarefa: Participar de um curso online");	
		lista.removeTarefa("Participar de um curso online");
		System.out.println("Lista de Tarefas:");
		lista.imprimirListaDeTarefas();
		System.out.println("Total de Tarefas: " + lista.obterTotalTarefas());
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Buscando a tarefa: Estudar Java");	
		lista.findTarefa("Estudar Java");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Buscando a tarefa: Tarefa Inexistente");
		lista.findTarefa("Tarefa Inexistente");
		
		System.out.println("-----------------------------------------------------------------");
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.addItem("Notebook", 2500.00, 1);
		carrinho.addItem("Mouse", 50.00, 2);
		carrinho.addItem("Teclado", 100.00, 1);
		carrinho.addItem("Monitor", 800.00, 1);
		carrinho.addItem("Cadeira Gamer", 1200.00, 1);
		carrinho.addItem("Cadeira Gamer", 1200.00, 1);
		carrinho.addItem("Cadeira Gamer", 1200.00, 1);
		carrinho.exibirItemsCarrinho();
		carrinho.calcularValorTotal();
		System.out.println("-----------------------------------------------------------------");
		carrinho.removeItem("Cadeira Gamer");
		System.out.println("Itens no carrinho após remoção:");
		carrinho.exibirItemsCarrinho();
		carrinho.calcularValorTotal();
		System.out.println("-----------------------------------------------------------------");

		CatalogoLivros catalogo = new CatalogoLivros();
		catalogo.addLivro("Java: Como Programar", "Deitel", 2020);
		catalogo.addLivro("Effective Java", "Joshua Bloch", 2018);
		catalogo.addLivro("Clean Code", "Robert C. Martin", 2019);
		catalogo.addLivro("Java Concurrency in Practice", "Brian Goetz", 2017);
		catalogo.addLivro("Head First Java", "Kathy Sierra", 2021);
		catalogo.addLivro("Head First Java", "Kathy Sierra", 2021);
		catalogo.addLivro("Head First Java", "Kathy Sierra", 2021);
		catalogo.imprimirCatalogo();
		System.out.println("-----------------------------------------------------------------");
		catalogo.pesquisarPorAutor("Deitel");
		System.out.println("-----------------------------------------------------------------");
		catalogo.pesquisarPorIntervaloAnos(2018, 2020);
		System.out.println("-----------------------------------------------------------------");
		catalogo.pesquisarPorTitulo("Effective Java");
	}
}