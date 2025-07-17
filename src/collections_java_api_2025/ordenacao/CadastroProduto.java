package collections_java_api_2025.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

	private Set<Produto> produtos;
	
	
	public CadastroProduto() {
		this.produtos = new HashSet<>();
	}
	
	public Set<Produto> getProdutos() {
		return produtos;
	}
	
	public void adicionaProduto(Produto produto) {
		if (produto != null) {
			if (produtos.contains(produto)) {
				System.out.println("Produto já cadastrado: " + produto.getNome());
				return;
			}
			produtos.add(produto);
			System.out.println("Produto adicionado com sucesso: " + produto.getNome());
		} else {
			System.out.println("Produto não pode ser nulo.");
		}
	}
	
	public void exibirProdutos() {
		if (produtos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
		} else {
			System.out.println("Lista de Produtos:");
			for (Produto produto : produtos) {
				System.out.println(produto);
			}
		}
	}
	
	public void exibirProdutosPorNomeEmOrdemAlfabetica() {
		Set<Produto> produtosOrdenados = new TreeSet<>(new ComparatorProdutoPorNome());
		produtosOrdenados.addAll(produtos);
		System.out.println("Produtos ordenados por nome:");
		for (Produto produto : produtosOrdenados) {
			System.out.println(produto);
		}

	}
	
	public void exibirProdutosPorPrecoEmOrdemCrescente() {
		Set<Produto> produtosOrdenados = new TreeSet<>(new ComparatorProdutoPorPreco());
		produtosOrdenados.addAll(produtos);
		System.out.println("Produtos ordenados por preço:");
		for (Produto produto : produtosOrdenados) {
			System.out.println(produto);
		}
	}
}
