package collections_java_api_2025.list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> items;
	
	public CarrinhoDeCompras() {
		this.items = new ArrayList<>();
	}
	
	public List<Item> getItems() {
		return items;
	}
	
	public void addItem(String nome, double preco, int quantidade) {
		items.add(new Item(nome, preco, quantidade));
	}
	
	public void removeItem(String nome) {
		List<Item> itemsParaRemover = new ArrayList<>();
		
		for(Item item : items) {
			if(item.getNome().equalsIgnoreCase(nome)) {
				itemsParaRemover.add(item);
			}
		}
		
		items.removeAll(itemsParaRemover);
	}
	
	public void calcularValorTotal() {
		double total = 0.0;
		for(Item item : items) {
			total += item.getPreco() * item.getQuantidade();
		}
		System.out.printf("Valor total do carrinho: R$ %.2f%n", total);
	}
	
	public void exibirItemsCarrinho() {
		if (items.isEmpty()) {
			System.out.println("Carrinho de compras está vazio.");
			return;
		}
		System.out.println("Itens no carrinho:");
		for (Item item : items) {
			System.out.printf("%s - Preço: R$ %.2f, Quantidade: %d%n", item.getNome(), item.getPreco(), item.getQuantidade());
		}
	}
}
